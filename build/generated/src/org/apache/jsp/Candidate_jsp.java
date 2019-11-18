package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Candidate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("s\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       <link rel=\"stylesheet\" type=\"text/css\" href=\"Candidate.css\">\n");
      out.write("       \n");
      out.write("           <title>Health Freak</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("           <section>\n");
      out.write("             <div class=\"set\">\n");
      out.write("                 \n");
      out.write("                 <div><img src=\"gym2.gif\" ></div>\n");
      out.write("                 <div><img src=\"gym10.gif\" ></div>\n");
      out.write("                \n");
      out.write("                 <div><img src=\"gym14.gif\" ></div>\n");
      out.write("                 \n");
      out.write("                \n");
      out.write("                 <div><img src=\"gym2.gif\" ></div>\n");
      out.write("                 <div><img src=\"gym10.gif\" ></div>\n");
      out.write("                \n");
      out.write("                 <div><img src=\"gym14.gif\" ></div>\n");
      out.write("               \n");
      out.write("             </div>\n");
      out.write("                <div class=\"set set2\">\n");
      out.write("                 \n");
      out.write("                 <div><img src=\"gym2.gif\" ></div>\n");
      out.write("                 <div><img src=\"gym10.gif\" ></div>\n");
      out.write("                \n");
      out.write("                 <div><img src=\"gym14.gif\" ></div>\n");
      out.write("                 \n");
      out.write("                \n");
      out.write("                 <div><img src=\"gym2.gif\" ></div>\n");
      out.write("                 <div><img src=\"gym10.gif\" ></div>\n");
      out.write("                \n");
      out.write("                 <div><img src=\"gym14.gif\" ></div>\n");
      out.write("               \n");
      out.write("             </div>\n");
      out.write("         </section>\n");
      out.write("  \n");
      out.write("        <form method=\"post\" action=\"Customer\">\n");
      out.write("                <div class=\"login-form\">\n");
      out.write("                      <img src=\"akshuaksh.png\" class=\"user\" >\n");
      out.write("                    \n");
      out.write("                    <h2>Hi, Please Register Here </h2>\n");
      out.write("                        \n");
      out.write("               <div class=\"form-input\">\n");
      out.write("                  \n");
      out.write("                   <input type=\"text\" name=\"txtFirstName\"  required=\"\">\n");
      out.write("                    <label>First Name</label>\n");
      out.write("                   \n");
      out.write("                   </div>\n");
      out.write("                   \n");
      out.write("               <div class=\"form-input\">\n");
      out.write("                      \n");
      out.write("                   <input type=\"text\" name=\"txtLastName\"  required=\"\">\n");
      out.write("                <label>Last Name</label>\n");
      out.write("                   </div>\n");
      out.write("                    <div class=\"form-input\">\n");
      out.write("                       <label>Gender</label>\n");
      out.write("                    <input type=\"radio\" name=\"gender\" value=\"Male\" >\n");
      out.write("                    <input type=\"radio\" name=\"gender\" value=\"Female\" >\n");
      out.write("                 \n");
      out.write("                  \n");
      out.write("                \n");
      out.write("                   </div>\n");
      out.write("                \n");
      out.write("                    <div class=\"form-input\">\n");
      out.write("                      \n");
      out.write("                   <input type=\"text\" name=\"txtEmailId\"  required=\"\">\n");
      out.write("                <label>Email</label>\n");
      out.write("                   </div>\n");
      out.write("                    <div class=\"form-input\">\n");
      out.write("                      \n");
      out.write("                   <input type=\"password\" name=\"txtPassword\"  required=\"\">\n");
      out.write("                <label>Password</label>\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"form-input\">\n");
      out.write("                      \n");
      out.write("                   <input type=\"password\" name=\"txtConfirmPassword\"  required=\"\">\n");
      out.write("                <label>Confirm-Password</label>\n");
      out.write("                   </div>\n");
      out.write("                                       \n");
      out.write("               <div class=\"form-input\">\n");
      out.write("                   <input type=\"submit\"  value=\"Submit\" name=\"btnConfirmCustomerDetails\">\n");
      out.write("                   </div>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("            <form method=\"post\" action=\"Photograph.jsp\" enctype=\"multipart/form-data\" > \n");
      out.write("       <table>\n");
      out.write("           <tr><td><h3>Upload Photograph</h3></td></tr>\n");
      out.write("               \n");
      out.write("           \n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                <td >\n");
      out.write("                    <input type=\"file\" name=\"PhotoGraphUpload\" >\n");
      out.write("                \n");
      out.write("               \n");
      out.write("              \n");
      out.write("                \n");
      out.write("               \n");
      out.write("                    <input type=\"submit\" name=\"btnUploadPhoto\" value=\"Upload\">\n");
      out.write("                    <img src=\"jpgIcon.jpg\" style=\"width:30px;height:30px\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("       \n");
      out.write("   \n");
      out.write("</body>\n");
      out.write("    \n");
      out.write("</html>\n");
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
