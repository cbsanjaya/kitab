/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.kitab;

import cb.kitab.utils.Koneksi;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import cb.kitab.dialog.JDlgCari;

/**
 *
 * @author sanjaya
 */
public class Transaksi extends javax.swing.JFrame {
    private final Koneksi kn = new Koneksi();
    private ResultSet rsTmp,rsExe,rsShow;

    /**
     * Creates new form Menu
     */
    public Transaksi() {
        initComponents();
        setLocationRelativeTo(null);
        _bersih();
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
        txNis = new javax.swing.JTextField();
        jLbNama = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLbKamar = new javax.swing.JLabel();
        jLbKelas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblTrans = new javax.swing.JTable();
        jLbTotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txBayar = new javax.swing.JTextField();
        jLbBayar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txKembali = new javax.swing.JTextField();
        jLbnis = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transaksi");
        setState(6);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setLabelFor(txNis);
        jLabel1.setText("NIS");

        txNis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txNis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNisActionPerformed(evt);
            }
        });
        txNis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txNisKeyPressed(evt);
            }
        });

        jLbNama.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLbNama.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setLabelFor(jLbNama);
        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setLabelFor(jLbKamar);
        jLabel4.setText("Kamar");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setLabelFor(jLbKelas);
        jLabel6.setText("Kelas");

        jLbKamar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLbKamar.setText("Kamar");

        jLbKelas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLbKelas.setText("Kelas");

        jTblTrans.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTblTrans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "PID", "Deskripsi", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTblTrans.setColumnSelectionAllowed(true);
        jTblTrans.setEnabled(false);
        jTblTrans.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTblTrans);
        jTblTrans.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLbTotal.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLbTotal.setForeground(java.awt.Color.red);
        jLbTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLbTotal.setText("Total");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setLabelFor(txBayar);
        jLabel5.setText("Bayar");

        txBayar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txBayar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txBayar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txBayar.setFocusable(false);
        txBayar.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txBayarCaretUpdate(evt);
            }
        });
        txBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txBayarActionPerformed(evt);
            }
        });
        txBayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txBayarKeyPressed(evt);
            }
        });

        jLbBayar.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLbBayar.setForeground(java.awt.Color.green);
        jLbBayar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLbBayar.setText("0");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setLabelFor(txKembali);
        jLabel7.setText("Kembali");

        txKembali.setEditable(false);
        txKembali.setBackground(new java.awt.Color(255, 255, 255));
        txKembali.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txKembali.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txKembali.setText("0");
        txKembali.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txKembali.setFocusable(false);
        txKembali.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txKembaliCaretUpdate(evt);
            }
        });

        jLbnis.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLbnis.setText("NIS");

        jLabel2.setText("| F2 : Cari Siswa | F3 : Batalkan Transaksi |");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txNis)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLbBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLbNama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLbnis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLbKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(txNis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLbnis))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLbNama))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLbKamar)))
                            .addComponent(jLbKelas)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(txKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLbBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txNisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNisActionPerformed
        if (txNis.getText().equals("")){
            txBayar.selectAll();
            return;
        }
        
        tampilData(txNis.getText());
        
    }//GEN-LAST:event_txNisActionPerformed

    private void txBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txBayarActionPerformed
        if (jLbBayar.getForeground()==Color.green){
            Integer total,bayar,kembali;
            total = Integer.parseInt(jLbTotal.getText());
            bayar = Integer.parseInt(txBayar.getText());
            kembali=  bayar - total;

            if (total > bayar){
                JOptionPane.showMessageDialog(rootPane, "pembayaran tidak cukup...");
                txKembali.setText("0");
                return;
            }

            jLbBayar.setForeground(Color.blue);
            txKembali.setText(Integer.toString(kembali)); 
        } else
        if (jLbBayar.getForeground()==Color.blue){
            simpanData();
        }            

    }//GEN-LAST:event_txBayarActionPerformed

    private void txKembaliCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txKembaliCaretUpdate
            jLbBayar.setText(txKembali.getText());            
    }//GEN-LAST:event_txKembaliCaretUpdate

    private void txBayarCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txBayarCaretUpdate
        txKembali.setText("0");
        jLbBayar.setForeground(Color.green);
        if (txBayar.getText().equals("")) {
            jLbBayar.setText("0");            
        } else {
            jLbBayar.setText(txBayar.getText());
        }

    }//GEN-LAST:event_txBayarCaretUpdate

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        System.out.println(evt);
    }//GEN-LAST:event_formKeyPressed

    private void txNisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNisKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_F2){
            cariSantri();
        }
    }//GEN-LAST:event_txNisKeyPressed

    private void txBayarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txBayarKeyPressed
                
        if (evt.getKeyCode()==KeyEvent.VK_F3){
            _bersih();
        }
    }//GEN-LAST:event_txBayarKeyPressed

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
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLbBayar;
    private javax.swing.JLabel jLbKamar;
    private javax.swing.JLabel jLbKelas;
    private javax.swing.JLabel jLbNama;
    private javax.swing.JLabel jLbTotal;
    private javax.swing.JLabel jLbnis;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblTrans;
    private javax.swing.JTextField txBayar;
    private javax.swing.JTextField txKembali;
    private javax.swing.JTextField txNis;
    // End of variables declaration//GEN-END:variables

    private void tampilKitab(String _id) throws SQLException {
        clearTable();
        DefaultTableModel tbl = new DefaultTableModel();
        tbl= (DefaultTableModel) jTblTrans.getModel();
        Integer no = 1;
        /*
        tbl.addColumn("No");
        tbl.addColumn("PID");
        tbl.addColumn("Deskripsi");
        tbl.addColumn("Harga");
        jTblTrans.setModel(tbl);
        */
                
        rsShow = kn.stmt.executeQuery("select * from tb_matpel where id_kelas ='"+_id+"' order by PID");
            while (rsShow.next()){
                tbl.addRow(new Object[]{
                new Integer(no++),
                rsShow.getString("PID"),
                rsShow.getString("MatPel"),
                new Integer(rsShow.getInt("Harga")),
                new Integer(rsShow.getInt("HPP"))
                });
                
                jTblTrans.setModel(tbl);
            }
        jLbTotal.setText(Integer.toString(hitungTotal()));
        
    }

    private Integer hitungTotal() {
        Integer total = 0;
        for (int i = 0; i < jTblTrans.getRowCount(); i++) {
            total += (Integer) jTblTrans.getValueAt(i, 3);
        }
        
        return total;
    }

    private void clearTable() {
        jTblTrans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "PID", "Deskripsi", "Harga","HPP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, 
                java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        
        jTblTrans.getColumnModel().getColumn(4).setMaxWidth(-1);
        jTblTrans.getColumnModel().getColumn(4).setMinWidth(-1);        
        jTblTrans.getColumnModel().getColumn(4).setMaxWidth(-1);

    }

    @SuppressWarnings("empty-statement")
    private String _idTrans() {
        String tgl,hari = "00000000",kd = "";
        Integer tot=0;
        
        try {
            rsTmp = kn.stmt.executeQuery("select count(id_Trans) as tot, date(now()) as sekarang from "+
                    "tb_jual_global where Tanggal = date(now())");
        rsTmp.first();
        
        tgl =rsTmp.getString("sekarang");
        hari = tgl.replace("-", "");
        
        tot = rsTmp.getInt("tot")+1;
        
        
        } catch (SQLException ex) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (tot<10000)  {kd="";}
        if (tot<1000)   {kd="0";}
        if (tot<100)    {kd="00";}
        if (tot<10)     {kd="000";}
        
        return "TR-"+hari+"-"+kd+Integer.toString(tot);        
    }

    private void simpanData() {
        String _isi = "",_id= _idTrans();
        //System.out.println(_id);

        for (int i = 0; i < jTblTrans.getRowCount(); i++) {
            _isi += "('"+_id+"','"+jTblTrans.getValueAt(i, 0)+
                    "','"+jTblTrans.getValueAt(i, 1)+
                    "','"+jTblTrans.getValueAt(i, 4)+
                    "','"+jTblTrans.getValueAt(i, 3)+"'),";
        }
        _isi=_isi.substring(0,_isi.length()-1);
        //System.out.println(_isi);
        
        try {
        //if (kn.conn.getAutoCommit()){kn.conn.setAutoCommit(false);}
        
        kn.conn.setAutoCommit(false);
        
        kn.stmt.executeUpdate("insert into tb_jual_global(id_Trans,Tanggal,jam,NIS,Total) values "+
                "('"+_id+"',date(now()),time(now()),'"+jLbnis.getText()+"','"+jLbTotal.getText()+"')");
        
        kn.stmt.executeUpdate("insert into tb_jual_rinci(id_Trans,no,PID,HPP,Harga) values "+_isi );
        
        
        kn.conn.commit();
        
        JOptionPane.showMessageDialog(rootPane, "Data Berhasil disimpan...");
        _bersih();
         } catch (SQLException ex) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
                
   }

    private void _bersih() {
        jLbnis.setText("");
        jLbNama.setText("");
        jLbKelas.setText("");
        jLbKamar.setText("");
        jLbTotal.setText("");

        jLbTotal.setText("Total");

        txNis.setText("");
        txNis.setFocusable(true);
        txBayar.setText("");
        txBayar.setFocusable(false);

        jLbBayar.setText("0");
        
        clearTable();
    }

    private void cariSantri() {
        JDlgCari cr = new JDlgCari(this, true,"select * from vw_santri","Nama");
        cr.setTitle("Cari Siswa");
        cr.setVisible(true);
        tampilData(cr.getHasil(0));                
    }

    private void tampilData(String kode) {
        try {
            rsTmp = kn.stmt.executeQuery("select * from vw_santri where NIS ='"+kode+"'");
            
            if (rsTmp.last()){
                jLbnis.setText(rsTmp.getString("NIS"));
                jLbNama.setText(rsTmp.getString("Nama"));
                jLbKelas.setText(rsTmp.getString("Kelas"));
                jLbKamar.setText(rsTmp.getString("Kamar"));
                tampilKitab(rsTmp.getString("id_kelas"));
                txBayar.setFocusable(true);
                jLbBayar.setText("0");
                txNis.setFocusable(false);
            } else {
                _bersih();
                JOptionPane.showMessageDialog(rootPane, "Data tidak ditemukan", "Not Found", 
                      JOptionPane.ERROR_MESSAGE);

            }
            
            rsExe = kn.stmt.executeQuery("SELECT DISTINCT NIS FROM tb_jual_global WHERE NIS = '"+kode+"'");
            if (rsExe.last()){
                JOptionPane.showMessageDialog(rootPane, "Siswa ini sudah melakukan pembelian...", "Sudah Beli", 
                      JOptionPane.ERROR_MESSAGE);
                _bersih();
            }

            txNis.setText("");

        } catch (SQLException ex) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
}