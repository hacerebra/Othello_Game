/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.othelloproje;

/**
 *
 * @author hacerebra
 */
public class HacerEbraOzdemir_Oyuncu {
    
    //Cinsiyet adındaki enum, oyuncunun cinsiyetini belirtir ve Kadın ve Erkek sabitleri içerir.
    public enum Cinsiyet {
        Kadın,
        Erkek,
    };
    
    //gid, oyuncu ID'lerini belirlemek için kullanılır ve id, her bir oyuncunun benzersiz ID'sini tutar. mail, oyuncunun e-posta adresini, adSoyad, oyuncunun ad ve soyadını, sifre, oyuncunun şifresini ve cinsiyet, oyuncunun cinsiyetini tutar.
    public static int gid = 0;
    public int id;
    public String mail;
    public String adSoyad;
    public String sifre;
    public Cinsiyet cinsiyet;

    public HacerEbraOzdemir_Oyuncu() {
        this.id = HacerEbraOzdemir_Oyuncu.gid;
        HacerEbraOzdemir_Oyuncu.gid++;
    }

    //toString() metodu, bir oyuncunun özelliklerini bir metin olarak döndürür. Bu metot, diğer sınıfların bir oyuncunun özelliklerine erişmek için kullanılır.
    @Override
    public String toString() {
        String values = "";

        values += this.id + "&";
        values += this.mail + "&";
        values += this.adSoyad + "&";
        values += this.sifre + "&";
        if (this.cinsiyet == Cinsiyet.Kadın) {
            values += "Kadın";
        }
        if (this.cinsiyet == Cinsiyet.Erkek) {
            values += "Erkek";
        }
        return values;
    }

}
