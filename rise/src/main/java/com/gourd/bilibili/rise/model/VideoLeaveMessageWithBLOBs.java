package com.gourd.bilibili.rise.model;

public class VideoLeaveMessageWithBLOBs extends VideoLeaveMessage {
    private String message;

    private String messageusericon;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getMessageusericon() {
        return messageusericon;
    }

    public void setMessageusericon(String messageusericon) {
        this.messageusericon = messageusericon == null ? null : messageusericon.trim();
    }
}