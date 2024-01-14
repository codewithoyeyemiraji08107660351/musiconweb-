
package musiconweb;

import javax.swing.JOptionPane;

/**
 *
 * @author AmTechGuy
 */
public class Gateway extends javax.swing.JFrame {
    
    private static int grandTotal;
    /**
     * Creates new form Gateway
     * @param grandTotal
     */
    public Gateway(int grandTotal) {
        initComponents();
        btnPay.setEnabled(false);
        Gateway.grandTotal = grandTotal;
        lblTotal.setText(String.format("%s", grandTotal));
        
        lblCardNumber.setVisible(false);
        txtCardNumber.setVisible(false);
        lblCV.setVisible(false);
        txtCV.setVisible(false);
        lblPin.setVisible(false);
        txtPIN.setVisible(false);
    }
    
    public void clear(){
        txtCardNumber.setText("");
        txtCV.setText("");
        txtPIN.setText("");
        btnPay.setEnabled(false);
    }
    public void validates(){
        String cardNumber = txtCardNumber.getText();
        String cv = txtCV.getText();
        String pin = txtPIN.getText();
        if(!cardNumber.equals("")&& !cv.equals("") && !pin.equals("")){
            btnPay.setEnabled(true);
        }
        else{
            btnPay.setEnabled(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCheckBoxDemandDraft = new javax.swing.JCheckBox();
        jCheckBoxCOD = new javax.swing.JCheckBox();
        jCheckBoxCreditCard = new javax.swing.JCheckBox();
        lblCardNumber = new javax.swing.JLabel();
        txtCardNumber = new javax.swing.JTextField();
        lblCV = new javax.swing.JLabel();
        txtCV = new javax.swing.JPasswordField();
        lblPin = new javax.swing.JLabel();
        txtPIN = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnPay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 235, 215));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/music1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 6, -1, 137));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Music DashBoad");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 48, -1, -1));

        jLabel3.setFont(new java.awt.Font("MV Boli", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Payment Gateway");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Please select the Payment Mode ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 207, -1, -1));

        jCheckBoxDemandDraft.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jCheckBoxDemandDraft.setText("Demand Draft");
        jCheckBoxDemandDraft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDemandDraftActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBoxDemandDraft, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 257, -1, -1));

        jCheckBoxCOD.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jCheckBoxCOD.setText("Cash On Delivery (COD)");
        jCheckBoxCOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCODActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBoxCOD, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 311, -1, -1));

        jCheckBoxCreditCard.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jCheckBoxCreditCard.setText("Credit Card");
        jCheckBoxCreditCard.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxCreditCardItemStateChanged(evt);
            }
        });
        jCheckBoxCreditCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCreditCardActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBoxCreditCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 365, -1, -1));

        lblCardNumber.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCardNumber.setText("Card Number");
        jPanel1.add(lblCardNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 436, -1, -1));

        txtCardNumber.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtCardNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCardNumberKeyReleased(evt);
            }
        });
        jPanel1.add(txtCardNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 433, 257, -1));

        lblCV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCV.setText("Card CV");
        jPanel1.add(lblCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 485, -1, -1));

        txtCV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtCV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCVKeyReleased(evt);
            }
        });
        jPanel1.add(txtCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 482, 257, -1));

        lblPin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPin.setText("Card PIN");
        jPanel1.add(lblPin, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 534, -1, -1));

        txtPIN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPIN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPINKeyReleased(evt);
            }
        });
        jPanel1.add(txtPIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 531, 257, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Total Amount");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 580, -1, -1));

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTotal.setText("00000");
        jPanel1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 580, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 611, -1, -1));

        btnPay.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPay.setText("Pay");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });
        jPanel1.add(btnPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 611, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1253, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxDemandDraftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDemandDraftActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxDemandDraftActionPerformed

    private void jCheckBoxCODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxCODActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxCODActionPerformed

    private void jCheckBoxCreditCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxCreditCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxCreditCardActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCardNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCardNumberKeyReleased
        // TODO add your handling code here:
        validates();
    }//GEN-LAST:event_txtCardNumberKeyReleased

    private void txtCVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCVKeyReleased
        // TODO add your handling code here:
        validates();
    }//GEN-LAST:event_txtCVKeyReleased

    private void txtPINKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPINKeyReleased
        // TODO add your handling code here:
        validates();
    }//GEN-LAST:event_txtPINKeyReleased

    private void jCheckBoxCreditCardItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxCreditCardItemStateChanged
        // TODO add your handling code here:
        if(jCheckBoxCreditCard.isSelected()){
            lblCardNumber.setVisible(true);
            txtCardNumber.setVisible(true);
            lblCV.setVisible(true);
            txtCV.setVisible(true);
            lblPin.setVisible(true);
            txtPIN.setVisible(true);
        }
       
    }//GEN-LAST:event_jCheckBoxCreditCardItemStateChanged

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
     JOptionPane.showMessageDialog(null, "Your Order has been Placed!!");
      setVisible(false);
        new OrderMusic().setVisible(true);
    }//GEN-LAST:event_btnPayActionPerformed

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
            java.util.logging.Logger.getLogger(Gateway.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gateway.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gateway.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gateway.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gateway(grandTotal).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPay;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBoxCOD;
    private javax.swing.JCheckBox jCheckBoxCreditCard;
    private javax.swing.JCheckBox jCheckBoxDemandDraft;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCV;
    private javax.swing.JLabel lblCardNumber;
    private javax.swing.JLabel lblPin;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPasswordField txtCV;
    private javax.swing.JTextField txtCardNumber;
    private javax.swing.JPasswordField txtPIN;
    // End of variables declaration//GEN-END:variables
}
