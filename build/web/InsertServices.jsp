

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    
        <form method="post" action="Services">
        <table>
            
            <tr><td>Service Name:</td>
            
                <td> <input type="text" name="txtServiceName"></td>
            
            
            </tr>
           <tr> <td>
            Duration of Session
            
            </td>
            <td> <input type="text" name="textDuration"></td><td>/day</td>
           
           </tr>
           <tr><td>
               Type of Training
                   
                   
                   
               </td>
               <td><select name="ddlGender"><option value="Team">
                   
                           
                           Team
                           
                       </option>
                       <option value="Individual">Individual</option>
                   
                   
                   </select></td></tr>
 
           
           <tr><td><input type="submit" name="btnSubmitService"></td></tr>
            
        </table>
            
        </form>
    </body>
</html>
