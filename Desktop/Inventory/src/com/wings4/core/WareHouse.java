/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WareHouse.java
 *
 * Created on Aug 9, 2012, 1:59:27 PM
 */
package com.wings4.core;

import com.wings4.Login;
import com.wings4.util.InventoryConstants;
import com.wings4.util.InventoryInternalBase;
import com.wings4.util.Item;
import com.wings4.util.ItemCreationCombo;
import com.wings4.util.ItemRenderer;
import com.wings4.util.RESTFeed;
import java.io.IOException;
import java.net.MalformedURLException;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Md Dablu Hossain
 */

public class WareHouse extends InventoryInternalBase {

    /** Creates new form WareHouse */
    public WareHouse() {
        initComponents();
    }
    
    
    public void saveWareHouse(){
        
        String extendedAddress = addressOneTxt.getText().toString()+" "+addressTwoTxt.getText().toString();
        JSONObject wareHouseResourceObject = new JSONObject();
        System.out.println("extendedAddress = " + extendedAddress);
        try{
            Item organization = (Item) wareHouseorganizationCombo.getSelectedItem();
            wareHouseResourceObject.put("organization", organization.getId());
            wareHouseResourceObject.put("country",countryTxt.getText());
            wareHouseResourceObject.put("extendedAddress", extendedAddress);
            wareHouseResourceObject.put("poBox", postBoxTxt.getText());
            wareHouseResourceObject.put("postalCode", postCodeTxt.getText());
            wareHouseResourceObject.put("region", regionTxt.getText());
            wareHouseResourceObject.put("streetAddress", streetAddressTxt.getText());
            wareHouseResourceObject.put("wareHouseName", wareHouseNameTxt.getText());
            
            
        }catch (JSONException ex) {
            Logger.getLogger(CategoryCreate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String restEndPoint = Login.getRestEndPoint();
        String resource = "warehouse";
        
        RESTFeed restFeed = new RESTFeed(InventoryConstants.MEDIA_JSON,
                InventoryConstants.MEDIA_JSON,InventoryConstants.POST, 
                restEndPoint, resource);
    restFeed.setJsonObject(wareHouseResourceObject);
    
    
    
        try {
            restFeed.restInitialization();
        } catch (MalformedURLException ex) {
            Logger.getLogger(InventoryCreate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InventoryCreate.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        organizationNameLabel = new javax.swing.JLabel();
        wareHouseNameLabel = new javax.swing.JLabel();
        addressOneLabel = new javax.swing.JLabel();
        addressTwoLabel = new javax.swing.JLabel();
        postBoxLabel = new javax.swing.JLabel();
        postalCodeLabel = new javax.swing.JLabel();
        regionLabel = new javax.swing.JLabel();
        streetAddressLabel = new javax.swing.JLabel();
        wareHouseorganizationCombo = new javax.swing.JComboBox(ItemCreationCombo.comboInitialization("CommonDao","findAllOrganizations", "organizationName"));
        wareHouseorganizationCombo.setRenderer(new ItemRenderer());
        cancelBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        countryLabel1 = new javax.swing.JLabel();
        wareHouseNameTxt = new javax.swing.JTextField();
        countryTxt = new javax.swing.JTextField();
        addressOneTxt = new javax.swing.JTextField();
        addressTwoTxt = new javax.swing.JTextField();
        postBoxTxt = new javax.swing.JTextField();
        postCodeTxt = new javax.swing.JTextField();
        regionTxt = new javax.swing.JTextField();
        streetAddressTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        organizationNameLabel.setText("Organization :");

        wareHouseNameLabel.setText("WareHouse Name :");

        addressOneLabel.setText("Address 1 :");

        addressTwoLabel.setText("Address 2 :");

        postBoxLabel.setText("Post Box :");

        postalCodeLabel.setText("Postal Code :");

        regionLabel.setText("Region :");

        streetAddressLabel.setText("Street Address :");

        

        cancelBtn.setText("Cancel");

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        countryLabel1.setText("Country :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(organizationNameLabel)
                    .addComponent(wareHouseNameLabel)
                    .addComponent(countryLabel1)
                    .addComponent(addressOneLabel)
                    .addComponent(addressTwoLabel)
                    .addComponent(postBoxLabel)
                    .addComponent(postalCodeLabel)
                    .addComponent(regionLabel)
                    .addComponent(streetAddressLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wareHouseNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(wareHouseorganizationCombo, 0, 210, Short.MAX_VALUE))
                    .addComponent(countryTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(addressOneTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(addressTwoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(postBoxTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(postCodeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(regionTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(streetAddressTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organizationNameLabel)
                    .addComponent(wareHouseorganizationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(wareHouseNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(countryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(countryLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressOneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressOneLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressTwoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressTwoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(postBoxTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(postBoxLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(postCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(postalCodeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regionLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(streetAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(streetAddressLabel)))
                    .addComponent(wareHouseNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-493)/2, (screenSize.height-513)/2, 493, 513);
    }// </editor-fold>//GEN-END:initComponents

private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
// TODO add your handling code here:
    saveWareHouse();
}//GEN-LAST:event_saveBtnActionPerformed

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
            Logger.getLogger(WareHouse.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(WareHouse.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(WareHouse.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(WareHouse.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new WareHouse().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressOneLabel;
    private javax.swing.JTextField addressOneTxt;
    private javax.swing.JLabel addressTwoLabel;
    private javax.swing.JTextField addressTwoTxt;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel countryLabel1;
    private javax.swing.JTextField countryTxt;
    private javax.swing.JLabel organizationNameLabel;
    private javax.swing.JLabel postBoxLabel;
    private javax.swing.JTextField postBoxTxt;
    private javax.swing.JTextField postCodeTxt;
    private javax.swing.JLabel postalCodeLabel;
    private javax.swing.JLabel regionLabel;
    private javax.swing.JTextField regionTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel streetAddressLabel;
    private javax.swing.JTextField streetAddressTxt;
    private javax.swing.JLabel wareHouseNameLabel;
    private javax.swing.JTextField wareHouseNameTxt;
    private javax.swing.JComboBox wareHouseorganizationCombo;
    // End of variables declaration//GEN-END:variables
}
