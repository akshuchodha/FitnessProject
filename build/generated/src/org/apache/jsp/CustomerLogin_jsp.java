package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CustomerLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("          <link rel=\"stylesheet\" type=\"text/css\" href=\"CustomerLogin.css\">\n");
      out.write("     \n");
      out.write("\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write(" \n");
      out.write("    <body  data-vide-bg=\"BEAST in the Beauty - Cassandra Martin - Muscle Madness\">\n");
      out.write("       <form method=\"post\" action=\"MemberProfile.jsp\">\n");
      out.write("           \n");
      out.write("                <div class=\"login-form\">\n");
      out.write("  \n");
      out.write("          \n");
      out.write("                    <img src=\"akshuaksh.png\" class=\"user\" >\n");
      out.write("                    <h2>Log In Here</h2>\n");
      out.write("            ");

                   String Email="";
                
    if(request.getParameter("para")!=null)
    {
        Email=request.getParameter("para");
        
    
      out.write("\n");
      out.write("    \n");
      out.write("      Sorry!Your password is wrong.\n");
      out.write("    \n");
      out.write("    ");
}
    
    if(request.getParameter("para1")!=null)
    {
    
    
    
      out.write("\n");
      out.write("    Sorry!User does not exist!\n");
      out.write("    \n");
      out.write("    ");
}
      out.write("\n");
      out.write("               <div class=\"form-input\">\n");
      out.write("                  \n");
      out.write("                   <input type=\"text\" name=\"txtEmail\"  required=\"\" value=\"");
      out.print(Email);
      out.write("\">\n");
      out.write("                    <label>Email</label>\n");
      out.write("                   \n");
      out.write("                   </div>\n");
      out.write("                   \n");
      out.write("               <div class=\"form-input\">\n");
      out.write("                      \n");
      out.write("                   <input type=\"password\" name=\"txtPassword\"  required=\"\">\n");
      out.write("                <label>Password</label>\n");
      out.write("                   </div>\n");
      out.write("                 \n");
      out.write("                                       \n");
      out.write("               <div class=\"form-input\">\n");
      out.write("                   <input type=\"submit\" name=\"btnLogin\" value=\"Login\">\n");
      out.write("                   </div>\n");
      out.write("                    <a href=\"Candidate.jsp\" class=\"forget\">Not Registed?Sign up</a>\n");
      out.write("                    <a href=\"ShowPlans.jsp\" class=\"forget\">Plans</a>\n");
      out.write("                                  \n");
      out.write("              <div class=\"loader\"></div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("                    \n");
      out.write("          <script src=\"https://code.jquery.com/jquery-3.3.1.js\"></script>\n");
      out.write("        <script src=\"jquery.vide.js\"></script>\n");
      out.write("       </form>\n");
      out.write("      \n");
      out.write("  \n");
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
