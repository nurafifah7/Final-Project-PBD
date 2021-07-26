/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasiku_login;

/**
 *
 * @author user
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class HalamanStaff extends javax.swing.JFrame {

    /**
     * Creates new form HalamanStaff
     */
    DefaultTableModel model2;
    
    public HalamanStaff() {
        initComponents();
        String[] judul = {"Id Produksi", "Nama Produksi", "Harga Produksi", "Tanggal Produksi"};
        model2 = new DefaultTableModel(judul, 0);
        tabelproduksi.setModel(model2);
        tampilkan();
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
        jLabel3 = new javax.swing.JLabel();
        txtidproduksi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnamaproduksi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txthargaproduksi = new javax.swing.JTextField();
        txttanggalproduksi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btntambah2 = new javax.swing.JButton();
        btnedit2 = new javax.swing.JButton();
        btnreset2 = new javax.swing.JButton();
        btnhapus2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelproduksi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("SELAMAT DATANG STAFF");

        jLabel2.setText("Isikan Laman Produksi dengan Benar");

        jLabel3.setText("Id Produksi ");

        jLabel4.setText("Nama Produksi");

        jLabel5.setText("Harga Produksi");

        txttanggalproduksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttanggalproduksiActionPerformed(evt);
            }
        });

        jLabel6.setText("Tanggal Produksi");

        btntambah2.setText("Tambah");
        btntambah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambah2ActionPerformed(evt);
            }
        });

        btnedit2.setText("Edit");
        btnedit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnedit2ActionPerformed(evt);
            }
        });

        btnreset2.setText("Reset");
        btnreset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset2ActionPerformed(evt);
            }
        });

        btnhapus2.setText("Hapus");
        btnhapus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapus2ActionPerformed(evt);
            }
        });

        tabelproduksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelproduksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelproduksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelproduksi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(btntambah2)
                            .addGap(27, 27, 27)
                            .addComponent(btnedit2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnreset2)
                            .addGap(33, 33, 33)
                            .addComponent(btnhapus2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(77, 77, 77)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txttanggalproduksi, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txthargaproduksi, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtidproduksi, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtnamaproduksi, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtidproduksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnamaproduksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txthargaproduksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txttanggalproduksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntambah2)
                    .addComponent(btnedit2)
                    .addComponent(btnreset2)
                    .addComponent(btnhapus2))
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttanggalproduksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttanggalproduksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttanggalproduksiActionPerformed

    private void btntambah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambah2ActionPerformed
        // TODO add your handling code here:
        try{
            Connection cnnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aplikasikuu", "root", "");
            cnnn.createStatement().executeUpdate("insert into produksi values" + "('" + txtidproduksi.getText() + "','" + txtnamaproduksi.getText() + "','" + txthargaproduksi.getText() + "','"  + txttanggalproduksi.getText() + "')");
            tampilkan();
            reset();
        }catch (Exception e){
            
        }
//            reset();
    }//GEN-LAST:event_btntambah2ActionPerformed

    private void tabelproduksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelproduksiMouseClicked
        // TODO add your handling code here:
         System.out.println("testing");
        int i = tabelproduksi.getSelectedRow();
        
        if (i > -1) {
            txtidproduksi.setText(model2.getValueAt(i, 0).toString());
            txtnamaproduksi.setText(model2.getValueAt(i, 1).toString());
            txthargaproduksi.setText(model2.getValueAt(i, 2).toString());
            txttanggalproduksi.setText(model2.getValueAt(i, 3).toString());
        }
    }//GEN-LAST:event_tabelproduksiMouseClicked

    private void btnedit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnedit2ActionPerformed
        try {
            // TODO add your handling code here:
            Connection cnnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aplikasikuu", "root", "");            
            cnnn.createStatement().executeUpdate("update produksi set nama_produksi='"+txtnamaproduksi.getText()+"', harga_prdksi="+txthargaproduksi.getText()+", tgl_prdksi='"+txttanggalproduksi.getText()+"' where id_produksi ='"+txtidproduksi.getText()+"'");
            tampilkan();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(HalamanStaff.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnedit2ActionPerformed

    private void btnhapus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapus2ActionPerformed
        try {
            // TODO add your handling code here:
            Connection cnnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aplikasikuu", "root", "");
            cnnn.createStatement().executeUpdate("delete from produksi where id_produksi = "+txtidproduksi.getText()+"");
            tampilkan ();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(HalamanStaff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnhapus2ActionPerformed

    private void btnreset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset2ActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnreset2ActionPerformed
private void reset (){
    txtidproduksi.setText("");
    txtnamaproduksi.setText("");
    txthargaproduksi.setText("");
    txttanggalproduksi.setText("");
}
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
            java.util.logging.Logger.getLogger(HalamanStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedit2;
    private javax.swing.JButton btnhapus2;
    private javax.swing.JButton btnreset2;
    private javax.swing.JButton btntambah2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelproduksi;
    private javax.swing.JTextField txthargaproduksi;
    private javax.swing.JTextField txtidproduksi;
    private javax.swing.JTextField txtnamaproduksi;
    private javax.swing.JTextField txttanggalproduksi;
    // End of variables declaration//GEN-END:variables

    private void tampilkan() {
        
    int row = tabelproduksi.getRowCount();
        for (int a = 0; a < row; a++) {
            model2.removeRow(0);
        }
        try {
            //        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aplikasikuu", "root", "");
            ResultSet rss = cnn.createStatement().executeQuery("SELECT * FROM produksi");
             while (rss.next()) {
                String data[] = {rss.getString(1), rss.getString(2), rss.getString(3), rss.getString(4)};
                model2.addRow(data);
                
            } 
        }catch (SQLException ex) {
            Logger.getLogger(HalamanStaff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


//    private void reset() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//}

