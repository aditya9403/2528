<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HR Application Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }
        .container {
            width: 50%;
            margin: auto;
            padding: 20px;
            background-color: white;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            margin-top: 50px;
        }
        h1 {
            text-align: center;
            color: #333;
        }
        label {
            display: block;
            margin: 10px 0 5px;
        }
        input[type="text"], input[type="email"], input[type="date"], select {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ddd;
            border-radius: 4px;
        }
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #5cb85c;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #4cae4c;
        }
    </style>
</head>
<body>

    <div class="container">
        <h1>HR Application Form</h1>
        <form action="/xyz" method="POST">
            <!-- Personal Information -->
            <label for="name">Full Name:</label>
            <input type="text" id="name" name="name" placeholder="Enter your full name" required>

            <label for="email">Email Address:</label>
            <input type="email" id="email" name="email" placeholder="Enter your email address" required>

            <label for="dob">Date of Birth:</label>
            <input type="date" id="dob" name="dob" required>

            <!-- Job Details -->
            <label for="position">Position Applied for:</label>
            <select id="position" name="position" required>
                <option value="">Select Position</option>
                <option value="HR Manager">HR Manager</option>
                <option value="Software Developer">Software Developer</option>
                <option value="Sales Executive">Sales Executive</option>
                <option value="Accountant">Accountant</option>
            </select>

            <label for="salary">Expected Salary:</label>
            <input type="text" id="salary" name="salary" placeholder="Enter expected salary" required>

            <!-- Submission -->
           
            <input type="submit" onclick="myFunction()" name="Register"><br>
        </form>
    </div>

</body>
</html>

</body>
</html>
<script type="text/javascript">
function myFunction()
{
  
  alert("Login Successfully !");

  }
</script>