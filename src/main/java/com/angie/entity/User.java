package com.angie.entity;

public class User {

    private int userid;
    private int loginid;
    private String usrname;
    private String password;
    private int role;


    public User() {
    }

    public User(int loginid, String password) {
        this.loginid = loginid;
        this.password = password;
    }

    public User(int userid, int loginid, String usrname, String password) {
        this.userid = userid;
        this.loginid = loginid;
        this.usrname = usrname;
        this.password = password;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getLoginid() {
        return loginid;
    }

    public void setLoginid(int loginid) {
        this.loginid = loginid;
    }

    public String getUsrname() {
        return usrname;
    }

    public void setUsrname(String usrname) {
        this.usrname = usrname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
