
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
        if(request.getParameter("para")!=null)
        {
        
        
        %>
        You have successfully added the details of the Trainer!
        
        <%}%>
        
        <form method="post" action="Trainers" >
        <table>
   
        
    <tr> <td>Trainer Name</td><td><input type="text" name="txtTrainerName"></td></tr>
    <tr> <td>Trainer Experience</td>
       <td><select name="ddlExperience" >
    
     <option value="" selected disabled hidden>Choose Here</option>      
     <option value="1" >Less than 1 Year</option>      
     <option value="2" >1-2 Years</option>      
        
           </select></td>
           
    <tr><td>Trainer Post</td></tr>
    <td><select name="ddlPosition" >
    
     <option value="" selected disabled hidden>Choose Here</option>      
     <option value="juniorTrainer" name="juniorTrainer" >Junior Trainer</option>      
     <option value="seniorTrainer" name="seniorTrainer" >Senior Trainer</option>      
        
     </select></td>        
     </td></tr>
    
    <tr>  <td>Specialization</td><td><textarea name="txtSpecialization"></textarea></td></tr>
    <tr>  <td><input name="btnSubmitTrainerDetails" type="submit" value="Add Trainer Details"></td></tr>
        
        
  
        
    </table>
            
        </form>
    </body>
</html>
