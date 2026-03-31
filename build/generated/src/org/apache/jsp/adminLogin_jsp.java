package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" media=\"screen\">\r\n");
      out.write("<style>\r\n");
      out.write("input[type=\"text\"], input[type=\"password\"], input[type=\"submit\"]\r\n");
      out.write("{\r\n");
      out.write("    border: none;\r\n");
      out.write("    background:silver;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("\tmargin-left:35%;\r\n");
      out.write("\tpadding:15px;\r\n");
      out.write("\twidth:33%;\t\r\n");
      out.write("\tborder-radius: 25px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("  <a href=\"#default\" class=\"logo\"><img class=\"logo\" src=\"Logo1.png\"></a>\r\n");
      out.write("  <div class=\"header-right\">\r\n");
      out.write("    <a href=\"index.jsp\">Home</a>\r\n");
      out.write("    <a class=\"active\" href=\"adminLogin.jsp\">Admin Login</a>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("  <form action=\"adminlLoginAction.jsp\" method=\"post\">\r\n");
      out.write("   <div class=\"form-group\">\r\n");
      out.write("       <center><h2>Username</h2></center>\r\n");
      out.write("       <input type=\"text\" placeholder=\"Enter Username\" name=\"username\" required >\r\n");
      out.write("       <center><h2>Password</h2></center>\r\n");
      out.write("       <input type=\"password\" placeholder=\"Enter Password\" name=\"password\" required >\r\n");
      out.write("       <center><button type=\"submit\" class=\"button\">Submit</button></center>\r\n");
      out.write("\r\n");
      out.write("  </form>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<h3><center>All Right Reserved @ BSC-IT Days :: 2022  </center></h3>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
