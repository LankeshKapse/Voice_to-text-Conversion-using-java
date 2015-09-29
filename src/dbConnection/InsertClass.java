/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbConnection;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class InsertClass {
    
   public InsertClass(){
     
            connection=new DBConnetionClass();
            
      
    }
    
    
    public void InsertSTD(String stdName,String stdClass,String stdAdd,String stdcollageId,String stdVoice){
        String query="insert into stdtbl(stdName,stdClass,stdAdd,stdcollgeId,stdVoice) values('"+stdName+"','"+stdClass+"','"+stdAdd+"','"+stdcollageId+"','"+stdVoice+"')";
        try{
            connection.st.execute(query);
            JOptionPane.showMessageDialog(null, "new Student data enter into the databaes");
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "new Student data not enter into the databaes");
            ex.printStackTrace();}
    }
    
    
    public void InsertNewStaff(String Name,String Post,String contact,String email,String quali,String voiceFile, String address,String pass ){
        String query="insert into stafftbl(stffName,staffPost,staffContactNo,staffEmail,staffQualification,staffVoice,staffAdd,staffPassword) values('"+Name+"','"+Post+"','"+contact+"','"+email+"','"+quali+"','"+voiceFile+"','"+address+"','"+pass+"')";
        try{
            connection.st.execute(query);
            JOptionPane.showMessageDialog(null, "new Staff data  enter into the databaes");
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "new Staff data not enter into the databaes");
            ex.printStackTrace();
        }
    }
    
    private DBConnetionClass connection;
}
