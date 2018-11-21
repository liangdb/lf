package com.gourd.bilibili.rise.model;

public class Video {
    private String videoid;

    private String videoname;

    private String videocategory;

    private Integer videostar;

    private Integer videoviewcounts;

    private String videotime;

    private String videouploadingtime;

    private String videostate;

    private String columnone;

    private String columntwo;

    public String getVideoid() {
        return videoid;
    }

    public void setVideoid(String videoid) {
        this.videoid = videoid == null ? null : videoid.trim();
    }

    public String getVideoname() {
        return videoname;
    }

    public void setVideoname(String videoname) {
        this.videoname = videoname == null ? null : videoname.trim();
    }

    public String getVideocategory() {
        return videocategory;
    }

    public void setVideocategory(String videocategory) {
        this.videocategory = videocategory == null ? null : videocategory.trim();
    }

    public Integer getVideostar() {
        return videostar;
    }

    public void setVideostar(Integer videostar) {
        this.videostar = videostar;
    }

    public Integer getVideoviewcounts() {
        return videoviewcounts;
    }

    public void setVideoviewcounts(Integer videoviewcounts) {
        this.videoviewcounts = videoviewcounts;
    }

    public String getVideotime() {
        return videotime;
    }

    public void setVideotime(String videotime) {
        this.videotime = videotime == null ? null : videotime.trim();
    }

    public String getVideouploadingtime() {
        return videouploadingtime;
    }

    public void setVideouploadingtime(String videouploadingtime) {
        this.videouploadingtime = videouploadingtime == null ? null : videouploadingtime.trim();
    }

    public String getVideostate() {
        return videostate;
    }

    public void setVideostate(String videostate) {
        this.videostate = videostate == null ? null : videostate.trim();
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