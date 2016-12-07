/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author apple
 */
public class MenuUtamaViewKeuangan extends javax.swing.JFrame implements View {

    
    private final Color TabActiveColor;
    private final Color TabInactiveColor;
    
    
    public MenuUtamaViewKeuangan() {
        this.TabActiveColor = new Color(68,138,255);
        this.TabInactiveColor = new Color(48,63,159);
        initComponents();      
        
    }    

/**
     * Creates new form MenuUtamaView
     */
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTab = new javax.swing.JPanel();
        panelTabLaporan = new javax.swing.JPanel();
        BtnKelolaLaporan = new javax.swing.JButton();
        panelTabLogout = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        panelIsi = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(33, 150, 243));

        panelTab.setBackground(new java.awt.Color(48, 63, 159));
        panelTab.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelTab.setForeground(new java.awt.Color(255, 255, 255));

        panelTabLaporan.setBackground(new java.awt.Color(48, 63, 159));

        BtnKelolaLaporan.setBackground(new java.awt.Color(255, 255, 255));
        BtnKelolaLaporan.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        BtnKelolaLaporan.setForeground(new java.awt.Color(255, 255, 255));
        BtnKelolaLaporan.setText("Kelola Laporan");
        BtnKelolaLaporan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout panelTabLaporanLayout = new javax.swing.GroupLayout(panelTabLaporan);
        panelTabLaporan.setLayout(panelTabLaporanLayout);
        panelTabLaporanLayout.setHorizontalGroup(
            panelTabLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabLaporanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnKelolaLaporan, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTabLaporanLayout.setVerticalGroup(
            panelTabLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTabLaporanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnKelolaLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelTabLogout.setBackground(new java.awt.Color(48, 63, 159));

        btnLogout.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout panelTabLogoutLayout = new javax.swing.GroupLayout(panelTabLogout);
        panelTabLogout.setLayout(panelTabLogoutLayout);
        panelTabLogoutLayout.setHorizontalGroup(
            panelTabLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabLogoutLayout.createSequentialGroup()
                .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        panelTabLogoutLayout.setVerticalGroup(
            panelTabLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTabLogoutLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelTabLayout = new javax.swing.GroupLayout(panelTab);
        panelTab.setLayout(panelTabLayout);
        panelTabLayout.setHorizontalGroup(
            panelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabLayout.createSequentialGroup()
                .addGroup(panelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelTabLogout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTabLaporan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelTabLayout.setVerticalGroup(
            panelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTabLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelTabLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelIsi.setBackground(new java.awt.Color(255, 255, 255));
        panelIsi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelIsi.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout panelIsiLayout = new javax.swing.GroupLayout(panelIsi);
        panelIsi.setLayout(panelIsiLayout);
        panelIsiLayout.setHorizontalGroup(
            panelIsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
        );
        panelIsiLayout.setVerticalGroup(
            panelIsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelIsi, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelIsi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnKelolaLaporan;
    private javax.swing.JButton btnLogout;
    private javax.swing.JPanel panelIsi;
    private javax.swing.JPanel panelTab;
    private javax.swing.JPanel panelTabLaporan;
    private javax.swing.JPanel panelTabLogout;
    // End of variables declaration//GEN-END:variables

   public void changetoColorActive(JPanel panel ){
       
       panelTabLaporan.setBackground(TabInactiveColor);
       panelTabLogout.setBackground(TabInactiveColor);
       
       panel.setBackground(TabActiveColor);
   }

    public Color getTabActiveColor() {
        return TabActiveColor;
    }

    public Color getTabInactiveColor() {
        return TabInactiveColor;
    }

    public JButton getBtnKelolaLaporan() {
        return BtnKelolaLaporan;
    }

    public JButton getBtnLogout() {
        return btnLogout;
    }

    public JPanel getPanelIsi() {
        return panelIsi;
    }

    public JPanel getPanelTab() {
        return panelTab;
    }

    public JPanel getPanelTabLaporan() {
        return panelTabLaporan;
    }

    public JPanel getPanelTabLogout() {
        return panelTabLogout;
    }

   
    
   
    @Override
    public void addListener(ActionListener l) {
        BtnKelolaLaporan.addActionListener(l);
        btnLogout.addActionListener(l);
        
    }

    @Override
    public void showMessage(String m) {
    
    }
   
   
   
   
    


    
}
