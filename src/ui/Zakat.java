/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.ZakatController;
import model.ZakatMal;

/**
 *
 * @author jepe
 */
public class Zakat extends javax.swing.JFrame {

    private ZakatController mController;
    private ZakatMal mZakat;
    
    private double hartaSetelahZakat;
    private double nisabZakat;
    /**
     * Creates new form Zakat
     */
    public Zakat() {
        initComponents();
        
        mController = new ZakatController(this);
        mZakat = new ZakatMal();
    }
    
    public void tampilZakatMal(ZakatMal mZakat){
        txtJumlahHarta.setText("Rp. " + mZakat.getOutputZmal1());
        txtJumlahHartaZakat.setText("" + mZakat.getOutputZmal2());
    }
    
    public void tampilBayarZakat(ZakatMal mZakat){
        txtNisabZakat.setText("" + mZakat.getOutputNmal1());
        txtBayarZakat.setText("" + mZakat.getOutputNmal2());
        txtZakatPertahun.setText("" + mZakat.getOutputNmal3());
        txtZakatPerbulan.setText("" + mZakat.getOutputNmal4());
    }
    
    public void setData(){
        
        mZakat.setInputZmal1(10000);
        mZakat.setInputZmal2(10000);
        mZakat.setInputZmal3(10000);
        mZakat.setInputZmal4(10000);
        mZakat.setInputZmal5(10000);
        mZakat.setInputZmal6(10000);
        mZakat.setInputZmal7(10000);
        mZakat.setInputZmal8(10000);
        mZakat.setInputZmal9(10000);
        
        mZakat.setInputZmal10(50000);
        
        mZakat.setInputNmal1(750000);
        
        mController.hitungJumlahHarta(mZakat);
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtJumlahHarta = new javax.swing.JLabel();
        txtJumlahHartaZakat = new javax.swing.JLabel();
        txtNisabZakat = new javax.swing.JLabel();
        txtBayarZakat = new javax.swing.JLabel();
        txtZakatPertahun = new javax.swing.JLabel();
        txtZakatPerbulan = new javax.swing.JLabel();
        txtInputZmal1 = new javax.swing.JTextField();
        txtInputZmal2 = new javax.swing.JTextField();
        txtInputZmal3 = new javax.swing.JTextField();
        txtInputZmal4 = new javax.swing.JTextField();
        txtInputZmal5 = new javax.swing.JTextField();
        txtInputZmal6 = new javax.swing.JTextField();
        txtInputZmal7 = new javax.swing.JTextField();
        txtInputZmal8 = new javax.swing.JTextField();
        txtInputZmal9 = new javax.swing.JTextField();
        txtInputNmal1 = new javax.swing.JTextField();
        txtInputZmal10 = new javax.swing.JTextField();
        btnHitung = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtJumlahHarta.setText("jLabel1");
        getContentPane().add(txtJumlahHarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 247, -1, -1));

