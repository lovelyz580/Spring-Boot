package com.springboot.entity;

public class BuyerInfo {
    private Integer buyerId;

    private String buyerName;

    private String buyerPassword;

    private Integer buyerPhone;

    private String buyerAddr;

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerPassword() {
        return buyerPassword;
    }

    public void setBuyerPassword(String buyerPassword) {
        this.buyerPassword = buyerPassword;
    }

    public Integer getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(Integer buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getBuyerAddr() {
        return buyerAddr;
    }

    public void setBuyerAddr(String buyerAddr) {
        this.buyerAddr = buyerAddr;
    }
}