<%@page import="java.sql.*"%>
<%@page import="Project.ConnectionProvider"%>
<%@include file="header.html"%>

<!DOCTYPE html>
<html>
<head>
<title>Add New Donor</title>
<link rel="stylesheet" href="style.css" type="text/css">

<style>
input[type="text"], input[type="email"], select
{
    border: none;
    background: silver;
    height: 50px;
    font-size: 16px;
    padding: 15px;
    width: 60%;
    border-radius: 25px;
    margin-left: 20%;
}

h2, h1 { margin-left: 20%; }
hr { width: 60%; }

button {
    padding: 10px 25px;
    font-size: 16px;
    border-radius: 20px;
    background-color: red;
    color: white;
    border: none;
    cursor: pointer;
}
</style>
</head>

<body>
<%
String msg = request.getParameter("msg");
if ("valid".equals(msg)) {
%>
    <center><font color="green" size="5">Successfully Updated</font></center>
<%
} else if ("invalid".equals(msg)) {
%>
    <center><font color="red" size="5">Something Went Wrong! Try Again!</font></center>
<%
}
%>

<%
int id = 1;
try {
    Connection con = ConnectionProvider.getCon();
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT MAX(id) FROM donor");
    if (rs.next()) {
        id = rs.getInt(1) + 1; // Next donor ID
    }
    rs.close();
    st.close();
    con.close();
} catch(Exception e) {
    e.printStackTrace();
}
%>

<div class="container">
    <h1 style="color:red;">Donor ID: <%= id %></h1>
</div>

<div class="container">
<form action="addNewDonorAction.jsp" method="post">

    <input type="hidden" name="id" value="<%= id %>">

    <h2>Name</h2>
    <input type="text" name="name" placeholder="Enter Name" required>
    <hr>

    <h2>Father Name</h2>
    <input type="text" name="father" placeholder="Enter Father Name">
    <hr>

    <h2>Mother Name</h2>
    <input type="text" name="mother" placeholder="Enter Mother Name">
    <hr>

    <h2>Mobile Number</h2>
    <input type="text" name="mobilenumber" pattern="[0-9]{10}" placeholder="Enter 10-digit Mobile Number" required>
    <hr>

    <h2>Gender</h2>
    <select name="gender" required>
        <option value="">Select</option>
        <option value="Male">Male</option>
        <option value="Female">Female</option>
        <option value="Others">Others</option>
    </select>
    <hr>

    <h2>Email</h2>
    <input type="email" name="email" placeholder="Enter Email">
    <hr>

    <h2>Blood Group</h2>
    <select name="bloodgroup" required>
        <option value="">Select</option>
        <option value="A+">A+</option>
        <option value="A-">A-</option>
        <option value="B+">B+</option>
        <option value="B-">B-</option>
        <option value="O+">O+</option>
        <option value="O-">O-</option>
        <option value="AB+">AB+</option>
        <option value="AB-">AB-</option>
    </select>
    <hr>

    <h2>Address</h2>
    <input type="text" name="address" placeholder="Enter Address">
    <br><br>

    <center><button type="submit">Save</button></center>

</form>
</div>

<br><br><br><br>
<h3><center>All Right Reserved @ BSC-IT  Days :: 2022</center></h3>

</body>
</html>