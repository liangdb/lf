package com.gourd.bilibili.rise.model;

public class ForumWithBLOBs extends Forum {
    private String forumtitle;

    private String forummessage;

    private String firumicon;

    public String getForumtitle() {
        return forumtitle;
    }

    public void setForumtitle(String forumtitle) {
        this.forumtitle = forumtitle == null ? null : forumtitle.trim();
    }

    public String getForummessage() {
        return forummessage;
    }

    public void setForummessage(String forummessage) {
        this.forummessage = forummessage == null ? null : forummessage.trim();
    }

    public String getFirumicon() {
        return firumicon;
    }

    public void setFirumicon(String firumicon) {
        this.firumicon = firumicon == null ? null : firumicon.trim();
    }
}