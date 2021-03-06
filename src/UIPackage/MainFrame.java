/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIPackage;

import dbConnection.CheckStaff;
import dbConnection.DBConnetionClass;
import dbConnection.InsertClass;
import demo.sphinx.helloworld.HelloWorld;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import sound_maching.JavaSoundRecorder;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author Administrator
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        insertClassobj=new InsertClass();
        dbObj=new DBConnetionClass();
        showStafftable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        stffName = new javax.swing.JTextField();
        staffpost = new javax.swing.JTextField();
        staffcontactNo = new javax.swing.JTextField();
        staffemail = new javax.swing.JTextField();
        staffqualification = new javax.swing.JTextField();
        StafftestVoiceFileName = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        staffAdd = new javax.swing.JTextArea();
        staffSubmit = new javax.swing.JButton();
        staffReset = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        staffPass = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        staffEmailVerified = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        staffPasslVerified = new javax.swing.JPasswordField();
        staffLogin = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        techerName = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Automatic sound Replying System");

        jPanel3.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Name ");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(55, 47, 39, 17);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("post");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(55, 78, 25, 17);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("conatct no.");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(55, 109, 67, 17);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("email");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(55, 135, 34, 17);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Qualificatipon");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(55, 161, 87, 17);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("test voice");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(55, 187, 58, 17);
        jPanel3.add(stffName);
        stffName.setBounds(207, 46, 298, 20);
        jPanel3.add(staffpost);
        staffpost.setBounds(207, 77, 298, 20);
        jPanel3.add(staffcontactNo);
        staffcontactNo.setBounds(207, 108, 298, 20);
        jPanel3.add(staffemail);
        staffemail.setBounds(207, 134, 298, 20);
        jPanel3.add(staffqualification);
        staffqualification.setBounds(207, 160, 298, 20);
        jPanel3.add(StafftestVoiceFileName);
        StafftestVoiceFileName.setBounds(207, 186, 298, 20);

        staffAdd.setColumns(20);
        staffAdd.setRows(5);
        jScrollPane2.setViewportView(staffAdd);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(207, 215, 298, 80);

        staffSubmit.setText("submit");
        staffSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffSubmitActionPerformed(evt);
            }
        });
        jPanel3.add(staffSubmit);
        staffSubmit.setBounds(202, 347, 90, 31);

        staffReset.setText("Reset");
        staffReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffResetActionPerformed(evt);
            }
        });
        jPanel3.add(staffReset);
        staffReset.setBounds(342, 347, 110, 31);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Address");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(60, 220, 49, 17);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("password");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(60, 320, 55, 17);
        jPanel3.add(staffPass);
        staffPass.setBounds(207, 319, 304, 20);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Already Member");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(607, 46, 127, 17);

        jLabel16.setText("email");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(590, 80, 40, 14);
        jPanel3.add(staffEmailVerified);
        staffEmailVerified.setBounds(590, 100, 200, 20);

        jLabel17.setText("password");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(590, 130, 60, 14);
        jPanel3.add(staffPasslVerified);
        staffPasslVerified.setBounds(590, 150, 200, 20);

        staffLogin.setText("Login");
        staffLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffLoginActionPerformed(evt);
            }
        });
        jPanel3.add(staffLogin);
        staffLogin.setBounds(590, 190, 100, 30);

        jTabbedPane1.addTab(" Staff", jPanel3);

        techerName.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "post", "contct no", "email"
            }
        ));
        jScrollPane3.setViewportView(techerName);

        jButton3.setText("Looking for");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Serach teachers", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void staffResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffResetActionPerformed
        // TODO add your handling code here:
        resetNewStaffForm();
    }//GEN-LAST:event_staffResetActionPerformed

    private void staffSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffSubmitActionPerformed
        // TODO add your handling code here:
        insertClassobj.InsertNewStaff(stffName.getText(), staffpost.getText(), staffcontactNo.getText(), staffemail.getText(), staffqualification.getText(), StafftestVoiceFileName.getText(), staffAdd.getText(), staffPass.getText());
        resetNewStaffForm();
    }//GEN-LAST:event_staffSubmitActionPerformed

    private void staffLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffLoginActionPerformed
        // TODO add your handling code here:
        CheckStaff checkobj= new CheckStaff();
        if(checkobj.checkStaffLogin(this.staffEmailVerified.getText(), this.staffPasslVerified.getText(), new DBConnetionClass())){
            new InputVoiceForStaff(staffEmailVerified.getText().trim());
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "staff not present");
        }
         
        
    }//GEN-LAST:event_staffLoginActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        HelloWorld helloWorld = new HelloWorld();
         JOptionPane.showMessageDialog(null, "say( where is (techer name))");
        helloWorld.calling();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
    private void resetNewSTForm(){
//        this.stdName.setText("");
//        this.stdClass.setText("");
//        this.stdCollageId.setText("");
//        this.stdVoice.setText("");
//        this.stdAdd.setText("");
    }
    
    private void resetNewStaffForm(){
        stffName.setText("");
        staffAdd.setText("");
        staffpost.setText("");
        staffqualification.setText("");
        staffPass.setText("");
        staffemail.setText("");
        staffcontactNo.setText("");
        StafftestVoiceFileName.setText("");
        
//        reset email verification
//                and password of staff
        staffEmailVerified.setText("");
        staffPasslVerified.setText("");
    }
    
    public void showStafftable(){
        String select="SELECT stffName, staffPost,staffContactNo,staffEmail FROM stafftbl";
        try{
            ResultSet rst = dbObj.st.executeQuery(select);
            TableModel modle=DbUtils.resultSetToTableModel(rst);
            techerName.setModel(modle);
        }catch(SQLException ex){ex.printStackTrace();}
    }
    private InsertClass insertClassobj;
    private DBConnetionClass dbObj;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField StafftestVoiceFileName;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea staffAdd;
    private javax.swing.JTextField staffEmailVerified;
    private javax.swing.JButton staffLogin;
    private javax.swing.JPasswordField staffPass;
    private javax.swing.JPasswordField staffPasslVerified;
    private javax.swing.JButton staffReset;
    private javax.swing.JButton staffSubmit;
    private javax.swing.JTextField staffcontactNo;
    private javax.swing.JTextField staffemail;
    private javax.swing.JTextField staffpost;
    private javax.swing.JTextField staffqualification;
    private javax.swing.JTextField stffName;
    private javax.swing.JTable techerName;
    // End of variables declaration//GEN-END:variables
}
