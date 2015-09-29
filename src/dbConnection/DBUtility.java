/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class DBUtility {

    private static String server = "localhost";
    private static String server_port = "3306";
    private static String DB_name = "vanetdb";
    private static String user = "root";
     private static String pass = "";
    private static String url = "jdbc:mysql://"
            + server + ":"
            + server_port + "/"
            + DB_name;

    public Connection con = null;
    public Statement st = null;
    private ResultSet rs = null;
    private boolean flag = false;

    public String getUrl() {
        return url;
    }

    public DBUtility() {

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(getUrl(),user,pass);
            st = con.createStatement();
        } catch (SQLException sql) {
            sql.printStackTrace();
        } catch (Exception sql) {
            sql.printStackTrace();
        }
    }
}


