package com.gourd.bilibili.rise.model;

public class VideoUploading {
    private String fileid;

    private String filename;

    private Integer flag;

    private Integer percent;

    private String columnone;

    private String columntwo;

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid == null ? null : fileid.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
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