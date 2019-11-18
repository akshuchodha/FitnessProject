
package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class Trainer {
    
    public void insertTrainerDetails(Getters.TrainerDetails trainerDetails)
            
            
    {
    
  try
        {
            Connection con = DALoperations.getConnnection();
            PreparedStatement ps=con.prepareStatement("insert into Trainers(TrainerName,TrainerExperience,TrainerSpecialization) values(?,?,?)");
            
            ps.setString(1,trainerDetails.getName());
            
            ps.setString(2,trainerDetails.getTrainerExperience());
            ps.setString(3,trainerDetails.getSpecialization());
            
            
            ps.execute();
            
            
            
            

           
            
            
        }
        catch(Exception ex)
        {
            
            System.out.print(ex);
            
            
        }
        
    
    
    
}
                    

public Getters.TrainerDetails getTrainerData(int TrainerId)

    {
        Getters.TrainerDetails trainerDetails=new Getters.TrainerDetails();

        try
{

 Connection con = DALoperations.getConnnection();

PreparedStatement ps=con.prepareStatement("select * from Trainers where TrainerId="+TrainerId);

      ResultSet rs=ps.executeQuery();
      
            while(rs.next())
            {
                
                trainerDetails.setName(rs.getString("TrainerName"));
                trainerDetails.setTrainerExperience(rs.getString("TrainerExperience"));
                trainerDetails.setSpecialization(rs.getString("TrainerSpecialization"));
                trainerDetails.setTrainerId(rs.getInt("TrainerId"));
                
                
                
            }
                }

catch(Exception ex)

    {

System.out.print(ex);

}
        
        
        return trainerDetails;

                }

public ArrayList<Getters.TrainerDetails> getAllTrainerDetails()
{
    ArrayList arrayList=new ArrayList();
    
    
    
    try
    {
         Connection con = DALoperations.getConnnection();
          
         
         Statement st=con.createStatement();
         
         ResultSet rs=st.executeQuery("select * from Trainers");
        
        while(rs.next())
        {
            
            Getters.TrainerDetails trainers=new Getters.TrainerDetails();
            
            
            trainers.setName(rs.getString("TrainerName"));
            trainers.setTrainerExperience(rs.getString("TrainerExperience"));
            trainers.setSpecialization(rs.getString("TrainerSpecialization"));
            trainers.setTrainerId(rs.getInt("TrainerId"));
            
            
            
            arrayList.add(trainers);
        }
        
        
    }
    
    catch(Exception e)
            {
                
                
                    System.out.print(e);
                
            }
    
    return arrayList;
    
    
}


public void updateTrainerDetails(Getters.TrainerDetails details)
{
    
    
    
    try
    {
        Connection con = DALoperations.getConnnection();
        
        
        PreparedStatement ps=con.prepareStatement("update Trainers set TrainerName=?,TrainerExperience=?,TrainerSpecialization=? where TrainerId=?");
        
        
        ps.setString(1, details.getName());
        ps.setString(2, details.getTrainerExperience());
        ps.setString(3, details.getSpecialization());
        ps.setInt(4, details.getTrainerId());
        
        ps.execute();
        
    }
    
    catch(Exception ex)
    {
    
    System.out.print(ex);
    
    }

    
}

public void deleteTrainerDetails(int TrainerId)
{
    
    
    try
    {
        
       Connection con = DALoperations.getConnnection();
       
       PreparedStatement ps=con.prepareStatement("delete from Trainers where TrainerId="+TrainerId);
       ps.execute();
                
        
    }
    catch(Exception e)
    {
        
        System.out.print(e);
        
    }
    
    
    
    
}


    }




            