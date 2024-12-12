from flask import Flask
app=Flask(__name__)
@app.route('/')
def NWC():
    return "Welcome to Nowrosjee Wadia College Pune"
if __name__=="__main__":
    app.run(port=5006)
