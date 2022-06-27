
package com.SIG.model;

public class LineInvoics {
    private int Number;
    private String ItemName;
    private double ItemPrice;
    private int Count;
    private InvoiceHeader InvoiceHeader;

    public LineInvoics() 
    {
    }

    public LineInvoics(int Number, String ItemName, double ItemPrice, int Count, InvoiceHeader InvoiceHeader) {
        this.Number = Number;
        this.ItemName = ItemName;
        this.ItemPrice = ItemPrice;
        this.Count = Count;
        this.InvoiceHeader = InvoiceHeader;
    }

    
    public int getCount() {
        return Count;
    }

    public void setCount(int Count) {
        this.Count = Count;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public double getItemPrice() {
        return ItemPrice;
    }

    public void setItemPrice(double ItemPrice) {
        this.ItemPrice = ItemPrice;
    }
    
    
}
