package com.example.demo.domain;

import java.io.Serializable;

public class BaseUser implements Serializable {
    private int id;
    private String username;
    private int age;
    private String phone;
    private int status;
    private MyLink myLink;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public MyLink getMyLink() {
        return myLink;
    }

    public void setMyLink(MyLink myLink) {
        this.myLink = myLink;
    }
}
