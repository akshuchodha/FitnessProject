

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
  <table>
        
        <%
        
        int ServiceId=Integer.parseInt(request.getParameter("ServiceId"));
        
        
        DAL.Services service=new DAL.Services();
        
        
    ArrayList<Getters.ServicePlans> plans= service.completeServicePlanDetails(ServiceId);
    
        if(plans!=null)
        {
    for(Getters.ServicePlans plan:plans)
    {
        %>
        <tr><td><h1>Service</h1></td></tr>
        <tr><td><%=plan.getServiceName()%></td></tr>
        <tr><td><%=plan.getTypeOfTraining()%></td></tr>
        
        <tr><td><h1>Plans</h1></td></tr>
        
        <tr><td><%=plan.getPlanName()%></td></tr>
        <tr><td><%=plan.getPlanType()%></td></tr>
        <tr><td><%=plan.getPlanCost()%></td></tr>
        
     <%}}
     
     
     else
        {
     %>
     No plans added Yet!
     <%}%>
  </table>
    </body>
</html>
