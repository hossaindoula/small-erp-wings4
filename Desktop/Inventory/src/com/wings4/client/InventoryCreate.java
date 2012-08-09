/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * InventoryCreate.java
 *
 * Created on Aug 6, 2012, 12:24:21 PM
 */
package com.wings4.client;

import com.wings4.Login;
import com.wings4.util.InventoryConstants;
import com.wings4.util.InventoryInternalBase;
import com.wings4.util.RESTFeed;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Masum
 */
public class InventoryCreate extends InventoryInternalBase {

    /** Creates new form InventoryCreate */
    public InventoryCreate() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productLabel = new javax.swing.JLabel();
        onHandLabel = new javax.swing.JLabel();
        onHandText = new javax.swing.JTextField();
        onOrderLabel = new javax.swing.JLabel();
        onOrderText = new javax.swing.JTextField();
        allocatedLabel = new javax.swing.JLabel();
        allocatedText = new javax.swing.JTextField();
        committedLabel = new javax.swing.JLabel();
        committedText = new javax.swing.JTextField();
        unavailableLabel = new javax.swing.JLabel();
        unavailableText = new javax.swing.JTextField();
        backOrdered = new javax.swing.JLabel();
        backOrderedText = new javax.swing.JTextField();
        dropShip = new javax.swing.JLabel();
        dropShipText = new javax.swing.JTextField();
        availableForSale = new javax.swing.JLabel();
        availableForSaleText = new javax.swing.JTextField();
        availableToPick = new javax.swing.JLabel();
        availableToPickText = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        productListCombo = new javax.swing.JComboBox();

        setTitle("Inventory Create");

        productLabel.setText("Product");

        onHandLabel.setText("On Hand");

        onOrderLabel.setText("On Order");

        allocatedLabel.setText("Allocated");

        committedLabel.setText("Committed");

        unavailableLabel.setText("Unavailable");

        backOrdered.setText("Back Ordered");

        dropShip.setText("Drop Ship");

        availableForSale.setText("Available For Sale");

        availableToPick.setText("Available To Pick");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");

        productListCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(availableToPick)
                    .addComponent(availableForSale)
                    .addComponent(dropShip)
                    .addComponent(backOrdered)
                    .addComponent(productLabel)
                    .addComponent(onOrderLabel)
                    .addComponent(allocatedLabel)
                    .addComponent(committedLabel)
                    .addComponent(unavailableLabel)
                    .addComponent(onHandLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveButton)
                        .addGap(44, 44, 44)
                        .addComponent(cancelButton))
                    .addComponent(availableToPickText)
                    .addComponent(availableForSaleText)
                    .addComponent(dropShipText)
                    .addComponent(backOrderedText)
                    .addComponent(unavailableText)
                    .addComponent(committedText)
                    .addComponent(allocatedText)
                    .addComponent(onOrderText)
                    .addComponent(onHandText)
                    .addComponent(productListCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productLabel)
                    .addComponent(productListCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onHandText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(onHandLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onOrderLabel)
                    .addComponent(onOrderText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allocatedLabel)
                    .addComponent(allocatedText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(committedLabel)
                    .addComponent(committedText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unavailableLabel)
                    .addComponent(unavailableText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backOrdered)
                    .addComponent(backOrderedText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dropShip)
                    .addComponent(dropShipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(availableForSale)
                    .addComponent(availableForSaleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(availableToPick)
                    .addComponent(availableToPickText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
// TODO add your handling code here:
    JSONObject inventoryResourceObject = new JSONObject();
        try {
            inventoryResourceObject.put("product", productListCombo.getSelectedItem().toString());
            inventoryResourceObject.put("onHand", onHandText.getText());
            inventoryResourceObject.put("onOrder", onOrderText.getText());
            inventoryResourceObject.put("allocated", allocatedText.getText());
            inventoryResourceObject.put("committed", committedText.getText());
            inventoryResourceObject.put("unavailable", unavailableText.getText());
            inventoryResourceObject.put("backOrdered", backOrderedText.getText());
            inventoryResourceObject.put("dropShip", dropShipText.getText());
            inventoryResourceObject.put("availableForSale", availableForSaleText.getText());
            inventoryResourceObject.put("availableToPick", availableToPickText.getText());
        } catch (JSONException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String restEndPoint = Login.getRestEndPoint();
        String resource = "inventoryRegister";
        
        RESTFeed restFeed = new RESTFeed(InventoryConstants.MEDIA_JSON,
                InventoryConstants.MEDIA_JSON,InventoryConstants.POST, 
                restEndPoint, resource);
    restFeed.setJsonObject(inventoryResourceObject);
        try {
            restFeed.restInitialization();
        } catch (MalformedURLException ex) {
            Logger.getLogger(InventoryCreate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InventoryCreate.class.getName()).log(Level.SEVERE, null, ex);
        }                                              

}//GEN-LAST:event_saveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(InventoryCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new InventoryCreate().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel allocatedLabel;
    private javax.swing.JTextField allocatedText;
    private javax.swing.JLabel availableForSale;
    private javax.swing.JTextField availableForSaleText;
    private javax.swing.JLabel availableToPick;
    private javax.swing.JTextField availableToPickText;
    private javax.swing.JLabel backOrdered;
    private javax.swing.JTextField backOrderedText;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel committedLabel;
    private javax.swing.JTextField committedText;
    private javax.swing.JLabel dropShip;
    private javax.swing.JTextField dropShipText;
    private javax.swing.JLabel onHandLabel;
    private javax.swing.JTextField onHandText;
    private javax.swing.JLabel onOrderLabel;
    private javax.swing.JTextField onOrderText;
    private javax.swing.JLabel productLabel;
    private javax.swing.JComboBox productListCombo;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel unavailableLabel;
    private javax.swing.JTextField unavailableText;
    // End of variables declaration//GEN-END:variables
}
