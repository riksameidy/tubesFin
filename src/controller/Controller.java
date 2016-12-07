/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import misc.Database;
import model.AdminFakultas;
import model.Barang;
import model.BarangRusak;
import model.DepartemenInvetaris;
import model.DepartemenKeuangan;
import model.Fakultas;
import model.KategoriBarang;
import model.Lokasi;
import model.PemeliharaanBarang;
import model.PemindahanBarang;
import view.KelolaBarangPanelView;
import view.KelolaTanahPanelView;
import view.LoginView;
import view.MenuUtamaView;
import view.TambahBarangView;
import view.TambahTanahView;
import view.View;

/**
 *
 * @author apple
 */
public class Controller implements ActionListener{
    
    private View v;
    private View selection;
    private ArrayList<DepartemenInvetaris> listDI;
    private ArrayList<DepartemenKeuangan> listDK;
    private ArrayList<AdminFakultas> listAdmin;
    
    private ArrayList<Barang> listBarang;
    private ArrayList<KategoriBarang> listKategoriBarang;
    private ArrayList<Lokasi> listLokasi;
    private ArrayList<Fakultas> listFakultas;
    private ArrayList<PemeliharaanBarang> listPemeliharaanBarang;
    private ArrayList<PemindahanBarang> listPemindahanBarang;
    private ArrayList<BarangRusak> listBarangRusak;
    
    private Database db;
    

    public Controller() {
        
        instansiasiAllList();
        db = new Database();
        db.createConnection();
        //listDI = db.selectAllDI();
        toLoginMenu();
        
    }
    
    private void instansiasiAllList(){
        listAdmin = new ArrayList<>();
        listDI = new ArrayList<>();
        listDK = new ArrayList<>();
        listBarang = new ArrayList<>();
        listKategoriBarang = new ArrayList<>();
        listLokasi = new ArrayList<>();
        listFakultas = new ArrayList<>();
        listPemeliharaanBarang = new ArrayList<>();
        listPemindahanBarang = new ArrayList<>();
        listBarangRusak = new ArrayList<>();
    }

    @Override
    public void actionPerformed(ActionEvent ex) {
        
         Object e = ex.getSource();
         
        if(v instanceof LoginView){
            loginMenu(e);
        }
        
        else if(v instanceof MenuUtamaView ){
            menuUtama(e);
            if(selection instanceof KelolaBarangPanelView){
                
                menuKelolaBarang((MenuUtamaView) v,e);
            }
            else if(selection instanceof TambahBarangView){
                
                menuTambahBarang((MenuUtamaView) v,e);
            }
            
            else if(selection instanceof KelolaTanahPanelView){
                menuKelolaTanah((MenuUtamaView)v, e);
            }
            
            else if(selection instanceof TambahTanahView){
                menuTambahTanah((MenuUtamaView)v, e);
            }
            
            
        }
    
    }
    
    private void toLoginMenu(){
        selection = null;
        LoginView loginView = new LoginView();
        v = loginView;
        loginView.setVisible(true);
        loginView.addListener(this);
    }
    
    private void toMenuUtama(){
        MenuUtamaView utama = new MenuUtamaView();
        utama.setVisible(true);
        v = utama;
        utama.addListener(this);
    }
    
    private void menuUtama(Object e){
        
        MenuUtamaView menu = (MenuUtamaView) v;
        if(e.equals(menu.getBtnBarang())){
            menu.changetoColorActive(menu.getPanelTabBarang());
            toKelolaBarangMenu(menu);
                       
        }
        else if(e.equals(menu.getBtnTanah())){
            menu.changetoColorActive(menu.getPanelTabTanah());
            toKelolatanahMenu(menu);
        
        }
        else if(e.equals(menu.getBtnMutasi())){
            menu.changetoColorActive(menu.getPanelTabMutasi());
            
        }
        else if(e.equals(menu.getBtnLaporan())){
            menu.changetoColorActive(menu.getPanelTabLaporan());
        }
        else if(e.equals(menu.getBtnLogout())){
            menu.changetoColorActive(menu.getPanelTabLogout());
            menu.setVisible(false);
            menu.dispose();
            toLoginMenu();
            
        }
        
        
    }
    
