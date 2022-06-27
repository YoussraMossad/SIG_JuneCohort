
package com.SIG.model;

import java.util.ArrayList;

public class InvoiceHeader {
    
    private int Number;
    private String Data;
    private String CustomerName;
    private ArrayList<LineInvoics>LinesInvoic;

    public InvoiceHeader()
    {
    }

    public InvoiceHeader(int Number, String Data, String CustomerName) {
        this.Number = Number;
        this.Data = Data;
        this.CustomerName = CustomerName;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }
    
}
