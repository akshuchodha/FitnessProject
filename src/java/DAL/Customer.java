package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.http.HttpSession;


public class Customer {
    
        public int updatePhotoGraph(int pMemberId)
    {
        int retValue=0;
        try
        {
                
            Connection con = DALoperations.getConnnection();
           PreparedStatement ps=con.prepareStatement("update MyCustomerDetails set photoGraph=? where MemberId=?");
           ps.setString(1,"PhotoGraph"+ pMemberId);
           ps.setInt(2,pMemberId);
           retValue = ps.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.print(ex);
        }
        
        return retValue;
    }

    
 public void updateProfile(Getters.Customer cust)
 {
     
     try
     {
           Connection con = DALoperations.getConnnection();
         PreparedStatement ps=con.prepareStatement("update MyCustomerDetails set firstname=?,lastname=?,gender=?,emailId=? where MemberId=?");

         ps.setString(1, cust.getFirstName());
         ps.setString(2, cust.getLastName());
         ps.setString(3, cust.getGender());
         ps.setString(4, cust.getEmailId());
         ps.setInt(5, cust.getMemberId());
         ps.execute();
         
         
     }
     catch(Exception e)
     {
         
         
         System.out.print(e);
     }
             
     
 }
    
    public void confirm(Getters.Plans plan,int serviceId)
    {
        
        try
        {
            Connection con = DALoperations.getConnnection();

            PreparedStatement ps=con.prepareStatement("insert into ClubPlans (planname,plantype,plancost,serviceId) values(?,?,?,?)");
                    
            
            ps.setString(1,plan.getPlanName());
            ps.setString(2, plan.getTypeOfPlan());
            ps.setString(3, plan.getCostOfPlan());
            ps.setInt(4, serviceId);
            
            ps.execute();
            
            
            
        }
        catch(Exception ex)
        {
            
            System.out.print(ex);
            
            
        }
        
        
        
    }
    
    public void confirmUserSelectedPlan(int PlanId,int MemberId)
    {
        
        try
        {
         Connection con = DALoperations.getConnnection();
         
         PreparedStatement ps=con.prepareStatement("insert into CustomerSelectedPlans(MemberId,PlanId) values(?,?)");
         
         ps.setInt(1,MemberId);
         ps.setInt(2, PlanId);
         
         ps.execute();
            
            
        }
        catch(Exception ex)
        {
            
            System.out.print(ex);
            
            
        }
        
        
        
        
        
    }
    public Getters.Customer getCompleteSavedDetails(int MemberId)
    {
        Getters.Customer cust=new Getters.Customer();
        
        try
        {
             Connection con = DALoperations.getConnnection();
            PreparedStatement ps=con.prepareStatement("select * from MyCustomerDetails where MemberId="+MemberId);
            
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                
                cust.setFirstName(rs.getString("firstname"));
                cust.setLastName(rs.getString("lastname"));
                cust.setGender(rs.getString("gender"));
                cust.setEmailId(rs.getString("emailId"));
                cust.setPhotograph(rs.getString("photograph"));
                
                
                
            }
            
            
        }
        catch(Exception e)
        {
            
            System.out.print(e);
            
        }
        
        return cust;
    }
    
    
    public Boolean checkLogin(String Email)
    {
        int rowCount=0;
        Boolean x=false;
        
        Getters.Customer custom=new Getters.Customer();
        
        try
        {
      Connection con = DALoperations.getConnnection();
      
      PreparedStatement ps=con.prepareStatement("select * from MyCustomerDetails where emailid=?");
      
      
      ps.setString(1, Email);
      
      ResultSet rs=ps.executeQuery();
      
     
       while(rs.next())
       {
           
           rowCount=rowCount+1;
           
       }
       if(rowCount!=0)
       {
           
           x=true;
           
       }
   
        }
        catch(Exception ex)
        {
            
            System.out.print(ex);
            
        }
        return x;
        
    }
    
   
    
    public Getters.Customer authenticate(String EmailId,String Password)
    {
        
        Getters.Customer custom=new Getters.Customer();
        
        
        try
        {
             Connection con = DALoperations.getConnnection();
               
      PreparedStatement pss=con.prepareStatement("select * from MyCustomerDetails where emailid=? and password=?");
             
             pss.setString(1, EmailId);
             pss.setString(2, Password);
             
            ResultSet rs=pss.executeQuery();
           while(rs.next())
           {
               
               custom.setFirstName(rs.getString("firstname"));
               custom.setLastName(rs.getString("lastname"));
               custom.setGender(rs.getString("gender"));
               custom.setEmailId(rs.getString("emailid"));
               custom.setMemberId(rs.getInt("MemberId"));
               custom.setPhotograph(rs.getString("photograph"));
               
               
               
          
            
      }
           
            
        }
        catch(Exception ex)
            
        {
            
            System.out.print(ex);
            
        }
        return custom;
        
    }
 
    
    public void insert(Getters.Customer customer)
    {


        try
        {


            Connection con = DALoperations.getConnnection();

            PreparedStatement ps=con.prepareStatement("insert into MyCustomerDetails (FirstName,Lastname,Gender,EmailId,Password,ConfirmPassword) values(?,?,?,?,?,?,?)");


            ps.setString(1,customer.getFirstName());
            ps.setString(2,customer.getLastName());
            ps.setString(3,customer.getGender());
             ps.setString(4,customer.getEmailId());
            ps.setString(5,customer.getPassword());
            ps.setString(6,customer.getConfirmPassword());
            ps.setString(7,"NR");
           

    

            ps.execute();

        }
        catch (Exception ex)
        {

            System.out.print(ex);


        }



    }}

    

