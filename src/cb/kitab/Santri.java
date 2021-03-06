/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.kitab;

import cb.kitab.dialog.EditSantri;
import cb.kitab.utils.Koneksi;
import cb.kitab.utils.ListTableModel;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author swalayan
 */
public class Santri extends javax.swing.JFrame {
    Koneksi kn = new Koneksi();
    ResultSet rs;
    ListTableModel mdl;
    JasperReport jasperReport;
    JasperDesign jasperDesign;
    JasperPrint jasperPrint;
    Map<String, Object> param = new HashMap<String, Object>();

    /**
     * Creates new form Santri
     */
    public Santri() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(getExtendedState() | MAXIMIZED_BOTH);
        _tampilKelas();
        //_cariNama("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbKelas = new javax.swing.JComboBox();
        btnCetak = new javax.swing.JButton();
        txCariNama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        sp = new javax.swing.JScrollPane();
        tblSantri = new javax.swing.JTable();
        btnCetakAll = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnBaru = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Data Pelanggan");

        cbKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKelasActionPerformed(evt);
            }
        });

        btnCetak.setText("Cetak");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        txCariNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCariNamaActionPerformed(evt);
            }
        });

        jLabel1.setText("Cari Nama");

        tblSantri.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblSantri.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        sp.setViewportView(tblSantri);

        btnCetakAll.setText("Cetak All");
        btnCetakAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakAllActionPerformed(evt);
            }
        });

        btnEdit.setMnemonic('e');
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnBaru.setMnemonic('b');
        btnBaru.setText("Baru");
        btnBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaruActionPerformed(evt);
            }
        });

        btnHapus.setMnemonic('h');
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabel2.setText("Kelas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBaru)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbKelas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txCariNama))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCetakAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCetak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCetak)
                    .addComponent(jLabel2))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txCariNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnCetakAll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnBaru)
                    .addComponent(btnHapus))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        String SQL = "SELECT * from vw_santri where KelasBaru ='"+cbKelas.getSelectedItem().toString()+"'";
        _cetakSiswa(SQL,"kelas.jrxml");
    }//GEN-LAST:event_btnCetakActionPerformed

    private void txCariNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCariNamaActionPerformed
        _cariNama(txCariNama.getText());
    }//GEN-LAST:event_txCariNamaActionPerformed

    private void btnCetakAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakAllActionPerformed
        String SQL = "SELECT * from vw_santri order by KelasBaru";
        _cetakSiswa(SQL,"kelasAll.jrxml");
    }//GEN-LAST:event_btnCetakAllActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        EditSantri es= new EditSantri(this, tblSantri.getValueAt(tblSantri.getSelectedRow(), 0).toString());
        es.setTitle("Edit Data Santri");
        es.setVisible(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaruActionPerformed
        EditSantri es= new EditSantri(this);
        es.setTitle("Tambah Data Santri");
        es.setVisible(true);
    }//GEN-LAST:event_btnBaruActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        String id = tblSantri.getValueAt(tblSantri.getSelectedRow(),0).toString();
        
        if (JOptionPane.showConfirmDialog(rootPane, "Hapus Data ini?", 
                "Hapus Data", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
            try {
                kn.conn.setAutoCommit(false);                
                kn.stmt.executeUpdate("delete from tb_pelanggan where id= '"+id+"'");
                kn.conn.commit();
                JOptionPane.showMessageDialog(rootPane, "Hapus Data Berhasil....");
            } catch (SQLException ex) {
                Logger.getLogger(Santri.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void cbKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKelasActionPerformed
        if (cbKelas.getSelectedIndex()!=0){
            _lihatKelas((String) cbKelas.getSelectedItem());        
        } else
        if (cbKelas.getSelectedIndex()==0){
            _cariNama("");        
        }
    }//GEN-LAST:event_cbKelasActionPerformed

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
            java.util.logging.Logger.getLogger(Santri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Santri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Santri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Santri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Santri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaru;
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnCetakAll;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JComboBox cbKelas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane sp;
    private javax.swing.JTable tblSantri;
    private javax.swing.JTextField txCariNama;
    // End of variables declaration//GEN-END:variables

    private void _tampilKelas() {
        try {
            cbKelas.removeAllItems();
            
            cbKelas.addItem("-- Pilih Kelas --");
            
            rs = kn.stmt.executeQuery("select distinct kelas from tb_pelanggan");
            while (rs.next()) {                
                cbKelas.addItem(rs.getObject("kelas"));
            }
            
            cbKelas.setSelectedIndex(0);
            
        } catch (SQLException ex) {
            Logger.getLogger(Santri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void _cetakSiswa(String SQL,String rpt) {
        String path = System.getProperties().getProperty("java.class.path")
                .split(";")[System.getProperties().getProperty("java.class.path")
                .split(";").length - 1] + "/";
        try {
            //File file = new File(path+"laporan/kelas.jrxml");
            InputStream file= getClass().getResourceAsStream("/cb/kitab/laporan/"+rpt);
            jasperDesign = JRXmlLoader.load(file);
            param.clear();
            
            rs = kn.stmt.executeQuery(SQL);  

            JRResultSetDataSource jrRS = new JRResultSetDataSource (rs);            
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, param, jrRS);
            
            JasperViewer.viewReport(jasperPrint, false);
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void _lihatKelas(String kondisi) {
        String SQL = "SELECT * from tb_pelanggan where Kelas ='"+kondisi+"'";
        try {
            rs = kn.stmt.executeQuery(SQL);
            mdl = ListTableModel.createModelFromResultSet(rs);
            
            tblSantri.setModel(mdl);
            tblSantri.changeSelection(0, 0, false, false);

        } catch (SQLException ex) {
            Logger.getLogger(Santri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void _cariNama(String kondisi) {
        String SQL = "SELECT * from tb_pelanggan where Nama like '%"+kondisi+"%'";
        try {
            rs = kn.stmt.executeQuery(SQL);
            mdl = ListTableModel.createModelFromResultSet(rs);
            
            tblSantri.setModel(mdl);
            tblSantri.changeSelection(0, 0, false, false);
        } catch (SQLException ex) {
            Logger.getLogger(Santri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
