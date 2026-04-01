<%@page import="Project.ConnectionProvider" %>
<%@page import="java.sql.*" %>

<%
 String id = request.getParameter("id");
 String name = request.getParameter("name");
 String father = request.getParameter("father");
 String mother = request.getParameter("mother");
 String mobilenumber = request.getParameter("mobilenumber");
 String gender = request.getParameter("gender");
 String email = request.getParameter("email");
 String bloodgroup = request.getParameter("bloodgroup");
 String address = request.getParameter("address");
 
%>