    private void toKelolaBarangMenu(MenuUtamaView menu){
        
        disposeSelectionView(menu);
                
        KelolaBarangPanelView kelolaBarangView = new KelolaBarangPanelView();
        
        kelolaBarangView.setSize(menu.getPanelIsi().getSize());
        selection = kelolaBarangView;
        menu.getPanelIsi().add(kelolaBarangView);
        menu.getPanelIsi().validate();
        menu.getPanelIsi().repaint();
        kelolaBarangView.addListener(this);
          
    }
    
    private void menuKelolaBarang(MenuUtamaView menu, Object e){
        KelolaBarangPanelView kb = (KelolaBarangPanelView) selection;
        if(e.equals(kb.getBtnTambahBarang())){
            menu.setVisible(false);
            toMenuTambahBarang(menu);
        }
    }
    
    private void toMenuTambahBarang(MenuUtamaView menu){
        
        disposeSelectionView(menu);
        
        TambahBarangView tambahBarangView = new TambahBarangView();
        
        selection = tambahBarangView;
        tambahBarangView.setVisible(true);
        tambahBarangView.addListener(this);
        
           
    }
    
    private void menuTambahBarang(MenuUtamaView menu , Object e){
        TambahBarangView tambahBarangView = (TambahBarangView) selection;
        if(e.equals(tambahBarangView.getBtnKembali())){
            menu.setVisible(true);
            tambahBarangView.dispose();
            toKelolaBarangMenu(menu);
        }
        
    }
      
    private void toKelolatanahMenu(MenuUtamaView menu){
       
        disposeSelectionView(menu);
        KelolaTanahPanelView kelolaTanahView = new KelolaTanahPanelView();
        kelolaTanahView.setSize(menu.getPanelIsi().getSize());
        selection = kelolaTanahView;
        menu.getPanelIsi().add(kelolaTanahView);
        menu.getPanelIsi().validate();
        menu.getPanelIsi().repaint();
        kelolaTanahView.addListener(this);
                
           
    }
    
    private void menuKelolaTanah(MenuUtamaView menu, Object e){
        
        KelolaTanahPanelView kt = (KelolaTanahPanelView) selection;
        if(e.equals(kt.getBtnTambahTanah())){
            menu.setVisible(false);
            toMenuTambahTanah(menu);
            
        }
        
        
    }
    
    private void toMenuTambahTanah(MenuUtamaView menu){
        
        disposeSelectionView(menu);
        
        TambahTanahView tambahTanahView = new TambahTanahView();
        
        selection = tambahTanahView;
        tambahTanahView.setVisible(true);
        tambahTanahView.addListener(this);
    }
    
    private void menuTambahTanah(MenuUtamaView menu, Object e){
        TambahTanahView tambahTanahView = (TambahTanahView) selection;
        if(e.equals(tambahTanahView.getBtnKembali())){
            tambahTanahView.dispose();
            menu.setVisible(true);
            toKelolatanahMenu(menu);
        }
        
    }
    
    private void loginMenu(Object e){
        
        //listDI = db.selectAllDI();
        LoginView view = (LoginView) v;
        if(e.equals(view.getBtnLogin())){
            String username = view.getTfUsername().toString();
            String password = view.getTfPassword().toString();
            if(validateLogin(username, password)==1){
                view.setVisible(false);
                view.dispose();
                toMenuUtama();
            }
            else{
                view.getTfUsername().setText("");
                view.getTfPassword().setText("");
            }
        }
        
        
    }
    
    private int validateLogin(String username , String password){
        if(searchDI(username, password)==null){
            return -1;
        }
        else{
            return 1;
        }
    }
    
    private void disposeSelectionView(MenuUtamaView menu){
        if(selection instanceof KelolaBarangPanelView){
            KelolaBarangPanelView k =  (KelolaBarangPanelView) selection;
            menu.getPanelIsi().remove(k);
        }
        else if(selection instanceof KelolaTanahPanelView){
            KelolaTanahPanelView k = (KelolaTanahPanelView) selection;
            menu.getPanelIsi().remove(k);
        }
        
        menu.validate();
        menu.repaint();
        
    }
    
    
    private DepartemenInvetaris searchDI(String username , String password){
       for( DepartemenInvetaris f: listDI){
           if(f.getUsername().equals(username)&&f.getPassword().equals(password)){
               return f;
           }
       }
       return null;
    }
    
    
    
    
}
