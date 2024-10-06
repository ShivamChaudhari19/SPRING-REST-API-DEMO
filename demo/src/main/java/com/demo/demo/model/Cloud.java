package com.demo.demo.model;

public class Cloud {
    public Cloud() {
    }

    public Cloud(String venderId, String venderName, String venderAddress, String venderPhoneNo) {
        this.venderId = venderId;
        this.venderName = venderName;
        this.venderAddress = venderAddress;
        this.venderPhoneNo = venderPhoneNo;
    }
    private String venderId;
    private String venderName;
    private String venderAddress;
    private String venderPhoneNo;

    public String getVenderId() {
        return venderId;
    }

    public void setVenderId(String venderId) {
        this.venderId = venderId;
    }

    public String getVenderName() {
        return venderName;
    }

    public void setVenderName(String venderName) {
        this.venderName = venderName;
    }

    public String getVenderAddress() {
        return venderAddress;
    }

    public void setVenderAddress(String venderAddress) {
        this.venderAddress = venderAddress;
    }

    public String getVenderPhoneNo() {
        return venderPhoneNo;
    }

    public void setVenderPhoneNo(String venderPhoneNo) {
        this.venderPhoneNo = venderPhoneNo;
    }
}
