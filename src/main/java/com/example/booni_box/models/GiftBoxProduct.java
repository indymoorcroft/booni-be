package com.example.booni_box.models;

import jakarta.persistence.*;

@Entity(name = "GiftBoxProducts")
public class GiftBoxProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "gift_box_id")
    private GiftBox giftBox;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GiftBox getGiftBox() {
        return giftBox;
    }

    public void setGiftBox(GiftBox giftBox) {
        this.giftBox = giftBox;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
