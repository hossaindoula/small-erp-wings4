package com.jabait.scm

import com.jabait.scm.inventory.InventoryService
import com.jabait.scm.inventory.Product

class Purchase {

    Vendor vendor;
//    Product product;
    PurchaseOrder purchaseOrder;
    Date purchaseDate;
    Double price;
    Integer quantity;
    String purchaseType;

    static constraints = {
    }
}
