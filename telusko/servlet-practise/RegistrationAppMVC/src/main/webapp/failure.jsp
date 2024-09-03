<%@ page language="java" contentType= "text/html; charset=ISO-8859-1" pageEncoding= "ISO-8859-1"%>
<DOCTYPE html>
<html>
<head>
<title>Failed</title>
</head>
<body>
<h1>Registration Failed</h1>
<%
        String error = (String) session.getAttribute("error");
        if (error == null) {
            error = "Something is wrong";  // Default value if name is null
        }
    %>
    <h1>Hi <%= error %></h1></body>
</html>