<!DOCTYPE html>
<html lang="en">
    
<head>
<link rel="stylesheet" href="style.css" type="text/css">

<style>
input[type="text"], input[type="password"], button {
    border: none;
    background: silver;
    height: 50px;
    font-size: 16px;
    margin-left: 35%;
    padding: 15px;
    width: 33%;	
    border-radius: 25px;
}

.button {
    cursor: pointer;
}
</style>
</head>

<body>
    
<div class="header">
  <a href="#default" class="logo"><img class="logo" src="Logo1.png"></a>
  <div class="header-right">
    <a href="index.jsp">Home</a>
    <a class="active" href="adminLogin.jsp">Admin Login</a>
  </div>
</div>

<div class="container">
<br><br>

<%
String msg = request.getParameter("msg");
if("invalid".equals(msg)) 
{
%>
  <h3 style="color:red; text-align:center;">Invalid Username/Password.</h3>
<%
}
%>

<form action="adminLoginAction.jsp" method="post">
   <div class="form-group">
       <h2 style="text-align:center;">Username</h2>
       <input type="text" placeholder="Enter Username" name="username" required>

       <h2 style="text-align:center;">Password</h2>
       <input type="password" placeholder="Enter Password" name="password" required>

       <br><br>
       <div style="text-align:center;">
           <button type="submit" class="button">Submit</button>
       </div>
   </div>
</form>

</div>

<br><br><br><br>
<h3 style="text-align:center;">All Rights Reserved @ BSC-IT Days :: 2022</h3>

</body>
</html>