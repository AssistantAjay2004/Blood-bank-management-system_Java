package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" media=\"screen\">\r\n");
      out.write("<style>\r\n");
      out.write(".mySlides {display:none;}\r\n");
      out.write("\r\n");
      out.write("input[type=\"text\"], input[type=\"mail\"]\r\n");
      out.write("{\r\n");
      out.write("    border: none;\r\n");
      out.write("    background:silver;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("\tmargin-left:2%;\r\n");
      out.write("\tpadding:15px;\t\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("  <a href=\"#default\" class=\"logo\"><img class=\"logo\" src=\"Logo1.png\"></a>\r\n");
      out.write("  <div class=\"header-right\">\r\n");
      out.write("    <a class=\"active\" href=\"index.jsp\">Home</a>\r\n");
      out.write("    <a href=\"adminLogin.jsp\">Admin Login</a>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div style=\"max-width:100%\">\r\n");
      out.write("  <img class=\"mySlides\"  src=\"slide1.jpg\" >\r\n");
      out.write("  <img class=\"mySlides\"  src=\"slide2.png\" >\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("var myIndex = 0;\r\n");
      out.write("carousel();\r\n");
      out.write("\r\n");
      out.write("function carousel() {\r\n");
      out.write("    var i;\r\n");
      out.write("    var x = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("    for (i = 0; i < x.length; i++) {\r\n");
      out.write("       x[i].style.display = \"none\";  \r\n");
      out.write("    }\r\n");
      out.write("    myIndex++;\r\n");
      out.write("    if (myIndex > x.length) {myIndex = 1}    \r\n");
      out.write("    x[myIndex-1].style.display = \"block\";  \r\n");
      out.write("    setTimeout(carousel, 2000); // Change image every 2 seconds\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <br>\r\n");
      out.write(" \r\n");
      out.write("<center><h1>Enter Your Details Request for Blood</h1></center>\r\n");
      out.write("<form action=\"indexFormAction.jsp\" method=\"post\">\r\n");
      out.write("    <center>\r\n");
      out.write("        <input type=\"text\" name=\"text\" name=\"name\" placeholder=\"Enter Name\" required>\r\n");
      out.write("        <input type=\"text\" name=\"mobilenumber\" placeholder=\"Enter Mobile Number\" required>\r\n");
      out.write("        <input type=\"mail\" name=\"email\" placeholder=\"Enter Email Address\" required>\r\n");
      out.write("        <input type=\"text\" name=\"text\" name=\"bloodgroup\" placeholder=\"Enter Blood Group\" required>\r\n");
      out.write("        <button class=\"button1\"><span>submit</span></button>\r\n");
      out.write("    </center>\r\n");
      out.write("</form>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("  <br>\r\n");
      out.write("  <br>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"row1\"> \r\n");
      out.write("<div class=\"container\"> \r\n");
      out.write("<br>         \r\n");
      out.write("<br>\r\n");
      out.write("<table>\r\n");
      out.write("    <tbody>\r\n");
      out.write("        \r\n");
      out.write("    </tbody>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<h3><center>All Right Reserved @ BSC-IT Days :: 2022  </center></h3>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
