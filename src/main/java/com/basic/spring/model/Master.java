package com.basic.spring.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "master_item")
public class Master {
    private String brandCode;
    private String brandName;
    private int redemption;
    private int coupon;
    private BigDecimal interest;

    public String getBrandCode() {
        return brandCode;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getRedemption() {
        return redemption;
    }

    public int getCoupon() {
        return coupon;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public Master(String brandCode, String brandName, int redemption, int coupon, BigDecimal interest) {
        this.brandCode = brandCode;
        this.brandName = brandName;
        this.redemption = redemption;
        this.coupon = coupon;
        this.interest = interest;
    }
}
