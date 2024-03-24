/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.othelloproje;

import static com.mycompany.othelloproje.HacerEbraOzdemir_Data.idList;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HacerEbraOzdemir_Frm_Giris extends javax.swing.JFrame {

    public HacerEbraOzdemir_Frm_Giris() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_oyuncu1 = new javax.swing.JPanel();
        lbl_mail1 = new javax.swing.JLabel();
        lbl_sifre1 = new javax.swing.JLabel();
        txt_mail1 = new javax.swing.JTextField();
        btn_giris1 = new javax.swing.JButton();
        passw_giris1 = new javax.swing.JPasswordField();
        pnl_oyuncu2 = new javax.swing.JPanel();
        lbl_mail2 = new javax.swing.JLabel();
        lbl_sifre2 = new javax.swing.JLabel();
        txt_mail2 = new javax.swing.JTextField();
        btn_giris2 = new javax.swing.JButton();
        passw_giris2 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        btn_kayıt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_oyuncu1.setBackground(new java.awt.Color(204, 204, 255));
        pnl_oyuncu1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OTHELLO Oyuncu1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica", 1, 18), new java.awt.Color(102, 0, 255))); // NOI18N
        pnl_oyuncu1.setPreferredSize(new java.awt.Dimension(300, 200));

        lbl_mail1.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        lbl_mail1.setText("Mail");
        lbl_mail1.setPreferredSize(new java.awt.Dimension(55, 25));

        lbl_sifre1.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        lbl_sifre1.setText("Şifre");
        lbl_sifre1.setPreferredSize(new java.awt.Dimension(55, 25));

        txt_mail1.setPreferredSize(new java.awt.Dimension(200, 30));

        btn_giris1.setText("Giriş Yap");
        btn_giris1.setPreferredSize(new java.awt.Dimension(100, 30));
        btn_giris1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_giris1ActionPerformed(evt);
            }
        });

        passw_giris1.setPreferredSize(new java.awt.Dimension(200, 30));

        javax.swing.GroupLayout pnl_oyuncu1Layout = new javax.swing.GroupLayout(pnl_oyuncu1);
        pnl_oyuncu1.setLayout(pnl_oyuncu1Layout);
        pnl_oyuncu1Layout.setHorizontalGroup(
            pnl_oyuncu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_oyuncu1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnl_oyuncu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_giris1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_oyuncu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_oyuncu1Layout.createSequentialGroup()
                            .addComponent(lbl_sifre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(passw_giris1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnl_oyuncu1Layout.createSequentialGroup()
                            .addComponent(lbl_mail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_mail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnl_oyuncu1Layout.setVerticalGroup(
            pnl_oyuncu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_oyuncu1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(pnl_oyuncu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_mail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_mail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_oyuncu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_sifre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passw_giris1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_giris1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_oyuncu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 180));

        pnl_oyuncu2.setBackground(new java.awt.Color(204, 204, 255));
        pnl_oyuncu2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OTHELLO Oyuncu2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica", 1, 18), new java.awt.Color(102, 0, 255))); // NOI18N
        pnl_oyuncu2.setPreferredSize(new java.awt.Dimension(300, 200));

        lbl_mail2.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        lbl_mail2.setText("Mail");
        lbl_mail2.setPreferredSize(new java.awt.Dimension(55, 25));

        lbl_sifre2.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        lbl_sifre2.setText("Şifre");
        lbl_sifre2.setPreferredSize(new java.awt.Dimension(55, 25));

        txt_mail2.setPreferredSize(new java.awt.Dimension(200, 30));

        btn_giris2.setText("Giriş Yap");
        btn_giris2.setPreferredSize(new java.awt.Dimension(100, 30));
        btn_giris2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_giris2ActionPerformed(evt);
            }
        });

        passw_giris2.setPreferredSize(new java.awt.Dimension(200, 30));

        javax.swing.GroupLayout pnl_oyuncu2Layout = new javax.swing.GroupLayout(pnl_oyuncu2);
        pnl_oyuncu2.setLayout(pnl_oyuncu2Layout);
        pnl_oyuncu2Layout.setHorizontalGroup(
            pnl_oyuncu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_oyuncu2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(pnl_oyuncu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_giris2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_oyuncu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_oyuncu2Layout.createSequentialGroup()
                            .addComponent(lbl_mail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_mail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnl_oyuncu2Layout.createSequentialGroup()
                            .addComponent(lbl_sifre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(passw_giris2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pnl_oyuncu2Layout.setVerticalGroup(
            pnl_oyuncu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_oyuncu2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnl_oyuncu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_mail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_mail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_oyuncu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_sifre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passw_giris2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_giris2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_oyuncu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, 180));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        btn_kayıt.setText("Kayıt Ol");
        btn_kayıt.setPreferredSize(new java.awt.Dimension(100, 30));
        btn_kayıt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kayıtActionPerformed(evt);
            }
        });
        jPanel1.add(btn_kayıt);

        jLabel1.setText("Bir hesabınız yok mu?");
        jPanel1.add(jLabel1);

        jLabel2.setText(" Kayıt Ol butonuna tıklayarak yeni bir hesap oluşturun ve siz de OTHELLO oynayın.");
        jPanel1.add(jLabel2);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 610, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_giris1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_giris1ActionPerformed
        //btn_giris1 adli butona basildiginda;
        String mail = txt_mail1.getText();
        String sifre = passw_giris1.getText();
        /*Kullanicinin e-posta adresi ve sifresi alinir ve ardindan Data.oyuncuList listesi uzerinde bir dongu kullanilarak her oyuncu icin kontrol yapilir. 
        Eğer girilen e-posta adresi verilen oyuncunun e-posta adresine esitse, o oyuncunun id si idList listesine eklenir ve giris yapılır. Ayrıca, Data.WriteGamerListToFile() methodu cagrilarak oyuncu listesi dosyaya yazdirilir.*/
        for (int i = 0; i < HacerEbraOzdemir_Data.oyuncuList.size(); i++) {
            HacerEbraOzdemir_Oyuncu o = HacerEbraOzdemir_Data.oyuncuList.get(i);
            if (mail.contains(o.mail)) {
                try {
                    HacerEbraOzdemir_Data.WriteGamerListToFile();
                } catch (IOException ex) {
                    Logger.getLogger(HacerEbraOzdemir_Frm_Giris.class.getName()).log(Level.SEVERE, null, ex);
                }
                idList.add(o.id);
            }
        }
        boolean giris = HacerEbraOzdemir_Data.Giris(mail, sifre);

        if (giris) {
            JOptionPane.showMessageDialog(rootPane, "Oyuncu1 giriş yaptı. Lütfen Oyuncu2 giriş yapsın.");

        } else {
            JOptionPane.showMessageDialog(rootPane, "Giris Yapılamadı.");
        }


    }//GEN-LAST:event_btn_giris1ActionPerformed

    private void btn_kayıtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kayıtActionPerformed
        //btn_kayıt adli butona basildiginda, yeni bir kullanicinin kaydolmasini saglamak icin kayit sayfasi acilir.
        this.setVisible(false);
        HacerEbraOzdemir_Frm_Kayıt frm_Kayıt = new HacerEbraOzdemir_Frm_Kayıt(this);
        frm_Kayıt.setVisible(true);

    }//GEN-LAST:event_btn_kayıtActionPerformed

    private void btn_giris2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_giris2ActionPerformed

        String mail = txt_mail2.getText();
        String sifre = passw_giris2.getText();

        /*btn_giris2 adli butona basildiginda, ikinci bir kullanıcinin giris yapmasini saglar. Kullanicinin e-posta adresi ve sifresi alinir ve ardindan Data.oyuncuList listesi uzerinde bir dongu kullanilarak her oyuncu icin kontrol yapilir.
        Eger girilen e-posta adresi verilen oyuncunun e-posta adresine esitse, o oyuncunun id si idList listesine eklenir ve giris yapilir. Ayrıca, kullanicinin e-posta adresi zaten idList listesinde oldugunda hata mesaji verilir.*/
        for (int i = 0; i < HacerEbraOzdemir_Data.oyuncuList.size(); i++) {
            HacerEbraOzdemir_Oyuncu o = HacerEbraOzdemir_Data.oyuncuList.get(i);
            if (mail.contains(o.mail)) {
                try {
                    HacerEbraOzdemir_Data.WriteGamerListToFile();
                    for (int id : idList) {
                        if (o.id == HacerEbraOzdemir_Data.idList.get(0)) {
                            throw new Exception("Aynı maille giriş yapamazsınız. lütfen tekrar deneyiniz.");

                        }
                        break;
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                }
                idList.add(o.id);
            }

        }

        /*Eger giris basariliysa, yeni bir oyun sayfası goruntulenir ve mevcut Frm_Giris kapatilir.*/
        boolean giris = HacerEbraOzdemir_Data.Giris(mail, sifre);
        if (giris) {
            HacerEbraOzdemir_Frm_Oyun frm_Oyun = new HacerEbraOzdemir_Frm_Oyun();
            frm_Oyun.setVisible(true);
            frm_Oyun.isimSoyisimYazdır();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Giris Yapılamadı.");
        }
    }//GEN-LAST:event_btn_giris2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_giris1;
    private javax.swing.JButton btn_giris2;
    private javax.swing.JButton btn_kayıt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_mail1;
    private javax.swing.JLabel lbl_mail2;
    private javax.swing.JLabel lbl_sifre1;
    private javax.swing.JLabel lbl_sifre2;
    private javax.swing.JPasswordField passw_giris1;
    private javax.swing.JPasswordField passw_giris2;
    private javax.swing.JPanel pnl_oyuncu1;
    private javax.swing.JPanel pnl_oyuncu2;
    private javax.swing.JTextField txt_mail1;
    private javax.swing.JTextField txt_mail2;
    // End of variables declaration//GEN-END:variables

}
