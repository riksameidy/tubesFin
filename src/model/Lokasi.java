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
public class Lokasi {
    private String namaLokasi;
    private Fakultas fakultas;

    public Lokasi(String namaLokasi) {
        this.namaLokasi = namaLokasi;
    }
    
    

    public Lokasi(String namaLokasi, Fakultas fakultas) {
        this.namaLokasi = namaLokasi;
        this.fakultas = fakultas;
    }
    
    

    public String getNamaLokasi() {
        return namaLokasi;
    }

    public void setNamaLokasi(String namaLokasi) {
        this.namaLokasi = namaLokasi;
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    
    
}
