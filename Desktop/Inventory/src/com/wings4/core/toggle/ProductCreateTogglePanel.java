package com.wings4.core.toggle;

import com.nepxion.swing.tabbedpane.JEclipseTabbedPane;
import com.wings4.core.panel.ProductCreateButtonPanel;
import com.wings4.util.IconFactory;

import javax.swing.*;

/**
 * Created by IntelliJ IDEA.
 * User: ronnie
 * Date: 8/31/12
 * Time: 4:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class ProductCreateTogglePanel extends AppTogglePanel {

    public ProductCreateTogglePanel() {
    }

    @Override
    public void initialize() {
        JEclipseTabbedPane toggleTabbedPane = getToggleTabbedPane();
        toggleTabbedPane.addTab("Product Create", IconFactory.getSwingIcon("component/button_16.png"),
                new AppToggleTemplate(new ProductCreateButtonPanel()), "Product Create");

    }

    public String getToggleText(){
        return "Product Create";
    }

    public Icon getToggleIcon(){
        return IconFactory.getSwingIcon("product.png");
    }

    public Icon getToggleBannerIcon(){
        return IconFactory.getSwingIcon("product.png");
    }

    public String getToggleDescription(){
        return "Product Create";
    }
}

