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
public class DepartemenKeuangan extends User{
    private String idDK;

    public DepartemenKeuangan(String username, String password, String nama) {
        super(username, password, nama);
    }

    public DepartemenKeuangan(String idDK, String username, String password, String nama) {
        super(username, password, nama);
        this.idDK = idDK;
    }

    public String getIdDK() {
        return idDK;
    }

    public void setIdDK(String idDK) {
        this.idDK = idDK;
    }

    

    
    
    
}
