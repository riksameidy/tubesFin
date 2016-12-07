/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author apple
 */
public class PemindahanBarang {
    private Date tanggalPemindahan;
    private Lokasi asal;
    private Lokasi tujuan;
    private Barang barang;

    public PemindahanBarang(Date tanggalPemindahan, Lokasi asal, Lokasi tujuan, Barang barang) {
        this.tanggalPemindahan = tanggalPemindahan;
        this.asal = asal;
        this.tujuan = tujuan;
        this.barang = barang;
    }

    public Date getTanggalPemindahan() {
        return tanggalPemindahan;
    }

    public void setTanggalPemindahan(Date tanggalPemindahan) {
        this.tanggalPemindahan = tanggalPemindahan;
    }

    public Lokasi getAsal() {
        return asal;
    }

    public void setAsal(Lokasi asal) {
        this.asal = asal;
    }

    public Lokasi getTujuan() {
        return tujuan;
    }

    public void setTujuan(Lokasi tujuan) {
        this.tujuan = tujuan;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }
    
    
    
}
