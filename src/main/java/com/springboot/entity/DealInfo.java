package com.springboot.entity;

public class DealInfo {
    private Integer dealId;

    private Integer orderId;

    private Integer prodId;

    private Long prodPrice;

    private Integer prodNumber;

    public Integer getDealId() {
        return dealId;
    }

    public void setDealId(Integer dealId) {
        this.dealId = dealId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public Long getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(Long prodPrice) {
        this.prodPrice = prodPrice;
    }

    public Integer getProdNumber() {
        return prodNumber;
    }

    public void setProdNumber(Integer prodNumber) {
        this.prodNumber = prodNumber;
    }
}