/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Administrator
 */
public class CategoryCreate extends InventoryInternalBase {

    private static volatile CategoryCreate instance = null;
    
    /**
     * Creates new form CategoryCreate
     */
    private CategoryCreate() {
        initComponents();
    }
 
    public static CategoryCreate getInstance() {
        if (instance == null) {
            synchronized (CategoryCreate.class){
                if (instance == null) {
                    instance = new CategoryCreate();
                }
            }
        }
        
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        categoryNameLabel = new javax.swing.JLabel();
        categoryNameText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        parentCategory = new javax.swing.JComboBox();
        submitCategory = new javax.swing.JButton();
        cancelCategory = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(2);
        setTitle("CategoryCreate");

        categoryNameLabel.setText("Category Name");

        jLabel1.setText("Parent Category");

        parentCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        submitCategory.setText("Submit");
        submitCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitCategoryActionPerformed(evt);
            }
        });

        cancelCategory.setText("Cancel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categoryNameLabel)
                    .addComponent(jLabel1))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(submitCategory)
                        .addGap(33, 33, 33)
                        .addComponent(cancelCategory))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(categoryNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                        .addComponent(parentCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryNameLabel)
                    .addComponent(categoryNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(parentCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitCategory)
                    .addComponent(cancelCategory))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitCategoryActionPerformed

        JSONObject categoryObject = new JSONObject();
        try {
            categoryObject.put("categoryName", categoryNameText.getText());
            categoryObject.put("parentCategory", 1);
        } catch (JSONException ex) {
            Logger.getLogger(CategoryCreate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String restEndPoint = Login.getRestEndPoint();
        String resource = "category";


        
        RESTFeed restFeed = new RESTFeed(InventoryConstants.MEDIA_JSON,
                InventoryConstants.MEDIA_JSON,InventoryConstants.POST, 
                restEndPoint, resource);
        restFeed.setJsonObject(categoryObject);
        try {
            restFeed.restInitialization();
        } catch (MalformedURLException ex) {
            Logger.getLogger(CategoryCreate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CategoryCreate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submitCategoryActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelCategory;
    private javax.swing.JLabel categoryNameLabel;
    private javax.swing.JTextField categoryNameText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox parentCategory;
    private javax.swing.JButton submitCategory;
    // End of variables declaration//GEN-END:variables
}
