package com.example.android.memecard.models;

import android.widget.ImageView;
import android.widget.TextView;

public class Notification {

    private String notificationBy;
    private long notificationAt;
    private String type;
    private String postId;
    private String notificationId;
    private String postedBy;
    private boolean checkOpen;

    public Notification() {
    }

    public Notification(String notificationBy, long notificationAt, String type, String postId, String postedBy, boolean checkOpen) {
        this.notificationBy = notificationBy;
        this.notificationAt = notificationAt;
        this.type = type;
        this.postId = postId;
        this.postedBy = postedBy;
        this.checkOpen = checkOpen;
    }

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public String getNotificationBy() {
        return notificationBy;
    }

    public void setNotificationBy(String notificationBy) {
        this.notificationBy = notificationBy;
    }

    public long getNotificationAt() {
        return notificationAt;
    }

    public void setNotificationAt(long notificationAt) {
        this.notificationAt = notificationAt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }

    public boolean isCheckOpen() {
        return checkOpen;
    }

    public void setCheckOpen(boolean checkOpen) {
        this.checkOpen = checkOpen;
    }
}
