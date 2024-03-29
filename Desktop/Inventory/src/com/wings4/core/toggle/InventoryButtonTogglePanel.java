package com.wings4.core.toggle;

import com.wings4.util.InventoryConstants;
import com.wings4.util.JEclipseTabbedPane;
import com.wings4.core.panel.InventoryButtonPanel;
import com.wings4.util.IconFactory;

import javax.swing.*;

/**
 * Created by IntelliJ IDEA.
 * User: ronnie
 * Date: 8/22/12
 * Time: 7:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class InventoryButtonTogglePanel extends AppTogglePanel {

    public InventoryButtonTogglePanel() {
    }

    @Override
    public void initialize() {
        JEclipseTabbedPane toggleTabbedPane = getToggleTabbedPane();
        toggleTabbedPane.addTab(InventoryConstants.STOCK, IconFactory.getSwingIcon("component/button_16.png"),
                new AppToggleTemplate(new InventoryButtonPanel()), InventoryConstants.STOCK);

    }

    public String getToggleText(){
        return InventoryConstants.STOCK;
    }

    public Icon getToggleIcon(){
        return IconFactory.getSwingIcon("inventory.png");
    }

    public Icon getToggleBannerIcon(){
        return IconFactory.getSwingIcon("inventory.png");
    }

    public String getToggleDescription(){
        return InventoryConstants.STOCK;
    }
}
