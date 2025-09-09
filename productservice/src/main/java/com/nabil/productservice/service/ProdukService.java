package com.nabil.productservice.service;

import java.util.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.nabil.productservice.repository.ProdukRepositor;
import com.nabil.productservice.model.Produk;

@Service
public class ProdukService {
    @Autowired
    private ProdukRepositor produkRepositor;

    public List<Produk> getAllProduk() {
        return produkRepositor.findAll();
    }

    public Produk getProdukById(Long id) {
        return produkRepositor.findById(id).orElse(null);
    }

    public Produk createProduk(Produk produk) {
        return produkRepositor.save(produk);
    }

    public void deleteProduk(Long id) {
        produkRepositor.deleteById(id);
    }
}
