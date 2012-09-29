package com.wings4.core.panel;

import com.nepxion.swing.action.JSecurityAction;
import com.nepxion.swing.border.BorderManager;
import com.nepxion.swing.layout.filed.FiledLayout;
import com.towel.el.annotation.AnnotationResolver;
import com.towel.swing.table.ObjectTableModel;
import com.wings4.core.toggle.GeneralToggleActionButton;
import com.wings4.core.toggle.PurchaseCreateTogglePanel;
import com.wings4.dao.CommonDao;
import com.wings4.model.Warehouse;
import com.wings4.util.InventoryConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 8/28/12
 * Time: 9:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class WarehouseButtonPanel extends JPanel {

    private JScrollPane wareHouseListHolder;
    private JTable warehouseTable;
    private JButton createPurchaseOrderButton;
    private JButton createSalesButton;
    private JToolBar warehouseToolbar;

    public WarehouseButtonPanel() {
        setLayout(new FiledLayout(FiledLayout.COLUMN, FiledLayout.FULL, 0));
        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        add(new WareHouseListPanel());
    }


    /**
     * this class is for showing purchase order list
     */
    public class WareHouseListPanel extends JPanel {
        public WareHouseListPanel() {
            setLayout(new BorderLayout());
            setBorder(BorderManager.createComplexTitledBorder("Warehouse List"));

            warehouseToolbar = new JToolBar();
            //create a button for new purchase order add option
            createPurchaseOrderButton = new JButton();
            createSalesButton = new JButton();

            //button

            createPurchaseOrderButton.addActionListener(new JSecurityAction() {
                @Override
                public void execute(ActionEvent actionEvent) {
                    GeneralToggleActionButton categoryButton = new GeneralToggleActionButton(new
                            PurchaseOrderCreateTogglePanel());
                    categoryButton.doClick();
                }
            });

            createPurchaseOrderButton.setIcon(new ImageIcon(getClass().
                    getResource(InventoryConstants.resourceDirectory.
                            concat("list-add.png"))));
            createPurchaseOrderButton.setFocusable(false);
            createPurchaseOrderButton.setHorizontalTextPosition(SwingConstants.CENTER);
            createPurchaseOrderButton.setVerticalTextPosition(SwingConstants.BOTTOM);
            warehouseToolbar.add(createPurchaseOrderButton);

            createSalesButton.addActionListener(new JSecurityAction() {
                @Override
                public void execute(ActionEvent actionEvent) {
                    GeneralToggleActionButton purchaseButton = new GeneralToggleActionButton(new
                            PurchaseCreateTogglePanel());
                    purchaseButton.doClick();
                }
            });

            createSalesButton.setIcon(new ImageIcon(getClass().
                    getResource(InventoryConstants.resourceDirectory.
                            concat("list-add.png"))));
            createSalesButton.setFocusable(true);
            createSalesButton.setHorizontalTextPosition(SwingConstants.CENTER);
            createSalesButton.setVerticalTextPosition(SwingConstants.BOTTOM);
            warehouseToolbar.add(createSalesButton);



            wareHouseListHolder = new JScrollPane();
            warehouseTable = new JTable();


            //set the resolver to get the fields
            AnnotationResolver resolver = new AnnotationResolver(Warehouse.class);
            final ObjectTableModel<Warehouse> tableModel = new ObjectTableModel<Warehouse>(
                    resolver, "id,organization,wareHouseName");

            tableModel.setData(CommonDao.findAllWarehouses());
            warehouseTable.setModel(tableModel);

            wareHouseListHolder.setViewportView(warehouseTable);
            add(warehouseToolbar, BorderLayout.PAGE_START);
            add(wareHouseListHolder, BorderLayout.CENTER);

        }
    }


}
