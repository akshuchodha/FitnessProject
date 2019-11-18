
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <%
          
       
      if(request.getParameter("logout")!=null)
      {
          
          
          
       session.invalidate();
          
         response.sendRedirect("CustomerLogin.jsp");
                 
      }
      
      
      
      
      %>
    </body>
</html>
