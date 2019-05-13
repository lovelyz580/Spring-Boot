package com.springboot.entity;

public class SaleInfo {
    private Integer saleId;

    private String saleName;

    private String salePassword;

    private Integer salePhone;

    private String saleAddr;

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }

    public String getSalePassword() {
        return salePassword;
    }

    public void setSalePassword(String salePassword) {
        this.salePassword = salePassword;
    }

    public Integer getSalePhone() {
        return salePhone;
    }

    public void setSalePhone(Integer salePhone) {
        this.salePhone = salePhone;
    }

    public String getSaleAddr() {
        return saleAddr;
    }

    public void setSaleAddr(String saleAddr) {
        this.saleAddr = saleAddr;
    }
}