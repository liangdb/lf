package com.gourd.bilibili.rise.model;

public class ForumReply {
    private String replyid;

    private String replytime;

    private String replyusericon;

    private String replyforumid;

    private String replyusername;

    private String columnone;

    private String columntwo;

    private String replycontext;

    public String getReplyid() {
        return replyid;
    }

    public void setReplyid(String replyid) {
        this.replyid = replyid == null ? null : replyid.trim();
    }

    public String getReplytime() {
        return replytime;
    }

    public void setReplytime(String replytime) {
        this.replytime = replytime == null ? null : replytime.trim();
    }

    public String getReplyusericon() {
        return replyusericon;
    }

    public void setReplyusericon(String replyusericon) {
        this.replyusericon = replyusericon == null ? null : replyusericon.trim();
    }

    public String getReplyforumid() {
        return replyforumid;
    }

    public void setReplyforumid(String replyforumid) {
        this.replyforumid = replyforumid == null ? null : replyforumid.trim();
    }

    public String getReplyusername() {
        return replyusername;
    }

    public void setReplyusername(String replyusername) {
        this.replyusername = replyusername == null ? null : replyusername.trim();
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

    public String getReplycontext() {
        return replycontext;
    }

    public void setReplycontext(String replycontext) {
        this.replycontext = replycontext == null ? null : replycontext.trim();
    }
}