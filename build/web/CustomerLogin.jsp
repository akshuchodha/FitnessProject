<%@page contentType="text/html" pageEncoding="UTF-8"%>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" type="text/css" href="CustomerLogin.css">
     

        
    </head>
 
    <body  data-vide-bg="BEAST in the Beauty - Cassandra Martin - Muscle Madness">
       <form method="post" action="MemberProfile.jsp">
           
                <div class="login-form">
  
          
                    <img src="akshuaksh.png" class="user" >
                    <h2>Log In Here</h2>
            <%
                   String Email="";
                
    if(request.getParameter("para")!=null)
    {
        Email=request.getParameter("para");
        
    %>
    
      Sorry!Your password is wrong.
    
    <%}
    
    if(request.getParameter("para1")!=null)
    {
    
    
    %>
    Sorry!User does not exist!
    
    <%}%>
               <div class="form-input">
                  
                   <input type="text" name="txtEmail"  required="" value="<%=Email%>">
                    <label>Email</label>
                   
                   </div>
                   
               <div class="form-input">
                      
                   <input type="password" name="txtPassword"  required="">
                <label>Password</label>
                   </div>
                 
                                       
               <div class="form-input">
                   <input type="submit" name="btnLogin" value="Login">
                   </div>
                    <a href="Candidate.jsp" class="forget">Not Registed?Sign up</a>
                    <a href="ShowPlans.jsp" class="forget">Plans</a>
                                  
              <div class="loader"></div>
            
            
            </div>
                    
          <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
        <script src="jquery.vide.js"></script>
       </form>
      
  
</html>
