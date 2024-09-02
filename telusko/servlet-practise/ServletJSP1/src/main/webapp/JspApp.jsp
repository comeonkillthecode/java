<%@ page language="java" contentType= "text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
//directive tag
<%@ page import="java.util.Date"
%>
//declaration tag
<%!
int age=18;
%>
//script tag
<%
 String name=request.getParameter("uname");
 String ucity=request.getParameter("ucity");
 Date date=new Date();

 out.println(name+" "+ucity);

%>
//expression tag
<h1><%= date%></h1>
</html>
</body>