<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Simple Calculator</title>
</head>
<body>
    <h2>Simple Calculator</h2>
    <form action="calculator" method="post">
        <input type="text" name="expression" value="${param.expression}" />
        <br/>
        <input type="submit" value="Calculate" />
    </form>
    <br/>
    <h3>${result}</h3>
</body>
</html>
