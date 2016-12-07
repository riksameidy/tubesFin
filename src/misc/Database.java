/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.AdminFakultas;
import model.Barang;
import model.DepartemenInvetaris;
import model.Fakultas;
import model.KategoriBarang;
import model.Lokasi;

/**
 *
 * @author apple
 */
public class Database {
    private Connection con;
    
    public void createConnection(){
        try {
            String url = "jdbc:mysql://localhost:3306/inventaris";
            String hostname = "root";
            String password = "yu";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,hostname,password);
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Error Here");
        } catch (SQLException ex) {
            System.out.println("error");
            ex.printStackTrace();
        }
    }
    
    public ArrayList<DepartemenInvetaris> selectAllDI(){  
        ArrayList<DepartemenInvetaris> listDI = new ArrayList<>();
        Statement stmt;
        String query = "select * from DepartemenInventaris";
        try{
           createConnection();
           stmt = con.createStatement();
           ResultSet rs= stmt.executeQuery(query);
           while(rs.next()){
               listDI.add(new DepartemenInvetaris(rs.getString("IdDI"), rs.getString("username"),
                       rs.getString("password"),rs.getString("nama")));
           }
           con.close();

           return listDI;
            
        }
        catch( SQLException e){
            return null;
        }
        
    }
    
    public ArrayList<KategoriBarang> selectAllKategori(){
        ArrayList<KategoriBarang> listKategori = new ArrayList<KategoriBarang>();
         Statement stmt;
        String query = "select * from kategoriBarang";
        try{
           createConnection();
           stmt = con.createStatement();
           ResultSet rs= stmt.executeQuery(query);
           while(rs.next()){
               listKategori.add(new KategoriBarang(rs.getString("namaKategori")));
           }
           con.close();

           return listKategori;
            
        }
        catch( SQLException e){
            return null;
        }
        
    }
    
    public ArrayList<Fakultas> selectAllFakultas(){
        ArrayList<Fakultas> listFakultas = new ArrayList<>();
        Statement stmt;
        String query = "select * from fakultas";
        try{
           createConnection();
           stmt = con.createStatement();
           ResultSet rs= stmt.executeQuery(query);
           while(rs.next()){
               listFakultas.add(new Fakultas(rs.getString("NamaFakultas")));
           }
           con.close();

           return listFakultas;
            
        }
        catch( SQLException e){
            return null;
        }
        
    }
    
    public ArrayList<Lokasi> selectAllLokasi(ArrayList<Fakultas> listFakultas){
        ArrayList<Lokasi> listLokasi = new ArrayList<>();
        Statement stmt;
        String query = "select * from lokasi";
        try{
           createConnection();
           stmt = con.createStatement();
           ResultSet rs= stmt.executeQuery(query);
           while(rs.next()){
               String namaFakultas = rs.getString("Fakultas");
               for(Fakultas f: listFakultas){
                   if(f.getNamaFakultas().equals(namaFakultas)){
                      listLokasi.add(new Lokasi(rs.getString("namaLokasi"), f)); 
                   }
               }
               
               
           }
           con.close();

           return listLokasi;
            
        }
        catch( SQLException e){
            return null;
        }
    
    }
    
    public ArrayList<AdminFakultas> selectAllAdmin(){  
        ArrayList<AdminFakultas> listAdmin = new ArrayList<>();
        Statement stmt;
        String query = "select * from admin";
        try{
           createConnection();
           stmt = con.createStatement();
           ResultSet rs= stmt.executeQuery(query);
           while(rs.next()){
               listAdmin.add(new AdminFakultas(rs.getString("username"), rs.getString("password"), rs.getString("nama")));
                       
           }
           con.close();

           return listAdmin;
            
        }
        catch( SQLException e){
            return null;
        }
        
    }
    
    public ArrayList<Barang> selectAllDataBarang(ArrayList<KategoriBarang> listKategoriBarang,
            ArrayList<Lokasi> listLokasi){
        ArrayList<Barang> listBarang = new ArrayList<>();
        Statement stmt;
        String query = "select * from Barang";
        try{
           createConnection();
           stmt = con.createStatement();
           ResultSet rs= stmt.executeQuery(query);
           while(rs.next()){
              String kategoriBarang = rs.getString("kategoriBarang");
              String lokasi = rs.getString("lokasi");
              KategoriBarang kb = null;
              for(KategoriBarang k: listKategoriBarang){
                  if(kategoriBarang.equals(k.getNamaKategori())){
                      kb = k;
                  }
              }
              if(kb!=null){
                  Lokasi lo = null;
                  for(Lokasi lok: listLokasi){
                      if(lokasi.equals(lok.getNamaLokasi())){
                          lo = lok;
                      }
                  }
                  if(lo!=null){
                      
                      Barang b = new Barang(rs.getString("idBarang"), rs.getString("namaBarang"),
                              rs.getString("status"), rs.getDouble("hargaBarang"), kb, lo);
                      listBarang.add(b);
                  }
                  else{
                      return null;
                  }
                  
              }
              else{
                  return null;
              }                 
           }
           con.close();

           return listBarang;
            
        }
        catch( SQLException e){
            return null;
        }
        
    }
    
    public boolean insertDatabarang(Barang b){
        try{
            createConnection();
            String query = "insert into barang (idBarang,namaBarang,hargaBarang,status,kategoriBarang,lokasi) "+
                    "values (?,?,?,?,?,?)";
            PreparedStatement p = con.prepareStatement(query);
            p.setString(1, b.getIdBarang());
            p.setString(2, b.getNamaBarang());
            p.setDouble(3, b.getHargaBarang());
            p.setString(4, b.getStatus());
            p.setString(5, b.getKategoriBarang().getNamaKategori());
            p.setString(6, b.getLokasi().getNamaLokasi());
            
            p.execute();
            con.close();
            return true;
        }
        catch(SQLException e){
            return false;
        }
    }
    
    public boolean insertDataAdmin(AdminFakultas adminFakultas){
        
        try {
            createConnection();
            String query = "insert into admin ( username , password , nama ) "
                    + "values (?,?,?)";
            
            PreparedStatement p = con.prepareStatement(query);
            p.setString(1,adminFakultas.getUsername());
            p.setString(2,adminFakultas.getPassword());
            p.setString(3,adminFakultas.getNama());
            
            
            p.execute();
            con.close();
            return true;
            
        } catch (SQLException ex) {
            return false;
        }
    }
    
    
    
    
}
