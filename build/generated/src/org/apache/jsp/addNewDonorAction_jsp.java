package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Project.ConnectionProvider;
import java.sql.*;

public final class addNewDonorAction_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\r\n");

 String id = request.getParameter("id");
 String name = request.getParameter("name");
 String father = request.getParameter("father");
 String mother = request.getParameter("mother");
 String mobilenumber = request.getParameter("mobilenumber");
 String gender = request.getParameter("gender");
 String email = request.getParameter("email");
 String bloodgroup = request.getParameter("bloodgroup");
 String address = request.getParameter("address");
 try
 {
     Connection con=ConnectionProvider.getCon();
     PreparedStatement ps=con.prepareStatement("insert into donor values(?,?,?,?,?,?,?,?,?)");
     
     ps.setString(1,id);
     ps.setString(2,name);
     ps.setString(3,father);
     ps.setString(4,mother);
     ps.setString(5,mobilenumber);
     ps.setString(6,gender);
     ps.setString(7,email);
     ps.setString(8,bloodgroup);
     ps.setString(9,address);
     ps.executeUpdate();
     response.sendRedirect("addNewDonor.jsp?msg=valid");
     
 }
 catch(Exception e)
 {
     response.sendRedirect("addNewDonor.jsp?msg=invalid"); 
 }

      out.write("\r\n");
      out.write("\r\n");
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
