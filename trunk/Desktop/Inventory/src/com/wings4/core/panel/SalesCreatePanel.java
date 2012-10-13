package com.wings4.core.panel;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;
import com.jidesoft.combobox.TableComboBox;
import com.jidesoft.dialog.JideOptionPane;
import com.nepxion.swing.action.JSecurityAction;
import com.nepxion.swing.layout.filed.FiledLayout;
import com.towel.el.annotation.AnnotationResolver;
import com.towel.swing.table.ObjectTableModel;
import com.wings4.dao.CommonDao;
import com.wings4.dao.JobDao;
import com.wings4.model.*;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created with IntelliJ IDEA.
 * User: MASUM
 * Date: 9/28/12
 * Time: 12:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class SalesCreatePanel   extends JPanel {

    public SalesCreatePanel() {
        setLayout(new FiledLayout(FiledLayout.COLUMN, FiledLayout.FULL, 0));
        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        add(new SalesCreate());
    }

    public class SalesCreate extends JPanel {
        public SalesCreate() {
            DefaultFormBuilder builder = new DefaultFormBuilder(new FormLayout(""));
            builder.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
            builder.appendColumn("right:pref");
            builder.appendColumn("3dlu");
            builder.appendColumn("fill:max(pref; 100px)");
            builder.appendColumn("5dlu");
            builder.appendColumn("right:pref");
            builder.appendColumn("3dlu");
            builder.appendColumn("fill:max(pref; 10px)");


            AnnotationResolver vendorResolver = new AnnotationResolver(Vendor.class);
            AnnotationResolver productResolver = new AnnotationResolver(PurchaseOrder.class);


            final ObjectTableModel<Vendor> tableModelVendor = new ObjectTableModel<Vendor>(
                    vendorResolver, "id,firstName");

            final ObjectTableModel<PurchaseOrder> tableModelPurchaseOrder = new ObjectTableModel<PurchaseOrder>(
                    productResolver, "id,jobName");


            tableModelVendor.setData(CommonDao.findAllVendors());
            tableModelPurchaseOrder.setData(JobDao.findAllPurchaseOrders());



            final TableComboBox vendorCombo = new TableComboBox(tableModelVendor);
            final TableComboBox purchaseOrderCombo = new TableComboBox(tableModelPurchaseOrder);

            final JTextField priceTextField = new JTextField();
            final JTextField quantity = new JTextField();
            String[] purchaseTypeValue = {"A", "B", "C"};
            final JComboBox purchaseTypeCombo = new JComboBox(purchaseTypeValue);





            JButton submitPurchase = new JButton();
            JButton cancelPurchase = new JButton();


            builder.append("Vendor:", vendorCombo);
            builder.nextLine();

            builder.append("Purchase Order:", purchaseOrderCombo);
            builder.nextLine();

            builder.append("Price:", priceTextField);
            builder.nextLine();

            builder.append("Quantity:", quantity);
            builder.nextLine();

            builder.append("Purchase Type:", purchaseTypeCombo);
            builder.nextLine();


            submitPurchase.setText("Submit");
            cancelPurchase .setText("Cancel");

            builder.append(submitPurchase);
            builder.append(cancelPurchase );

            add(builder.getPanel());

            submitPurchase.addActionListener(new JSecurityAction() {
                @Override
                public void execute(ActionEvent actionEvent) {


                    Sales sales = new Sales();

                    sales.setCustomerName(vendorCombo.getSelectedItem().toString());
                    sales.setSalesOrder(purchaseOrderCombo.getSelectedItem().toString());
                    sales.setPrice(Double.parseDouble(priceTextField.getText()));
                    sales.setQuantity(Integer.parseInt(quantity.getText()));
                    sales.setSalesType(purchaseTypeCombo.getSelectedItem().toString());


//                    purchaseOrder.setVendorId(vendorCombo.getSelectedItem().toString());


                    if (JobDao.saveSales(sales)) {
                        JideOptionPane.showMessageDialog(null, "Sales Saved Successfully", "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JideOptionPane.showMessageDialog(null, "Sales Save Failed", "Failure",
                                JOptionPane.ERROR_MESSAGE);
                    }

                }
            });
        }
    }

}