/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbConnection;

/**
 *
 * @author Administrator
 */
public class TruncateTable {
    
    public static void  deleteData(String tableName){
        try{
            new DBConnetionClass().st.executeUpdate("TRUNCATE "+tableName+"");
        }catch(Exception ex){ex.printStackTrace();}
    }
//    public static void main(String[] args) {
//        TruncateTable.deleteData("temp_tbl");
//    }
}
