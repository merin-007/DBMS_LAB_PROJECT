/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ALAMEEN
 */
import java.awt.CardLayout;
import java.sql.*;
import static java.time.Clock.system;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Driver_login extends javax.swing.JFrame {

    String name;
    Connection connect;
    CardLayout cardlayout;
    String dbname = null;
    String mobile_no = null;
    String license_no = null;
    String car_model = null;
    int balance = 0;
    int rating = 0;

    //Creates new form Driver_login
    Driver_login(String name) {
        initComponents();
        this.name = name;
        cardlayout = (CardLayout) (profile_pan.getLayout());
        connect = dbms.dbconnect();
        cardlayout.show(profile_pan, "jPanel1");
        init();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ride_b = new javax.swing.JButton();
        ridehis_b = new javax.swing.JButton();
        logout_b = new javax.swing.JButton();
        profile_b = new javax.swing.JButton();
        profile_pan = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        name_l = new javax.swing.JLabel();
        mobile_l = new javax.swing.JLabel();
        username_l = new javax.swing.JLabel();
        model_l = new javax.swing.JLabel();
        license_l = new javax.swing.JLabel();
        name_l1 = new javax.swing.JLabel();
        username_l1 = new javax.swing.JLabel();
        mobile_l1 = new javax.swing.JLabel();
        license_l1 = new javax.swing.JLabel();
        model_l1 = new javax.swing.JLabel();
        wallet_l = new javax.swing.JLabel();
        wallet_l1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jSplitPane1.setBackground(new java.awt.Color(0, 0, 0));
        jSplitPane1.setBorder(null);
        jSplitPane1.setDividerLocation(250);
        jSplitPane1.setDividerSize(1);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Hello Driver");

        ride_b.setBackground(new java.awt.Color(0, 0, 0));
        ride_b.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        ride_b.setForeground(new java.awt.Color(255, 204, 0));
        ride_b.setText("Take a ride ");
        ride_b.setBorderPainted(false);
        ride_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ride_bActionPerformed(evt);
            }
        });

        ridehis_b.setBackground(new java.awt.Color(0, 0, 0));
        ridehis_b.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        ridehis_b.setForeground(new java.awt.Color(255, 204, 0));
        ridehis_b.setText("Ride History");
        ridehis_b.setBorderPainted(false);
        ridehis_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ridehis_bActionPerformed(evt);
            }
        });

        logout_b.setBackground(new java.awt.Color(0, 0, 0));
        logout_b.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        logout_b.setForeground(new java.awt.Color(255, 204, 0));
        logout_b.setText("Logout");
        logout_b.setBorderPainted(false);
        logout_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_bActionPerformed(evt);
            }
        });

        profile_b.setBackground(new java.awt.Color(0, 0, 0));
        profile_b.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        profile_b.setForeground(new java.awt.Color(255, 204, 0));
        profile_b.setText("Profile");
        profile_b.setBorderPainted(false);
        profile_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profile_bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ridehis_b)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(profile_b)
                                    .addComponent(jLabel1)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(ride_b))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(logout_b)))
                .addGap(60, 60, 60))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(profile_b)
                .addGap(18, 18, 18)
                .addComponent(ride_b)
                .addGap(26, 26, 26)
                .addComponent(ridehis_b)
                .addGap(30, 30, 30)
                .addComponent(logout_b)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(jPanel4);

        profile_pan.setLayout(new java.awt.CardLayout());

        name_l.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        name_l.setText("Name");

        mobile_l.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mobile_l.setText("Mobile");

        username_l.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        username_l.setText("User Name");

        model_l.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        model_l.setText("Model");

        license_l.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        license_l.setText("License");

        name_l1.setBackground(new java.awt.Color(0, 0, 0));

        wallet_l.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        wallet_l.setText("Wallet");

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\merin\\Documents\\NetBeansProjects\\JDBC-master\\src\\main\\java\\images\\smallll pic.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_l)
                    .addComponent(username_l)
                    .addComponent(license_l)
                    .addComponent(model_l)
                    .addComponent(mobile_l)
                    .addComponent(wallet_l))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(name_l1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(username_l1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mobile_l1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(license_l1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(model_l1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wallet_l1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addGap(111, 111, 111))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_l)
                    .addComponent(name_l1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_l)
                    .addComponent(username_l1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobile_l)
                    .addComponent(mobile_l1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(license_l)
                    .addComponent(license_l1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(model_l)
                    .addComponent(model_l1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wallet_l)
                    .addComponent(wallet_l1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(198, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        profile_pan.add(jPanel1, "card2");

        jPanel2.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(102, 0, 204));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setText("Location");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(320, 80, 104, 33);

        jComboBox1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kollam", "Trivandrum", "Pathnamthitta", "Idukki", "Thrissur", "Ernakulam", "Malappuram", "Kozhikode" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(425, 77, 158, 34);

        jLabel4.setBackground(new java.awt.Color(102, 0, 204));
        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("Available");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(50, 77, 104, 33);

        jLabel5.setBackground(new java.awt.Color(102, 0, 204));
        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("From");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(50, 155, 73, 33);

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jTextField1);
        jTextField1.setBounds(430, 160, 150, 33);

        jLabel6.setBackground(new java.awt.Color(102, 0, 204));
        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setText("To");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(360, 160, 34, 33);

        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(120, 160, 150, 31);

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton1.setText("Set Status");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(274, 229, 110, 30);

        jComboBox2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jComboBox2);
        jComboBox2.setBounds(172, 76, 81, 34);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\merin\\Documents\\NetBeansProjects\\JDBC-master\\src\\main\\java\\images\\smallll pic.png")); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 640, 510);

        profile_pan.add(jPanel2, "card3");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BookingDate", "Username", "Pickup", "DepartureTime", "Destination", "Fare"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(jTable2);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\merin\\Documents\\NetBeansProjects\\JDBC-master\\src\\main\\java\\images\\smallll pic.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addGap(27, 27, 27))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        profile_pan.add(jPanel3, "card4");

        jSplitPane1.setRightComponent(profile_pan);

        getContentPane().add(jSplitPane1);
        jSplitPane1.setBounds(0, 0, 891, 511);

        setSize(new java.awt.Dimension(895, 542));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void init() {

        try {
            String query1 = "select * from driver where username=?";
            PreparedStatement ps = connect.prepareStatement(query1);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                dbname = rs.getString("name");
                license_no = rs.getString("license_no");
                car_model = rs.getString("car_model");
                rating = rs.getInt("rating");
            }

            String query2 = "select * from users where username=?";
            PreparedStatement ps2 = connect.prepareStatement(query2);
            ps2.setString(1, name);
            ResultSet rs2 = ps2.executeQuery();
            while (rs2.next()) {

                mobile_no = rs2.getString("mobile_no");
                balance = rs2.getInt("wallet_bal");
            }

        } catch (Exception e) {
            System.out.print("hi");
        }
    }
    private void profile_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profile_bActionPerformed
        // TODO add your handling code here:
        cardlayout.show(profile_pan, "card2");
        try {

            username_l1.setText(name);
            name_l1.setText(dbname);
            license_l1.setText(license_no);
            model_l1.setText(car_model);

            wallet_l1.setText(Integer.toString(balance));
            mobile_l1.setText(mobile_no);

        } catch (Exception e) {
            System.out.print("error");
        }
    }//GEN-LAST:event_profile_bActionPerformed

    private void logout_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_bActionPerformed

        this.setVisible(false);
        new login1().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_logout_bActionPerformed

    private void ride_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ride_bActionPerformed
        System.out.println("2");
        cardlayout = (CardLayout) (profile_pan.getLayout());
        cardlayout.show(profile_pan, "card3");
        // TODO add your handling code here:
    }//GEN-LAST:event_ride_bActionPerformed

    private void ridehis_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ridehis_bActionPerformed
        cardlayout.show(profile_pan, "card4");   
        try {
            Connection conn=dbms.dbconnect();

            DefaultTableModel  model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);
            PreparedStatement ps = conn.prepareStatement("select * from bookings where driver=? ");
            ps.setString(1, dbname);
            System.out.print("\nhello"+dbname);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.print("hello"+rs.getInt(1));
                model.addRow(new Object[]{rs.getString(2), rs.getString(8),rs.getString(9),rs.getString(4),rs.getString(10),rs.getInt(7)});
                // TODO add your handling code here:

            }
        }
        catch (SQLException ex) {
            Logger.getLogger(Driver_login.class.getName()).log(Level.SEVERE, null, ex);
        }// TODO add your handling code here:
    }//GEN-LAST:event_ridehis_bActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection conn = dbms.dbconnect();
        String location = (String) jComboBox1.getSelectedItem();
        String from=jTextField2.getText();
        String to =jTextField1.getText();
        String activestatus = (String) jComboBox2.getSelectedItem();
        String string_time;
        PreparedStatement ps;
        if (activestatus.equals("Yes")) {
            try {
                ps = conn.prepareStatement("Insert into available values(?,?,?,?,?,?,?,?)");

                ps.setString(1, dbname);
                ps.setString(3, location);
                ps.setString(2, activestatus);
                if(from.equals(""))
                {
                    LocalTime lt = java.time.LocalTime.now();
                  string_time = lt.toString();
                  string_time = string_time.substring(0, 5);
                  string_time = string_time.replace(':', '.');
                  from=string_time;
                }
                 if(to.equals(""))
                    to="24.00";
                ps.setString(5,"YES"); 
                ps.setString(6, from);
                ps.setInt(4, rating);
                ps.setString(7, to);
                ps.setString(8,car_model);
// TODO add your handling code here:
                ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Driver_login.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
               ps = conn.prepareStatement("Delete from available where driver_id=?");
               //ps = conn.prepareStatement("Delete from available");
                ps.setString(1, dbname);
               ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Driver_login.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Driver_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Driver_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Driver_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Driver_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Driver_login("test").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel license_l;
    private javax.swing.JLabel license_l1;
    private javax.swing.JButton logout_b;
    private javax.swing.JLabel mobile_l;
    private javax.swing.JLabel mobile_l1;
    private javax.swing.JLabel model_l;
    private javax.swing.JLabel model_l1;
    private javax.swing.JLabel name_l;
    private javax.swing.JLabel name_l1;
    private javax.swing.JButton profile_b;
    private javax.swing.JPanel profile_pan;
    private javax.swing.JButton ride_b;
    private javax.swing.JButton ridehis_b;
    private javax.swing.JLabel username_l;
    private javax.swing.JLabel username_l1;
    private javax.swing.JLabel wallet_l;
    private javax.swing.JLabel wallet_l1;
    // End of variables declaration//GEN-END:variables
}
