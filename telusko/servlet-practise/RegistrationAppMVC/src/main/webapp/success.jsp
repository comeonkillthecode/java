<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Success</title>
</head>
<body>
    <h1>Registration Success</h1>
    <%
        String name = (String) session.getAttribute("name");
        if (name == null) {
            name = "Guest";  // Default value if name is null
        }
    %>
    <h1>Hi <%= name %></h1>
</body>
</html>
