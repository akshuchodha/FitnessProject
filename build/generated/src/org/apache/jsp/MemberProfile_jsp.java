package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MemberProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"Header.css\">\n");
      out.write("           <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("           <div class=\"HeaderBack\">\n");
      out.write("        <div class=\"header\">\n");
      out.write("        <ul>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <div class=\"icon\">\n");
      out.write("                        <i class=\"fa fa-home\" aria-hidden=\"true\"></i>\n");
      out.write("                        <i class=\"fa fa-home\" aria-hidden=\"true\"></i>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"name\" data-text=\"Home\">Home</div>\n");
      out.write("                    \n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("                <li>\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <div class=\"icon\">\n");
      out.write("                       <i class=\"fa fa-user\" aria-hidden=\"true\"></i>\n");
      out.write("                       <i class=\"fa fa-user\" aria-hidden=\"true\"></i>\n");
      out.write("\n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"name\" data-text=\"About\">My Trainer</div>\n");
      out.write("                    \n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("                <li>\n");
      out.write("                <a href=\"Services.jsp\">\n");
      out.write("                    <div class=\"icon\">\n");
      out.write("                     <i class=\"fa fa-list-ul\" aria-hidden=\"true\"></i>\n");
      out.write("                     <i class=\"fa fa-list-ul\" aria-hidden=\"true\"></i>\n");
      out.write("                      \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"name\" data-text=\"Services\">My Plans</div>\n");
      out.write("                    \n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("                <li>\n");
      out.write("                <a href=\"ShowPlans.jsp\">\n");
      out.write("                    <div class=\"icon\">\n");
      out.write("                      <i class=\"fa fa-picture-o\" aria-hidden=\"true\"></i>\n");
      out.write("                      <i class=\"fa fa-picture-o\" aria-hidden=\"true\"></i>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"name\" data-text=\"Portfolio\">All Plans</div>\n");
      out.write("                    \n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("               <li>\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <div class=\"icon\">\n");
      out.write("                <i class=\"fa fa-comments\" aria-hidden=\"true\"></i>\n");
      out.write("                <i class=\"fa fa-comments\" aria-hidden=\"true\"></i>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"name\" data-text=\"Team\">Team</div>\n");
      out.write("                    \n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("                <li>\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <div class=\"icon\">\n");
      out.write("                       <i class=\"fa fa-envelope\" aria-hidden=\"true\"></i>\n");
      out.write("                       <i class=\"fa fa-envelope\" aria-hidden=\"true\"></i>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"name\" data-text=\"Contact\">Contact</div>\n");
      out.write("                    \n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("               \n");
      out.write("        </ul>\n");
      out.write("       \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        ");
    String Email=request.getParameter("txtEmail");
           HttpSession ses=request.getSession();
           
        
           if(request.getParameter("btnLogin")!=null)
        {
            
            DAL.Customer customer=new DAL.Customer();
            Boolean x=customer.checkLogin(request.getParameter("txtEmail"));
            if(x)
            {
                
             DAL.Customer cust=new DAL.Customer();
             
         Getters.Customer customs=cust.authenticate(request.getParameter("txtEmail"),request.getParameter("txtPassword"));
         
         
      
         ses.setAttribute("firstName", customs.getFirstName());
         ses.setAttribute("MemberId", customs.getMemberId());
         
        
                
                if(customs.getMemberId()==0)
                {
        response.sendRedirect("CustomerLogin.jsp?para="+Email);
            
        
        
       
       
        }
        
        else
                {
                      String MemberName=ses.getAttribute("firstName").toString(); 
                
        
      out.write("\n");
      out.write("         \n");
      out.write("        <form method=\"post\" action=\"UpdateMemberDetails.jsp\">\n");
      out.write("        <table align=\"center\">\n");
      out.write("            \n");
      out.write("            <tr>  <h1>Hi!");
      out.print(MemberName);
      out.write("</h1></tr>\n");
      out.write("            <tr>  <h1></tr>\n");
      out.write("           tr><td><h1>Profile</h1></td></tr> \n");
      out.write("           tr><td><h1></h1></td></tr> \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

        int MemberId=Integer.parseInt(ses.getAttribute("MemberId").toString());
        
        if(!customs.getPhotograph().equals("NR"))
        
        {
        
      out.write("\n");
      out.write("        <tr><img src=\"Photographs/Photograph");
      out.print(MemberId);
      out.write(".jpg\" ></tr>\n");
      out.write("      ");
}
      out.write("\n");
      out.write("       <tr><td>First Name</td><td>");
      out.print(customs.getFirstName());
      out.write("</td></tr>\n");
      out.write("       <tr><td>Last Name</td><td>");
      out.print(customs.getLastName());
      out.write("</td></tr>\n");
      out.write("       <tr><td>Gender</td><td>");
      out.print(customs.getGender());
      out.write("</td></tr>\n");
      out.write("       <tr><td>Email Id</td><td>");
      out.print(customs.getEmailId());
      out.write("</td></tr>\n");
      out.write("       \n");
      out.write("       <tr><td><input type=\"submit\" value=\"Edit\" name=\"btnEdit\"></td></tr>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("       \n");
      out.write("       </form>\n");
      out.write("            \n");
      out.write("            ");
}}
        
                else
            {
                response.sendRedirect("CustomerLogin.jsp?para1="+Email);
                
            }}
           else
           {
               
               
           if(request.getParameter("profile")!=null)
           {
               
               HttpSession sess=request.getSession();
               int MemberId=Integer.parseInt(sess.getAttribute("MemberId").toString());
               
               DAL.Customer cus=new DAL.Customer();
              Getters.Customer customers= cus.getCompleteSavedDetails(MemberId);
          
                
      out.write("\n");
      out.write("\n");
      out.write("                  <form method=\"post\" action=\"UpdateMemberDetails.jsp\">\n");
      out.write("        <table align=\"center\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("           <tr><td><h1></h1></td></tr> \n");
      out.write("           <tr><td><h1></h1></td></tr> \n");
      out.write("           <tr><td><h1></h1></td></tr> \n");
      out.write("           <tr><td><h1></h1></td></tr> \n");
      out.write("           <tr><td><h1></h1></td></tr> \n");
      out.write("           <tr><td><h1></h1></td></tr> \n");
      out.write("           <tr><td><h1></h1></td></tr> \n");
      out.write("           <tr><td><h1></h1></td></tr> \n");
      out.write("           <tr><td><h1>Profile</h1></td></tr> \n");
      out.write("        \n");
      out.write("               ");

      
        
        if(!customers.getPhotograph().equals("NR"))
        
        {
        
      out.write("\n");
      out.write("        <tr><img src=\"Photographs/Photograph");
      out.print(MemberId);
      out.write(".jpg\"></tr>\n");
      out.write("      ");
}
      out.write("\n");
      out.write("       <tr><td>First Name</td><td>");
      out.print(customers.getFirstName());
      out.write("</td></tr>\n");
      out.write("       <tr><td>Last Name</td><td>");
      out.print(customers.getLastName());
      out.write("</td></tr>\n");
      out.write("       <tr><td>Gender</td><td>");
      out.print(customers.getGender());
      out.write("</td></tr>\n");
      out.write("       <tr><td>Email Id</td><td>");
      out.print(customers.getEmailId());
      out.write("</td></tr>\n");
      out.write("\n");
      out.write("            \n");
      out.write("        <tr><input type=\"submit\" value=\"Edit\" name=\"btnEdit\"></tr>    \n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("       \n");
      out.write("       </form> \n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
}
           

}
      out.write("\n");
      out.write("            \n");
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
