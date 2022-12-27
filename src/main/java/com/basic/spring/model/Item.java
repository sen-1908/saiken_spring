package com.basic.spring.model;

import jakarta.persistence.*;

import java.math.BigDecimal;


@Entity
@Table(name = "balance_item")
public class Item {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String brandCode;
    private BigDecimal quantity;
    private BigDecimal bookValue;
    private BigDecimal marketValue;

    public Item(String brandCode, BigDecimal quantity, BigDecimal bookValue, BigDecimal marketValue) {
        this.brandCode = brandCode;
        this.quantity = quantity;
        this.bookValue = bookValue;
        this.marketValue = marketValue;
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
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