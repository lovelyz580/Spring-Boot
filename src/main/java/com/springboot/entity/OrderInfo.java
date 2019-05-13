package com.springboot.entity;

import java.util.Date;

public class OrderInfo {
    private Integer orderId;

    private Integer saleId;

    private Integer buyerId;

    private String orderNote;

    private Date orderStime;

    private Date orderEtime;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public String getOrderNote() {
        return orderNote;
    }

    public void setOrderNote(String orderNote) {
        this.orderNote = orderNote;
    }

    public Date getOrderStime() {
        return orderStime;
    }

    public void setOrderStime(Date orderStime) {
        this.orderStime = orderStime;
    }

    public Date getOrderEtime() {
        return orderEtime;
    }

    public void setOrderEtime(Date orderEtime) {
        this.orderEtime = orderEtime;
    }
}