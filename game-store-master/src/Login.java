/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    Connect dbsetting;
    String driver, database, user, pass;
    Object tableTablean;
    
    
    public Login() {
        initComponents();
        
        dbsetting = new Connect();
        driver = dbsetting.SettingPanel("DBDriver");
        database = dbsetting.SettingPanel("DBDatabase");
        user = dbsetting.SettingPanel("DBUsername");
        pass = dbsetting.SettingPanel("DBPassword");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcome = new javax.swing.JTabbedPane();
        login = new javax.swing.JPanel();
        pane_title = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pane_login = new javax.swing.JPanel();
        txt_login = new javax.swing.JLabel();
        panelRound1 = new PanelRound();
        txt_email = new javax.swing.JLabel();
        login_email = new TextFieldRound();
        txt_password = new javax.swing.JLabel();
        login_password = new PasswordFieldRound();
        login_show_password = new javax.swing.JCheckBox();
        txt_register_acc = new ButtonRound();
        btn_login = new ButtonRound();
        register = new javax.swing.JPanel();
        pane_title1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pane_register = new javax.swing.JPanel();
        txt_register = new javax.swing.JLabel();
        panelRound2 = new PanelRound();
        txt_email1 = new javax.swing.JLabel();
        register_email = new TextFieldRound();
        txt_password1 = new javax.swing.JLabel();
        register_password = new PasswordFieldRound();
        register_show_password = new javax.swing.JCheckBox();
        txt_gender = new javax.swing.JLabel();
        radio_male = new javax.swing.JRadioButton();
        radio_female = new javax.swing.JRadioButton();
        txt_login_acc = new ButtonRound();
        btn_register = new ButtonRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login.setBackground(new java.awt.Color(22, 25, 32));
        login.setPreferredSize(new java.awt.Dimension(1280, 720));

        pane_title.setBackground(new java.awt.Color(0, 0, 0));
        pane_title.setPreferredSize(new java.awt.Dimension(640, 720));
        pane_title.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("GAME STORE");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        pane_title.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 330, 50));
        pane_title.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GAME STORE COVER.png"))); // NOI18N
        pane_title.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

        pane_login.setBackground(new java.awt.Color(22, 25, 32));
        pane_login.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pane_login.setPreferredSize(new java.awt.Dimension(640, 720));
        pane_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_login.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        txt_login.setForeground(new java.awt.Color(255, 255, 255));
        txt_login.setText("LOGIN");
        pane_login.add(txt_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 144, -1, -1));

        txt_email.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_email.setForeground(new java.awt.Color(4, 175, 244));
        txt_email.setText("Email");

        txt_password.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_password.setForeground(new java.awt.Color(4, 175, 244));
        txt_password.setText("Password");

        login_show_password.setBackground(new java.awt.Color(32, 49, 69));
        login_show_password.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        login_show_password.setForeground(new java.awt.Color(255, 255, 255));
        login_show_password.setText("Show Password");
        login_show_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_show_passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(login_show_password)
                    .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(login_password, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                        .addComponent(login_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_email)
                        .addComponent(txt_password)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txt_email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_email, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_password, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(login_show_password)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pane_login.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 234, -1, -1));

        txt_register_acc.setBackground(new java.awt.Color(22, 25, 32));
        txt_register_acc.setForeground(new java.awt.Color(103, 193, 245));
        txt_register_acc.setText("Don't have an account?");
        txt_register_acc.setBorderColor(new java.awt.Color(22, 25, 32));
        txt_register_acc.setColor(new java.awt.Color(22, 25, 32));
        txt_register_acc.setColorClick(new java.awt.Color(22, 12, 18));
        txt_register_acc.setColorOver(new java.awt.Color(22, 52, 84));
        txt_register_acc.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txt_register_acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_register_accActionPerformed(evt);
            }
        });
        pane_login.add(txt_register_acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 509, -1, -1));

        btn_login.setBackground(new java.awt.Color(0, 96, 213));
        btn_login.setText("LOGIN");
        btn_login.setBorderColor(new java.awt.Color(0, 96, 213));
        btn_login.setColor(new java.awt.Color(0, 96, 213));
        btn_login.setColorClick(new java.awt.Color(0, 45, 210));
        btn_login.setColorOver(new java.awt.Color(0, 148, 206));
        btn_login.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        pane_login.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 571, 156, 51));

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addComponent(pane_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pane_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pane_title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pane_login, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        welcome.addTab("tab1", login);

        register.setBackground(new java.awt.Color(22, 25, 32));
        register.setPreferredSize(new java.awt.Dimension(1280, 720));

        pane_title1.setBackground(new java.awt.Color(0, 0, 0));
        pane_title1.setPreferredSize(new java.awt.Dimension(640, 720));
        pane_title1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("GAME STORE");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        pane_title1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 330, 50));
        pane_title1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GAME STORE COVER.png"))); // NOI18N
        jLabel3.setFocusable(false);
        pane_title1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 740));

        pane_register.setBackground(new java.awt.Color(22, 25, 32));
        pane_register.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pane_register.setPreferredSize(new java.awt.Dimension(640, 720));
        pane_register.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_register.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        txt_register.setForeground(new java.awt.Color(255, 255, 255));
        txt_register.setText("REGISTER");
        pane_register.add(txt_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 111, -1, -1));

        txt_email1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_email1.setForeground(new java.awt.Color(4, 175, 244));
        txt_email1.setText("Email");

        txt_password1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_password1.setForeground(new java.awt.Color(4, 175, 244));
        txt_password1.setText("Password");

        register_show_password.setBackground(new java.awt.Color(32, 49, 69));
        register_show_password.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        register_show_password.setForeground(new java.awt.Color(255, 255, 255));
        register_show_password.setText("Show Password");
        register_show_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_show_passwordActionPerformed(evt);
            }
        });

        txt_gender.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_gender.setForeground(new java.awt.Color(4, 175, 244));
        txt_gender.setText("Gender");

        radio_male.setBackground(new java.awt.Color(32, 49, 69));
        radio_male.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        radio_male.setForeground(new java.awt.Color(255, 255, 255));
        radio_male.setText("Male");

        radio_female.setBackground(new java.awt.Color(32, 49, 69));
        radio_female.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        radio_female.setForeground(new java.awt.Color(255, 255, 255));
        radio_female.setText("Female");
        radio_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_femaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panelRound2Layout.createSequentialGroup()
                            .addComponent(txt_gender)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(register_show_password))
                        .addComponent(register_password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                        .addComponent(register_email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_email1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_password1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addComponent(radio_male)
                        .addGap(99, 99, 99)
                        .addComponent(radio_female)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txt_email1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(register_email, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_password1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(register_password, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(register_show_password))
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(txt_gender)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio_male)
                    .addComponent(radio_female))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pane_register.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 201, -1, -1));

        txt_login_acc.setBackground(new java.awt.Color(22, 25, 32));
        txt_login_acc.setForeground(new java.awt.Color(103, 193, 245));
        txt_login_acc.setText("Already have an account?");
        txt_login_acc.setBorderColor(new java.awt.Color(22, 25, 32));
        txt_login_acc.setColor(new java.awt.Color(22, 25, 32));
        txt_login_acc.setColorClick(new java.awt.Color(22, 12, 18));
        txt_login_acc.setColorOver(new java.awt.Color(22, 52, 84));
        txt_login_acc.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txt_login_acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_login_accActionPerformed(evt);
            }
        });
        pane_register.add(txt_login_acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 550, -1, -1));

        btn_register.setText("REGISTER");
        btn_register.setBorderColor(new java.awt.Color(111, 166, 32));
        btn_register.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });
        pane_register.add(btn_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 587, 156, 51));

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerLayout.createSequentialGroup()
                .addComponent(pane_title1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pane_register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pane_title1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
            .addComponent(pane_register, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        welcome.addTab("tab2", register);

        getContentPane().add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void login_show_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_show_passwordActionPerformed
        // TODO add your handling code here:
        if(login_show_password.isSelected()){
            login_password.setEchoChar((char)0);
        }
        else{
            login_password.setEchoChar('*');
        }
    }//GEN-LAST:event_login_show_passwordActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
         UIManager UI=new UIManager();
         UI.put("OptionPane.messageForeground", Color.white);
         UI.put("OptionPane.background",new ColorUIResource(40,46,57));
         UI.put("Panel.background",new ColorUIResource(40,46,57));
         try{
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(database, user, pass);
            
            String email = login_email.getText();
            String password = login_password.getText();
            
            Statement stt = conn.createStatement();
            String SQL = "select * from users where email='"+email+"' and name='"+password+"'";
            ResultSet res = stt.executeQuery(SQL);
            
            if(res.next()){
                // Jika email dan password user benar, pindah ke halaman user
                Dashboard dashboard = new Dashboard();
                dashboard.setVisible(true);

                this.setVisible(false);
            }
            else if(login_email.getText().equals("")){
                // Jika Email kosong, tampilkan pesan
                JOptionPane.showMessageDialog(null, "Please fill out username");
            }
            else if(login_password.getText().equals("")){
                // Jika password kosong, tampilkan pesan
                JOptionPane.showMessageDialog(null, "Please fill out password");
            }
            else if(login_email.getText().contains("admin@gmail.com")&& login_password.getText().contains("Admin")){
               // Login untuk admin
                Dashboard dashboard = new Dashboard();
                dashboard.setVisible(true);

                this.setVisible(false);
            }
            else{
                // Jika email dan password salah
                JOptionPane.showMessageDialog(null, "Wrong username or password!",
                    "Message",JOptionPane.ERROR_MESSAGE);
            }
            conn.close();
         }catch(Exception e){
             System.out.println(e.getMessage());
         }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void txt_register_accActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_register_accActionPerformed
        // TODO add your handling code here:
        welcome.setSelectedIndex(1);
    }//GEN-LAST:event_txt_register_accActionPerformed

    private void register_show_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_show_passwordActionPerformed
        // TODO add your handling code here:
        if(register_show_password.isSelected()){
            register_password.setEchoChar((char)0);
        }
        else{
            register_password.setEchoChar('*');
        }
        
    }//GEN-LAST:event_register_show_passwordActionPerformed

    private void txt_login_accActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_login_accActionPerformed
        // TODO add your handling code here:
        welcome.setSelectedIndex(0);
    }//GEN-LAST:event_txt_login_accActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        // TODO add your handling code here:
        String data[] = new String[3];
        try{
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(database, user, pass);
            
            String email = register_email.getText();
            String password = register_password.getText();
            String gender= "";
            
            Statement stt = conn.createStatement();
            if(radio_male.isSelected()){
                gender = "male";
                System.out.println(gender);
            }
            else if(radio_female.isSelected()){
                gender = "female";
                System.out.println(gender);
            }
            else{
                JOptionPane.showMessageDialog(null, "Please select your gender");
            }
            String SQL = "INSERT INTO users (name, "
                        + "email, gender) "
                        + "VALUES "
                        + "('"+ password +"', "
                        +"'"+ email +"', "
                        +"'"+ gender +"')";
            stt.executeUpdate(SQL);
            String SQL2 = "SELECT * FROM users WHERE name='"+ password +"'";
            ResultSet res = stt.executeQuery(SQL2);
            
            if(res.next()){
                JOptionPane.showMessageDialog(null, "Data has been saved","Saved",JOptionPane.INFORMATION_MESSAGE);
            }
            else if(register_email.getText().equals("")){
                // Jika Email kosong, tampilkan pesan
                JOptionPane.showMessageDialog(null, "Please fill out username");
            }
            else if(register_password.getText().equals("")){
                // Jika password kosong, tampilkan pesan
                JOptionPane.showMessageDialog(null, "Please fill out password");
            }
            
            conn.close();
            stt.close();

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),
                        "Error",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_registerActionPerformed

    private void radio_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_femaleActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ButtonRound btn_login;
    private ButtonRound btn_register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel login;
    private TextFieldRound login_email;
    private PasswordFieldRound login_password;
    private javax.swing.JCheckBox login_show_password;
    private javax.swing.JPanel pane_login;
    private javax.swing.JPanel pane_register;
    private javax.swing.JPanel pane_title;
    private javax.swing.JPanel pane_title1;
    private PanelRound panelRound1;
    private PanelRound panelRound2;
    private javax.swing.JRadioButton radio_female;
    private javax.swing.JRadioButton radio_male;
    private javax.swing.JPanel register;
    private TextFieldRound register_email;
    private PasswordFieldRound register_password;
    private javax.swing.JCheckBox register_show_password;
    private javax.swing.JLabel txt_email;
    private javax.swing.JLabel txt_email1;
    private javax.swing.JLabel txt_gender;
    private javax.swing.JLabel txt_login;
    private ButtonRound txt_login_acc;
    private javax.swing.JLabel txt_password;
    private javax.swing.JLabel txt_password1;
    private javax.swing.JLabel txt_register;
    private ButtonRound txt_register_acc;
    private javax.swing.JTabbedPane welcome;
    // End of variables declaration//GEN-END:variables
}
