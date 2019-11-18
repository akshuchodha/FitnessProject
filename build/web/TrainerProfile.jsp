
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <%
         
       
         
     int TrainerId=Integer.parseInt(request.getParameter("TrainerId"));
     DAL.Trainer trainer=new DAL.Trainer();
     Getters.TrainerDetails trainerDetails=trainer.getTrainerData(TrainerId);
     
          
     
     %>
     <form action="UpdateTrainerDetails.jsp" method="post">
     <table style="width: 50%">
         <tr><td> Name:<%=trainerDetails.getName()%></td></tr>
         <tr><td>Experience:<%=trainerDetails.getTrainerExperience()%></td></tr>
         <tr><td>Specialization:<%=trainerDetails.getSpecialization()%></td>
   
             
             
           
             <td><input type="hidden" name="hidden" value="<%=trainerDetails.getTrainerId()%>"></td>
         
         
         </tr>
         
         
         
         <tr><td><input type="submit" value="Edit" name="btnEdit"></td></tr>
     </table>
     </form>
       
  
    </body>
</html>
