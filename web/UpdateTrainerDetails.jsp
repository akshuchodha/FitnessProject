

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%    if (request.getParameter("btnEdit") != null)
        
        {

                int TrainersId = Integer.parseInt(request.getParameter("hidden"));

                DAL.Trainer trainer = new DAL.Trainer();
                Getters.TrainerDetails trainerDetails = trainer.getTrainerData(TrainersId);


        %>
        <form action="UpdateTrainerDetails.jsp" method="post">
            <table style="width: 50%">


                <tr><td>Trainer Name</td><td><input value="<%=trainerDetails.getName()%>" type="text" name="txtName"></td></tr>
                <tr><td>Trainer Experience</td><td><input type="text" value="<%=trainerDetails.getTrainerExperience()%>" name="txtExperience"></td></tr>
                <tr><td>Trainer Specialization</td><td><input value="<%=trainerDetails.getSpecialization()%>" type="text" name="txtSpecialization"></td>

                    <td><input type="hidden" name="hidden" value="<%=trainerDetails.getTrainerId()%>"></td>

                </tr>


                <tr><td><input type="submit" value="update" name="btnUpdate"></td></tr>
            </table>
        </form>
        <%}
         
        else
   {

        
  if(request.getParameter("btnUpdate")!=null)
        {
            Getters.TrainerDetails trains=new Getters.TrainerDetails();
             
            trains.setName(request.getParameter("txtName"));
            trains.setTrainerExperience(request.getParameter("txtExperience"));
            trains.setSpecialization(request.getParameter("txtSpecialization"));
            trains.setTrainerId(Integer.parseInt(request.getParameter("hidden")));
            DAL.Trainer train=new DAL.Trainer();
             
            train.updateTrainerDetails(trains);
             
            int TrainerId=Integer.parseInt(request.getParameter("hidden"));
             
            response.sendRedirect("TrainerProfile.jsp?TrainerId="+TrainerId);
             
             
             
        }}
        
    
        %>
    </body>
</html>
