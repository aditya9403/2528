const express = require('express');
const axios = require('axios');
const { Parser } = require('json2csv');
const fs = require('fs');
const path = require('path');

const app = express();
const PORT = 3000;

// Middleware to parse JSON request bodies
app.use(express.json());

// Root route to confirm the API is working
app.get('/', (req, res) => {
    res.send('Google Autocomplete API is running. Use /autocomplete endpoint with a query.');
});

// Endpoint to fetch Google autocomplete suggestions
app.get('/autocomplete', async (req, res) => {
    const { query } = req.query;

    if (!query) {
        return res.status(400).json({ error: 'Query parameter is required' });
    }

    try {
        const response = await axios.get(`https://suggestqueries.google.com/complete/search`, {
            params: {
                q: query,
                client: 'firefox' // Using Firefox client for consistent results
            }
        });

        const suggestions = response.data[1]; // Suggestions are in the second element of the array

        if (suggestions.length === 0) {
            return res.status(404).json({ error: 'No suggestions found' });
        }

        // Convert to CSV
        const fields = ['suggestion'];
        const parser = new Parser({ fields });
        const csv = parser.parse(suggestions.map(suggestion => ({ suggestion })));

        // Write CSV to a file
        const csvFilePath = path.join(__dirname, 'autocomplete.csv');
        fs.writeFileSync(csvFilePath, csv);

        // Send CSV file as response
        res.download(csvFilePath);

    } catch (error) {
        console.error('Error fetching autocomplete suggestions:', error);
        res.status(500).json({ error: 'Failed to fetch autocomplete suggestions' });
    }
});

// Start the server
// http://localhost:3000/autocomplete?query=your-search-query

app.listen(PORT, () => {
    console.log(`Server running on http://localhost:${PORT}`);
});

