package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class ShowCompanyPlans_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("             <script type=\"text/javascript\">\n");
      out.write("            \n");
      out.write("            function f1(planName)\n");
      out.write("            {\n");
      out.write("                //alert(\"Hello world\")\n");
      out.write("                var x = confirm(\"Do you want to delete \"+planName);\n");
      out.write("                return x;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    \n");
      out.write("        ");

            
            if(request.getParameter("planId")!=null)
            {
                
                    DAL.Plans plan=new DAL.Plans();
            plan.deletePlans(Integer.parseInt(request.getParameter("planId")));
            
            response.sendRedirect("ShowCompanyPlans.jsp?para=-1");
            
                
            }
            if(request.getParameter("para")!=null)
            {
            
            
            
      out.write("\n");
      out.write("            Your plan has been deleted!\n");
      out.write("            \n");
      out.write("           ");
}
      out.write("\n");
      out.write("  \n");
      out.write("   ");
    DAL.Plans plan=new DAL.Plans();
   
  ArrayList<Getters.Plans> aray= plan.showPlans();
  if(aray.size()!=0)
          
  {
   
 for(Getters.Plans plans :aray)
 {
   
      out.write("\n");
      out.write("   \n");
      out.write(" <table>\n");
      out.write("  <tr>Plan Name :");
      out.print(plans.getPlanName());
      out.write("</tr>\n");
      out.write("  <tr>Plan Cost :");
      out.print(plans.getCostOfPlan());
      out.write("</tr>\n");
      out.write("  <tr>Plan Type :");
      out.print(plans.getTypeOfPlan());
      out.write("</tr>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <a  onclick=\"return f1('");
      out.print(plans.getPlanName());
      out.write("')\" href=\"ShowCompanyPlans.jsp?planId=");
      out.print(plans.getPlanId());
      out.write("\" >Delete\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      </a>\n");
      out.write("  \n");
      out.write("\n");
      out.write(" </table>   \n");
      out.write(" ");
 } }
 
 else
 
  {
      out.write("\n");
      out.write("  \n");
      out.write("  Sorry!There are No Plans Posted Yet.\n");
      out.write("  ");
}
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
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
