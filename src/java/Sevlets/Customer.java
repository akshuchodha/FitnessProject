
package Sevlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Customer extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
   if(request.getParameter("btnUpdate")!=null)
       
   {
           HttpSession ses=request.getSession();
        int MemberId=Integer.parseInt(ses.getAttribute("MemberId").toString());
       
       DAL.Customer customerDetails=new DAL.Customer();
       
       
       Getters.Customer cus=new Getters.Customer();
       
       cus.setFirstName(request.getParameter("txtFirstName"));
       cus.setLastName(request.getParameter("txtLastName"));
       cus.setGender(request.getParameter("gender"));
       cus.setEmailId(request.getParameter("txtEmailId"));
      
       cus.setMemberId(MemberId);
       
       customerDetails.updateProfile(cus);
       
        response.sendRedirect("MemberProfile.jsp?profile");
                
       
       
       
       
   }
        
   if(request.getParameter("btnConfirmCustomerDetails")!=null)
       
   {
       String name=request.getParameter("txtFirstName");
       
       
       Getters.Customer cust=new Getters.Customer();
       cust.setFirstName(request.getParameter("txtFirstName"));
       cust.setLastName(request.getParameter("txtLastName"));
       cust.setGender(request.getParameter("gender"));
       cust.setEmailId(request.getParameter("txtEmailId"));
       cust.setPassword(request.getParameter("txtPassword"));
       cust.setConfirmPassword(request.getParameter("txtConfirmPassword"));
       
       DAL.Customer cus=new DAL.Customer();
       
       cus.insert(cust);
       
       
       response.sendRedirect("ShowPlans.jsp?name");
       
       
       
       
   }
        
        
        if(request.getParameter("btnConfirm")!=null)
        {
            
            
            
            Getters.Plans plan=new Getters.Plans();
            
            
            plan.setPlanName(request.getParameter("txtplanname"));
            plan.setTypeOfPlan(request.getParameter("ddltypeofplan"));
            plan.setCostOfPlan(request.getParameter("txtcost"));
            int ServiceId=Integer.parseInt(request.getParameter("hiddenServiceId"));
            
            
            DAL.Customer custom=new DAL.Customer();
            
            
            custom.confirm(plan,ServiceId);
            
            response.sendRedirect("AdminClubPlans.jsp");
            
            
            
            
        }
   
        
        
        
        if(request.getParameter("submit")!=null)
        {


            String FirstName=request.getParameter("txtFirstName");
            String LastName=request.getParameter("txtLastName");
            String EmailId=request.getParameter("txtEmailId");
            String Password=request.getParameter("txtPassword");
            String confirmPassword=request.getParameter("txtConfirmPassword");
            String Gender=request.getParameter("gender");

            Getters.Customer custom=new Getters.Customer();


            custom.setFirstName(FirstName);
            custom.setLastName(LastName);
            custom.setPassword(Password);
            custom.setConfirmPassword(confirmPassword);
            custom.setEmailId(EmailId);
            custom.setGender(Gender);

            DAL.Customer dalcustom=new DAL.Customer();

                dalcustom.insert(custom);
                    
                
                response.sendRedirect("Candidate.jsp");
              


        }
        
        if(request.getParameter("btnUploadPlan")!=null)
        {
            
            
            Getters.Plans plan=new Getters.Plans();
            
            
            plan.setPlanName(request.getParameter("txtplanname"));
            plan.setTypeOfPlan(request.getParameter("ddltypeofplan"));
            plan.setCostOfPlan(request.getParameter("txtcost"));
            
          
            response.sendRedirect("ConfirmPlans.jsp");
                    
            
            
            
        }
            
        
     


    
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
