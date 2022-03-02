
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author merin
 */
public class payment extends javax.swing.JFrame {

    /**
     * Creates new form payment
     */
    Connection connect=null;
    String mode=null,s=null; 
    int f,bkid;
    public payment(int fare,int id,String name) {
        initComponents();
        s=name;
        f=fare;
        bkid=id;
        jLabel1.setText("Your total cab fare is "+String.valueOf(fare));
        connect=dbms.dbconnect();
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
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(24, 13, 311, 47);

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel2.setText("Pay By");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(35, 78, 115, 39);

        jCheckBox1.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jCheckBox1.setText("Digital Wallet");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(258, 133, 155, 37);

        jCheckBox2.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jCheckBox2.setText("Cash");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(258, 91, 155, 37);

        jButton1.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jButton1.setText("Pay Now");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(139, 188, 100, 40);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-5, 0, 430, 250);

        setSize(new java.awt.Dimension(435, 286));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        mode=jCheckBox2.getText();
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        mode=jCheckBox1.getText();
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String query1=null;
        PreparedStatement ps=null;
        ResultSet rs;
        int fare1=0;
        if(mode.equals("Digital Wallet")){  
            System.out.println("sfvc);");
            query1="select * from users where username=?";
            try {
                ps = connect.prepareStatement(query1);
                ps.setString(1,s);
                rs=ps.executeQuery();
                while(rs.next()){
                    fare1=rs.getInt(6);
                }
            } catch (SQLException ex) {
            }
            if(fare1<f){
                System.out.println("sfvccd);");
                JOptionPane.showMessageDialog(null, "Insufficient Balance");
            }
            else{
                try {
                    
                query1="update bookings set modeofpayment=? where bookingid=?";
                ps = connect.prepareStatement(query1);
                ps.setString(1,mode);
                ps.setInt(2,bkid);
                ps.execute();
                
                query1="update users set wallet_bal=? where username=?";
                ps = connect.prepareStatement(query1);
                int d=fare1-f;
                System.out.println("sfvcfadcc);");
                System.out.println(d);
                ps.setInt(1, d);
                ps.setString(2, s);
                ps.execute();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
                System.out.println("sfvefacac);");
                JOptionPane.showMessageDialog(null,"Payment Successfull!!");
                this.setVisible(false);
            }
        }
        else{
            System.out.println("sfvc);ves");
            JOptionPane.showMessageDialog(null,"Payment Successfull!!");
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
