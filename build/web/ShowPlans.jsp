

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
   <%
       if(request.getParameter("name")!=null)
           
       {
          String memberName= request.getParameter("name");
           
           
        %>
        Hi,Welcome <%=memberName%>
      <% }
   
   DAL.Plans plan=new DAL.Plans();
   
  ArrayList<Getters.Plans> aray= plan.showPlans();
  
   
   
 for(Getters.Plans plans :aray)
 {
   %>
   
   
 <table align="center" width="30px" >
     
     <tr><td><a href="ShowCustomerPlanDetails.jsp?PlanId=<%=plans.getPlanId()%>">Plan Name</a></td> <td><%=plans.getPlanName()%></td></tr>
  <tr><td>Plan Cost </td><td><%=plans.getCostOfPlan()%></td></tr>
  <tr><td>Plan Type</td><td><%=plans.getTypeOfPlan()%></td></tr>
  
  
  
  

 </table>   
 <%
          
         
         }%> 
    </body>
</html>
