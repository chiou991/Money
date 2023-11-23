package com.example.money.model;

import jakarta.persistence.*;

@Entity
@Table(name = "currency")
public class Currency {
    @Id
    @SequenceGenerator(
            name = "currency_sequence",
            sequenceName = "currency_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "currency_sequence"
    )

    private Long id;

    private String date;

    private Double usd_ntd;

    private Double rmb_ntd;



    public Currency(Long id, String date, Double usd_ntd, Double rmb_ntd) {
        this.id = id;
        this.date = date;
        this.usd_ntd = usd_ntd;
        this.rmb_ntd = rmb_ntd;
    }

    public Currency(String date, Double usd_ntd, Double rmb_ntd) {
        this.date = date;
        this.usd_ntd = usd_ntd;
        this.rmb_ntd = rmb_ntd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getUsd_ntd() {
        return usd_ntd;
    }

    public void setUsd_ntd(Double usd_ntd) {
        this.usd_ntd = usd_ntd;
    }

    public Double getRmb_ntd() {
        return rmb_ntd;
    }

    public void setRmb_ntd(Double rmb_ntd) {
        this.rmb_ntd = rmb_ntd;
    }

    @Override
    public String toString() {
        return "Currency{" +
                ", date='" + date + '\'' +
                ", usd_ntd=" + usd_ntd +
                ", rmb_ntd=" + rmb_ntd +
                '}';
    }
}
