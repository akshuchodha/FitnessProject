package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TrainerDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

        if(request.getParameter("para")!=null)
        {
        
        
        
      out.write("\n");
      out.write("        You have successfully added the details of the Trainer!\n");
      out.write("        \n");
      out.write("        ");
}
      out.write("\n");
      out.write("        \n");
      out.write("        <form method=\"post\" action=\"Trainers\" >\n");
      out.write("        <table>\n");
      out.write("   \n");
      out.write("        \n");
      out.write("    <tr> <td>Trainer Name</td><td><input type=\"text\" name=\"txtTrainerName\"></td></tr>\n");
      out.write("    <tr> <td>Trainer Experience</td>\n");
      out.write("       <td><select name=\"ddlExperience\" >\n");
      out.write("    \n");
      out.write("     <option value=\"\" selected disabled hidden>Choose Here</option>      \n");
      out.write("     <option value=\"1\" >Less than 1 Year</option>      \n");
      out.write("     <option value=\"2\" >1-2 Years</option>      \n");
      out.write("        \n");
      out.write("           </select></td>\n");
      out.write("           \n");
      out.write("    <tr><td>Trainer Post</td></tr>\n");
      out.write("    <td><select name=\"ddlPosition\" >\n");
      out.write("    \n");
      out.write("     <option value=\"\" selected disabled hidden>Choose Here</option>      \n");
      out.write("     <option value=\"juniorTrainer\" name=\"juniorTrainer\" >Junior Trainer</option>      \n");
      out.write("     <option value=\"seniorTrainer\" name=\"seniorTrainer\" >Senior Trainer</option>      \n");
      out.write("        \n");
      out.write("     </select></td>        \n");
      out.write("     </td></tr>\n");
      out.write("    \n");
      out.write("    <tr>  <td>Specialization</td><td><textarea name=\"txtSpecialization\"></textarea></td></tr>\n");
      out.write("    <tr>  <td><input name=\"btnSubmitTrainerDetails\" type=\"submit\" value=\"Add Trainer Details\"></td></tr>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("  \n");
      out.write("        \n");
      out.write("    </table>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
