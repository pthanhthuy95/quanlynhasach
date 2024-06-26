/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Connect.SQLServerProvider;
import DAO.DAO_LOAI;
import DAO.DAO_NHANVIEN;
import Entity.NHANVIEN;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
/**
 *
 * @author PC
 */
public class Register extends javax.swing.JFrame {
    private SQLServerProvider cn;
    private Connection conn;
    PreparedStatement preparedStatement;
 
    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        this.setLocationRelativeTo(null);
        cn = new SQLServerProvider();
        SwingUtilities.invokeLater(this::load_cbb_MaNhanVien);
    }
     
    public void load_cbb_MaNhanVien(){
    if (cboMaNhanVien == null) {
        cboMaNhanVien = new JComboBox<>();
    }
    ArrayList<NHANVIEN> dsL = DAO_NHANVIEN.getNHANVIEN();
    for(NHANVIEN l : dsL){
      cboMaNhanVien.addItem(String.valueOf(l.getMaNhanvien())); // Entity_TaiKhoan
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtGmail = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        txtConfirmPass = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnDangKi = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cboMaNhanVien = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIsAdmin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Thêm Tài Khoản");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 250, 60));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 51));
        jLabel3.setText("Username:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, 24));
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 181, 27));
        getContentPane().add(txtGmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 181, 27));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 181, 27));
        getContentPane().add(txtConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 181, 27));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 51));
        jLabel4.setText("Gmail:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 56, 22));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 51));
        jLabel5.setText("Password:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 74, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 51));
        jLabel6.setText("Confirm Password:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        btnDangKi.setForeground(new java.awt.Color(255, 51, 51));
        btnDangKi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register.png"))); // NOI18N
        btnDangKi.setText("Register");
        btnDangKi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKiActionPerformed(evt);
            }
        });
        getContentPane().add(btnDangKi, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 136, -1));

        btnLogin.setForeground(new java.awt.Color(255, 51, 51));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        btnLogin.setText("Quay lại trang Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 190, 37));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 0));
        jLabel7.setText("Mã Nhân Viên:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 112, 25));

        cboMaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMaNhanVienActionPerformed(evt);
            }
        });
        getContentPane().add(cboMaNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 181, 27));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 30, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imgUser.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 240, 270));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("Is_admin:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 100, 20));

        txtIsAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIsAdminActionPerformed(evt);
            }
        });
        getContentPane().add(txtIsAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 180, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangKiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKiActionPerformed
        // TODO add your handling code here:

        String username = txtUser.getText().trim();
        String gmail = txtGmail.getText().trim();
        String password = txtPass.getText().trim();
        String confirmPassword = txtConfirmPass.getText().trim();
        String manhanvien= cboMaNhanVien.getSelectedItem().toString();
        String is_admin=txtIsAdmin.getText().trim();
        if (username.isEmpty() || gmail.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()||is_admin.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không để thông tin trống!");
            return;
        }
        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Mật khẩu xác nhận không khớp!");
            return;
        }

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = cn.open();
            if (conn == null) {
                JOptionPane.showMessageDialog(this, "Không thể kết nối đến cơ sở dữ liệu.");
                return;
            }

            int dk = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng kí?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (dk != JOptionPane.YES_OPTION) {
                return;
            }

            String sql_dk = "INSERT INTO TAIKHOAN (TENTAIKHOAN, EMAIL, MATKHAU, CONFIRMPASS,MANV,is_admin) VALUES (?, ?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(sql_dk);
            ps.setString(1, username);
            ps.setString(2, gmail);
            ps.setString(3, password);
            ps.setString(4, confirmPassword);
            ps.setString(5, manhanvien);
            ps.setString(6, is_admin);
            int n = ps.executeUpdate();
            if (n != 0) {
                JOptionPane.showMessageDialog(this, "Đăng kí thành công!");
            } else {
                JOptionPane.showMessageDialog(this, "Đăng kí thất bại!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi đăng kí: " + e.getMessage());
        } finally {
            try {
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_btnDangKiActionPerformed

    private void cboMaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMaNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMaNhanVienActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        Login l=new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtIsAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIsAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIsAdminActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKi;
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> cboMaNhanVien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtConfirmPass;
    private javax.swing.JTextField txtGmail;
    private javax.swing.JTextField txtIsAdmin;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
