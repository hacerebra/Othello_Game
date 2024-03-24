/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.othelloproje;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hacerebra
 */
public class HacerEbraOzdemir_Frm_Kayıt extends javax.swing.JFrame {

    JFrame anaFrame;

    public HacerEbraOzdemir_Frm_Kayıt(JFrame anaFrame) {
        initComponents();
        this.anaFrame = anaFrame;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btng_cinsiyet = new javax.swing.ButtonGroup();
        pnl_kayıtOl = new javax.swing.JPanel();
        lbl_mailKayıt = new javax.swing.JLabel();
        lbl_adSoyadKayıt = new javax.swing.JLabel();
        lbl_sifreKayıt = new javax.swing.JLabel();
        rbtn_kadın = new javax.swing.JRadioButton();
        rbtn_erkek = new javax.swing.JRadioButton();
        txt_mailKayıt = new javax.swing.JTextField();
        txt_adSoyadKayıt = new javax.swing.JTextField();
        btn_kayıt = new javax.swing.JButton();
        btn_kapat = new javax.swing.JButton();
        passw_kayıt = new javax.swing.JPasswordField();
        btn_sifreGoster = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        pnl_kayıtOl.setBackground(new java.awt.Color(153, 102, 255));
        pnl_kayıtOl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kayıt Ol", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica", 1, 18))); // NOI18N

        lbl_mailKayıt.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        lbl_mailKayıt.setText("Mail");
        lbl_mailKayıt.setPreferredSize(new java.awt.Dimension(78, 19));

        lbl_adSoyadKayıt.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        lbl_adSoyadKayıt.setText("Ad Soyad");

        lbl_sifreKayıt.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        lbl_sifreKayıt.setText("Şifre");
        lbl_sifreKayıt.setPreferredSize(new java.awt.Dimension(78, 19));

        btng_cinsiyet.add(rbtn_kadın);
        rbtn_kadın.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        rbtn_kadın.setText("Kadın");

        btng_cinsiyet.add(rbtn_erkek);
        rbtn_erkek.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        rbtn_erkek.setText("Erkek");

        txt_mailKayıt.setPreferredSize(new java.awt.Dimension(200, 30));

        txt_adSoyadKayıt.setPreferredSize(new java.awt.Dimension(200, 30));

        btn_kayıt.setText("Kayıt Ol");
        btn_kayıt.setPreferredSize(new java.awt.Dimension(100, 30));
        btn_kayıt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kayıtActionPerformed(evt);
            }
        });

        btn_kapat.setText("Kapat");
        btn_kapat.setPreferredSize(new java.awt.Dimension(100, 30));
        btn_kapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kapatActionPerformed(evt);
            }
        });

        passw_kayıt.setPreferredSize(new java.awt.Dimension(200, 30));

        btn_sifreGoster.setText("Sifremi Göster");
        btn_sifreGoster.setPreferredSize(new java.awt.Dimension(113, 30));
        btn_sifreGoster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_sifreGosterMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jLabel1.setText("Cinsiyet");
        jLabel1.setPreferredSize(new java.awt.Dimension(78, 19));

        javax.swing.GroupLayout pnl_kayıtOlLayout = new javax.swing.GroupLayout(pnl_kayıtOl);
        pnl_kayıtOl.setLayout(pnl_kayıtOlLayout);
        pnl_kayıtOlLayout.setHorizontalGroup(
            pnl_kayıtOlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_kayıtOlLayout.createSequentialGroup()
                .addGroup(pnl_kayıtOlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_kayıtOlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnl_kayıtOlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_adSoyadKayıt)
                            .addComponent(lbl_sifreKayıt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_mailKayıt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_kayıtOlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_adSoyadKayıt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_mailKayıt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passw_kayıt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_kayıtOlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rbtn_kadın)
                        .addGap(23, 23, 23)
                        .addComponent(rbtn_erkek))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_kayıtOlLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btn_kayıt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnl_kayıtOlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_kapat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_sifreGoster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        pnl_kayıtOlLayout.setVerticalGroup(
            pnl_kayıtOlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_kayıtOlLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnl_kayıtOlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_mailKayıt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mailKayıt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_kayıtOlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_adSoyadKayıt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_adSoyadKayıt))
                .addGap(15, 15, 15)
                .addGroup(pnl_kayıtOlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_sifreKayıt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passw_kayıt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(btn_sifreGoster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_kayıtOlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_kadın)
                    .addComponent(rbtn_erkek)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_kayıtOlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_kayıt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kapat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_kayıtOl);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_kayıtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kayıtActionPerformed
        /*btn_kayıt butonuna basildiginda; girilen bilgileri kullanarak yeni bir Oyuncu nesnesi olusturur ve Data sinifindaki OyuncuEkle metodunu kullanarak bu yeni oyuncuyu Data.oyuncuList listesine ekler.
        Ardindan, Data.WriteGamerListToFile metoduyla oyuncu listesi dosyaya yazilir ve Giris penceresi acilirrken kayit penceresi kapatilir.*/
        HacerEbraOzdemir_Oyuncu yeni = new HacerEbraOzdemir_Oyuncu();
        //txt_mailKayıt, txt_adSoyadKayıt ve passw_kayıt JTextField bilesenleri, Oyuncu classindan olusan yeni bir objenin ad-soyad, e-posta adresi ve sifre bilgilerini girdigi metin alanlaridir.
        yeni.mail = txt_mailKayıt.getText();
        yeni.adSoyad = txt_adSoyadKayıt.getText();
        yeni.sifre = passw_kayıt.getText();
        //rbtn_kadın JRadioButton bileşeni, kullanıcının cinsiyetini belirlemesi için bir seçenek sunar.
        if (rbtn_kadın.isSelected()) {
            yeni.cinsiyet = HacerEbraOzdemir_Oyuncu.Cinsiyet.Kadın;
        } else {
            yeni.cinsiyet = HacerEbraOzdemir_Oyuncu.Cinsiyet.Erkek;
        }
        try {
            //Eğer herhangi bir zorunlu bilgi alani (e-posta, ad-soyad) bos birakilirsa veya sifre 3 karakterden kisa ise bir hata mesajı gosterilir. 
            if (txt_mailKayıt.getText().isEmpty()) {
                throw new Exception("Lütfen mail giriniz!");
            }
            if (txt_adSoyadKayıt.getText().isEmpty()) {
                throw new Exception("Lütfen ad soyad giriniz! ");
            }
            if (passw_kayıt.getText().length() < 3) {
                throw new Exception("Tekrar şifre giriniz. Şifreniz en az 3 karakterli olmalı.");
            }
            //E-posta adresinin gecerliligi, "gmail.com" veya "hotmail.com" adlarindan birine sahip bir e-posta adresi olup olmadigiyle kontrol edilir.Eğer e-posta geçerli değilse, kullanıcıya bir hata mesajı gösterilir.
            try {
                Pattern pattern = Pattern.compile("^([a-z]+\\w*){4,}@{1}((gmail)|(hotmail)){1}(.com){1}$");
                Matcher matcher = pattern.matcher(txt_mailKayıt.getText());
                if (matcher.find()) {
                    HacerEbraOzdemir_Data.OyuncuEkle(yeni);
                    HacerEbraOzdemir_Data.WriteGamerListToFile();
                    this.anaFrame.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Geçersiz mail! Tekrar deneyiniz.");
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "UYARI", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_kayıtActionPerformed

    private void btn_kapatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kapatActionPerformed
        //btn_kapat butonuna basilinca, Giris penceresi acilirken kayit penceresini kapatir.
        this.anaFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_kapatActionPerformed


    private void btn_sifreGosterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sifreGosterMouseClicked
        //btn_sifreGoster butonuna basilinca;
        if (btn_sifreGoster.isSelected()) {
            //sifrenin gorunmezlığını saglar sifre yerine 0(null) degerini atar.
            passw_kayıt.setEchoChar((char) 0);
            btn_sifreGoster.setText("Gizle");
        } else {
            //sifrenin tekrar gizlenmesini saglar.
            passw_kayıt.setEchoChar('*');
            btn_sifreGoster.setText("Şifremi Göster");
        }

    }//GEN-LAST:event_btn_sifreGosterMouseClicked

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_kapat;
    private javax.swing.JButton btn_kayıt;
    private javax.swing.JToggleButton btn_sifreGoster;
    private javax.swing.ButtonGroup btng_cinsiyet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_adSoyadKayıt;
    private javax.swing.JLabel lbl_mailKayıt;
    private javax.swing.JLabel lbl_sifreKayıt;
    private javax.swing.JPasswordField passw_kayıt;
    private javax.swing.JPanel pnl_kayıtOl;
    private javax.swing.JRadioButton rbtn_erkek;
    private javax.swing.JRadioButton rbtn_kadın;
    private javax.swing.JTextField txt_adSoyadKayıt;
    private javax.swing.JTextField txt_mailKayıt;
    // End of variables declaration//GEN-END:variables
}
