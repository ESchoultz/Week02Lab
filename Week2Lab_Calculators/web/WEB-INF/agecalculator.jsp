<%-- 
    Document   : agecalculator
    Created on : Sep 14, 2018, 3:15:49 PM
    Author     : 669385
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Week 2 Lab</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter Your Age: <input type="text" name="age" value="${age}"><br>
            <input type="submit" value="Age Next Birthday">
        </form>
        <div>
            ${message}
        </div> 
        <div>
            <a href="arithmetic">Arithmetic Calculator</a>
        </div>
    </body>
</html>
