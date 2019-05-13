package com.springboot.entity;

public class ProInfo {
    private Integer prodId;

    private Integer saleId;

    private String prodName;

    private Long prodPrice;

    private String prodNote;

    private String jielongname;

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public Long getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(Long prodPrice) {
        this.prodPrice = prodPrice;
    }

    public String getProdNote() {
        return prodNote;
    }

    public void setProdNote(String prodNote) {
        this.prodNote = prodNote;
    }

    public String getJielongname() {
        return jielongname;
    }

    public void setJielongname(String jielongname) {
        this.jielongname = jielongname;
    }
}