package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import Project.ConnectionProvider;

public final class addNewDonor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" media=\"screen\">\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("ul {\r\n");
      out.write("  list-style-type: none;\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("  overflow: hidden;\r\n");
      out.write("  background-color: #333;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li {\r\n");
      out.write("  float: left;\r\n");
      out.write("  border-right:1px solid #bbb;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li:last-child {\r\n");
      out.write("  border-right: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li a {\r\n");
      out.write("  display: block;\r\n");
      out.write("  color: white;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  padding: 14px 16px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li a:hover:not(.active) {\r\n");
      out.write("  background-color: #111;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".active {\r\n");
      out.write("  background-color: #4CAF50;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<ul>\r\n");
      out.write("  <li><a href=\"home.jsp\">Home</a></li>\r\n");
      out.write("  <li><a href=\"addNewDonor.jsp\">Add New Donor</a></li>\r\n");
      out.write("  <li><a href=\"editDeleteList.jsp\">Edit,Delete & List of Donor Details</a></li>\r\n");
      out.write("    <li><a href=\"manageStock.jsp\">Manage Stock</a></li>\r\n");
      out.write("  <li><a href=\"requestForBlood.jsp\">Request for Blood</a></li>\r\n");
      out.write("  <li><a href=\"requestCompleted.jsp\">Request Completed</a></li>\r\n");
      out.write("  <li style=\"float:right\"><a href=\"adminLogin.jsp\">Logout</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Add New Donor</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("input[type=\"text\"], input[type=\"email\"], select\r\n");
      out.write("{\r\n");
      out.write("    border: none;\r\n");
      out.write("    background: silver;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    padding: 15px;\r\n");
      out.write("    width: 60%;\r\n");
      out.write("    border-radius: 25px;\r\n");
      out.write("    margin-left: 20%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h2, h1 { margin-left: 20%; }\r\n");
      out.write("hr { width: 60%; }\r\n");
      out.write("\r\n");
      out.write("button {\r\n");
      out.write("    padding: 10px 25px;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    border-radius: 20px;\r\n");
      out.write("    background-color: red;\r\n");
      out.write("    color: white;\r\n");
      out.write("    border: none;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");

String msg = request.getParameter("msg");
if ("valid".equals(msg)) {

      out.write("\r\n");
      out.write("    <center><font color=\"green\" size=\"5\">Successfully Updated</font></center>\r\n");

} else if ("invalid".equals(msg)) {

      out.write("\r\n");
      out.write("    <center><font color=\"red\" size=\"5\">Something Went Wrong! Try Again!</font></center>\r\n");

}

      out.write("\r\n");
      out.write("\r\n");

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <h1 style=\"color:red;\">Donor ID: ");
      out.print( id );
      out.write("</h1>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<form action=\"addNewDonorAction.jsp\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("    <input type=\"hidden\" name=\"id\" value=\"");
      out.print( id );
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("    <h2>Name</h2>\r\n");
      out.write("    <input type=\"text\" name=\"name\" placeholder=\"Enter Name\" required>\r\n");
      out.write("    <hr>\r\n");
      out.write("\r\n");
      out.write("    <h2>Father Name</h2>\r\n");
      out.write("    <input type=\"text\" name=\"father\" placeholder=\"Enter Father Name\">\r\n");
      out.write("    <hr>\r\n");
      out.write("\r\n");
      out.write("    <h2>Mother Name</h2>\r\n");
      out.write("    <input type=\"text\" name=\"mother\" placeholder=\"Enter Mother Name\">\r\n");
      out.write("    <hr>\r\n");
      out.write("\r\n");
      out.write("    <h2>Mobile Number</h2>\r\n");
      out.write("    <input type=\"text\" name=\"mobilenumber\" pattern=\"[0-9]{10}\" placeholder=\"Enter 10-digit Mobile Number\" required>\r\n");
      out.write("    <hr>\r\n");
      out.write("\r\n");
      out.write("    <h2>Gender</h2>\r\n");
      out.write("    <select name=\"gender\" required>\r\n");
      out.write("        <option value=\"\">Select</option>\r\n");
      out.write("        <option value=\"Male\">Male</option>\r\n");
      out.write("        <option value=\"Female\">Female</option>\r\n");
      out.write("        <option value=\"Others\">Others</option>\r\n");
      out.write("    </select>\r\n");
      out.write("    <hr>\r\n");
      out.write("\r\n");
      out.write("    <h2>Email</h2>\r\n");
      out.write("    <input type=\"email\" name=\"email\" placeholder=\"Enter Email\">\r\n");
      out.write("    <hr>\r\n");
      out.write("\r\n");
      out.write("    <h2>Blood Group</h2>\r\n");
      out.write("    <select name=\"bloodgroup\" required>\r\n");
      out.write("        <option value=\"\">Select</option>\r\n");
      out.write("        <option value=\"A+\">A+</option>\r\n");
      out.write("        <option value=\"A-\">A-</option>\r\n");
      out.write("        <option value=\"B+\">B+</option>\r\n");
      out.write("        <option value=\"B-\">B-</option>\r\n");
      out.write("        <option value=\"O+\">O+</option>\r\n");
      out.write("        <option value=\"O-\">O-</option>\r\n");
      out.write("        <option value=\"AB+\">AB+</option>\r\n");
      out.write("        <option value=\"AB-\">AB-</option>\r\n");
      out.write("    </select>\r\n");
      out.write("    <hr>\r\n");
      out.write("\r\n");
      out.write("    <h2>Address</h2>\r\n");
      out.write("    <input type=\"text\" name=\"address\" placeholder=\"Enter Address\">\r\n");
      out.write("    <br><br>\r\n");
      out.write("\r\n");
      out.write("    <center><button type=\"submit\">Save</button></center>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<br><br><br><br>\r\n");
      out.write("<h3><center>All Right Reserved @ BSC-IT  Days :: 2022</center></h3>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
