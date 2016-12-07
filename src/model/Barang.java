/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author apple
 */
public class Barang {
    private String idBarang;
    private String namaBarang;
    private String status;
    private double hargaBarang;
    private KategoriBarang kategoriBarang;
    private Lokasi lokasi;

    public Barang(String idBarang) {
        this.idBarang = idBarang;
    }

    public Barang(String idBarang, String namaBarang, String status, double hargaBarang) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.status = status;
        this.hargaBarang = hargaBarang;
    }

    public Barang(String idBarang, String namaBarang, String status, double hargaBarang, KategoriBarang kategoriBarang, Lokasi lokasi) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.status = status;
        this.hargaBarang = hargaBarang;
        this.kategoriBarang = kategoriBarang;
        this.lokasi = lokasi;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public KategoriBarang getKategoriBarang() {
        return kategoriBarang;
    }

    public void setKategoriBarang(KategoriBarang kategoriBarang) {
        this.kategoriBarang = kategoriBarang;
    }

    public Lokasi getLokasi() {
        return lokasi;
    }

    public void setLokasi(Lokasi lokasi) {
        this.lokasi = lokasi;
    }
    
    
    
    
    
}
