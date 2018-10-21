package com.example.demo.domain;

import jdk.nashorn.internal.objects.annotations.Setter;

public class UserInfo {

    private String userId;

    private String passWd;

    public String getUserId() {
        return userId;
    }

    public String getPassWd() {
        return passWd;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassWd(String passWd) {
        this.passWd = passWd;
    }

    public UserInfo(String userId, String passWd) {
        this.userId = userId;
        this.passWd = passWd;
    }

    public UserInfo() {}
}
