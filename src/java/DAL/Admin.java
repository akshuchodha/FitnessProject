
package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Admin {
    
    
    public Boolean checkLogin(Getters.Admin admin)
    {  Boolean x=false;
        
        try
        {
          
            Connection con = DALoperations.getConnnection();
            Statement s=con.createStatement();
            
            
            ResultSet rs=s.executeQuery("select * from AdminLoin");
            
            if(rs.next())
            {       
            if(rs.getString("Username").equals(admin.getUserLName())&& rs.getString("password").equals(admin.getPassword()) )
                
            {
                
                
                x=true;
                
            } 
          
                       }    
            
            
            
        }
        catch(Exception e)
        {
            
            System.out.print(e);
            
            
        }
        
       return x;
    }
    
}
