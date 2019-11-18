

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            HttpSession ses=request.getSession();
            String MemberName=ses.getAttribute("firstName").toString();
            int MemberId=Integer.parseInt(ses.getAttribute("MemberId").toString());
        
        DAL.Customer cus=new DAL.Customer();
       Getters.Customer customer= cus.getCompleteSavedDetails(MemberId);
        
        
        
        %>
    
        <form method="post" action="Customer">
             
                        
               <div class="form-input">
                  
                   <input type="text" name="txtFirstName" value="<%=customer.getFirstName()%>" required="">
                    <label>First Name</label>
                   
                   </div>
                   
               <div class="form-input">
                      
                   <input type="text" name="txtLastName"  required="" value="<%=customer.getLastName()%>">
                <label>Last Name</label>
                   </div>
                    <div class="form-input">
                       <label>Gender</label>
                       <input type="radio" <%=customer.getGender().equals("Male")?"checked":""%> name="gender" value="Male" >
                       <input type="radio" <%=customer.getGender().equals("Female")?"checked":""%> name="gender" value="Female" >
                 
                  
                
                   </div>
                
                    <div class="form-input">
                      
                        <input type="text" name="txtEmailId" value="<%=customer.getEmailId()%>" required="">
                <label>Email</label>
                   </div>
                    
                                       
               <div class="form-input">
                   <input type="submit"  value="Update" name="btnUpdate">
                   </div>
     
       </form>
  <form method="post" action="Photograph.jsp" enctype="multipart/form-data" > 
       <table>
           <tr><td><h3>Upload Photograph</h3></td></tr>
               
           
            <tr>
                
                <td >
                    <input type="file" name="PhotoGraphUpload" >
                
               
              
                
               
                    <input type="submit" name="btnUploadPhoto" value="Upload">
                    <img src="jpgIcon.png" style="width:30px;height:30px">
                </td>
            </tr>
        </table>

    </form>
    </body>
</html>
