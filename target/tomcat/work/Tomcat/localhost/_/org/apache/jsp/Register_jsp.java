/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-07-26 09:32:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("h1 {\r\n");
      out.write("    font-family:\"Goudy Stout\";\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("label {\r\n");
      out.write("    font-family:\"Magneto\";\r\n");
      out.write("    font-size:20;\r\n");
      out.write("}\r\n");
      out.write("body{\r\n");
      out.write("    background-image:url(\"http://www.fifplay.com/images/public/wallpapers/fifa-16-wallpaper-messi-1920x1080.jpg\");\r\n");
      out.write("    background-repeat: no-repeat;\r\n");
      out.write("    background-attachment: fixed;\r\n");
      out.write("    background-position: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<title>Register</title>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<pre>\r\n");
      out.write("<form action=\"RegisterUser\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<label>First Name : </label><input type=\"text\" placeholder=\"Enter F_name here\" name=\"fname\"  required>\r\n");
      out.write("\r\n");
      out.write("<label>Last Name : </label><input type=\"text\" placeholder=\"Enter L_name here\" name=\"lname\" required>\r\n");
      out.write("\r\n");
      out.write("<label>User Name : </label><input type=\"text\" placeholder=\"Enter U_name here\" name=\"username\" required>\r\n");
      out.write("\r\n");
      out.write("<label>Password   : </label><input type=\"password\" placeholder=\"enter your password here\" name=\"password\">\r\n");
      out.write("\r\n");
      out.write("<label>Event          :</label required><input type=\"checkbox\" name=\"event\" value=\"Football\">Football<input type=\"checkbox\" name=\"event\" value=\"Cricket\">Cricket<input type=\"checkbox\" name=\"event\" value=\"Tennis\">Tennis \r\n");
      out.write("\r\n");
      out.write("<label>Mail Id      : </label><input type=\"email\" placeholder=\"Enter E_mail here\" name=\"email\" required>\r\n");
      out.write(" \r\n");
      out.write("<label>Phone no    : </label><input type=\"text\"  name=\"phno\" required>\r\n");
      out.write("\r\n");
      out.write("<label>Date          : </label><input type=\"date\" name=\"date\" required>\r\n");
      out.write("\r\n");
      out.write("<label>Location    : </label><input type=\"text\" placeholder=\"Enter Location here\" name=\"location\" required>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<input type=\"submit\" value=\"Register & Proceed\">\r\n");
      out.write("</pre>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}