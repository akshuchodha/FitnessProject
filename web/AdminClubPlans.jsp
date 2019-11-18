
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                     <link rel="stylesheet" type="text/css" href="Candidate.css">
    </head>
    <body>
        
        <form method="post" action="ConfirmPlans.jsp">
        <table border="1">
     
  <tr><td>Plan Name</td><td ><input type="text" name="txtplanname" ></td></tr>
            
  <tr><td>Type of Plan</td><td ><select name="ddltypeofplan" >
              <option value="" selected disabled hidden>Choose here</option>
              <option value="Weekly">Weekly</option>
              <option value="Monthly">Monthly</option>
              <option value="Yearly">Yearly</option>
          </select>
      
      </td></tr>   
  
  
  <tr><td>Cost of the Plan<td><input type="text" name="txtcost">
          <%
          
          int ServiceId=Integer.parseInt(request.getParameter("ServiceId"));
          
          
          %>
          <input type="hidden" name="txtHidden" value="<%=ServiceId%>"></td>
  
  
  </tr>
  
  
  

  <tr><td></td><td><input type="submit" name="btnUploadPlan" value="Upload Place" ><td></tr>
            
            
  <a href="ShowCompanyPlans.jsp">All Plans</a>
 
        </table>
            
            
        </form>
          
    </body>
</html>
