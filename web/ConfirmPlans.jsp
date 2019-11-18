

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="Candidate.css">
        
    </head>
    <body>
       
        <form method="post" action="ConfirmPlans.jsp">
            
            <table>
                
             <%
     
            Getters.Plans plan=new Getters.Plans();
            
            
          int ServiceId=Integer.parseInt(request.getParameter("txtHidden"));
               plan.setPlanName(request.getParameter("txtplanname"));
           plan.setTypeOfPlan(request.getParameter("ddltypeofplan"));
           plan.setCostOfPlan(request.getParameter("txtcost"));
          
          
          if(request.getParameter("btnConfirm")!=null)
          {
     
    
           DAL.Customer custom=new DAL.Customer();
                custom.confirm(plan,ServiceId);
                
                response.sendRedirect("Services.jsp?Added");
                
          }
          else
          {
                if(request.getParameter("btnUploadPlan")!=null)
                {
             %>
             
                
             <tr><td><h8>Plan Name</h8></td><td><%=plan.getPlanName()%></td></tr>    
             <tr><td>Plan Type</td><td><%=plan.getTypeOfPlan()%></td></tr>    
             <tr><td>Cost</td><td><%=plan.getCostOfPlan()%>CAD</td>
             <tr><td><input type="hidden" name="txtHidden" value="<%=request.getParameter("txtHidden")%>"></td></tr>
             
           
             
               
            
             <tr><td></td><td><input type="submit" value="Confirm" name="btnConfirm"></td>
             
             <input type="submit" value="Edit" name="btnEdit">
             
             <input type="submit"value="Cancel" name="btnCancel">
             
          
             
             
             </tr>
            
            </table>
        </form>
        
               
        <%
        
                }}
            if(request.getParameter("btnCancel")!=null)
             {
                 
                 response.sendRedirect("MyProjectHomePage.jsp");
                 
                 
             }
           %>
           
         
        
    </body>
</html>
