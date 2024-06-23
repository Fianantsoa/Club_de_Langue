/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package club_de_langue;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author BEST
 */
public class Authentification extends javax.swing.JFrame {

    /**
     * Creates new form FrameLogin
     */
    public Authentification() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLmessagePassword = new javax.swing.JLabel();
        jTextFieldName_Admin = new javax.swing.JTextField();
        jPassword_Admin = new javax.swing.JPasswordField();
        jButtonValide_Admin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Authentification");
        setBackground(new java.awt.Color(45, 110, 50));
        setLocation(new java.awt.Point(450, 200));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(45, 110, 50));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Utilisateur :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mot de passe :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLmessagePassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLmessagePassword.setForeground(new java.awt.Color(255, 153, 153));
        jPanel2.add(jLmessagePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));
        jPanel2.add(jTextFieldName_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 204, 32));
        jPanel2.add(jPassword_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 204, 32));

        jButtonValide_Admin.setBackground(new java.awt.Color(51, 255, 51));
        jButtonValide_Admin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonValide_Admin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonValide_Admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/valide_fav.png"))); // NOI18N
        jButtonValide_Admin.setText("Valider");
        jButtonValide_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValide_AdminActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonValide_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 130, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Club de Langue");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/deleteMember_fav.png"))); // NOI18N
        jButton1.setText("Supprimer");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 130, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/world_fond.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValide_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValide_AdminActionPerformed
        if("".equals(jPassword_Admin.getPassword()) || "".equals(jTextFieldName_Admin.getText())){
            jLmessagePassword.setText("Remplir les cases.");
        }else{
            Connection connect = null;
            try {
                ConnectionDb.Charge();
		connect = ConnectionDb.getConnection();
		Statement cursor = connect.createStatement();
		ResultSet result = cursor.executeQuery("select id, name, password from "
                        + "club_langage.administrateur where name='" + jTextFieldName_Admin.getText() + "'");
				
		String passwordEntred = String.valueOf(jPassword_Admin.getPassword());
		while(result.next()) {
                    String id = result.getString("id");
                    String userDB = result.getString("name");
                    String passwordDB = result.getString("password");
                    if(passwordEntred.toString().equals(passwordDB.toString())) {
			System.out.println("Bienvenue !");
                        jLmessagePassword.setText("");
                        this.setVisible(false);
                        new NewJFrame().setVisible(true);
                    } else {
                        jLmessagePassword.setText("Mot de passe est incorrecte.");
                        jPassword_Admin.setText("");
                    }
		}
				
                connect.close();
			
            } catch (ClassNotFoundException e) {
		System.out.println("echec du chargement du driver");
            } catch ( SQLException e ) {
            	System.out.println("Erreur de type sql");
		e.printStackTrace();
            } finally{
		if(connect != null) {
                    try {
			connect.close();
                    } catch (SQLException e) {
			e.printStackTrace();
                    }
		}
            }
        }
    }//GEN-LAST:event_jButtonValide_AdminActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        jTextFieldName_Admin.setText("");
        jPassword_Admin.setText("");
    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonValide_Admin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLmessagePassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPassword_Admin;
    private javax.swing.JTextField jTextFieldName_Admin;
    // End of variables declaration//GEN-END:variables
}
