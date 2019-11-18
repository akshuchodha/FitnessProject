

package Sevlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Plans extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
                if(request.getParameter("deletion")!=null)
                {
    
            
            DAL.Plans plan=new DAL.Plans();
            plan.deletePlans(Integer.parseInt(request.getParameter("planId")));
            
            response.sendRedirect("ShowCompanyPlans.jsp?id=para");
            
                }
          
            

    }}

    


