/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package club_de_langue;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public final class NewClub extends javax.swing.JPanel {
    public String club;
    public NewClub( String club, javax.swing.JTabbedPane jtab) throws SQLException {
        this.club = club;
        initialize();
        jtab.addTab(club, jPanelNEW);
        
        jPanel3.setVisible(false);
        callPostDataLeader(club,jLabelName_d_NEW,jLabelLastName_d_NEW,
                jLabelBirthday_d_NEW,jLabelAddress_d_NEW,jLabelEmail_d_NEW,
                jLabelTel_d_NEW,jLabelNb_member_NEW);
        insertDataInTable(club, jTableMember_NEW);
        insertActivityInTable(club, jTable_A_NEW);
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        String cDate = String.valueOf(currentDate);
        String cTime = String.valueOf(currentTime);
        jTextFieldDate_A_NEW.setText(cDate);
        jTextFieldTime_A_NEW.setText(cTime);
    }
    
    public void initialize() {
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelNEW = new javax.swing.JPanel();
        jPanelNEWUnder = new javax.swing.JPanel();
        jTabbedPaneNEW = new javax.swing.JTabbedPane();
        jPanelClub_NEW = new javax.swing.JPanel();
        jPanelClub_NEWUnder = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButtonConf_d_NEW = new javax.swing.JButton();
        jTFNameUpdate_NEW = new javax.swing.JTextField();
        jTFLastnameUpdate_NEW = new javax.swing.JTextField();
        jTFAdressUpdate_NEW = new javax.swing.JTextField();
        jTFEmailUpdate_NEW = new javax.swing.JTextField();
        jTFTelUpdate_NEW = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSpinneYear_b_NEW = new javax.swing.JSpinner();
        jSpinneMonth_b_NEW = new javax.swing.JSpinner();
        jSpinneDay_b_NEW = new javax.swing.JSpinner();
        jLabelErrorDate_NEW = new javax.swing.JLabel();
        jLabelMessage_NEW = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabelName_d_NEW = new javax.swing.JLabel();
        jLabelLastName_d_NEW = new javax.swing.JLabel();
        jLabelBirthday_d_NEW = new javax.swing.JLabel();
        jButtonCancel_leader = new javax.swing.JButton();
        jLabelAddress_d_NEW = new javax.swing.JLabel();
        jLabelEmail_d_NEW = new javax.swing.JLabel();
        jLabelTel_d_NEW = new javax.swing.JLabel();
        jButtonUpdate_d_NEW = new javax.swing.JButton();
        jLabelBarriereNEW = new javax.swing.JLabel();
        jPanelClub_NEWUnder2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabelNb_member_NEW = new javax.swing.JLabel();
        jPanelActivity_NEW = new javax.swing.JPanel();
        jLabelActivityTitre = new javax.swing.JLabel();
        jPanelActivity_NEWUnder = new javax.swing.JPanel();
        jScrollPane_A_NEW = new javax.swing.JScrollPane();
        jTable_A_NEW = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jTextFieldPlace_A_NEW = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jTextFieldTime_A_NEW = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jTextFieldDate_A_NEW = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jTextFieldDescription_A_NEW = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTextFieldName_A_NEW = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jButtonValide_A_NEW = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jTextFieldID_A_NEW = new javax.swing.JTextField();
        jButtonCancel_A_NEW = new javax.swing.JButton();
        jPanelMember_NEW = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jButtonSearchMember_NEW = new javax.swing.JButton();
        jTextfieldAddMember_NEW = new javax.swing.JTextField();
        jPanelMember_NEWUnder = new javax.swing.JPanel();
        jScrollMember_NEW = new javax.swing.JScrollPane();
        jTableMember_NEW = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jTextFieldMatriculeMember_NEW = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jTextFieldNameMember_NEW = new javax.swing.JTextField();
        jTextFieldLastnameMember_NEW = new javax.swing.JTextField();
        jTextFieldBirthdayMember_NEW = new javax.swing.JTextField();
        jTextFieldAdressMember_NEW = new javax.swing.JTextField();
        jTextFieldEmailMember_NEW = new javax.swing.JTextField();
        jTextFieldTelMember_NEW = new javax.swing.JTextField();
        jButtonAddMember_NEW = new javax.swing.JButton();
        jButtonUpdateMember_NEW = new javax.swing.JButton();
        jButtonDeleteMember_NEW = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jPanelNEWUnder.setBackground(new java.awt.Color(0, 0, 0, 0));
        jPanelNEWUnder.setOpaque(false);
        jPanelNEWUnder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPaneNEW.setBackground(new java.awt.Color(45, 130, 50));
        jTabbedPaneNEW.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPaneNEW.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jTabbedPaneNEW.setName("");

        jPanelClub_NEW.setOpaque(false);
        jPanelClub_NEW.setRequestFocusEnabled(false);
        
        jButtonCancel_leader.setBackground(new java.awt.Color(204, 0, 0));
        jButtonCancel_leader.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCancel_leader.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancel_leader.setText("Retour");
        jButtonCancel_leader.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancel_leaderMouseClicked(evt);
            }
        });

        jPanelClub_NEWUnder.setBackground(new java.awt.Color(45, 110, 50));
        jPanelClub_NEWUnder.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dirigeant du club "+club+"", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255)));
        jPanelClub_NEWUnder.setMinimumSize(new java.awt.Dimension(409, 460));
        jPanelClub_NEWUnder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(45, 110, 50));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modification du dirigeant", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255)));

        jButtonConf_d_NEW.setBackground(new java.awt.Color(0, 204, 204));
        jButtonConf_d_NEW.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButtonConf_d_NEW.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConf_d_NEW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/valide_fav.png")));
        jButtonConf_d_NEW.setText("Valider");
        jButtonConf_d_NEW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonConf_d_NEWMouseClicked(evt);
            }
        });
        jButtonConf_d_NEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConf_d_NEWActionPerformed(evt);
            }
        });

        jTFEmailUpdate_NEW.setText("exemple@gmail.com");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nom :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Prénoms :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date de naissance :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Adresse :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email :");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Téléphone :");

        jSpinneYear_b_NEW.setModel(new javax.swing.SpinnerNumberModel(2000, 1900, 2010, 1));

        jSpinneMonth_b_NEW.setModel(new javax.swing.SpinnerNumberModel(12, 1, 12, 1));

        jSpinneDay_b_NEW.setModel(new javax.swing.SpinnerNumberModel(31, 1, 31, 1));

        jLabelErrorDate_NEW.setForeground(new java.awt.Color(255, 0, 0));

        jLabelMessage_NEW.setFont(new java.awt.Font("Segoe UI", 0, 13));
        jLabelMessage_NEW.setForeground(new java.awt.Color(255, 153, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCancel_leader, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel16))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFLastnameUpdate_NEW)
                    .addComponent(jTFNameUpdate_NEW)
                    .addComponent(jTFEmailUpdate_NEW)
                    .addComponent(jTFAdressUpdate_NEW)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMessage_NEW)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelErrorDate_NEW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jSpinneDay_b_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jSpinneMonth_b_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jSpinneYear_b_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 74, Short.MAX_VALUE))
                                .addComponent(jTFTelUpdate_NEW)))))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConf_d_NEW)
                .addGap(55, 55, 55))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNameUpdate_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFLastnameUpdate_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jSpinneMonth_b_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinneDay_b_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinneYear_b_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabelErrorDate_NEW)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFAdressUpdate_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFEmailUpdate_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFTelUpdate_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addComponent(jLabelMessage_NEW)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConf_d_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel_leader, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jPanelClub_NEWUnder.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 460));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nom : ");
        jPanelClub_NEWUnder.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 48, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Prénoms : ");
        jPanelClub_NEWUnder.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 104, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Date de naissance : ");
        jPanelClub_NEWUnder.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Adresse : ");
        jPanelClub_NEWUnder.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 216, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Email : ");
        jPanelClub_NEWUnder.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 272, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Téléphone :");
        jPanelClub_NEWUnder.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 328, -1, -1));

        jLabelName_d_NEW.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabelName_d_NEW.setForeground(new java.awt.Color(255, 255, 255));
        jLabelName_d_NEW.setText("nom_d");
        jPanelClub_NEWUnder.add(jLabelName_d_NEW, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 48, -1, -1));

        jLabelLastName_d_NEW.setFont(new java.awt.Font("Segoe UI", 1, 16));
        jLabelLastName_d_NEW.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLastName_d_NEW.setText("prénoms_d");
        jPanelClub_NEWUnder.add(jLabelLastName_d_NEW, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 102, -1, -1));

        jLabelBirthday_d_NEW.setFont(new java.awt.Font("Segoe UI", 1, 16));
        jLabelBirthday_d_NEW.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBirthday_d_NEW.setText("date_naissance_d");
        jPanelClub_NEWUnder.add(jLabelBirthday_d_NEW, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 158, -1, -1));

        jLabelAddress_d_NEW.setFont(new java.awt.Font("Segoe UI", 1, 16));
        jLabelAddress_d_NEW.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAddress_d_NEW.setText("adresse_d");
        jPanelClub_NEWUnder.add(jLabelAddress_d_NEW, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 214, -1, -1));

        jLabelEmail_d_NEW.setFont(new java.awt.Font("Segoe UI", 1, 16));
        jLabelEmail_d_NEW.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail_d_NEW.setText("email_d");
        jPanelClub_NEWUnder.add(jLabelEmail_d_NEW, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 270, -1, -1));

        jLabelTel_d_NEW.setFont(new java.awt.Font("Segoe UI", 1, 16));
        jLabelTel_d_NEW.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTel_d_NEW.setText("telephone_d");
        jPanelClub_NEWUnder.add(jLabelTel_d_NEW, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 326, -1, -1));

        jButtonUpdate_d_NEW.setBackground(new java.awt.Color(0, 204, 0));
        jButtonUpdate_d_NEW.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButtonUpdate_d_NEW.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdate_d_NEW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/updateMember_fav.png")));
        jButtonUpdate_d_NEW.setText("Modifier");
        jButtonUpdate_d_NEW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonUpdate_d_NEWMouseClicked(evt);
            }
        });
        jButtonUpdate_d_NEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdate_d_NEWActionPerformed(evt);
            }
        });
        jPanelClub_NEWUnder.add(jButtonUpdate_d_NEW, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 387, -1, 34));

        jLabelBarriereNEW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banniereFR.jpg")));

        jPanelClub_NEWUnder2.setBackground(new java.awt.Color(45, 110, 50));
        jPanelClub_NEWUnder2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information club", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); 

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Nom : ");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Description :");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Membre : ");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("club linguistique " + club);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Apprentissage de langue");

        jLabelNb_member_NEW.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        jLabelNb_member_NEW.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNb_member_NEW.setText("120");

        javax.swing.GroupLayout jPanelClub_NEWUnder2Layout = new javax.swing.GroupLayout(jPanelClub_NEWUnder2);
        jPanelClub_NEWUnder2.setLayout(jPanelClub_NEWUnder2Layout);
        jPanelClub_NEWUnder2Layout.setHorizontalGroup(
            jPanelClub_NEWUnder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClub_NEWUnder2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanelClub_NEWUnder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelClub_NEWUnder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel27)
                    .addComponent(jLabelNb_member_NEW))
                .addGap(55, 55, 55))
        );
        jPanelClub_NEWUnder2Layout.setVerticalGroup(
            jPanelClub_NEWUnder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClub_NEWUnder2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelClub_NEWUnder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel27))
                .addGap(34, 34, 34)
                .addGroup(jPanelClub_NEWUnder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel28))
                .addGap(34, 34, 34)
                .addGroup(jPanelClub_NEWUnder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabelNb_member_NEW))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelClub_NEWLayout = new javax.swing.GroupLayout(jPanelClub_NEW);
        jPanelClub_NEW.setLayout(jPanelClub_NEWLayout);
        jPanelClub_NEWLayout.setHorizontalGroup(
            jPanelClub_NEWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClub_NEWLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabelBarriereNEW)
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(jPanelClub_NEWLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanelClub_NEWUnder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelClub_NEWUnder2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanelClub_NEWLayout.setVerticalGroup(
            jPanelClub_NEWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClub_NEWLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelBarriereNEW)
                .addGap(25, 25, 25)
                .addGroup(jPanelClub_NEWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelClub_NEWUnder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelClub_NEWUnder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jTabbedPaneNEW.addTab("Club        ", new javax.swing.ImageIcon(getClass().getResource("/images/club_icone.png")), jPanelClub_NEW); 

        jPanelActivity_NEW.setOpaque(false);

        jLabelActivityTitre.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabelActivityTitre.setForeground(new java.awt.Color(45, 110, 50));
        jLabelActivityTitre.setText("Nos activités");

        jPanelActivity_NEWUnder.setBackground(new java.awt.Color(45, 110, 50));

        jTable_A_NEW.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Identifiant", "Nom", "description", "date", "horaire", "lieu", "status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane_A_NEW.setViewportView(jTable_A_NEW);

        jPanel18.setBackground(new java.awt.Color(45, 130, 50));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Création d'activité", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13), new java.awt.Color(255, 255, 255))); 

        jTextFieldPlace_A_NEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlace_A_NEWActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Lieu");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Horaire");

        jTextFieldDate_A_NEW.setText("2000-12-31");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Date");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Description");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Nom");

        jButtonValide_A_NEW.setBackground(new java.awt.Color(0, 204, 204));
        jButtonValide_A_NEW.setForeground(new java.awt.Color(255, 255, 255));
        jButtonValide_A_NEW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/valide_fav.png"))); 
        jButtonValide_A_NEW.setText("valider");
        jButtonValide_A_NEW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonValide_A_NEWMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldName_A_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(jTextFieldDescription_A_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(jTextFieldDate_A_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(jTextFieldTime_A_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jTextFieldPlace_A_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonValide_A_NEW))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(jLabel45)
                    .addComponent(jLabel47)
                    .addComponent(jLabel48))
                .addGap(10, 10, 10)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldName_A_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDescription_A_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDate_A_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTime_A_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPlace_A_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonValide_A_NEW))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(45, 130, 50));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Annuler un activité", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13), new java.awt.Color(255, 255, 255))); 

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Identifiant");

        jButtonCancel_A_NEW.setBackground(new java.awt.Color(255, 0, 0));
        jButtonCancel_A_NEW.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancel_A_NEW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/deleteMember_fav.png"))); 
        jButtonCancel_A_NEW.setText("Annuler");
        jButtonCancel_A_NEW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancel_A_NEWMouseClicked(evt);
            }
        });
        jButtonCancel_A_NEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancel_A_NEWActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jTextFieldID_A_NEW, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancel_A_NEW)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldID_A_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel_A_NEW))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelActivity_NEWUnderLayout = new javax.swing.GroupLayout(jPanelActivity_NEWUnder);
        jPanelActivity_NEWUnder.setLayout(jPanelActivity_NEWUnderLayout);
        jPanelActivity_NEWUnderLayout.setHorizontalGroup(
            jPanelActivity_NEWUnderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelActivity_NEWUnderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelActivity_NEWUnderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelActivity_NEWUnderLayout.createSequentialGroup()
                        .addComponent(jScrollPane_A_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(9, Short.MAX_VALUE))
                    .addGroup(jPanelActivity_NEWUnderLayout.createSequentialGroup()
                        .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        jPanelActivity_NEWUnderLayout.setVerticalGroup(
            jPanelActivity_NEWUnderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelActivity_NEWUnderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane_A_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelActivity_NEWUnderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelActivity_NEWLayout = new javax.swing.GroupLayout(jPanelActivity_NEW);
        jPanelActivity_NEW.setLayout(jPanelActivity_NEWLayout);
        jPanelActivity_NEWLayout.setHorizontalGroup(
            jPanelActivity_NEWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelActivity_NEWLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelActivity_NEWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelActivityTitre)
                    .addComponent(jPanelActivity_NEWUnder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelActivity_NEWLayout.setVerticalGroup(
            jPanelActivity_NEWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelActivity_NEWLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelActivityTitre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelActivity_NEWUnder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneNEW.addTab("Activités  ", new javax.swing.ImageIcon(getClass().getResource("/images/activite.png")), jPanelActivity_NEW); 

        jPanelMember_NEW.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelMember_NEW.setOpaque(false);
        jPanelMember_NEW.setPreferredSize(new java.awt.Dimension(1300, 654));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 18)); 
        jLabel18.setForeground(new java.awt.Color(45, 110,50));
        jLabel18.setText("Membre du club " + club);

        jButtonSearchMember_NEW.setBackground(new java.awt.Color(0, 153, 255));
        jButtonSearchMember_NEW.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSearchMember_NEW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchMember_fav.png"))); 
        jButtonSearchMember_NEW.setText("Rechercher");
        jButtonSearchMember_NEW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSearchMember_NEWMouseClicked(evt);
            }
        });
        jButtonSearchMember_NEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchMember_NEWActionPerformed(evt);
            }
        });

        jTextfieldAddMember_NEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextfieldAddMember_NEWActionPerformed(evt);
            }
        });

        jPanelMember_NEWUnder.setBackground(new java.awt.Color(45, 110, 50));

        jScrollMember_NEW.setHorizontalScrollBar(null);

        jTableMember_NEW.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "N° Matricule", "Nom", "Prénoms", "Date de naissance", "Adresse", "Email", "Téléphone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollMember_NEW.setViewportView(jTableMember_NEW);

        jPanel5.setBackground(new java.awt.Color(45, 130, 50));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modification ou suppression", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); 

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("N°Matricule");

        jTextFieldMatriculeMember_NEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMatriculeMember_NEWActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(45, 130, 50));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ajoutation d'un membre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); 
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Nom");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Prénoms");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Date de naissance");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Adresse");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Email");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Téléphone");

        jTextFieldLastnameMember_NEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLastnameMember_NEWActionPerformed(evt);
            }
        });

        jTextFieldEmailMember_NEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailMember_NEWActionPerformed(evt);
            }
        });

        jTextFieldTelMember_NEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelMember_NEWActionPerformed(evt);
            }
        });

        jButtonAddMember_NEW.setBackground(new java.awt.Color(0, 255, 51));
        jButtonAddMember_NEW.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddMember_NEW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addmember_fav.png"))); 
        jButtonAddMember_NEW.setText("Ajouter");
        jButtonAddMember_NEW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddMember_NEWMouseClicked(evt);
            }
        });
        jButtonAddMember_NEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddMember_NEWActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jTextFieldNameMember_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(85, 85, 85)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldLastnameMember_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jTextFieldBirthdayMember_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jTextFieldAdressMember_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel34))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(
                                jTextFieldEmailMember_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel35))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jTextFieldTelMember_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAddMember_NEW)))
                .addGap(1232, 1232, 1232))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel33)
                                .addComponent(jLabel29)
                                .addComponent(jLabel34)
                                .addComponent(jLabel35)))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLastnameMember_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNameMember_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBirthdayMember_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAdressMember_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmailMember_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTelMember_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddMember_NEW))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButtonUpdateMember_NEW.setBackground(new java.awt.Color(0, 255, 51));
        jButtonUpdateMember_NEW.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdateMember_NEW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/updateMember_fav.png"))); 
        jButtonUpdateMember_NEW.setText("Modifier");
        jButtonUpdateMember_NEW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonUpdateMember_NEWMouseClicked(evt);
            }
        });
        jButtonUpdateMember_NEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateMember_NEWActionPerformed(evt);
            }
        });

        jButtonDeleteMember_NEW.setBackground(new java.awt.Color(255, 0, 0));
        jButtonDeleteMember_NEW.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDeleteMember_NEW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/deleteMember_fav.png"))); 
        jButtonDeleteMember_NEW.setText("Supprimer");
        jButtonDeleteMember_NEW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDeleteMember_NEWMouseClicked(evt);
            }
        });
        jButtonDeleteMember_NEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteMember_NEWActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonDeleteMember_NEW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel61)
                    .addComponent(jTextFieldMatriculeMember_NEW))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonUpdateMember_NEW)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldMatriculeMember_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonUpdateMember_NEW)
                    .addComponent(jButtonDeleteMember_NEW))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelMember_NEWUnderLayout = new javax.swing.GroupLayout(jPanelMember_NEWUnder);
        jPanelMember_NEWUnder.setLayout(jPanelMember_NEWUnderLayout);
        jPanelMember_NEWUnderLayout.setHorizontalGroup(
            jPanelMember_NEWUnderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMember_NEWUnderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMember_NEWUnderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelMember_NEWUnderLayout.createSequentialGroup()
                        .addComponent(jScrollMember_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelMember_NEWUnderLayout.setVerticalGroup(
            jPanelMember_NEWUnderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMember_NEWUnderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollMember_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelMember_NEWLayout = new javax.swing.GroupLayout(jPanelMember_NEW);
        jPanelMember_NEW.setLayout(jPanelMember_NEWLayout);
        jPanelMember_NEWLayout.setHorizontalGroup(
            jPanelMember_NEWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMember_NEWLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextfieldAddMember_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSearchMember_NEW)
                .addGap(57, 57, 57))
            .addGroup(jPanelMember_NEWLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMember_NEWUnder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMember_NEWLayout.setVerticalGroup(
            jPanelMember_NEWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMember_NEWLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelMember_NEWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMember_NEWLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMember_NEWLayout.createSequentialGroup()
                        .addGroup(jPanelMember_NEWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextfieldAddMember_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSearchMember_NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanelMember_NEWUnder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPaneNEW.addTab("Membres ", new javax.swing.ImageIcon(getClass().getResource("/images/member_icone.png")), jPanelMember_NEW); 

        jPanelNEWUnder.add(jTabbedPaneNEW, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 660));
        
        //
        
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondClubs.png")));

        javax.swing.GroupLayout jPanelNEWLayout = new javax.swing.GroupLayout(jPanelNEW);
        jPanelNEW.setLayout(jPanelNEWLayout);
        jPanelNEWLayout.setHorizontalGroup(
            jPanelNEWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNEWLayout.createSequentialGroup()
                .addComponent(jPanelNEWUnder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, Short.MAX_VALUE))
            .addGroup(jPanelNEWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNEWLayout.createSequentialGroup()
                    .addGap(105, 105, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1128, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanelNEWLayout.setVerticalGroup(
            jPanelNEWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNEWLayout.createSequentialGroup()
                .addComponent(jPanelNEWUnder, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelNEWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNEWLayout.createSequentialGroup()
                    .addContainerGap(0, 0)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

    }

    private void jButtonConf_d_NEWMouseClicked(java.awt.event.MouseEvent evt) {                                              
        changeInfoLeader(club, jTFNameUpdate_NEW, jTFLastnameUpdate_NEW,
            jSpinneYear_b_NEW,jSpinneMonth_b_NEW,jSpinneDay_b_NEW,jTFAdressUpdate_NEW, jTFEmailUpdate_NEW, jTFTelUpdate_NEW,
            jPanel3,jLabelErrorDate_NEW, jLabelMessage_NEW);
        callPostDataLeader(club,jLabelName_d_NEW,jLabelLastName_d_NEW,
            jLabelBirthday_d_NEW,jLabelAddress_d_NEW,jLabelEmail_d_NEW,
            jLabelTel_d_NEW,jLabelNb_member_NEW);
    }                                             

    private void jButtonConf_d_NEWActionPerformed(java.awt.event.ActionEvent evt) {                                                 

    }                                                

    private void jButtonUpdate_d_NEWMouseClicked(java.awt.event.MouseEvent evt) {                                                
        jPanel3.setVisible(true);
    }                                               

    private void jButtonUpdate_d_NEWActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void jTextFieldPlace_A_NEWActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void jButtonValide_A_NEWMouseClicked(java.awt.event.MouseEvent evt) {                                                
        try {
            addActivity(club, jTextFieldName_A_NEW, jTextFieldDescription_A_NEW, jTextFieldDate_A_NEW,
                jTextFieldTime_A_NEW, jTextFieldPlace_A_NEW, jTable_A_NEW);
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                               

    private void jButtonCancel_A_NEWMouseClicked(java.awt.event.MouseEvent evt) {                                                
        try {
            deleteAtctivity(club, jTextFieldID_A_NEW, jTable_A_NEW);
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                               

    private void jButtonCancel_A_NEWActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void jButtonSearchMember_NEWMouseClicked(java.awt.event.MouseEvent evt) {                                                    
        try {
            searchInfoMember(club, jTextfieldAddMember_NEW, jTableMember_NEW);
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                                   

    private void jButtonSearchMember_NEWActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void jTextfieldAddMember_NEWActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void jTextFieldMatriculeMember_NEWActionPerformed(java.awt.event.ActionEvent evt) {                                                             
        // TODO add your handling code here:
    }                                                            

    private void jTextFieldLastnameMember_NEWActionPerformed(java.awt.event.ActionEvent evt) {                                                            
        // TODO add your handling code here:
    }                                                           

    private void jTextFieldEmailMember_NEWActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
    }                                                        

    private void jTextFieldTelMember_NEWActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void jButtonAddMember_NEWMouseClicked(java.awt.event.MouseEvent evt) {                                                 
        try {
            addMember(club, jTextFieldNameMember_NEW,jTextFieldLastnameMember_NEW,
                jTextFieldBirthdayMember_NEW,jTextFieldAdressMember_NEW,
                jTextFieldEmailMember_NEW,jTextFieldTelMember_NEW,jTableMember_NEW, jLabelNb_member_NEW);
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                                

    private void jButtonAddMember_NEWActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void jButtonUpdateMember_NEWMouseClicked(java.awt.event.MouseEvent evt) {                                                    
        changeInfoMember(club,jTextFieldMatriculeMember_NEW,jTextFieldNameMember_NEW,
            jTextFieldLastnameMember_NEW,jTextFieldBirthdayMember_NEW,jTextFieldAdressMember_NEW
            ,jTextFieldEmailMember_NEW,jTextFieldTelMember_NEW,jTableMember_NEW);
    }                                                   

    private void jButtonUpdateMember_NEWActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void jButtonDeleteMember_NEWMouseClicked(java.awt.event.MouseEvent evt) {                                                    
        try {
            deleteMember(club, jTextFieldMatriculeMember_NEW,jTableMember_NEW, jLabelNb_member_NEW);
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                                   

    private void jButtonDeleteMember_NEWActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }
    
    private void jButtonCancel_leaderMouseClicked(java.awt.event.MouseEvent evt) {                                                  
        jPanel3.setVisible(false);
    } 
    
    public void changeInfoLeader(String club, javax.swing.JTextField jtName,javax.swing.JTextField jtLastname, 
            javax.swing.JSpinner year,javax.swing.JSpinner month, 
            javax.swing.JSpinner day, javax.swing.JTextField jtAdress, javax.swing.JTextField jtEmail, 
            javax.swing.JTextField jtTel, javax.swing.JPanel container, javax.swing.JLabel messageError,
            javax.swing.JLabel jmessage){
        String name = String.valueOf(jtName.getText());
        String lastname = String.valueOf(jtLastname.getText());
        String birthday = String.valueOf(year.getValue() + "-" + month.getValue() + "-" + day.getValue());
        String adress = String.valueOf(jtAdress.getText());
        String email = String.valueOf(jtEmail.getText());
        String tel = String.valueOf(jtTel.getText());
        if ("".equals(name) || "".equals(lastname) || "".equals(birthday) || "".equals(adress) || 
                "".equals(email) || "".equals(tel)){
            String message = "Remplire les cases!";
            jmessage.setText(message);
        }else{
            Connection connect = null;
                try {
                    ConnectionDb.Charge();
                    connect = ConnectionDb.getConnection();
                    Statement cursor = connect.createStatement();
                    String query = "UPDATE club_langage.leaderClub SET nom='"+name+"',"
                        + "prenoms='"+lastname+"',"
                        + "date_de_naissance='"+birthday+"',"
                        + "adresse='"+adress+"',"
                        + "email='"+email+"',"
                        + "telephone='"+tel+"' "
                        + "WHERE club='"+club+"'";
                    cursor.executeUpdate(query);
                    connect.close();
                    container.setVisible(false);
                } catch (ClassNotFoundException e) {
                    System.out.println("echec du chargement du driver");
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    messageError.setText("La Date ne correspond pas");
                }
        }
    }
    
    public void setTime(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                        
                    }
                    Date date = new Date();
                    SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                    SimpleDateFormat df = new SimpleDateFormat("EEEE, dd-MM-yyyy");
                    String time = tf.format(date);
                }
            }
        }).start();
    }
    
    public void postDataLeader(String club, javax.swing.JLabel jLName, javax.swing.JLabel jLLastname,
            javax.swing.JLabel jLBirthday, javax.swing.JLabel jLAdress, javax.swing.JLabel jLEmail, 
            javax.swing.JLabel jLTel,javax.swing.JLabel jLCompter) throws SQLException{
        Connection connect = null;
            try {
                ConnectionDb.Charge();
		connect = ConnectionDb.getConnection();
		Statement cursor = connect.createStatement();
                String sql = "select * from club_langage.leaderClub where club='" + club + "'";
		ResultSet result = cursor.executeQuery(sql);
		while(result.next()) {
                    String name = result.getString("nom");
                    String lastname = result.getString("prenoms");
                    String birthday = result.getString("date_de_naissance");
                    String adress = result.getString("adresse");
                    String email = result.getString("email");
                    String telephone = result.getString("telephone");
                    jLName.setText(name);
                    jLLastname.setText(lastname);
                    jLBirthday.setText(birthday);
                    jLAdress.setText(adress);
                    jLEmail.setText(email);
                    jLTel.setText(telephone);
		}
                compterMember(club, jLCompter);
		
                connect.close();
            } catch (ClassNotFoundException e) {
		System.out.println("echec du chargement du driver");
            }
    }
    
    public void compterMember(String club, javax.swing.JLabel jLCompter) throws SQLException{
        try {
            Connection connect = null;
            ConnectionDb.Charge();
            connect = ConnectionDb.getConnection();
            String compterSql = "SELECT COUNT(*) FROM club_langage.member WHERE club='"+club+"' and status ='membre'";
            Statement statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery(compterSql);
            
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                jLCompter.setText(" "+count);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void callPostDataLeader(String club, javax.swing.JLabel jLName, javax.swing.JLabel jLLastname,
            javax.swing.JLabel jLBirthday, javax.swing.JLabel jLAdress, javax.swing.JLabel jLEmail, 
            javax.swing.JLabel jLTel,javax.swing.JLabel jLCompter){
        try {
            postDataLeader(club,jLName,jLLastname,jLBirthday,jLAdress,jLEmail,jLTel,jLCompter);
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    public void insertDataInTable(String club, javax.swing.JTable myTable) throws SQLException{
        Connection connect = null;
            try {
                ConnectionDb.Charge();
		connect = ConnectionDb.getConnection();
		Statement cursor = connect.createStatement();
                String query = "SELECT matricule,nom,prénoms,date_de_naissance,adresse,email,telephone FROM club_langage.member WHERE club='"+club+"'"
                        + " and status='membre'";
		ResultSet result = cursor.executeQuery(query);
		ResultSetMetaData metaData = result.getMetaData();
                int columnCount = metaData.getColumnCount();
                DefaultTableModel tableModel = new DefaultTableModel();
                for (int i = 1; i <= columnCount; i++) {
                    tableModel.addColumn(metaData.getColumnName(i));
                }
                while (result.next()) {
                    Object[] rowData = new Object[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        rowData[i - 1] = result.getObject(i);
                    }
                    tableModel.addRow(rowData);
                }
                myTable.setModel(tableModel);
                connect.close();
            } catch (ClassNotFoundException e) {
		System.out.println("echec du chargement du driver");
            }
    }
    
    public void insertActivityInTable(String club, javax.swing.JTable myTable) throws SQLException{
        Connection connect = null;
            try {
                ConnectionDb.Charge();
		connect = ConnectionDb.getConnection();
		Statement cursor = connect.createStatement();
                String query = "SELECT ID,nom,description,date,"
                        + "horaire,lieu,status FROM club_langage.activity "
                        + "WHERE club='"+club+"' ORDER BY date DESC";
		ResultSet result = cursor.executeQuery(query);
		ResultSetMetaData metaData = result.getMetaData();
                int columnCount = metaData.getColumnCount();
                DefaultTableModel tableModel = new DefaultTableModel();
                for (int i = 1; i <= columnCount; i++) {
                    tableModel.addColumn(metaData.getColumnName(i));
                }
                while (result.next()) {
                    Object[] rowData = new Object[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        rowData[i - 1] = result.getObject(i);
                    }
                    tableModel.addRow(rowData);
                }
                myTable.setModel(tableModel);
                verifyDatePassed();
                connect.close();
            } catch (ClassNotFoundException e) {
		System.out.println("echec du chargement du driver");
            }
    }
    
    public void deleteAtctivity(String club, javax.swing.JTextField myID, 
            javax.swing.JTable myTable) throws SQLException{
        String id = myID.getText();
        Connection connect = null;
        try {
            ConnectionDb.Charge();
            connect = ConnectionDb.getConnection();
            Statement st = connect.createStatement();
            String queryDeleteMember = "DELETE FROM club_langage.activity WHERE club='"+club+"' and ID='"+id+"'";
            st.executeUpdate(queryDeleteMember);
            myID.setText("");
            insertActivityInTable(club, myTable);
	    connect.close();
        } catch (ClassNotFoundException e) {
            System.out.println("echec du chargement du driver");
        }
    }
    
    public void addActivity(String club, javax.swing.JTextField nameA, javax.swing.JTextField descA,
            javax.swing.JTextField dateA, javax.swing.JTextField timeA, javax.swing.JTextField placeA,
            javax.swing.JTable myTableA) throws SQLException{
        String name = nameA.getText();
        String desc = descA.getText();
        String date = dateA.getText();
        String time = timeA.getText();
        String place = placeA.getText();
        String status;
        
        LocalDate currentDate = LocalDate.now();
        LocalDate dateL = LocalDate.parse(date);
                    
        LocalTime timeL = LocalTime.parse(time);
        LocalTime currentTime = LocalTime.now();
        Duration difference = Duration.between(timeL, currentTime);
        long heures = difference.toHours();
        long minutes = difference.toMinutes() % 60;

        if (dateL.isBefore(currentDate)) {
            status = "passé";
        }else{
            long difDate = ChronoUnit.DAYS.between(currentDate, dateL);
            status = difDate + "j " + heures + "h:" + minutes;
        }
        
        Connection connect = null;
        try {
            ConnectionDb.Charge();
            connect = ConnectionDb.getConnection();
            Statement st = connect.createStatement();
            String queryAddMember = "INSERT INTO club_langage.activity(ID,nom,description,"
                    + "date,horaire,lieu,status,club) VALUE(NULL,"
                    + "'"+name+"','"+desc+"','"+date+"',"
                    + "'"+time+"','"+place+"','"+status+"','"+club+"')";
            st.executeUpdate(queryAddMember);
            insertActivityInTable(club, myTableA);
            nameA.setText("");
            descA.setText("");
            dateA.setText("");
            timeA.setText("");
            placeA.setText("");
            verifyDatePassed();
	    connect.close();
        } catch (ClassNotFoundException e) {
            System.out.println("echec du chargement du driver");
        }
    }
    
    public void addMember(String club, javax.swing.JTextField jname,javax.swing.JTextField jlastname,
            javax.swing.JTextField jbirthday,javax.swing.JTextField jadress,javax.swing.JTextField jemail
            ,javax.swing.JTextField jtel, javax.swing.JTable myTable, javax.swing.JLabel jcompter) throws SQLException{
        String name = jname.getText();
        String lastname = jlastname.getText();
        String birthday = jbirthday.getText();
        String adress = jadress.getText();
        String email = jemail.getText();
        String tel = jtel.getText();
        
        Connection connect = null;
        try {
            ConnectionDb.Charge();
            connect = ConnectionDb.getConnection();
            Statement st = connect.createStatement();
            String queryAddMember = "INSERT INTO club_langage.member(matricule,nom,prénoms,"
                    + "date_de_naissance,adresse,email,telephone,club,status) VALUE(NULL,"
                    + "'"+name+"','"+lastname+"','"+birthday+"',"
                    + "'"+adress+"','"+email+"','"+tel+"','"+club+"','membre')";
            st.executeUpdate(queryAddMember);
            insertDataInTable(club, myTable);
            jname.setText("");
            jlastname.setText("");
            jbirthday.setText("");
            jadress.setText("");
            jemail.setText("");
            jtel.setText("");
            compterMember(club, jcompter);
	    connect.close();
        } catch (ClassNotFoundException e) {
            System.out.println("echec du chargement du driver");
        }
    }
    
    public void deleteMember(String club, javax.swing.JTextField matriculeMember, javax.swing.JTable table,
            javax.swing.JLabel jcompter) throws SQLException{
        String matricule = matriculeMember.getText();
        Connection connect = null;
        try {
            ConnectionDb.Charge();
            connect = ConnectionDb.getConnection();
            Statement st = connect.createStatement();
            String queryDeleteMember = "UPDATE club_langage.member SET status='supprimer' WHERE club='"+club+"' and matricule='"+matricule+"'";
            st.executeUpdate(queryDeleteMember);
            matriculeMember.setText("");
            insertDataInTable(club, table);
            compterMember(club, jcompter);
	    connect.close();
        } catch (ClassNotFoundException e) {
            System.out.println("echec du chargement du driver");
        }
    }
    
    public void changeInfoMember(String club, javax.swing.JTextField jtMatricule,javax.swing.JTextField jtName,
            javax.swing.JTextField jtLastname, javax.swing.JTextField jtBirthday, javax.swing.JTextField jtAdress, 
            javax.swing.JTextField jtEmail, 
            javax.swing.JTextField jtTel, javax.swing.JTable myTable){
        
        String matricule = String.valueOf(jtMatricule.getText());
        String name = String.valueOf(jtName.getText());
        String lastname = String.valueOf(jtLastname.getText());
        String birthday = String.valueOf(jtBirthday.getText());
        String adress = String.valueOf(jtAdress.getText());
        String email = String.valueOf(jtEmail.getText());
        String tel = String.valueOf(jtTel.getText());
        Connection connect = null;
            try {
                ConnectionDb.Charge();
		connect = ConnectionDb.getConnection();
		Statement statUpdate = connect.createStatement();
                String queryUpdate = "UPDATE club_langage.member SET matricule='"+matricule+"', nom='"+name+"',"
                    + "prénoms='"+lastname+"',"
                    + "date_de_naissance='"+birthday+"',"
                    + "adresse='"+adress+"',"
                    + "email='"+email+"',"
                    + "telephone='"+tel+"', "
                    + "club='"+club+"' WHERE club='"+club+"' and matricule='"+matricule+"'";
                statUpdate.executeUpdate(queryUpdate);
                
                jtName.setText("");
                jtLastname.setText("");
                jtBirthday.setText("");
                jtAdress.setText("");
                jtEmail.setText("");
                jtTel.setText("");
                insertDataInTable(club, myTable);
                connect.close();
            } catch (ClassNotFoundException e) {
		System.out.println("echec du chargement du driver");
            } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void searchInfoMember(String club, javax.swing.JTextField inputSearch,javax.swing.JTable myTable) throws SQLException{
        if ("".equals(inputSearch.getText())){
            insertDataInTable(club, myTable);
        }else{
            Connection connect = null;
            try {
                ConnectionDb.Charge();
		connect = ConnectionDb.getConnection();
		Statement cursor = connect.createStatement();
                String nameSearch = inputSearch.getText();
                String query = "SELECT matricule,nom,prénoms,date_de_naissance,adresse,"
                        + "email,telephone FROM club_langage.member "
                        + "WHERE club='"+club+"' and nom='"+nameSearch+"'";
		ResultSet result = cursor.executeQuery(query);
		ResultSetMetaData metaData = result.getMetaData();
                int columnCount = metaData.getColumnCount();
                DefaultTableModel tableModel = new DefaultTableModel();
                for (int i = 1; i <= columnCount; i++) {
                    tableModel.addColumn(metaData.getColumnName(i));
                }
                while (result.next()) {
                    Object[] rowData = new Object[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        rowData[i - 1] = result.getObject(i);
                    }
                    tableModel.addRow(rowData);
                }
                myTable.setModel(tableModel);
                inputSearch.setText("");
                connect.close();
            } catch (ClassNotFoundException e) {
		System.out.println("echec du chargement du driver");
            }
        }
    }
    
    public void verifyDatePassed() throws SQLException{
        Connection connect = null;
        try {
            ConnectionDb.Charge();
            connect = ConnectionDb.getConnection();
            PreparedStatement selectStmt = connect.prepareStatement("SELECT * FROM club_langage.activity");
            ResultSet resultSet = selectStmt.executeQuery();
            PreparedStatement updateStmt = connect.prepareStatement("UPDATE club_langage.activity SET "
                     + "status = 'passé' WHERE id = ?");
                while (resultSet.next()) {
                    String date = String.valueOf(resultSet.getDate("date"));
                    String time = String.valueOf(resultSet.getTime("horaire"));
                    LocalDate currentDate = LocalDate.now();
                    LocalDate dateL = LocalDate.parse(date);
                    
                    LocalTime timeL = LocalTime.parse(time);
                    LocalTime currentTime = LocalTime.now();
                    Duration difference = Duration.between(timeL, currentTime);
                    long heures = difference.toHours(); // Récupération du nombre d'heures
                    long minutes = difference.toMinutes() % 60; // Récupération du nombre de minutes


                    if (dateL.isBefore(currentDate)) {
                        int id = resultSet.getInt("id");
                        updateStmt.setInt(1, id);
                        updateStmt.executeUpdate();
                    }else{
                        int id = resultSet.getInt("id");
                        long difDate = ChronoUnit.DAYS.between(currentDate, dateL);
                        PreparedStatement updateStatus = connect.prepareStatement("UPDATE "
                                + "club_langage.activity SET status = '"+difDate+"j "+heures+"h:"+minutes+"' "
                                        + "WHERE id = "+id+"");
                        updateStatus.executeUpdate();
                    }
            }
	    connect.close();
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    private javax.swing.JButton jButtonAddMember_NEW;
    private javax.swing.JButton jButtonCancel_A_NEW;
    private javax.swing.JButton jButtonConf_d_NEW;
    private javax.swing.JButton jButtonDeleteMember_NEW;
    private javax.swing.JButton jButtonSearchMember_NEW;
    private javax.swing.JButton jButtonUpdateMember_NEW;
    private javax.swing.JButton jButtonUpdate_d_NEW;
    private javax.swing.JButton jButtonValide_A_NEW;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelActivityTitre;
    private javax.swing.JLabel jLabelAddress_d_NEW;
    private javax.swing.JLabel jLabelBarriereNEW;
    private javax.swing.JLabel jLabelBirthday_d_NEW;
    private javax.swing.JLabel jLabelEmail_d_NEW;
    private javax.swing.JLabel jLabelErrorDate_NEW;
    private javax.swing.JLabel jLabelLastName_d_NEW;
    private javax.swing.JLabel jLabelMessage_NEW;
    private javax.swing.JLabel jLabelName_d_NEW;
    private javax.swing.JLabel jLabelNb_member_NEW;
    private javax.swing.JLabel jLabelTel_d_NEW;
    private javax.swing.JButton jButtonCancel_leader;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelActivity_NEW;
    private javax.swing.JPanel jPanelActivity_NEWUnder;
    private javax.swing.JPanel jPanelClub_NEW;
    private javax.swing.JPanel jPanelClub_NEWUnder;
    private javax.swing.JPanel jPanelClub_NEWUnder2;
    private javax.swing.JPanel jPanelNEW;
    private javax.swing.JPanel jPanelNEWUnder;
    private javax.swing.JPanel jPanelMember_NEW;
    private javax.swing.JPanel jPanelMember_NEWUnder;
    private javax.swing.JScrollPane jScrollMember_NEW;
    private javax.swing.JScrollPane jScrollPane_A_NEW;
    private javax.swing.JSpinner jSpinneDay_b_NEW;
    private javax.swing.JSpinner jSpinneMonth_b_NEW;
    private javax.swing.JSpinner jSpinneYear_b_NEW;
    private javax.swing.JTextField jTFAdressUpdate_NEW;
    private javax.swing.JTextField jTFEmailUpdate_NEW;
    private javax.swing.JTextField jTFLastnameUpdate_NEW;
    private javax.swing.JTextField jTFNameUpdate_NEW;
    private javax.swing.JTextField jTFTelUpdate_NEW;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPaneNEW;
    private javax.swing.JTable jTableMember_NEW;
    private javax.swing.JTable jTable_A_NEW;
    private javax.swing.JTextField jTextFieldAdressMember_NEW;
    private javax.swing.JTextField jTextFieldBirthdayMember_NEW;
    private javax.swing.JTextField jTextFieldDate_A_NEW;
    private javax.swing.JTextField jTextFieldDescription_A_NEW;
    private javax.swing.JTextField jTextFieldEmailMember_NEW;
    private javax.swing.JTextField jTextFieldID_A_NEW;
    private javax.swing.JTextField jTextFieldLastnameMember_NEW;
    private javax.swing.JTextField jTextFieldMatriculeMember_NEW;
    private javax.swing.JTextField jTextFieldNameMember_NEW;
    private javax.swing.JTextField jTextFieldName_A_NEW;
    private javax.swing.JTextField jTextFieldPlace_A_NEW;
    private javax.swing.JTextField jTextFieldTelMember_NEW;
    private javax.swing.JTextField jTextFieldTime_A_NEW;
    private javax.swing.JTextField jTextfieldAddMember_NEW;
}
