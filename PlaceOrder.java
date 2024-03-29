
package musiconweb;

import dao.CategoryDao;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;
import model.NewMusic;
import dao.NewMusicDao;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.TableModel;
import model.Category;

/**
 *
 * @author AmTechGuy
 */
public class PlaceOrder extends javax.swing.JFrame {

   public int grandTotal = 0;
   public int productPrice = 0;
   public int productTotal = 0;
   private String email;
    /**
     * Creates new form PlaceOrder
     */
    public PlaceOrder() {
        initComponents();
        initComponents();
        //this.email = email;
        //this.grandTotal = grandTotal;
        txtName.setEnabled(false);
        txtPrice.setEditable(false);
        txtTotal.setEditable(false);
        btnAddToCart.setEnabled(false);
        btnBuyNow.setEnabled(false);
                JFormattedTextField tf = ((JSpinner.DefaultEditor)jSpinnerQuantity.getEditor()).getTextField();
                tf.setEnabled(false);
    }
    
     public void clear(){
        txtName.setText("");
        txtPrice.setText("");
        jSpinnerQuantity.setValue(1);
        txtTotal.setText("");
        btnAddToCart.setEnabled(false);
    }
     
     public void date(){
        Date date = new Date();
        
        SimpleDateFormat fommatter = new SimpleDateFormat("E dd/MM/YYYY");
        String todayDate = fommatter.format(date);
       lblDate.setText(todayDate);
    }
    public void time(){
        Date date = new Date();
        
        SimpleDateFormat fommatter = new SimpleDateFormat("hh:mm:ss");
        String currentTime = fommatter.format(date);
        lblTime.setText(currentTime);
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
        jLabel1 = new javax.swing.JLabel();
        jComboCategory = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbtList = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnAddToCart = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnRemove = new javax.swing.JButton();
        btnClearCart = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblGrandTotal = new javax.swing.JLabel();
        btnBuyNow = new javax.swing.JButton();
        jSpinnerQuantity = new javax.swing.JSpinner();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 235, 215));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Select the Category");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 179, -1, -1));

        jComboCategory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jComboCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCategoryActionPerformed(evt);
            }
        });
        jPanel1.add(jComboCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 210, 300, -1));

        jLabel3.setFont(new java.awt.Font("MV Boli", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("An Online Music Web");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Music On WEB");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 16, -1, -1));

        tbtList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tbtList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title and Artist"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbtList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbtList);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 278, 317, 335));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("List of Available CDs");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 247, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Name/Artist");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 179, -1, -1));

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 210, 250, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Quantity");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 247, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Price");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 179, -1, -1));

        txtPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 210, 250, -1));

        txtTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 278, 250, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Total");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 247, -1, -1));

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 327, -1, -1));

        btnAddToCart.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddToCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add to cart.png"))); // NOI18N
        btnAddToCart.setText("Add To Cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 327, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Shopping Cart");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 369, -1, -1));

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name/Artist", "Price", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 400, -1, 231));

        btnRemove.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnRemove.setText("Remove ");
        jPanel1.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 414, -1, -1));

        btnClearCart.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClearCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btnClearCart.setText("Clear Cart");
        jPanel1.add(btnClearCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 496, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Grand Total:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 654, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("NGN");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 654, -1, -1));

        lblGrandTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblGrandTotal.setText("00000");
        jPanel1.add(lblGrandTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 654, -1, -1));

        btnBuyNow.setBackground(new java.awt.Color(0, 0, 102));
        btnBuyNow.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnBuyNow.setForeground(new java.awt.Color(255, 255, 255));
        btnBuyNow.setText("Buy Now");
        btnBuyNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyNowActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuyNow, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 649, -1, -1));

        jSpinnerQuantity.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jSpinnerQuantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerQuantityStateChanged(evt);
            }
        });
        jPanel1.add(jSpinnerQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 278, 250, -1));

        lblDate.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblDate.setText("jLabel14");
        lblDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDateMouseClicked(evt);
            }
        });
        jPanel1.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, -1, -1));

        lblTime.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTime.setText("jLabel15");
        jPanel1.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 80, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/music.png"))); // NOI18N
        jLabel2.setText("jLabel1");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 249, 356));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jLabel5.setText("Back");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCategoryActionPerformed
        // TODO add your handling code here:
        String category = jComboCategory.getSelectedItem().toString();
        //productNameByCategory(category);
    }//GEN-LAST:event_jComboCategoryActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void tbtListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtListMouseClicked
        // TODO add your handling code here:
//        int index = tbtList.getSelectedRow();
//        TableModel model = tbtList.getModel();
//        String musicName = model.getValueAt(index, 0).toString();
//        //NewMusic newMusic = NewMusicDao.getProductByname(musicName);
//            txtName.setText(newMusic.getName());
//            txtPrice.setText(newMusic.getPrice());
//            jSpinnerQuantity.setValue(1);
//            txtTotal.setText(newMusic.getPrice());
//            productPrice = Integer.parseInt(newMusic.getPrice());
//            productTotal = Integer.parseInt(newMusic.getPrice());
//            btnAddToCart.setEnabled(true);
    }//GEN-LAST:event_tbtListMouseClicked

    private void jSpinnerQuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerQuantityStateChanged
        // TODO add your handling code here:
        int quantity = (Integer) jSpinnerQuantity.getValue();
        if(quantity < 1){
            jSpinnerQuantity.setValue(1);
            quantity = 1;
        }
        productTotal = productPrice * quantity;
        txtTotal.setText(String.valueOf(productTotal));
    }//GEN-LAST:event_jSpinnerQuantityStateChanged

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String price = txtPrice.getText();
        String quantity = String.valueOf(jSpinnerQuantity.getValue());
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.addRow(new Object[]{name, price, quantity, productTotal});
        grandTotal = grandTotal + productTotal;
        lblGrandTotal.setText(String.valueOf(grandTotal));
        
        clear();
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        new DashBoard("raji@gmail.com").setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btnBuyNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyNowActionPerformed
        // TODO add your handling code here:
        
        setVisible(false);
        new Gateway(grandTotal).setVisible(true);
    }//GEN-LAST:event_btnBuyNowActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formComponentShown

    private void lblDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDateMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_lblDateMouseClicked

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jPanel1ComponentShown

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
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaceOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnBuyNow;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearCart;
    private javax.swing.JButton btnRemove;
    private javax.swing.JComboBox<String> jComboCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerQuantity;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblGrandTotal;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTable tbtList;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
