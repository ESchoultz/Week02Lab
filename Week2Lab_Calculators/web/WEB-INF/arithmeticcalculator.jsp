<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 16, 2018, 1:21:56 PM
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
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="firstval" value="${firstval}"><br>
            Second : <input type="text" name="secondval" value="${secondval}">
            <input type="submit" name="arithType" value="+">
            <input type="submit" name="arithType" value="-">
            <input type="submit" name="arithType" value="*">
            <input type="submit" name="arithType" value="%">
        </form>
        <div>
            ${result}
        </div>
    </body>
</html>
