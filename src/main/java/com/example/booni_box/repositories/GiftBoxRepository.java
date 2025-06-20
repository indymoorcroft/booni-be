package com.example.booni_box.repositories;

import com.example.booni_box.models.GiftBox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiftBoxRepository extends JpaRepository<GiftBox, Long> {
}
