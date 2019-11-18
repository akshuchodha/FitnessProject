

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <%
            
            if(request.getParameter("para")!=null)
            {
            DAL.Trainer train=new DAL.Trainer();
            
            train.deleteTrainerDetails(Integer.parseInt(request.getParameter("TrainerId")));
            %>
            
            
            <%}%>
            <tr><td>Trainers</td></tr>
            
       <%
       DAL.Trainer trainer=new DAL.Trainer();
       
       ArrayList<Getters.TrainerDetails> train=trainer.getAllTrainerDetails();
       
       
       for(Getters.TrainerDetails trains:train)
       {
       
       %>
       <tr><td><a href="TrainerProfile.jsp?TrainerId=<%=trains.getTrainerId()%>"><%=trains.getName()%></a></td>
       
           <td><a href="AllTrainers.jsp?para&&TrainerId=<%=trains.getTrainerId()%>">Delete</a></td>
       
       </tr> 
       
       <%}%>
       
        </table>
    </body>
</html>
