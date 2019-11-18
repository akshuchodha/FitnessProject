
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
   <%     
          if(request.getParameter("btnLogin")!=null)
        {
            
            Getters.Admin admin=new Getters.Admin();
            
            
           admin.setUserLName(request.getParameter("txtUserId"));
           admin.setPassword(request.getParameter("txtPassword"));
           
           
           DAL.Admin adm=new DAL.Admin();
           
           Boolean y=adm.checkLogin(admin);
           
           if(y)
           
               
               response.sendRedirect("AdminServices.jsp");
         
                   
           else
           {%>
           
           Sorry!Please enter correct password.
           
           
      <%}}%>
   
        
        
        <form action="Administrator.jsp" method="post">
            
            <table>
                
                <tr><td>Userd</td>
                
                    <td> <input type="text" name="txtUserId"></td>
                </tr>
                
                
                <tr>
                    
                    <td>Password</td>
                    
                    
                    <td><input type="password" name="txtPassword"></td>
                    
                    
                </tr>
                <tr>
                    
                    <td>    <input type="submit" value="Login" name="btnLogin"></td>
                    
                    
                </tr>
                    
                    
            </table>
            
            
            
        </form> 
           
    </body>
</html>
