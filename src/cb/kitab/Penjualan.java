/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.kitab;

import cb.kitab.utils.Koneksi;
import cb.kitab.utils.ListTableModel;
import java.awt.event.KeyEvent;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.TableColumnModelEvent;
import javax.swing.event.TableColumnModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author swalayan
 */
public class Penjualan extends javax.swing.JFrame {
    ResultSet rs,rsSP;
    Koneksi kn = new Koneksi();
    private DecimalFormat numFormat = new DecimalFormat("#,###,###");
    
    /**
     * Creates new form Kebutuhan
     */
    public Penjualan() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(getExtendedState() | MAXIMIZED_BOTH);       
        Refresh();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRefresh = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tblFooter = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblKeb = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Penjualan");

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        tblFooter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblFooter.setEnabled(false);
        tblFooter.setFocusable(false);
        jPanel1.add(tblFooter, java.awt.BorderLayout.PAGE_END);

        jTblKeb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTblKeb.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTblKeb.getColumnModel().addColumnModelListener(
            new TableColumnModelListener() {

                @Override
                public void columnSelectionChanged(ListSelectionEvent e) {
                }

                @Override
                public void columnRemoved(TableColumnModelEvent e) {
                }

                @Override
                public void columnMoved(TableColumnModelEvent e) {
                }

                @Override
                public void columnMarginChanged(ChangeEvent e) {
                    final TableColumnModel tableColumnModel = jTblKeb
                    .getColumnModel();
                    TableColumnModel footerColumnModel = tblFooter
                    .getColumnModel();
                    for (int i = 0; i < tableColumnModel.getColumnCount(); i++) {
                        int w = tableColumnModel.getColumn(i).getWidth();
                        footerColumnModel.getColumn(i).setMinWidth(w);
                        footerColumnModel.getColumn(i).setMaxWidth(w);
                        // footerColumnModel.getColumn(i).setPreferredWidth(w);
                    }

                    tblFooter.doLayout();
                    tblFooter.repaint();
                    repaint();
                }

                @Override
                public void columnAdded(TableColumnModelEvent e) {
                }
            });
            jTblKeb.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    jTblKebKeyPressed(evt);
                }
            });
            jScrollPane1.setViewportView(jTblKeb);

            jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                        .addComponent(btnRefresh))
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnRefresh)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addContainerGap())
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        Refresh();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void jTblKebKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTblKebKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_F12){
            // key press
        }
    }//GEN-LAST:event_jTblKebKeyPressed
    
    private Integer sumTbl(int col) {
        Integer total = 0;
        for (int i = 0; i < jTblKeb.getRowCount(); i++) {
            total += (Integer) jTblKeb.getValueAt(i, col);
            jTblKeb.setValueAt(numFormat.format(jTblKeb.getValueAt(i, col)), i, col);
        }
        
        return total;
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
            java.util.logging.Logger.getLogger(Kebutuhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kebutuhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kebutuhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kebutuhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Penjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblKeb;
    private javax.swing.JTable tblFooter;
    // End of variables declaration//GEN-END:variables

    private void Refresh() {
        ArrayList<String> column = new ArrayList<String>();
            column.add("PID");
            column.add("Deskripsi");
            column.add("Qty");
            column.add("SUM HPP");
            column.add("SUM HARGA");
            column.add("Laba");
            
            ListTableModel tbl = new ListTableModel(column);
            tbl.setModelEditable( false );
            
        try {
          rs = kn.stmt.executeQuery("select * from vwPenjualan order by PID");        
          
          ArrayList<List> data = new ArrayList<List>();
		while (rs.next())
		{
			ArrayList<Object>row = new ArrayList<Object>(10);
			row.add(0, rs.getObject(1));
			row.add(1, rs.getObject(2));
                        row.add(2, rs.getInt(3));
			row.add(3, rs.getInt(4));
                        row.add(4, rs.getInt(5));
                        row.add(5, rs.getInt(6));
                                                                        
			data.add(row );
		}
                
                tbl.insertRows(0, data);        
        
        jTblKeb.setModel(tbl);
        
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        
        for (int i = 2; i < 6; i++) {
            //tbl.setColumnClass(i, java.lang.Integer.class);
            tblFooter.setValueAt(numFormat.format(sumTbl(i)), 0, i);
            tblFooter.getColumnModel().getColumn(i).setCellRenderer(rightRenderer);
            jTblKeb.getColumnModel().getColumn(i).setCellRenderer(rightRenderer);
        }
        
        } catch (SQLException ex) {
            Logger.getLogger(Kebutuhan.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
}