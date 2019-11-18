
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="Header.css">
        <link type="text/css" rel="stylesheet" href="Design.css">
        
           <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">

        
    </head>
    <body>
           <div class="HeaderBack">
        <div class="header">
        <ul>
            <li>
                <a href="#">
                    <div class="icon">
                        <i class="fa fa-home" aria-hidden="true"></i>
                        <i class="fa fa-home" aria-hidden="true"></i>
                        
                    </div>
                    <div class="name" data-text="Home">Home</div>
                    
                </a>
            </li>
                <li>
                <a href="#">
                    <div class="icon">
                       <i class="fa fa-user" aria-hidden="true"></i>
                       <i class="fa fa-user" aria-hidden="true"></i>

                       
                        
                    </div>
                    <div class="name" data-text="About">My Trainer</div>
                    
                </a>
            </li>
                <li>
                <a href="Services.jsp">
                    <div class="icon">
                     <i class="fa fa-list-ul" aria-hidden="true"></i>
                     <i class="fa fa-list-ul" aria-hidden="true"></i>
                      
                        
                    </div>
                    <div class="name" data-text="Services">My Plans</div>
                    
                </a>
            </li>
                <li>
                <a href="ShowPlans.jsp">
                    <div class="icon">
                      <i class="fa fa-picture-o" aria-hidden="true"></i>
                      <i class="fa fa-picture-o" aria-hidden="true"></i>
                        
                    </div>
                    <div class="name" data-text="Portfolio">All Plans</div>
                    
                </a>
            </li>
               <li>
                <a href="#">
                    <div class="icon">
                <i class="fa fa-comments" aria-hidden="true"></i>
                <i class="fa fa-comments" aria-hidden="true"></i>

                    

                        
                    </div>
                    <div class="name" data-text="Team">Team</div>
                    
                </a>
            </li>
                <li>
                <a href="#">
                    <div class="icon">
                       <i class="fa fa-envelope" aria-hidden="true"></i>
                       <i class="fa fa-envelope" aria-hidden="true"></i>
                        
                    </div>
                    <div class="name" data-text="Contact">Contact</div>
                    
                </a>
            </li>
               
        </ul>
       
            
        </div>
               
               <a href="Logout.jsp?logout">Logout</a>  
                
             
        </div>
        <%    String Email=request.getParameter("txtEmail");
           HttpSession ses=request.getSession();
           
        
           if(request.getParameter("btnLogin")!=null)
        {
            
            DAL.Customer customer=new DAL.Customer();
            Boolean x=customer.checkLogin(request.getParameter("txtEmail"));
            if(x)
            {
                
             DAL.Customer cust=new DAL.Customer();
             
         Getters.Customer customs=cust.authenticate(request.getParameter("txtEmail"),request.getParameter("txtPassword"));
         
         
      
         ses.setAttribute("firstName", customs.getFirstName());
         ses.setAttribute("MemberId", customs.getMemberId());
         
        
                
                if(customs.getMemberId()==0)
                {
        response.sendRedirect("CustomerLogin.jsp?para="+Email);
            
        
        
       
       
        }
        
        else
                {
                      String MemberName=ses.getAttribute("firstName").toString(); 
                
        %>
         
        <form method="post" action="UpdateMemberDetails.jsp">
        <table align="center">
            
            <tr>  <h1>Hi!<%=MemberName%></h1></tr>
            <tr>  <h1></tr>
            <tr>  <h1></tr>
            <tr>  <h1></tr>
            <tr>  <h1></tr>
            <tr>  <h1></tr>
            <tr>  <h1></tr>
           tr><td><h1>Profile</h1></td></tr> 
           tr><td><h1></h1></td></tr> 
        
        
        <%
        int MemberId=Integer.parseInt(ses.getAttribute("MemberId").toString());
        
        if(!customs.getPhotograph().equals("NR"))
        
        {
        %>
        <tr><td><img class="imageDesign" src="Photographs/Photograph<%=MemberId%>.jpg" ></td></tr>
      <%}%>
       <tr><td>First Name</td><td><%=customs.getFirstName()%></td></tr>
       <tr><td>Last Name</td><td><%=customs.getLastName()%></td></tr>
       <tr><td>Gender</td><td><%=customs.getGender()%></td></tr>
       <tr><td>Email Id</td><td><%=customs.getEmailId()%></td></tr>
       
       <tr><td><input type="submit" value="Edit" name="btnEdit"></td></tr>
            
            
        </table>
       
       </form>
            
            <%}}
        
                else
            {
                response.sendRedirect("CustomerLogin.jsp?para1="+Email);
                
            }}
           else
           {
               
               
           if(request.getParameter("profile")!=null)
           {
               
               HttpSession sess=request.getSession();
               int MemberId=Integer.parseInt(sess.getAttribute("MemberId").toString());
               
               DAL.Customer cus=new DAL.Customer();
              Getters.Customer customers= cus.getCompleteSavedDetails(MemberId);
          
                %>

       <form  method="post" action="UpdateMemberDetails.jsp">
        <table align="center">
            
            
           <tr><td><h1></h1></td></tr> 
           <tr><td><h1></h1></td></tr> 
           <tr><td><h1></h1></td></tr> 
           <tr><td><h1></h1></td></tr> 
           <tr><td><h1></h1></td></tr> 
           <tr><td><h1></h1></td></tr> 
           <tr><td><h1></h1></td></tr> 
           <tr><td><h1></h1></td></tr> 
           <tr><td><h1>Profile</h1></td></tr> 
        
               <%
      
        
        if(!customers.getPhotograph().equals("NR"))
        
        {
        %>
        <tr><td><img class="imageDesign" src="Photographs/Photograph<%=MemberId%>.jpg"></td></tr>
      <%}%>
       <tr><td>First Name</td><td><%=customers.getFirstName()%></td></tr>
       <tr><td>Last Name</td><td><%=customers.getLastName()%></td></tr>
       <tr><td>Gender</td><td><%=customers.getGender()%></td></tr>
       <tr><td>Email Id</td><td><%=customers.getEmailId()%></td></tr>

            
       <tr><td><input type="submit" value="Edit" name="btnEdit"></td></tr>    
            
        </table>
       
       </form> 


            <%}
           

}%>
            
    </body>
</html>
