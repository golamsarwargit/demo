package com.demo.coursework.storedProc;

public class Order {
    private String customerName;
    private String itemName;
    private String unitName;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customerName='" + customerName + '\'' +
                ", itemName='" + itemName + '\'' +
                ", unitName='" + unitName + '\'' +
                '}';
    }
}
