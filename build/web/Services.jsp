

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form>
            <%
            if(request.getParameter("Added")!=null)
            {
                
             %> 
             
             You have added the new Plan!
                
           <% }
            DAL.Services service=new DAL.Services();
            
            ArrayList<Getters.Services> serve=service.getAllServices();
            
            
            
            
            
            
            
            
            %>
            <table align="center">
                
                
                <th>Services</th>
            <%
            for(Getters.Services ser:serve)
            {
            
            %>    
                
                <tr><td>Service Name</td><td><a href="CompleteServiceDetails.jsp?ServiceId=<%=ser.getServiceId()%>"><%=ser.getServiceName()%></a></td></tr>
                <tr><td>Type Of Service</td><td><%=ser.getTypeOfTraining()%></td></tr>
                
                
             <%}%>   
            </table>
                
            
            
            
            
            
            
            
            
            
            
        </form>
    </body>
</html>
