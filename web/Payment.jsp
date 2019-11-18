

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="#">
            
            <table align="center" width="50%" cellpadding="10px" cellpadding="10px">
                
                <tr><td>Please Select Your Payment option</td><td><select>
                    
                            <option>In-person</option>                               
                            <option>Credit/Debit Card</option>                               
                                        
                                        
                                        
                        </select></td></tr>
                
                <tr><td>Please select Your preferred start date</td>
                    
                    <td><input type="date"></td>
                </tr>
                
                <tr><td>Please select your preferred slot of time</td>
                
              <td>  <select>
                    
                    <option>Morning</option>
                    <option>Evening</option>
                    
                    
                  </select></td>
                
                </tr>
                
                <tr><td><input type="submit" name="btnPaymentConfirmation" value="Confirm"></td></tr>
                
                
                
            </table>
            
            
            
            
        </form>
    </body>
</html>
