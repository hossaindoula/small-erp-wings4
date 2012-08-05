/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wings4.client;

import com.wings4.Login;
import com.wings4.util.InventoryBase;
import com.wings4.util.InactivityListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import javax.swing.Action;

/**
 *
 * @author Administrator
 */
public class InventoryDesktop extends InventoryBase {
    
    private static InventoryDesktop desktop = new InventoryDesktop();
    private static Login login = new Login();

    private static class LogoutAction implements Action {

        public LogoutAction() {
            //desktop.dispose();
        }

        @Override
        public Object getValue(String key) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void putValue(String key, Object value) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void setEnabled(boolean b) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public boolean isEnabled() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void addPropertyChangeListener(PropertyChangeListener listener) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void removePropertyChangeListener(PropertyChangeListener listener) {
            
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            login.setVisible(true);
            desktop.dispose();
        }
    }

    /**
     * Creates new form InventoryDesktop
     */
    public InventoryDesktop() {
        initComponents();
        Action logoutAction = new LogoutAction();
        InactivityListener listener = new InactivityListener(logoutAction, 10);
        listener.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        categoryToolBarButton = new javax.swing.JButton();
        productToolbarButton = new javax.swing.JButton();
        purchaseToolbarButton = new javax.swing.JButton();
        salesToolbarButton = new javax.swing.JButton();
        inventoryDesktopBoard = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        loginMenuItem = new javax.swing.JMenuItem();
        logoutMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exitMenuItem = new javax.swing.JMenuItem();
        generalMenu = new javax.swing.JMenu();
        dashboardMenu = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        reportsMenu = new javax.swing.JMenuItem();
        materialsMenu = new javax.swing.JMenu();
        categoryMenuItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        productMenuItem = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        inventoryMenuItem = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        transferOrderMenuItem = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        consignmentMenuItem = new javax.swing.JMenuItem();
        salesMenu = new javax.swing.JMenu();
        salesOrderMenuItem = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        pickingMenuItem = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        shippingMenuItem = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        customerMenuItem = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        rmaMenuItem = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        pricingMenuItem = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        discountMenuItem = new javax.swing.JMenuItem();
        purchasingMenu = new javax.swing.JMenu();
        purchasingOrderMenuItem = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        receivingMenuItem = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        vendorMenuItem = new javax.swing.JMenuItem();
        manufacturingMenuItem = new javax.swing.JMenu();
        billOfMaterialsMenuItem = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        manufactureOrderMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventory");

        jToolBar1.setRollover(true);

        categoryToolBarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wings4/resource/category.png"))); // NOI18N
        categoryToolBarButton.setFocusable(false);
        categoryToolBarButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        categoryToolBarButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        categoryToolBarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryToolBarButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(categoryToolBarButton);

        productToolbarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wings4/resource/product.png"))); // NOI18N
        productToolbarButton.setFocusable(false);
        productToolbarButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        productToolbarButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(productToolbarButton);

        purchaseToolbarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wings4/resource/purchase.png"))); // NOI18N
        purchaseToolbarButton.setFocusable(false);
        purchaseToolbarButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        purchaseToolbarButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(purchaseToolbarButton);

        salesToolbarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wings4/resource/sales.png"))); // NOI18N
        salesToolbarButton.setFocusable(false);
        salesToolbarButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salesToolbarButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(salesToolbarButton);

        inventoryDesktopBoard.setBackground(new java.awt.Color(255, 255, 255));
        inventoryDesktopBoard.setForeground(new java.awt.Color(255, 255, 255));

        fileMenu.setText("File");

        loginMenuItem.setText("Login");
        fileMenu.add(loginMenuItem);

        logoutMenuItem.setText("Logout");
        logoutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(logoutMenuItem);
        fileMenu.add(jSeparator1);

        exitMenuItem.setText("Exit");
        fileMenu.add(exitMenuItem);

        jMenuBar1.add(fileMenu);

        generalMenu.setText("General");

        dashboardMenu.setText("Dashboard");
        generalMenu.add(dashboardMenu);
        generalMenu.add(jSeparator2);

        reportsMenu.setText("Reports");
        generalMenu.add(reportsMenu);

        jMenuBar1.add(generalMenu);

        materialsMenu.setText("Materials");

        categoryMenuItem.setText("Category");
        materialsMenu.add(categoryMenuItem);
        materialsMenu.add(jSeparator3);

        productMenuItem.setText("Product");
        materialsMenu.add(productMenuItem);
        materialsMenu.add(jSeparator4);

        inventoryMenuItem.setText("Inventory");
        materialsMenu.add(inventoryMenuItem);
        materialsMenu.add(jSeparator5);

        transferOrderMenuItem.setText("Transfer Order");
        materialsMenu.add(transferOrderMenuItem);
        materialsMenu.add(jSeparator6);

        consignmentMenuItem.setText("Consignment");
        materialsMenu.add(consignmentMenuItem);

        jMenuBar1.add(materialsMenu);

        salesMenu.setText("Sales");

        salesOrderMenuItem.setText("Sales Order");
        salesMenu.add(salesOrderMenuItem);
        salesMenu.add(jSeparator7);

        pickingMenuItem.setText("Picking");
        salesMenu.add(pickingMenuItem);
        salesMenu.add(jSeparator8);

        shippingMenuItem.setText("Shipping");
        salesMenu.add(shippingMenuItem);
        salesMenu.add(jSeparator9);

        customerMenuItem.setText("Customer");
        salesMenu.add(customerMenuItem);
        salesMenu.add(jSeparator10);

        rmaMenuItem.setText("RMA");
        salesMenu.add(rmaMenuItem);
        salesMenu.add(jSeparator11);

        pricingMenuItem.setText("Pricing");
        salesMenu.add(pricingMenuItem);
        salesMenu.add(jSeparator12);

        discountMenuItem.setText("Discount");
        salesMenu.add(discountMenuItem);

        jMenuBar1.add(salesMenu);

        purchasingMenu.setText("Purchasing");

        purchasingOrderMenuItem.setText("Purchasing Order");
        purchasingMenu.add(purchasingOrderMenuItem);
        purchasingMenu.add(jSeparator13);

        receivingMenuItem.setText("Receiving");
        purchasingMenu.add(receivingMenuItem);
        purchasingMenu.add(jSeparator14);

        vendorMenuItem.setText("Vendor");
        purchasingMenu.add(vendorMenuItem);

        jMenuBar1.add(purchasingMenu);

        manufacturingMenuItem.setText("Manufacturing");

        billOfMaterialsMenuItem.setText("Bill of Materials");
        manufacturingMenuItem.add(billOfMaterialsMenuItem);
        manufacturingMenuItem.add(jSeparator15);

        manufactureOrderMenuItem.setText("Manufacture Order");
        manufacturingMenuItem.add(manufactureOrderMenuItem);

        jMenuBar1.add(manufacturingMenuItem);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
            .addComponent(inventoryDesktopBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inventoryDesktopBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void categoryToolBarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryToolBarButtonActionPerformed
        Category category = new Category();
        category.setVisible(true);
        inventoryDesktopBoard.add(category);
    }//GEN-LAST:event_categoryToolBarButtonActionPerformed

    private void logoutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuItemActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_logoutMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(InventoryDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(InventoryDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(InventoryDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(InventoryDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new InventoryDesktop().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem billOfMaterialsMenuItem;
    private javax.swing.JMenuItem categoryMenuItem;
    private javax.swing.JButton categoryToolBarButton;
    private javax.swing.JMenuItem consignmentMenuItem;
    private javax.swing.JMenuItem customerMenuItem;
    private javax.swing.JMenuItem dashboardMenu;
    private javax.swing.JMenuItem discountMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu generalMenu;
    private javax.swing.JDesktopPane inventoryDesktopBoard;
    private javax.swing.JMenuItem inventoryMenuItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem loginMenuItem;
    private javax.swing.JMenuItem logoutMenuItem;
    private javax.swing.JMenuItem manufactureOrderMenuItem;
    private javax.swing.JMenu manufacturingMenuItem;
    private javax.swing.JMenu materialsMenu;
    private javax.swing.JMenuItem pickingMenuItem;
    private javax.swing.JMenuItem pricingMenuItem;
    private javax.swing.JMenuItem productMenuItem;
    private javax.swing.JButton productToolbarButton;
    private javax.swing.JButton purchaseToolbarButton;
    private javax.swing.JMenu purchasingMenu;
    private javax.swing.JMenuItem purchasingOrderMenuItem;
    private javax.swing.JMenuItem receivingMenuItem;
    private javax.swing.JMenuItem reportsMenu;
    private javax.swing.JMenuItem rmaMenuItem;
    private javax.swing.JMenu salesMenu;
    private javax.swing.JMenuItem salesOrderMenuItem;
    private javax.swing.JButton salesToolbarButton;
    private javax.swing.JMenuItem shippingMenuItem;
    private javax.swing.JMenuItem transferOrderMenuItem;
    private javax.swing.JMenuItem vendorMenuItem;
    // End of variables declaration//GEN-END:variables
}
