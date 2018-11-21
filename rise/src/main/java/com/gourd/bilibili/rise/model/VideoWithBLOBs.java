package com.gourd.bilibili.rise.model;

public class VideoWithBLOBs extends Video {
    private String videoimage;

    private String videoaddress;

    private String videocollection;

    private String videoleavingmessage;

    public String getVideoimage() {
        return videoimage;
    }

    public void setVideoimage(String videoimage) {
        this.videoimage = videoimage == null ? null : videoimage.trim();
    }

    public String getVideoaddress() {
        return videoaddress;
    }

    public void setVideoaddress(String videoaddress) {
        this.videoaddress = videoaddress == null ? null : videoaddress.trim();
    }

    public String getVideocollection() {
        return videocollection;
    }

    public void setVideocollection(String videocollection) {
        this.videocollection = videocollection == null ? null : videocollection.trim();
    }

    public String getVideoleavingmessage() {
        return videoleavingmessage;
    }

    public void setVideoleavingmessage(String videoleavingmessage) {
        this.videoleavingmessage = videoleavingmessage == null ? null : videoleavingmessage.trim();
    }
}