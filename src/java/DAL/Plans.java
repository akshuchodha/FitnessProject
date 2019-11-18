
package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class Plans {
    
    public void confirmMemberPlan(int MemberId,int PlanId)
    {
        
        
        try
        {
                                
            Connection con = DALoperations.getConnnection();
            PreparedStatement ps=con.prepareStatement("insert into MyMemberPlan(MemberId,PlanId) values(?,?)");
                    
            ps.setInt(1, MemberId);
            ps.setInt(2, PlanId);
            
            
            ps.execute();
            
            
        }
        catch(Exception e)
        {
            
            
            System.out.print(e);
            
            
        }
        
        
        
    }
    
    public ArrayList<Getters.Plans> showPlans()
    {
        ArrayList<Getters.Plans> aray=new ArrayList<Getters.Plans>();
                
                  
                try
                {
                    
                    Connection con = DALoperations.getConnnection();

                    Statement st=con.createStatement();
                    
                    ResultSet rs=st.executeQuery("select * from ClubPlans");
                 
                    while(rs.next())
                    {
                        
                      Getters.Plans plan=new Getters.Plans();
                        
                        plan.setPlanName(rs.getString("planname"));
                        plan.setTypeOfPlan(rs.getString("plantype"));
                        plan.setCostOfPlan(rs.getString("plancost"));
                        plan.setPlanId(rs.getInt("planId"));
                        
                     aray.add(plan);
                        
                        
                    }
        
        
                    
                }
                
                catch(Exception e)
                {
                    
                    System.out.print(e);
                    
                }
        return aray;
        
    }
    
    public Getters.Plans getIndividualPlanDetails(int PlanId)
    {
        
        Getters.Plans plan=new Getters.Plans();
        try
        {
              Connection con = DALoperations.getConnnection();
              
      PreparedStatement ps=con.prepareStatement("select * from ClubPlans where PlanId="+PlanId);
            
      ResultSet rs=ps.executeQuery();
      
      while(rs.next())
      {
          
          
          plan.setPlanName(rs.getString("planname"));
          plan.setTypeOfPlan(rs.getString("plantype"));
          plan.setCostOfPlan(rs.getString("plancost"));
          
      }
      
            
            
        }
        catch(Exception e)
        {
            
            System.out.print(e);
            
        }
        
        return plan;
    }
    
    public void deletePlans(int PlanId)
    {
        
        try
                {
                    
   Connection con=DAL.DALoperations.getConnnection();
   
   PreparedStatement ps=con.prepareStatement("delete from ClubPlans where planId="+PlanId);
   
        ps.executeQuery();
                  
                }
        catch(Exception ex)
        {
            
            
            System.out.print(ex);
            
        }
        
    }
    
    
}
