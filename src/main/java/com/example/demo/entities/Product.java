package com.example.demo.entities;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Entity
@Setter
@Getter
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

//    @Column(name = "unit")
//    private String unit;

    @Column(name = "brand")
    private String brand;

    @Column(name = "category")
    private String category;

    @Column(name = "supplier")
    private String supplier;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "standardPrice")
    private Double standardPrice;

    @Column(name = "cost")
    private Double cost;

    @Column(name = "remark")
    private String remark;

    @Column(name = "dateOfAdd")
    private Date dateOfAdd;

    @Column(name = "shelfLife")
    private Integer shelfLife;
}
