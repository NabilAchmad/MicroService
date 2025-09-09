package com.nabil.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nabil.productservice.model.Produk;

@Repository
public interface ProdukRepositor extends JpaRepository<Produk, Long> {
    
}