        txtJumlahHartaZakat.setText("jLabel1");
        getContentPane().add(txtJumlahHartaZakat, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 272, -1, -1));

        txtNisabZakat.setText("jLabel2");
        getContentPane().add(txtNisabZakat, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 297, -1, -1));

        txtBayarZakat.setText("Ya");
        getContentPane().add(txtBayarZakat, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 322, -1, -1));

        txtZakatPertahun.setText("jLabel4");
        getContentPane().add(txtZakatPertahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 347, -1, -1));

        txtZakatPerbulan.setText("jLabel5");
        getContentPane().add(txtZakatPerbulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 372, -1, -1));

        txtInputZmal1.setText("0");
        txtInputZmal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputZmal1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtInputZmal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 171, -1));

        txtInputZmal2.setText("0");
        txtInputZmal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputZmal2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtInputZmal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 171, -1));

        txtInputZmal3.setText("0");
        txtInputZmal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputZmal3ActionPerformed(evt);
            }
        });
        getContentPane().add(txtInputZmal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 171, -1));

        txtInputZmal4.setText("0");
        txtInputZmal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputZmal4ActionPerformed(evt);
            }
        });
        getContentPane().add(txtInputZmal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 171, -1));

        txtInputZmal5.setText("0");
        txtInputZmal5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputZmal5ActionPerformed(evt);
            }
        });
        getContentPane().add(txtInputZmal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 171, -1));

        txtInputZmal6.setText("0");
        txtInputZmal6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputZmal6ActionPerformed(evt);
            }
        });
        getContentPane().add(txtInputZmal6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 171, -1));

        txtInputZmal7.setText("0");
        txtInputZmal7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputZmal7ActionPerformed(evt);
            }
        });
        getContentPane().add(txtInputZmal7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 171, -1));

        txtInputZmal8.setText("0");
        txtInputZmal8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputZmal8ActionPerformed(evt);
            }
        });
        getContentPane().add(txtInputZmal8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 171, -1));

        txtInputZmal9.setText("0");
        txtInputZmal9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputZmal9ActionPerformed(evt);
            }
        });
        getContentPane().add(txtInputZmal9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 171, -1));

        txtInputNmal1.setText("0");
        txtInputNmal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputNmal1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtInputNmal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 171, -1));

        txtInputZmal10.setText("0");
        txtInputZmal10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputZmal10ActionPerformed(evt);
            }
        });
        getContentPane().add(txtInputZmal10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 171, -1));

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });
        getContentPane().add(btnHitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, -1));

        jLabel1.setText("Bayar Zakat?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtInputZmal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputZmal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputZmal1ActionPerformed

    private void txtInputZmal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputZmal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputZmal2ActionPerformed

    private void txtInputZmal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputZmal3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputZmal3ActionPerformed

    private void txtInputZmal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputZmal4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputZmal4ActionPerformed

    private void txtInputZmal5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputZmal5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputZmal5ActionPerformed

    private void txtInputZmal6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputZmal6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputZmal6ActionPerformed

    private void txtInputZmal7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputZmal7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputZmal7ActionPerformed

    private void txtInputZmal8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputZmal8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputZmal8ActionPerformed

    private void txtInputZmal9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputZmal9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputZmal9ActionPerformed

    private void txtInputNmal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputNmal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputNmal1ActionPerformed

    private void txtInputZmal10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputZmal10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputZmal10ActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        mZakat.setInputZmal1(Double.parseDouble(txtInputZmal1.getText()));
        mZakat.setInputZmal2(Double.parseDouble(txtInputZmal2.getText()));
        mZakat.setInputZmal3(Double.parseDouble(txtInputZmal3.getText()));
        mZakat.setInputZmal4(Double.parseDouble(txtInputZmal4.getText()));
        mZakat.setInputZmal5(Double.parseDouble(txtInputZmal5.getText()));
        mZakat.setInputZmal6(Double.parseDouble(txtInputZmal6.getText()));
        mZakat.setInputZmal7(Double.parseDouble(txtInputZmal7.getText()));
        mZakat.setInputZmal8(Double.parseDouble(txtInputZmal8.getText()));
        mZakat.setInputZmal9(Double.parseDouble(txtInputZmal9.getText()));
        mZakat.setInputZmal10(Double.parseDouble(txtInputZmal10.getText()));
        mZakat.setInputNmal1(Double.parseDouble(txtInputNmal1.getText()));
        
        mController.hitungJumlahHarta(mZakat);
    }//GEN-LAST:event_btnHitungActionPerformed

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
            java.util.logging.Logger.getLogger(Zakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Zakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Zakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Zakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Zakat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txtBayarZakat;
    private javax.swing.JTextField txtInputNmal1;
    private javax.swing.JTextField txtInputZmal1;
    private javax.swing.JTextField txtInputZmal10;
    private javax.swing.JTextField txtInputZmal2;
    private javax.swing.JTextField txtInputZmal3;
    private javax.swing.JTextField txtInputZmal4;
    private javax.swing.JTextField txtInputZmal5;
    private javax.swing.JTextField txtInputZmal6;
    private javax.swing.JTextField txtInputZmal7;
    private javax.swing.JTextField txtInputZmal8;
    private javax.swing.JTextField txtInputZmal9;
    private javax.swing.JLabel txtJumlahHarta;
    private javax.swing.JLabel txtJumlahHartaZakat;
    private javax.swing.JLabel txtNisabZakat;
    private javax.swing.JLabel txtZakatPerbulan;
    private javax.swing.JLabel txtZakatPertahun;
    // End of variables declaration//GEN-END:variables

    
}