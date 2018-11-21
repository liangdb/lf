package com.gourd.bilibili.rise.model;

public class Forum {
    private String forumid;

    private String forumusername;

    private String forumreleasetime;

    private String forumcategory;

    private String forumamount;

    private String columnone;

    private String columntwo;

    public String getForumid() {
        return forumid;
    }

    public void setForumid(String forumid) {
        this.forumid = forumid == null ? null : forumid.trim();
    }

    public String getForumusername() {
        return forumusername;
    }

    public void setForumusername(String forumusername) {
        this.forumusername = forumusername == null ? null : forumusername.trim();
    }

    public String getForumreleasetime() {
        return forumreleasetime;
    }

    public void setForumreleasetime(String forumreleasetime) {
        this.forumreleasetime = forumreleasetime == null ? null : forumreleasetime.trim();
    }

    public String getForumcategory() {
        return forumcategory;
    }

    public void setForumcategory(String forumcategory) {
        this.forumcategory = forumcategory == null ? null : forumcategory.trim();
    }

    public String getForumamount() {
        return forumamount;
    }

    public void setForumamount(String forumamount) {
        this.forumamount = forumamount == null ? null : forumamount.trim();
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