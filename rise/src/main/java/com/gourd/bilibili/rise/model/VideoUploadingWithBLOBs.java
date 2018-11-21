package com.gourd.bilibili.rise.model;

public class VideoUploadingWithBLOBs extends VideoUploading {
    private String filesize;

    private String fileresidue;

    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize == null ? null : filesize.trim();
    }

    public String getFileresidue() {
        return fileresidue;
    }

    public void setFileresidue(String fileresidue) {
        this.fileresidue = fileresidue == null ? null : fileresidue.trim();
    }
}