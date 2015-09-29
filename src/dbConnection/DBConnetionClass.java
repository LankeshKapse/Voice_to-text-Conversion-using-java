/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dbConnection;
import java.sql.*;
/**
 *
 * @author lucky
 */
public class DBConnetionClass {
    
     public Connection con=null;
    public Statement st=null;
    private ResultSet rs=null;
    private boolean flag=false;
    
    public DBConnetionClass()
    {
        try
        {
          Class.forName("com.mysql.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost/soundmatching","root","");
          st=con.createStatement();
        }
        catch(SQLException sql)
        {
            sql.printStackTrace();
        }
         catch(Exception sql)
        {
            sql.printStackTrace();
        }
    }
}
