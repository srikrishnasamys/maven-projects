<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculator App</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        .calculator-container {
            background-color: #ffffff;
            box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, 0.1);
            padding: 20px;
            border-radius: 8px;
            text-align: center;
        }

        h2 {
            color: #333;
        }

        form {
            margin-top: 20px;
        }

        label {
            display: block;
            margin-bottom: 8px;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 12px;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="submit"] {
            background-color: #4caf50;
            color: white;
            padding: 12px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        .result {
            margin-top: 20px;
            color: #333;
        }
    </style>
</head>
<body>
    <div class="calculator-container">
        <h2>Calculator App</h2>
        
        <form action="calculator" method="post">
            <label for="expression">Enter an expression:</label>
            <input type="text" name="expression" id="expression" placeholder="e.g., 2 + 3" required />
            <br/>
            <input type="submit" value="Calculate" />
        </form>

        <%-- Display the result if available --%>
        <% String result = (String)request.getAttribute("result"); %>
        <% if (result != null) { %>
            <div class="result">
                <p>Result: <%= result %></p>
            </div>
        <% } %>
    </div>
</body>
</html>
