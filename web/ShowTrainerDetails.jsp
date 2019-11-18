
<%@page import="java.util.ArrayList"%>
<%@page import="Getters.TrainerDetails"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <%
      
      
          DAL.Trainer train=new DAL.Trainer();
          
         ArrayList<Getters.TrainerDetails> arayList= train.getAllTrainerDetails();
      
            for(Getters.TrainerDetails trainerDetails:arayList)
            {
      %>
      
     <table><tr>Name:<a href="TrainerProfile.jsp?TrainerId=<%=trainerDetails.getTrainerId()%>"><%=trainerDetails.getName()%></a>
    Experience:<%=trainerDetails.getTrainerExperience()%>
    Post:<%=trainerDetails.getSpecialization()%></tr></table>
  
    <%}%>
    </body>
</html>
