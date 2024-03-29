package com.wings4.core.toggle;

import com.wings4.util.InventoryConstants;
import com.wings4.util.JEclipseTabbedPane;
import com.wings4.core.panel.InventoryCreateButtonPanel;
import com.wings4.core.panel.ProductCreateButtonPanel;
import com.wings4.util.IconFactory;

import javax.swing.*;

/**
 * Created by IntelliJ IDEA.
 * User: ronnie
 * Date: 8/31/12
 * Time: 4:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class InventoryCreateTogglePanel extends AppTogglePanel {

    public InventoryCreateTogglePanel() {
    }

    @Override
    public void initialize() {
        JEclipseTabbedPane toggleTabbedPane = getToggleTabbedPane();
        toggleTabbedPane.addTab(InventoryConstants.STOCK_ADD, IconFactory.getSwingIcon("component/button_16.png"),
                new AppToggleTemplate(new InventoryCreateButtonPanel()), InventoryConstants.STOCK_ADD);

    }

    public String getToggleText(){
        return InventoryConstants.STOCK_ADD;
    }

    public Icon getToggleIcon(){
        return IconFactory.getSwingIcon("inventory.png");
    }

    public Icon getToggleBannerIcon(){
        return IconFactory.getSwingIcon("inventory.png");
    }

    public String getToggleDescription(){
        return InventoryConstants.STOCK_ADD;
    }
}
