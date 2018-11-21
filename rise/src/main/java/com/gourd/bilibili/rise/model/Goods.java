package com.gourd.bilibili.rise.model;

public class Goods {
    private String goodsid;

    private String goodsname;

    private String goodsprice;

    private String goodsdesc;

    private String goodsiconaddress;

    private Integer goodsrepertory;

    private String goodscategory;

    private String columnone;

    private String columntwo;

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid == null ? null : goodsid.trim();
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(String goodsprice) {
        this.goodsprice = goodsprice == null ? null : goodsprice.trim();
    }

    public String getGoodsdesc() {
        return goodsdesc;
    }

    public void setGoodsdesc(String goodsdesc) {
        this.goodsdesc = goodsdesc == null ? null : goodsdesc.trim();
    }

    public String getGoodsiconaddress() {
        return goodsiconaddress;
    }

    public void setGoodsiconaddress(String goodsiconaddress) {
        this.goodsiconaddress = goodsiconaddress == null ? null : goodsiconaddress.trim();
    }

    public Integer getGoodsrepertory() {
        return goodsrepertory;
    }

    public void setGoodsrepertory(Integer goodsrepertory) {
        this.goodsrepertory = goodsrepertory;
    }

    public String getGoodscategory() {
        return goodscategory;
    }

    public void setGoodscategory(String goodscategory) {
        this.goodscategory = goodscategory == null ? null : goodscategory.trim();
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