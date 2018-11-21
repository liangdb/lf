package com.gourd.bilibili.rise.model;

public class VideoLeaveMessage {
    private String messageid;

    private String messagevideoid;

    private String messageuserid;

    private String messageusername;

    private String messagetime;

    private String columnone;

    private String columntwo;

    public String getMessageid() {
        return messageid;
    }

    public void setMessageid(String messageid) {
        this.messageid = messageid == null ? null : messageid.trim();
    }

    public String getMessagevideoid() {
        return messagevideoid;
    }

    public void setMessagevideoid(String messagevideoid) {
        this.messagevideoid = messagevideoid == null ? null : messagevideoid.trim();
    }

    public String getMessageuserid() {
        return messageuserid;
    }

    public void setMessageuserid(String messageuserid) {
        this.messageuserid = messageuserid == null ? null : messageuserid.trim();
    }

    public String getMessageusername() {
        return messageusername;
    }

    public void setMessageusername(String messageusername) {
        this.messageusername = messageusername == null ? null : messageusername.trim();
    }

    public String getMessagetime() {
        return messagetime;
    }

    public void setMessagetime(String messagetime) {
        this.messagetime = messagetime == null ? null : messagetime.trim();
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