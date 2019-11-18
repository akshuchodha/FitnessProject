
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
       
        DAL.Plans plan=new DAL.Plans();
        
        Getters.Plans plans=plan.getIndividualPlanDetails(Integer.parseInt(request.getParameter("PlanId")));
       
        
        %>
        <form method="post" action="CustomerPlans">
        <table>
            
            
            <tr>
              
                <td>Plan Name</td><td><%=plans.getPlanName()%></td>
                <td>  <input type="hidden" name="hidden" value="<%=Integer.parseInt(request.getParameter("PlanId"))%>"> </td>  

       
                
                
            </tr>
            
            
            
              <tr>
              
                  <td>Plan Type</td><td><%=plans.getTypeOfPlan()%></td>
                
            </tr>
        
           
                
                
              <tr>
              
                  <td>Plan Cost</td><td><%=plans.getCostOfPlan()%></td>
                
            </tr>
            <tr><td><input type="submit" value="Confirm Plan" name="btnConfirmPlan"></td></tr>
            
            
            

        </table>
        </form>
    </body>
</html>
