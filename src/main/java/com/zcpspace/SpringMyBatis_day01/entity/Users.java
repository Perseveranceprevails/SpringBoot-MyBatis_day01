package com.zcpspace.SpringMyBatis_day01.entity;


public class Users {

    private Integer uId;
    private String userName;
    private String userPed;
    private String realName;

    public Users() {
    }

    public Users(Integer uId, String userName, String userPed, String realName) {
        this.uId = uId;
        this.userName = userName;
        this.userPed = userPed;
        this.realName = realName;
    }

    @Override
    public String toString() {
        return "Users{" +
                "uId=" + uId +
                ", userName='" + userName + '\'' +
                ", userPed='" + userPed + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPed() {
        return userPed;
    }

    public void setUserPed(String userPed) {
        this.userPed = userPed;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
