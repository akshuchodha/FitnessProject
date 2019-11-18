<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
             <script type="text/javascript">
            
            function f1(planName)
            {
                //alert("Hello world")
                var x = confirm("Do you want to delete "+planName);
                return x;
                
            }
            
        </script>
    
        <%
            
            if(request.getParameter("planId")!=null)
            {
                
                    DAL.Plans plan=new DAL.Plans();
            plan.deletePlans(Integer.parseInt(request.getParameter("planId")));
            
            response.sendRedirect("ShowCompanyPlans.jsp?para=-1");
            
                
            }
            if(request.getParameter("para")!=null)
            {
            
            
            %>
            Your plan has been deleted!
            
           <%}%>
  
   <%    DAL.Plans plan=new DAL.Plans();
   
  ArrayList<Getters.Plans> aray= plan.showPlans();
  if(aray.size()!=0)
          
  {
   
 for(Getters.Plans plans :aray)
 {
   %>
   
 <table>
  <tr>Plan Name :<%=plans.getPlanName()%></tr>
  <tr>Plan Cost :<%=plans.getCostOfPlan()%></tr>
  <tr>Plan Type :<%=plans.getTypeOfPlan()%></tr>
  
  
  <a  onclick="return f1('<%=plans.getPlanName()%>')" href="ShowCompanyPlans.jsp?planId=<%=plans.getPlanId()%>&&deletion" >Delete
      
      
      
      </a>
  

 </table>   
 <% } }
 
 else
 
  {%>
  
  Sorry!There are No Plans Posted Yet.
  <%}%>
 
 
 
    </body>
</html>
