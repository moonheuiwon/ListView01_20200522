package com.example.listview01_20200522.datas;

public class User {

    private  String name;
    private  String address;

//    Alt + Insert


    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
