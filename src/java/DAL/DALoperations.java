/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author akshu aksh
 */
public class DALoperations {
    
    
     private static Connection con=null;


    public static Connection getConnnection()
    {

        if(con!=null)
        {
            try
            {
                if(!con.isClosed())
                {
                    return con;
                }
            }
            catch(SQLException ex)
            {
                System.out.println(ex);
            }
        }

        try
        {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost:49793;databaseName=AkshuTrial;username=sa;password=akshu";
            con = DriverManager.getConnection(connectionUrl);
        }
        catch(Exception ex)
        {
            System.out.print(ex);
        }


        return con;
    }//Function

    
}
