/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.othelloproje;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author hacerebra
 */
public class HacerEbraOzdemir_Data {

    static ArrayList<HacerEbraOzdemir_Oyuncu> oyuncuList = new ArrayList<>();//"oyuncuList" adli dizi, oyuncularin adini, mail adresini, şifrelerini ve id'lerini icerir.
    static ArrayList<Integer> idList = new ArrayList<>();//"idList" adli liste, her bir oyuncunun id'sini icerir.
    public static String oyuncuTxtFileName = "HacerEbraOzdemir_kullanicilar.txt";//"oyuncuTxtFileName" adli degisken, kaydedilen oyuncu bilgilerinin yazildigi dosyanin adini tutar.

    //"Giris" adli method, oyuncu listesindeki bir oyuncunun mailini ve sifresini kontrol ederek bir boolean degeri dondurur.
    public static boolean Giris(String mail, String sifre) {
        boolean giris = false;
        for (HacerEbraOzdemir_Oyuncu o : oyuncuList) {
            if (o.mail.compareTo(mail) == 0 && o.sifre.compareTo(sifre) == 0) {
                giris = true;
                break;

            }

        }
        return giris;
    }

    //"OyuncuEkle" adli method, verilen oyuncunun mail adresinin kayit olan diger oyuncularin mail adresleri ile ayni olup olmadigini kontrol eder ve kaydeder.
    public static void OyuncuEkle(HacerEbraOzdemir_Oyuncu oyuncu) throws Exception {

        for (HacerEbraOzdemir_Oyuncu o : oyuncuList) {
            if (o.mail.compareTo(oyuncu.mail) == 0) {
                throw new Exception("Bu mail ile daha önce kayıt yapıldı. Lütfen başka bir mail ile giriş yapınız.");

            }

        }
        oyuncuList.add(oyuncu);

    }

    //"WriteGamerListToFile" adli method, "oyuncuList" adli dizideki tüm oyuncu bilgilerini "oyuncuTxtFileName" adli dosyaya yazar.
    public static void WriteGamerListToFile() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(oyuncuTxtFileName));

        for (HacerEbraOzdemir_Oyuncu oyuncu : oyuncuList) {
            String values = oyuncu.toString();
            writer.append(values + "\n");

        }
        writer.close();
    }

    //"ReadFromFileToGamerList" adli method, "oyuncuTxtFileName" adli dosyadaki kaydedilen oyuncu bilgilerini okur ve "oyuncuList" adli diziye ekler.
    public static void ReadFromFileToGamerList() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(oyuncuTxtFileName));
        String line = " ";

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            String[] values = line.split("&");
            HacerEbraOzdemir_Oyuncu readGamer = new HacerEbraOzdemir_Oyuncu();
            readGamer.id = Integer.parseInt(values[0]);
            readGamer.mail = values[1];
            readGamer.adSoyad = values[2];
            readGamer.sifre = values[3];
            oyuncuList.add(readGamer);

        }

        reader.close();
    }

}
