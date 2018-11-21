package com.gourd.bilibili.rise.model;

public class DataDictionary {
    private Integer dataid;

    private String type;

    private String typename;

    private Integer parentid;

    private String columnone;

    private String columntwo;

    public Integer getDataid() {
        return dataid;
    }

    public void setDataid(Integer dataid) {
        this.dataid = dataid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
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