/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author fandi
 */
public class editbuku extends javax.swing.JFrame {
connection con;
    /**
     * Creates new form tambahbuku
     */
    public editbuku() {
        initComponents();
        this.setLocationRelativeTo(null);
        con = new connection();
        list_category();
        setbuku();
    }
    private void setbuku(){
        String data = "select * from book where id="+idbuku.getId()+"";
        try {
            Statement st = con.con.createStatement();
            ResultSet rs = st.executeQuery(data);
            if (rs.next()){
                jTextFieldjudul.setText(rs.getString(3));
                jTextFieldpenerbit.setText(rs.getString(5));
                jTextFieldpengarang.setText(rs.getString(4));
                jTextFieldtahun.setText(rs.getString(6));
                int x = Integer.parseInt(rs.getString(7));
                jComboBoxkategori.setSelectedIndex(x);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data buku gagal diambil" + ex.getMessage());
        }

    }
    private void list_category(){
        
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        jComboBoxkategori.setModel(model);
        jComboBoxkategori.addItem("Pilih Kategori");
        
        try {
            String kategori = "SELECT * FROM category";
            Statement st = con.con.createStatement();
            ResultSet rs = st.executeQuery(kategori);
          
            while (rs.next()) {
                jComboBoxkategori.addItem(rs.getString(2));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed show data in combobox " + ex.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        jTextFieldjudul = new javax.swing.JTextField();
        jTextFieldpengarang = new javax.swing.JTextField();
        jTextFieldpenerbit = new javax.swing.JTextField();
        jLabeljudul = new javax.swing.JLabel();
        jLabelpengarang = new javax.swing.JLabel();
        jLabelpenerbit = new javax.swing.JLabel();
        jLabelkategori = new javax.swing.JLabel();
        jComboBoxkategori = new javax.swing.JComboBox<>();
        jLabeltambahbuku = new javax.swing.JLabel();
        jButtonedit = new javax.swing.JButton();
        jButtoncancel = new javax.swing.JButton();
        jTextFieldtahun = new javax.swing.JTextField();
        jLabeltahun = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setMinimumSize(new java.awt.Dimension(400, 300));

        jLabeljudul.setText("Judul Buku");

        jLabelpengarang.setText("Pengarang");

        jLabelpenerbit.setText("Penerbit");

        jLabelkategori.setText("Kategori buku");

        jComboBoxkategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabeltambahbuku.setText("Edit Buku");

        jButtonedit.setText("Edit");
        jButtonedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtoneditMouseClicked(evt);
            }
        });
        jButtonedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoneditActionPerformed(evt);
            }
        });

        jButtoncancel.setText("Cancel");
        jButtoncancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtoncancelMouseClicked(evt);
            }
        });
        jButtoncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncancelActionPerformed(evt);
            }
        });

        jLabeltahun.setText("Tahun ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabeljudul)
                    .addComponent(jLabelpengarang)
                    .addComponent(jLabelpenerbit)
                    .addComponent(jLabelkategori)
                    .addComponent(jLabeltahun))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldjudul)
                    .addComponent(jTextFieldpengarang, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(jTextFieldpenerbit, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(jComboBoxkategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldtahun, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                .addGap(139, 139, 139))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabeltambahbuku)
                        .addGap(175, 175, 175))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonedit)
                        .addGap(18, 18, 18)
                        .addComponent(jButtoncancel)
                        .addGap(25, 25, 25))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabeltambahbuku)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldjudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeljudul))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelpengarang)
                    .addComponent(jTextFieldpengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldpenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelpenerbit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldtahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeltahun, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxkategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelkategori))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtoncancel)
                    .addComponent(jButtonedit))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtoneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoneditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtoneditActionPerformed

    private void jButtoncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtoncancelActionPerformed

    private void jButtoneditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtoneditMouseClicked

        // TODO add your handling code here:
        String judul, penerbit, pengarang, tahun;
        int kategori;
        judul = jTextFieldjudul.getText();
        penerbit = jTextFieldpenerbit.getText();
        pengarang = jTextFieldpengarang.getText();
        tahun = jTextFieldtahun.getText();
        kategori = jComboBoxkategori.getSelectedIndex();
        try {

            String update = "update book set title='"+judul+"',author='"+pengarang+"',publisher='"+penerbit+"',year='"+tahun+"',category_id='"+kategori+"',status_id='1' where id="+idbuku.getId()+"";
            Statement st = con.con.createStatement();
            st.executeUpdate(update);
            
            JOptionPane.showMessageDialog(this, "Data Buku sudah di update");
            this.setVisible(false);
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_jButtoneditMouseClicked

    private void jButtoncancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtoncancelMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtoncancelMouseClicked
    
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
            java.util.logging.Logger.getLogger(editbuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editbuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editbuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editbuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editbuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtoncancel;
    private javax.swing.JButton jButtonedit;
    private javax.swing.JComboBox<String> jComboBoxkategori;
    private javax.swing.JLabel jLabeljudul;
    private javax.swing.JLabel jLabelkategori;
    private javax.swing.JLabel jLabelpenerbit;
    private javax.swing.JLabel jLabelpengarang;
    private javax.swing.JLabel jLabeltahun;
    private javax.swing.JLabel jLabeltambahbuku;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldjudul;
    private javax.swing.JTextField jTextFieldpenerbit;
    private javax.swing.JTextField jTextFieldpengarang;
    private javax.swing.JTextField jTextFieldtahun;
    // End of variables declaration//GEN-END:variables
}
