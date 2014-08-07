/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.kitab.dialog;

import cb.kitab.Transaksi;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import cb.kitab.utils.Koneksi;
import cb.kitab.utils.ListTableModel;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sanjaya
 */
public class JDlgCari extends javax.swing.JDialog {
    private Koneksi kn = new Koneksi();
    private ResultSet rs;
    protected String _query;
    protected String filter;
    protected boolean ketemu;

    /**
     * Creates new form JDlgCari
     */
    public JDlgCari(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public JDlgCari(java.awt.Frame parent, boolean modal,String sql,String filter) {
        super(parent, modal);
        lookandfeels();

        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.addKeyEventDispatcher(new MyDispatcher());
        
        initComponents();
        setLocationRelativeTo(null);
        
        this._query = sql;
        this.filter = filter;
        allData();
    }    
    private class MyDispatcher implements KeyEventDispatcher {
        
        @Override
        public boolean dispatchKeyEvent(KeyEvent e) {
            if (e.getID() == KeyEvent.KEY_PRESSED) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    temukan();
                }
                                
                if (e.getKeyCode() ==KeyEvent.VK_ESCAPE){
                    keluarkan();
                }
            } else if (e.getID() == KeyEvent.KEY_RELEASED) {
//                System.out.println("2test2");
            } else if (e.getID() == KeyEvent.KEY_TYPED) {
//                System.out.println("3test3");
            }
            return false;
        }
    }

    private void lookandfeels(){
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
            java.util.logging.Logger.getLogger(JDlgCari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgCari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgCari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgCari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }
    
    private void temukan() {
        this.ketemu = true;
        this.dispose();
    }
    
    private void keluarkan() {
        this.dispose();
    }

    public boolean dicari(){
        return this.ketemu;        
    }
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFcari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblCari = new javax.swing.JTable();
        btnCari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jTFcari.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTFcariCaretUpdate(evt);
            }
        });
        jTFcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFcariKeyPressed(evt);
            }
        });

        jTblCari.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTblCari);

        btnCari.setText("Pilih");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(476, Short.MAX_VALUE)
                .addComponent(btnCari)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTFcari)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jTFcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCari)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFcariCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTFcariCaretUpdate
        cariData(jTFcari.getText());
        //        System.out.println(jTFcari.getText());
    }//GEN-LAST:event_jTFcariCaretUpdate

    private void jTFcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFcariKeyPressed
        //Up
        if (evt.getKeyCode()==38){
                jTblCari.changeSelection(jTblCari.getSelectedRow()-1, 0, false, false);
                
        } 
        //Down
        if (evt.getKeyCode()==40){
            if (jTblCari.getSelectedRow() != jTblCari.getRowCount()-1) {
                jTblCari.changeSelection(jTblCari.getSelectedRow()+1, 0, false, false);
            }                
        } 
    }//GEN-LAST:event_jTFcariKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgCari dialog = new JDlgCari(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFcari;
    private javax.swing.JTable jTblCari;
    // End of variables declaration//GEN-END:variables

        private void cariData(String text) {
        try {
            rs= kn.stmt.executeQuery(_query+" where "+filter+" like '%"+text+"%' LIMIT 50");
            tampilTable(rs);
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    private void allData() {
        try {
            rs= kn.stmt.executeQuery(_query+  " LIMIT 50");
            tampilTable(rs);
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    private void tampilTable(ResultSet rs) throws SQLException {
            ListTableModel tblMdl = ListTableModel.createModelFromResultSet(rs);
            jTblCari.setModel(tblMdl);
            jTblCari.changeSelection(0, 0, false, false);
    }
    
    public String getHasil(Integer col){
        return (String) jTblCari.getValueAt(jTblCari.getSelectedRow(), col);        
    }
    

}
