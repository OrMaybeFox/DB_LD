/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alex_db;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author asdfas
 */
public class Insert extends javax.swing.JFrame {

    /**
     * Creates new form Insert
     */
    public Insert(java.awt.Frame parent, boolean modal) {
        initComponents();
        this.setLocationRelativeTo(parent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NameLabel = new java.awt.Label();
        NameTextField = new javax.swing.JTextField();
        NameLabel1 = new java.awt.Label();
        LastNameField = new javax.swing.JTextField();
        CreateClientTitle = new java.awt.Label();
        NameLabel2 = new java.awt.Label();
        NameTextField1 = new javax.swing.JTextField();
        NameLabel3 = new java.awt.Label();
        LastNameField1 = new javax.swing.JTextField();
        DateLabel2 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        SumaField = new javax.swing.JTextField();
        label2 = new java.awt.Label();
        GameUpdate = new javax.swing.JComboBox();
        AddClientBtn = new javax.swing.JButton();
        FromYear = new javax.swing.JComboBox();
        FromMonth = new javax.swing.JComboBox();
        FromDay = new javax.swing.JComboBox();

        NameLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        NameLabel.setText("Vardas");

        NameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NameTextField.setMinimumSize(new java.awt.Dimension(100, 25));
        NameTextField.setPreferredSize(new java.awt.Dimension(100, 25));
        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });

        NameLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        NameLabel1.setText("Pavardė");

        LastNameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LastNameField.setMinimumSize(new java.awt.Dimension(100, 25));
        LastNameField.setPreferredSize(new java.awt.Dimension(100, 25));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        CreateClientTitle.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CreateClientTitle.setText("ID");

        NameLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        NameLabel2.setText("Vardas");

        NameTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NameTextField1.setMinimumSize(new java.awt.Dimension(100, 25));
        NameTextField1.setPreferredSize(new java.awt.Dimension(100, 25));
        NameTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextField1ActionPerformed(evt);
            }
        });

        NameLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        NameLabel3.setText("Pavardė");

        LastNameField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LastNameField1.setMinimumSize(new java.awt.Dimension(100, 25));
        LastNameField1.setPreferredSize(new java.awt.Dimension(100, 25));

        DateLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        DateLabel2.setText("Užsakymo data");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Suma");

        SumaField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SumaField.setText("jTextField1");
        SumaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumaFieldActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label2.setText("Žaidimas");

        GameUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        GameUpdate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Crash Bandicoot", "Counter Strike", "Marijo", "Bioshock Infinite", "Amnesia", "Dead Space", "Hitman", "Prince of Persia", "Need for Speed", "Shrek 2" }));
        GameUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GameUpdateActionPerformed(evt);
            }
        });

        AddClientBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddClientBtn.setText("Pridėti naują įrašą");
        AddClientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClientBtnActionPerformed(evt);
            }
        });

        FromYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2017", "2018", "2019", "2020" }));

        FromMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sausis", "Vasaris", "Kovas", "Balandis", "Gegužė", "Birželis", "Liepa", "Rugpjūtis", "Rugsėjis", "Spalis", "Lapkritis", "Gruodis", " " }));

        FromDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(NameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LastNameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(SumaField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(GameUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(CreateClientTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(DateLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FromYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(FromMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(FromDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(AddClientBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(CreateClientTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LastNameField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DateLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(FromYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FromMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FromDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(SumaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GameUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AddClientBtn)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextFieldActionPerformed

    private void NameTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextField1ActionPerformed

    private void GameUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GameUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GameUpdateActionPerformed

    private void AddClientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClientBtnActionPerformed

        Connection con = null;

        try {

              SQLServerDataSource ds = new SQLServerDataSource();
              ds.setServerName("localhost");
              ds.setPortNumber(1433);
              ds.setDatabaseName("Alekxxx");
              ds.setUser("aleksandra");
              ds.setPassword("Ogurciikamera03");

            con = ds.getConnection();

            int ID = Integer.parseInt(CreateClientTitle.getText());
            String Vardas = NameTextField1.getText();
            String Pavarde = LastNameField1.getText();
            int ZaidimoID = GameUpdate.getSelectedIndex()+1;
            int ApmokejimoID=0;
            int UzsakymoID=0;
            String Suma = SumaField.getText();
             
            String Data = "";
            String MenuoF = FromMonth.getSelectedItem().toString();
            String Menuo="";

            switch(MenuoF)
            {
                case "Sausis": Menuo = "01"; break; case "Vasaris": Menuo = "02"; break; case "Kovas": Menuo = "03"; break; 
                case "Balandis": Menuo = "04"; break; case "Gegužė": Menuo = "05"; break; case "Birželis": Menuo = "06"; break; 
                case "Liepa":  Menuo = "07"; break; case "Rugpjūtis":  Menuo = "08"; break; case "Rugsėjis": Menuo = "09"; break; 
                case "Spalis":  Menuo = "10"; break; case "Lapkritis":  Menuo = "11"; break; case "Gruodis": Menuo = "12"; break; 
            }
        
            Data = FromYear.getSelectedItem().toString()+"-"+ Menuo +"-"+FromDay.getSelectedItem().toString();

            Statement statement = con.createStatement();

            String GetUzsakymoID= "Select * FROM Uzsakymas";
            String GetApmokejimoID = "Select * From Apmokejimas";

            ResultSet set = statement.executeQuery(GetUzsakymoID);

            while (set.next())
            {
                UzsakymoID=set.getInt("Uzsakymo_Nr");
            }

            UzsakymoID+=1;
            
            set=statement.executeQuery(GetApmokejimoID);
            
            while(set.next())
            {
                ApmokejimoID= set.getInt("Cekio_Nr");
            }
            
            ApmokejimoID+=1;

            if(NameTextField1.getText().length()==0 || LastNameField1.getText().length()==0)
            {
                JOptionPane.showMessageDialog(new JFrame(), "Neteisingai įvesti duomenys", "Klaida", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String ClientInsertQuery = "SET NOCOUNT ON insert into Naudotojas(Kliento_Nr, Vardas, Pavarde)\n" +
            "values("+ID+", '"+Vardas+"', '"+Pavarde+"')";
            
            String UzsakymasInsert = "SET NOCOUNT ON insert into Uzsakymas(Uzsakymo_Nr, Cekio_Nr, Kliento_Nr, Mokestis, Pristatymas, Uzsakymo_Data)\n"
            + "values("+ UzsakymoID + ", " + ApmokejimoID + ", "+ ID +", 21, '"+ Data +"', '"+ Data +"')";

            String InsertApmokejimas= "SET NOCOUNT ON insert into Apmokejimas(Cekio_Nr, Suma, Apmokejimo_Data)\n"
            + "values("+ ApmokejimoID + ", "+ Suma +", '"+ Data +"')";
            
            String InsertSudaro = "SET NOCOUNT ON insert into Sudaro(Zaidimo_Nr, Uzsakymo_Nr)\n"
            + "values("+ ZaidimoID +", "+ UzsakymoID+")";

            System.out.println(ClientInsertQuery);
            System.out.println(InsertApmokejimas);
            System.out.println(UzsakymasInsert);
            System.out.println(InsertSudaro);
            

           statement.executeUpdate(ClientInsertQuery);
           statement.executeUpdate(InsertApmokejimas);
           statement.executeUpdate(UzsakymasInsert);
           statement.executeUpdate(InsertSudaro);

            this.dispose();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_AddClientBtnActionPerformed

    private void SumaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SumaFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Insert dialog = new Insert(new javax.swing.JFrame(), true);
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AddClientBtn;
    public java.awt.Label CreateClientTitle;
    public java.awt.Label DateLabel2;
    public javax.swing.JComboBox FromDay;
    public javax.swing.JComboBox FromMonth;
    public javax.swing.JComboBox FromYear;
    public javax.swing.JComboBox GameUpdate;
    public javax.swing.JTextField LastNameField;
    public javax.swing.JTextField LastNameField1;
    private java.awt.Label NameLabel;
    private java.awt.Label NameLabel1;
    private java.awt.Label NameLabel2;
    private java.awt.Label NameLabel3;
    public javax.swing.JTextField NameTextField;
    public javax.swing.JTextField NameTextField1;
    private javax.swing.JTextField SumaField;
    private javax.swing.JLabel jLabel1;
    public java.awt.Label label2;
    // End of variables declaration//GEN-END:variables
}
