/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbConnection;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class CheckStaff {
    
    public boolean checkStaffLogin(String email,String pass,DBConnetionClass dBConnetionClassobj){
        String query="select staffEmail,staffPassword from stafftbl";
        try{
            ResultSet rst = dBConnetionClassobj.st.executeQuery(query);
            while(rst.next()){
                String dbemail=rst.getString(1);
                String dbpass= rst.getString(2);
                
                if(email.equals(dbemail) && pass.equals(dbpass)){
                    return true;
                }
            }
        }catch(SQLException ex){ex.printStackTrace();}
        return false;
    }
    
}
