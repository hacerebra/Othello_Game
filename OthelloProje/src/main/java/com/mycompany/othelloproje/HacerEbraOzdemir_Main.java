/*
 * Click nbfs://nb:host/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.othelloproje;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hacerebra
 */
public class HacerEbraOzdemir_Main {

    public static void main(String[] args) {
        try {
            HacerEbraOzdemir_Data.ReadFromFileToGamerList();
        } catch (IOException ex) {
            Logger.getLogger(HacerEbraOzdemir_Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Frm_Giris adlı bir form oluşturulur ve bu form görünür hale getirilir. Frm_Giris formu, programın giriş sayfasıdır ve kullanıcıların oyunu başlatmaları için gerekli bilgileri girmelerine olanak sağlar.
        HacerEbraOzdemir_Frm_Giris newFrm = new HacerEbraOzdemir_Frm_Giris();
        newFrm.setVisible(true);
    }
}

