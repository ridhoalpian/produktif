/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DashboardKasir;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import raven.glasspanepopup.GlassPanePopup;

/**
 *
 * @author Lenovo
 */
public class regis extends javax.swing.JPanel {

    /**
     * Creates new form tamduk
     */
    public regis() {
        initComponents();
        setOpaque(false);
        kosong();
        validation();
    }
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));
        g2.dispose();
        super.paintComponent(grphcs);
    }
//    void tampiltabeluser()
//    {
//         DashboardAdmin da =new DashboardAdmin();
//         da.tampil_tableuser();
//    }
    public void kosong(){
        txtnama.setText("");
        txttelepon.setText("");
        txtnik.setText("");
        txtalamat.setText("");
    }
    void validation(){
        if(txtalamat.getText() == null){
            btnsimpan.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtalamat = new javax.swing.JTextField();
        txttelepon = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtnik = new javax.swing.JTextField();
        btncancel = new Swing.btnroundkotak();
        btnsimpan = new Swing.btnroundkotak();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1120, 731));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txtalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 430, 50));
        add(txttelepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 430, 50));
        add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 430, 50));
        add(txtnik, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 430, 50));

        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 620, 200, 60));

        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });
        add(btnsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 620, 200, 60));

        jLabel1.setFont(new java.awt.Font("Futura Md BT", 1, 18)); // NOI18N
        jLabel1.setText("Telepon");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Futura Md BT", 1, 18)); // NOI18N
        jLabel2.setText("Silahkan Lengkapi Data Diri Anda");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Futura Md BT", 1, 18)); // NOI18N
        jLabel3.setText("NIK");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Futura Md BT", 1, 18)); // NOI18N
        jLabel4.setText("Nama Lengkap");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Futura Md BT", 1, 18)); // NOI18N
        jLabel5.setText("Alamat");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, -1, -1));
        add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 430, 50));

        jLabel6.setFont(new java.awt.Font("Futura Md BT", 1, 18)); // NOI18N
        jLabel6.setText("Username");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Futura Md BT", 1, 18)); // NOI18N
        jLabel7.setText("Password");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, -1, -1));
        add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 430, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        try {
            String sql = "INSERT INTO user (nik, nama, alamat, telp) VALUES ('"+txtnik.getText()+"', '"+txtnama.getText()+"', '"+txtalamat.getText()+"','"+txttelepon.getText()+"')";
            String sql2 = "INSERT INTO akun (nik, username, password) VALUES ('"+txtnik.getText()+"', '"+txtusername.getText()+"', '"+txtpassword.getText()+"')";
            java.sql.Connection conn=(Connection)Koneksi.konek.configDBek();
            java.sql.PreparedStatement pst2=conn.prepareStatement(sql);
            java.sql.PreparedStatement pst=conn.prepareStatement(sql2);
            pst.execute();
            GlassPanePopup.closePopupLast();
//            tampiltabeluser();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Data gagal ditambahkan"+ e.getMessage());
        }
        
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        GlassPanePopup.closePopupLast();
    }//GEN-LAST:event_btncancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.btnroundkotak btncancel;
    private Swing.btnroundkotak btnsimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnik;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txttelepon;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
