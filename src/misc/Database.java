/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.DepartemenInvetaris;

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
               listDI.add(new DepartemenInvetaris(rs.getString("username"), rs.getString("password"),
                       rs.getString("nama"),rs.getString("idDI")));
           }
           con.close();

           return listDI;
            
        }
        catch( SQLException e){
            return null;
        }
        
    }
    
    
}
