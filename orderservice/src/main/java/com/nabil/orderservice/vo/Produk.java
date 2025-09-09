package com.nabil.orderservice.vo;

public class Produk {
    private Long id;
    private String nama;
    private String satuan;
    private Double harga;

    public Produk() {
    }

    public Produk(Long id, String nama, String satuan, Double harga) {
        this.id = id;
        this.nama = nama;
        this.satuan = satuan;
        this.harga = harga;
    }

    public Long getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getSatuan() {
        return satuan;
    }

    public Double getHarga() {
        return harga;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
