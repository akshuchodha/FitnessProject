package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.sun.javafx.scene.control.skin.VirtualFlow.ArrayLinkedList;

public final class TrainerServices_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("     \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("       ");

           
       if(request.getParameter("btnAddTrainer")!=null)
           
       {
       int ServiceId=Integer.parseInt(request.getParameter("ServiceId"));
       int size=Integer.parseInt(request.getParameter("hidden"));
       ArrayList<Integer> arrayList=new ArrayList<Integer>();
       
       for(int i=1;i<=size;i++)
       {
           
         if(request.getParameter("chk"+i)!=null)  
         {
             
             int TrainerId=Integer.parseInt(request.getParameter("chk"+i));
             
             arrayList.add(TrainerId);
             
             
         }
           
             
             
             
             
       }
       
       DAL.Services serve=new DAL.Services();
       serve.insertServiceTrainer(ServiceId, arrayList);
       response.sendRedirect("Services.jsp");
       
       
       }
       
      out.write("\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("    \n");
      out.write("          <form method=\"post\" action=\"TrainerServices.jsp\">\n");
      out.write("        <table>\n");
      out.write("          \n");
      out.write("            <tr><td>Service Trainers</td></tr>\n");
      out.write("     ");

         int length=0;
         
            int i=1;
          DAL.Trainer trainerDetails=new DAL.Trainer();
          
          ArrayList<Getters.TrainerDetails> allDetails=trainerDetails.getAllTrainerDetails();
     
    
            for(Getters.TrainerDetails train:allDetails )
            {
     
     
                     
      out.write("\n");
      out.write("     \n");
      out.write("        <tr>\n");
      out.write("      <td><input value=\"");
      out.print(train.getTrainerId());
      out.write("\" type=\"checkbox\" name=\"chk");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(train.getName() );
      out.write("</td>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("             </tr>        \n");
      out.write("     \n");
      out.write("     ");

            i++;
            }
     
            length=i;
     
      out.write("\n");
      out.write("     <tr><td><input type=\"submit\" name=\"btnAddTrainer\"></td></tr>  \n");
      out.write("     <td><input type=\"hidden\" name=\"hidden\" value=\"");
      out.print(length);
      out.write("\"></td>\n");
      out.write("        </table>\n");
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
