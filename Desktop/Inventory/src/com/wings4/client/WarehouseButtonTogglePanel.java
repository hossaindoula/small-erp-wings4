package com.wings4.client;

import com.wings4.util.IconFactory;
import com.nepxion.swing.tabbedpane.JEclipseTabbedPane;

import javax.swing.*;

/**
 * Created by IntelliJ IDEA.
 * User: ronnie
 * Date: 8/18/12
 * Time: 8:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class WarehouseButtonTogglePanel extends DemoTogglePanel {

    public WarehouseButtonTogglePanel()
    {
    }

    public void initialize()
    {
        JEclipseTabbedPane toggleTabbedPane = getToggleTabbedPane();
        toggleTabbedPane.addTab("CheckBox", IconFactory.getSwingIcon("component/button_16.png"),
                new DemoToggleTemplate(new DemoCheckBoxPanel()), "CheckBox");
    }

    public String getToggleText()
    {
        return "Warehouse";
    }

    public Icon getToggleIcon()
    {
        return IconFactory.getSwingIcon("warehouse.png");
    }

    public Icon getToggleBannerIcon()
    {
        return IconFactory.getSwingIcon("warehouse.png");
    }

    public String getToggleDescription()
    {
        return "Warehouse List";
    }
}
