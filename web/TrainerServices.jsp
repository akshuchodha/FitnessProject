
<%@page import="java.util.ArrayList"%>
<%@page import="com.sun.javafx.scene.control.skin.VirtualFlow.ArrayLinkedList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     
    </head>
    <body>
        
       <%
           
       if(request.getParameter("btnAddTrainer")!=null)
           
       {
       int ServiceId=Integer.parseInt(request.getParameter("hiddenServiceId"));
       int size=Integer.parseInt(request.getParameter("hidden"));
       ArrayList<Integer> arrayList=new ArrayList<Integer>();
       
       for(int i=1;i<=size;i++)
       {
           
         if(request.getParameter("chk"+i)!=null)  
         {
             
             int TrainerId=Integer.parseInt(request.getParameter("chk"+i));
             
             arrayList.add(TrainerId);
             
             
         }
           
             
             
             
             
       }
       
       DAL.Services serve=new DAL.Services();
       serve.insertServiceTrainer(ServiceId, arrayList);
       response.sendRedirect("Services.jsp");
       
       
       }
       %>
       
       
       
    
          <form method="post" action="TrainerServices.jsp">
        <table>
          
            <tr><td>Service Trainers</td></tr>
     <%
         int length=0;
         
            int i=1;
          DAL.Trainer trainerDetails=new DAL.Trainer();
          
          ArrayList<Getters.TrainerDetails> allDetails=trainerDetails.getAllTrainerDetails();
     
    
            for(Getters.TrainerDetails train:allDetails )
            {
     
     
                     %>
     
        <tr>
      <td><input value="<%=train.getTrainerId()%>" type="checkbox" name="chk<%=i%>"><%=train.getName() %></td>
      
      
      
             </tr>        
     
     <%
            i++;
            }
     
            length=i;
     %>
     <tr><td><input type="submit" name="btnAddTrainer"></td></tr>  
     <td><input type="hidden" name="hidden" value="<%=length%>"></td>
        </table>
        </form>
    </body>
</html>
