
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

try {
    // Basic validation
    if (name == null || name.trim().isEmpty() ||
        mobilenumber == null || mobilenumber.trim().isEmpty() ||
        gender == null || gender.trim().isEmpty() ||
        bloodgroup == null || bloodgroup.trim().isEmpty()) {

        response.sendRedirect("addNewDonor.jsp?msg=invalid");
        return;
    }

    Connection con = ConnectionProvider.getCon();

    PreparedStatement ps = con.prepareStatement(
        "INSERT INTO donor (id, name, father, mother, mobilenumber, gender, email, bloodgroup, address) " +
        "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)"
    );

    ps.setInt(1, Integer.parseInt(id));
    ps.setString(2, name);
    ps.setString(3, father);
    ps.setString(4, mother);
    ps.setString(5, mobilenumber);
    ps.setString(6, gender);
    ps.setString(7, email);
    ps.setString(8, bloodgroup);
    ps.setString(9, address);

    ps.executeUpdate();

    ps.close();
    con.close();

    response.sendRedirect("addNewDonor.jsp?msg=valid");

} catch(Exception e) {
    e.printStackTrace();
    response.sendRedirect("addNewDonor.jsp?msg=invalid");
}
%>