/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.othelloproje;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hacerebra
 */
public class HacerEbraOzdemir_Frm_Skorlar extends javax.swing.JFrame {
    
    JFrame anaFrame;
  
    public HacerEbraOzdemir_Frm_Skorlar(JFrame anaFrame) {
        initComponents();
        this.anaFrame = anaFrame;
        
    }
    
    //"skorTablosunuYazdır" metodu, "Data" sınıfında tanımlanan "idList" ve "oyuncuList" ArrayList'leri kullanarak bir skor tablosu yazdırmayı amaçlar.
    public void skorTablosunuYazdır() {
        
        ArrayList<Integer> idsListesi = new ArrayList<>(HacerEbraOzdemir_Data.idList);
        //"idsListesi" ArrayList'inin boyutu 1'den büyük veya eşitse,
        if (idsListesi.size() >= 1) {
            int id1 = idsListesi.get(0);
            HacerEbraOzdemir_Oyuncu oyuncu1 = null;
            for (HacerEbraOzdemir_Oyuncu oyuncu : HacerEbraOzdemir_Data.oyuncuList) {
                //Eğer "id1" değeri "Data.oyuncuList" de bir "Oyuncu" nesnesinin id'si ile eşleşirse, bu nesne "oyuncu1" olarak atanır.
                if (oyuncu.id == id1) {
                    oyuncu1 = oyuncu;
                    break;
                }
            }
            if (oyuncu1 != null) {
                //"oyuncu1.adSoyad" değeri, "rowData" adlı bir diziye atanır ve bu dizi Frm_skorlar daki "tbl_skorlar" tablosuna eklenir.
                DefaultTableModel dmodel = (DefaultTableModel) this.tbl_skorlar.getModel();
                String[] rowData = {oyuncu1.adSoyad};
                dmodel.addRow(rowData);
                
            }
        }
        //"idsListesi" ArrayList'inin boyutu 2 olursa, 
        if (idsListesi.size() == 2) {
            int id2 = idsListesi.get(1);
            HacerEbraOzdemir_Oyuncu oyuncu2 = null;
            for (HacerEbraOzdemir_Oyuncu oyuncu : HacerEbraOzdemir_Data.oyuncuList) {
                //Eğer "id2" değeri "Data.oyuncuList" de bir "Oyuncu" nesnesinin id'si ile eşleşirse, bu nesne "oyuncu2" olarak atanır.
                if (oyuncu.id == id2) {
                    oyuncu2 = oyuncu;
                    break;
                }
            }
            if (oyuncu2 != null) {
                //"oyuncu2.adSoyad" değeri, "rowData" adlı bir diziye atanır ve bu dizi Frm_skorlar daki "tbl_skorlar" tablosuna eklenir.
                DefaultTableModel dmodel = (DefaultTableModel) this.tbl_skorlar.getModel();
                String[] rowData = {oyuncu2.adSoyad};
                dmodel.addRow(rowData);
                
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_skorlar = new javax.swing.JTable();
        btn_skorSil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Skorlar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica", 1, 18), new java.awt.Color(153, 0, 153))); // NOI18N

        tbl_skorlar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Ad Soyad", "Skor"
            }
        ));
        jScrollPane1.setViewportView(tbl_skorlar);

        btn_skorSil.setText("Skorumu Sil");
        btn_skorSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_skorSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_skorSil)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_skorSil)
                .addGap(32, 32, 32))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_skorSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_skorSilActionPerformed
        
        int secilenSatır = tbl_skorlar.getSelectedRow();//Secilen satırın indexi int olarak atanır. 
        DefaultTableModel dmodel = (DefaultTableModel) this.tbl_skorlar.getModel();
        //Secilen satırda yazan isim ile karsılastırmak icin JOptionPane ile kullanıcıdan bir isim istenir. Ve kullanıcıdan alınan isim String "isim" degiskenine atanir. 
        String isim = JOptionPane.showInputDialog( rootPane,"Lütfen adınızı giriniz ","Ad Soyad Giriniz", JOptionPane.INFORMATION_MESSAGE);
        //isim değişkeni, seçilen satırdaki oyuncunun ismine eşit ise, seçilen satır dmodel değişkeninden silinir ve tbl_skorlar bileşeni güncellenir. Aksi takdirde bir şey yapılmaz.
        if (isim.equals((String) tbl_skorlar.getValueAt(secilenSatır, 0)) ){
           dmodel.removeRow(tbl_skorlar.getSelectedRow()); 
        }
        
    }//GEN-LAST:event_btn_skorSilActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_skorSil;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_skorlar;
    // End of variables declaration//GEN-END:variables

}
