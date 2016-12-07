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
public class DepartemenInvetaris extends User{
    
    private String idDI;
    
    public DepartemenInvetaris(String username, String password, String nama) {
        super(username, password, nama);
    }

    public DepartemenInvetaris(String idDI, String username, String password, String nama) {
        super(username, password, nama);
        this.idDI = idDI;
    }

    public String getIdDI() {
        return idDI;
    }

    public void setIdDI(String idDI) {
        this.idDI = idDI;
    }
    
    
    
    
}
