package com.gourd.bilibili.rise.model;

public class Order {
    private String orderid;

    private String orderusername;

    private String orderleavemessage;

    private String ordergoosicon;

    private Integer ordergoosquantity;

    private String ordersumprice;

    private String orderstate;

    private String ordertime;

    private String columnone;

    private String columntwo;

    private String orderaddress;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getOrderusername() {
        return orderusername;
    }

    public void setOrderusername(String orderusername) {
        this.orderusername = orderusername == null ? null : orderusername.trim();
    }

    public String getOrderleavemessage() {
        return orderleavemessage;
    }

    public void setOrderleavemessage(String orderleavemessage) {
        this.orderleavemessage = orderleavemessage == null ? null : orderleavemessage.trim();
    }

    public String getOrdergoosicon() {
        return ordergoosicon;
    }

    public void setOrdergoosicon(String ordergoosicon) {
        this.ordergoosicon = ordergoosicon == null ? null : ordergoosicon.trim();
    }

    public Integer getOrdergoosquantity() {
        return ordergoosquantity;
    }

    public void setOrdergoosquantity(Integer ordergoosquantity) {
        this.ordergoosquantity = ordergoosquantity;
    }

    public String getOrdersumprice() {
        return ordersumprice;
    }

    public void setOrdersumprice(String ordersumprice) {
        this.ordersumprice = ordersumprice == null ? null : ordersumprice.trim();
    }

    public String getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(String orderstate) {
        this.orderstate = orderstate == null ? null : orderstate.trim();
    }

    public String getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(String ordertime) {
        this.ordertime = ordertime == null ? null : ordertime.trim();
    }

    public String getColumnone() {
        return columnone;
    }

    public void setColumnone(String columnone) {
        this.columnone = columnone == null ? null : columnone.trim();
    }

    public String getColumntwo() {
        return columntwo;
    }

    public void setColumntwo(String columntwo) {
        this.columntwo = columntwo == null ? null : columntwo.trim();
    }

    public String getOrderaddress() {
        return orderaddress;
    }

    public void setOrderaddress(String orderaddress) {
        this.orderaddress = orderaddress == null ? null : orderaddress.trim();
    }
}