package com.gourd.bilibili.rise.model;

public class ShoppingCart {
    private String cartid;

    private String userid;

    private String username;

    private String cartgoodsid;

    private String cartgoodsname;

    private String cartgoodsimg;

    private String cartgoodsprice;

    private Integer cartgoosquantity;

    private String columnone;

    private String columntwo;

    public String getCartid() {
        return cartid;
    }

    public void setCartid(String cartid) {
        this.cartid = cartid == null ? null : cartid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getCartgoodsid() {
        return cartgoodsid;
    }

    public void setCartgoodsid(String cartgoodsid) {
        this.cartgoodsid = cartgoodsid == null ? null : cartgoodsid.trim();
    }

    public String getCartgoodsname() {
        return cartgoodsname;
    }

    public void setCartgoodsname(String cartgoodsname) {
        this.cartgoodsname = cartgoodsname == null ? null : cartgoodsname.trim();
    }

    public String getCartgoodsimg() {
        return cartgoodsimg;
    }

    public void setCartgoodsimg(String cartgoodsimg) {
        this.cartgoodsimg = cartgoodsimg == null ? null : cartgoodsimg.trim();
    }

    public String getCartgoodsprice() {
        return cartgoodsprice;
    }

    public void setCartgoodsprice(String cartgoodsprice) {
        this.cartgoodsprice = cartgoodsprice == null ? null : cartgoodsprice.trim();
    }

    public Integer getCartgoosquantity() {
        return cartgoosquantity;
    }

    public void setCartgoosquantity(Integer cartgoosquantity) {
        this.cartgoosquantity = cartgoosquantity;
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
}