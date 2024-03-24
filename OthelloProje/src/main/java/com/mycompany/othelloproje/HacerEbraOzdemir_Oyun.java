/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.othelloproje;

/**
 *
 * @author hacerebra
 */
public class HacerEbraOzdemir_Oyun {
    //Oyun sınıfında, MyButton türünden bir matris (oyunMatrix) ve boyut adında bir değişken tanımlanır. MyButton türünden oyunMatrix matrisi, oyun tahtasındaki tüm butonları temsil eder. 
    HacerEbraOzdemir_MyButton[][] oyunMatrix;
    int boyut;
    
    //Sınıfın kurucu metodu (Oyun(int boyut)) içinde, boyut parametresi alınır. Bu parametre, oyun tahtasının boyutunu belirler. oyunMatrix matrisi, boyutuna göre oluşturulur.
    public HacerEbraOzdemir_Oyun(int boyut) {
        this.oyunMatrix = new HacerEbraOzdemir_MyButton[boyut][boyut];

    }
}
