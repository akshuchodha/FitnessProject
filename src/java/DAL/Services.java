
package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class Services {
    
    
    public ArrayList<Getters.ServicePlans> completeServicePlanDetails(int ServiceId)
    {
        ArrayList<Getters.ServicePlans> plans=new ArrayList<Getters.ServicePlans>();
        
        try
        {
            
          Connection con = DALoperations.getConnnection();
            
          Statement st=con.createStatement();
          
          
          ResultSet rs=st.executeQuery("select p.planName,p.planType,p.planCost,p.serviceId,s.serviceName,s.typeOfTraining from  ClubPlans as [p],servicesIn as [s] where p.serviceId=s.serviceId and s.serviceId="+ServiceId);
          
          
          while(rs.next())
          {
              
              
              Getters.ServicePlans plan=new Getters.ServicePlans();
              plan.setPlanName(rs.getString("planname"));
              plan.setPlanType(rs.getString("plantype"));
              plan.setPlanCost(rs.getString("plancost"));
              plan.setPlanId(rs.getInt("planId"));
              plan.setServiceName(rs.getString("serviceName"));
              plan.setTypeOfTraining(rs.getString("typeOfTraining"));
              
              
          }
             
            
            
            
        }
        catch(Exception e)
        {
            
            
            System.out.print(e);
        }
        return plans;
    }
    
   public void insertServiceDetails(Getters.Services serve)
   {
       Getters.Services services=new Getters.Services();
       
       try
       {
           
         Connection con = DALoperations.getConnnection();
         PreparedStatement ps=con.prepareStatement("insert into servicesIn(serviceName,DurationEachDay,typeOfTraining) values(?,?,?)");
         
         ps.setString(1, serve.getServiceName());
         ps.setInt(2, serve.getDuration());
         ps.setString(3, serve.getTypeOfTraining());
         
         ps.execute();
           
       }
       catch(Exception e)
       {
           
           
           System.out.print(e);
           
           
       }
       
       
       
   }
   
   
   
   public Getters.Services getServiceDetails(String ServiceName,String typeOfTraining)
   {
       Getters.Services service=new Getters.Services();
       try
       {
   
                      
         Connection con = DALoperations.getConnnection();
         
           Statement st=con.createStatement();
           
 
           ResultSet rs=st.executeQuery("select * from servicesIn where serviceName='"+ServiceName+"' and typeOfTraining='"+typeOfTraining+"'");

            while(rs.next())
            {
                
                service.setServiceId(rs.getInt("serviceId"));
            
            }
           
       }
           catch(Exception e)
           {
               
               
               System.out.print(e);
           }
           
       
       return service;
       
       
       
   }
    
   public void insertServiceTrainer(int ServiceId,ArrayList<Integer> arrayList)
   {
       
      
       
       try
       {
              
                      
         Connection con = DALoperations.getConnnection();
         
         PreparedStatement ps=con.prepareStatement("insert into TrainerServices (TrainerId,ServiceId) values(?,?)");
           
                ps.setInt(1, ServiceId);
               
       }
       
       catch(Exception e)
       {
           
           
           System.out.print(e);
       }
       
       
       
       
       
       
       
       
       
       
       
   }
   
   public ArrayList<Getters.Services> getAllServices()
   {

       
       ArrayList<Getters.Services> serve=new ArrayList<Getters.Services>();
       
       try
       {
                  
      
                         
                      
         Connection con = DALoperations.getConnnection();
         
        Statement st=con.createStatement();
        
        ResultSet rs=st.executeQuery("select * from servicesIn");
        
        while(rs.next())

        {
            
             Getters.Services service=new Getters.Services();
             
             service.setServiceName(rs.getString("serviceName"));
             service.setTypeOfTraining(rs.getString("typeOfTraining"));
             service.setDuration(rs.getInt("DurationEachDay"));
             service.setServiceId(rs.getInt("serviceId"));
            
            serve.add(service);
            
        }
       }
       
       catch(Exception e)
       {
           
           
           System.out.print(e);
       }
       
       
       return serve;
       
       
       
       
   }
    
    
}
