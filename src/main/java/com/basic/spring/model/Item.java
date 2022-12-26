package com.basic.spring.model;

import jakarta.persistence.*;

import java.math.BigDecimal;


@Entity
@Table(name = "m_item")
public class Item {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long brandCode;
    private String brandName;
    private int redemption;
    private int coupon;
    private BigDecimal interest;
    private BigDecimal quantity;
    private BigDecimal bookValue;
    private BigDecimal marketValue;

    public Item(Long brandCode, String brandName, int redemption, int coupon, BigDecimal interest) {
        this.brandCode = brandCode;
        this.brandName = brandName;
        this.redemption = redemption;
        this.coupon = coupon;
        this.interest = interest;
    }

    public Item() {
    }


    public Long getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(Long brandCode) {
        this.brandCode = brandCode;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getRedemption() {
        return redemption;
    }

    public void setRedemption(int redemption) {
        this.redemption = redemption;
    }

    public int getCoupon() {
        return coupon;
    }

    public void setCoupon(int coupon) {
        this.coupon = coupon;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getBookValue() {
        return bookValue;
    }

    public void setBookValue(BigDecimal bookValue) {
        this.bookValue = bookValue;
    }

    public BigDecimal getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(BigDecimal marketValue) {
        this.marketValue = marketValue;
    }


}