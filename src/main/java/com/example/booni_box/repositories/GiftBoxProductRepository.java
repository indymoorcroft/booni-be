package com.example.booni_box.repositories;

import com.example.booni_box.models.GiftBoxProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiftBoxProductRepository extends JpaRepository<GiftBoxProduct, Long> {
}
