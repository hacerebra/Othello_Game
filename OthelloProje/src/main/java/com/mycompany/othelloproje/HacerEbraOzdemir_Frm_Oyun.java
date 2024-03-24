/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.othelloproje;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author hacerebra
 */
public class HacerEbraOzdemir_Frm_Oyun extends javax.swing.JFrame {

    private JPanel pnl_oyun;//Oyun tahtasini ve oyun sirasinda olusan butonları icerecektir.
    private JPanel pnl_bilgi;//Oyunun kurallari ve boyut secimi icin gerekli olan bilgileri ve ögeleri icerecektir.
    private final JSpinner spnr_boyut;//Oyun tahtasinin boyutunu ayarlamak icin kullanilacaktir.
    HacerEbraOzdemir_Frm_Skorlar frm_Skorlar = new HacerEbraOzdemir_Frm_Skorlar(this);//Skor tablosunu gostermek icin kullanilacaktir.
    HacerEbraOzdemir_Oyun oyun;//Oyunun durumunu takip etmek için kullanılacaktır.
    int boyut;//Oyun tahtasinin boyutunu tutar.

    Color currentColor = Color.BLACK;//Oyun sirasinda mevcut oyuncunun tas rengini tutar. Baslangicta siyah olarak ayarlanmistir.

    public HacerEbraOzdemir_Frm_Oyun() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//// Pencere kapatildiginda programi sonlandir.
        setLayout(new BorderLayout());

        // SpinnerModel olustur, minimum değer 6, maksimum deger 10, artis miktari 2 olan bir SpinnerModel olustur.
        SpinnerModel sizeModel = new SpinnerNumberModel(6, 6, 10, 2); // min, max, adım
        spnr_boyut = new JSpinner(sizeModel);

        //Menü olustur
        JMenuBar menuBar = new JMenuBar();
        JMenu oyun = new JMenu("Oyun");//"Oyun" adinda bir menü olustur.
        JMenuItem yeniOyun = new JMenuItem("Yeni Oyun");//"Yeni Oyun" adinda bir JMenuItem olustur.
        yeniOyun.addActionListener(new ActionListener() {
            @Override
            //Yeni Oyun secenegi seçildiğinde yeniOyun() metodunu cagir.
            public void actionPerformed(ActionEvent e) {
                yeniOyun();
            }

        });

        JMenuItem cıkıs = new JMenuItem("Çıkış");// "Çıkış" adinda bir JMenuItem olustur
        cıkıs.addActionListener(new ActionListener() {
            @Override
            // Çıkış secenegi secildiginde programi sonlandir
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        }
        );
        //JMenuItem'lari JMenu'ya ekle.
        oyun.add(yeniOyun);
        oyun.add(cıkıs);

        JMenu skor = new JMenu("Skorlar"); // "Skorlar" adinda bir menu olustur.
        JMenuItem skorlarıGoster = new JMenuItem("Skor Tablosunu Göster");//"Skor Tablosunu Göster" adinda bir JMenuItem olustur.        
        skorlarıGoster.addActionListener(new ActionListener() {
            @Override
            //Skor Tablosunu Göster secenegi secildiginde Skor frame'indeki skorTablosunuYazdır() metodunu cagir ve Skor frame'ini goster.
            public void actionPerformed(ActionEvent e) {
                frm_Skorlar.skorTablosunuYazdır();
                frm_Skorlar.setVisible(true);

            }

        });
        skor.add(skorlarıGoster);// JMenuItem'i JMenu'ya ekle.
        // JMenu'ları menu barina ekle.
        menuBar.add(oyun);
        menuBar.add(skor);

        // Oyun paneli
        boyut = (int) spnr_boyut.getValue(); // boyut degiskeni spnr_boyut JSpinner'indan alinan degere esittir.
        pnl_oyun = new JPanel(new GridLayout(boyut, boyut));// boyut x boyut'luk bir GridLayout kullanarak bir JPanel olustur.

        // Bilgilendirme ve boyut seçim paneli
        pnl_bilgi = new JPanel(new FlowLayout());//JPanel nesnesi olusturulurken, FlowLayout kullanilarak bileşenlerin yan yana sıralanması saglanıyor.
        pnl_bilgi.add(new JLabel("Boyut:"));
        pnl_bilgi.add(spnr_boyut);//boyut secimi icin bir JSpinner nesnesini ekle.
        pnl_bilgi.setBackground(Color.magenta);//JPanel nesnesinin arkaplan rengi magenta olarak ayarlanıyor. 
        //JButton nesnesi oluşturuluyor ve "BAŞLA" yazısı atanıyor.
        JButton btn_basla = new JButton();
        pnl_bilgi.add(btn_basla);
        btn_basla.setText("BAŞLA");
        btn_basla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Boyut değistiginde, board panelini guncelle
                buttonEkle();

            }
        });

        // Ana paneli ayarla
        setTitle("OTHELLO");//Baslık "OTHELLO" olarak ayarlanıyor. 
        setPreferredSize(new Dimension(1000, 1000));//Panel boyutu ayarlanıyor.
        add(pnl_bilgi, BorderLayout.SOUTH);//Bilgi paneli ana panelin alt kısmına ekleniyor ve BorderLayout kullanılarak konumu belirleniyor.
        add(menuBar, BorderLayout.NORTH);//Menü çubuğu ana panelin üst kısmına ekleniyor.
        //JFrame boyutu ayarlanarak panel görünür hale getiriliyor.
        pack();
        setVisible(true);
    }

    //Bu metot butonların olusturulmasından ve oyunun baslamasından sorumlu olacak.
    private void buttonEkle() {
        pnl_oyun.removeAll();//Oyun panelinde buton varsa butonlar temizlenir.
        boyut = (int) spnr_boyut.getValue();//Boyut spinnerından boyut bilgisi alınır.
        oyun = new HacerEbraOzdemir_Oyun(boyut);//Oyun sınıfından boyut parametresiyle bir obje olusturulur.
        pnl_oyun.setLayout(new GridLayout(boyut, boyut, boyut / 2, boyut / 2));//Oyun panelinin duzeni, boyut değerleri ve boşluk miktarı kullanılarak bir GridLayout ile ayarlanır.
        //Iki adet for döngüsü kullanılarak butonlar olusturulur ve bu butonlar oyun paneline eklenir.
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                HacerEbraOzdemir_MyButton btn_yeni = new HacerEbraOzdemir_MyButton();//MyButton sınıfından yeni bir obje olusturulur.
                //Butonların arka plan rengi ayarlanır.
                btn_yeni.setOpaque(true);
                btn_yeni.setBorderPainted(false);
                btn_yeni.setBackground(Color.GREEN);
                btn_yeni.addActionListener(new btn_gameButtonActionListener(i, j));
                pnl_oyun.add(btn_yeni);//Butonlar oyun paneline eklenir.
                this.oyun.oyunMatrix[i][j] = btn_yeni;//Butonların satır ve sütun koordinatları, oyunMatrix adlı 2 boyutlu diziye atanır.
            }
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame kapatıldığında uygulama tamamen kapanır.
        setTitle("Othello");//JFrame'in başlığı "Othello" olarak ayarlanır.
        getContentPane().add(pnl_oyun, BorderLayout.CENTER);//Oyun frame'i konumlandırılır.
        setVisible(true);//JFrame görünür hale getirilir.
    }

    //Butona tıklandığında, butonun arka plan rengi yeşil ise, butonun arka plan rengini mevcut oyuncunun taş rengine dönüştürür.
    private class btn_gameButtonActionListener implements ActionListener {

        private final int row;
        private final int col;

        public btn_gameButtonActionListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            HacerEbraOzdemir_MyButton button = (HacerEbraOzdemir_MyButton) e.getSource();
            if (button.getBackground() == Color.GREEN) { // Buton boş ise işleme devam et
                button.setBackground(currentColor); // Butonun arka plan rengini mevcut oyuncunun taş rengine dönüştür
                taslarıCevir(row, col); // Diğer taşları mevcut oyuncunun taş rengine dönüştür
                currentColor = (currentColor == Color.BLACK) ? Color.WHITE : Color.BLACK; // Oyuncu değiştir
                skor();//skor methodu cagirilir.
            }
        }
    }

    /*Bu metot, Othello oyunundaki belirli bir kareye tıklandığında, karenin etrafındaki tüm kareleri kontrol eder ve bu karelerdeki taşları belirli bir yönde döndürür. 
    "row" ve "col" parametreleri, hangi kareye tıkladığımızı belirtir ve "rowDirs" ve "colDirs" dizileri, taşları döndürmek için hangi yönleri izleyeceğimizi belirler.*/
    private void taslarıCevir(int row, int col) {
        //rowDirs ve colDirs dizileri, bir koordinattan hareket edildiğinde hangi yöne gidileceğini belirten değerleri içerir. Bu değerler, 8 yöne karşılık gelir: kuzey, kuzeydoğu, doğu, güneydoğu, güney, güneybatı, batı ve kuzeybatı.
        int[] rowDirs = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] colDirs = {0, 1, 1, 1, 0, -1, -1, -1};
        for (int i = 0; i < rowDirs.length; i++) {
            //kareleriTaraVeRenklendir() metodunda, row ve col parametreleri, taşın hareket edeceği başlangıç koordinatlarını belirtir. Yönlendirme değerleri, bu koordinatlardan hangi yöne gidileceğini belirtir.
            kareleriTaraVeRenklendir(row, col, rowDirs[i], colDirs[i]);
        }
    }

    private void kareleriTaraVeRenklendir(int row, int col, int rowDir, int colDir) {
        //int row, int col, int rowDir, int colDir: Bu parametreler, metodun çalıştırılacağı kare koordinatlarını ve tarama yönünü belirtir.
        int currentRow = row + rowDir;//int currentRow = row + rowDir; : Taramaya başlanacak olan kare, verilen yönde ilerletilen row degeri ile belirlenir.
        int currentCol = col + colDir;//int currentCol= col + colDir; : Taramaya başlanacak olan kare, verilen yönde ilerletilen col degeri ile belirlenir.
        while (currentRow >= 0 && currentRow < boyut && currentCol >= 0 && currentCol < boyut) {//Tarama işlemi sırasında, tahtanın dışına çıkılmadan devam edilir.
            JButton currentButton = oyun.oyunMatrix[currentRow][currentCol];//Mevcut konumdaki buton bulunur.
            if (currentButton.getBackground() == currentColor) { // Mevcut oyuncunun taşı ile karşılaştıysak aradaki taşları mevcut oyuncunun taş rengine doner.
                int steps = Math.max(Math.abs(currentRow - row), Math.abs(currentCol - col));// İlerleme mesafesi belirlenir. Math.max() metodu ile, taşların arasındaki en büyük mesafe hesaplanır. En çok nereye kadar giderek renk degistirilecegi belirlenir.
                //Yatay ve dikeydeki adım miktarı hesaplanır.
                int stepRow = (currentRow - row) / steps;
                int stepCol = (currentCol - col) / steps;
                //Geçici satır ve sütun değerleri atanır.
                int tempRow = row + stepRow;
                int tempCol = col + stepCol;
                //Taşların arasındaki her bir boşluğu doldurmak için while döngüsü kullanılır.
                while (tempRow != currentRow || tempCol != currentCol) {
                    JButton flipButton = oyun.oyunMatrix[tempRow][tempCol];
                    flipButton.setBackground(currentColor);//Geçici satır ve sütundaki butonların rengi, o anki oyuncunun taş rengine dönüştürülür.
                    //Ilerleme yapılır.
                    tempRow += stepRow;
                    tempCol += stepCol;

                }
            }
            //Mevcut satır ve sütun değerleri, tarama yönüne göre ilerletilir.
            currentRow += rowDir;
            currentCol += colDir;
        }

    }

    //yeniOyun() methodu, oyuncu ID'lerinin ve giriş formunun temizlenmesini sağlayarak yeni bir oyun başlatır.
    private void yeniOyun() {
        this.dispose();//Oyun Frame'i kapanır.
        HacerEbraOzdemir_Data.idList.clear();//idList, oyuncuların ID'lerini tutan bir listedir ve her yeni oyunda sıfırlanır.
        HacerEbraOzdemir_Frm_Giris frm_Giris = new HacerEbraOzdemir_Frm_Giris();
        frm_Giris.setVisible(true);//giris Frame'i acilir.
    }

    public void skor() {
        int siyah = 0;
        int beyaz = 0;
        boolean dolu = true;//Tahtanın tamamen tasla dolu olup olmadigini (her butonun siyah veya beyaza dönüp donmedigini kontrol etmek icin) 
        //Oyun tahtasındaki her bir butonun arkaplan rengini kontrol eder ve siyah veya beyaz renkte olan butonların sayısını arttırarak devam eder. 
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                if (oyun.oyunMatrix[i][j].getBackground() == Color.BLACK) {
                    siyah++;
                } else if (oyun.oyunMatrix[i][j].getBackground() == Color.WHITE) {
                    beyaz++;
                } else {
                    dolu = false;
                }
            }
        }

        if (dolu) { // tamamen dolu ise (oyun bitmisse) skoru hesapla ve kazananı belirle
            //siyah taşların sayısını ekranda "Siyah taş sayısı: " başlığı altında ve beyaz taşların sayısını "Beyaz taş sayısı: " başlığı altında gösteren iki adet JLabel oluşturur. Ve bu labellar bilgi paneline eklenir.
            JLabel lbl_siyah = new JLabel("Siyah taş sayısı: " + Integer.toString(siyah));
            pnl_bilgi.add(lbl_siyah);
            JLabel lbl_beyaz = new JLabel("  Beyaz taş sayısı: " + Integer.toString(beyaz));
            pnl_bilgi.add(lbl_beyaz);
            System.out.println("Siyah taş sayısı: " + siyah + " Beyaz taş sayısı: " + beyaz);

            //Siyah taşların sayısı beyaz tasların sayısından fazlaysa, "Siyah Kazandı" yazısını ekranda gösteren bir mesaj kutusu oluşturur. Siyah tasların sayısı beyaz tasların sayısından azsa, "Beyaz Kazandı" yazısını ekranda gösteren bir mesaj kutusu oluşturur. Eğer siyah taş sayısı beyaz taş sayısına eşitse, "Berabere" yazısını ekranda gösteren bir mesaj kutusu olusturur.
            if (siyah > beyaz) {
                System.out.println("Siyah Kazandı");
                JOptionPane.showMessageDialog(rootPane, "Siyah taş sayısı: " + Integer.toString(siyah) + "  Beyaz taş sayısı: " + Integer.toString(beyaz) + "  Siyah Kazandı");
            } else if (siyah < beyaz) {
                System.out.println("Beyaz Kazandı");
                JOptionPane.showMessageDialog(rootPane, "Siyah taş sayısı: " + Integer.toString(siyah) + "  Beyaz taş sayısı: " + Integer.toString(beyaz) + "  Beyaz Kazandı");
            } else {
                System.out.println("Berabere");
                JOptionPane.showMessageDialog(rootPane, "Siyah taş sayısı: " + Integer.toString(siyah) + "  Beyaz taş sayısı: " + Integer.toString(beyaz) + "  Berabere");
            }
        }
    }

    //isimSoyisimYazdır() methodu oyunu oynayan oyuncuların isimlerinin oyun frame'indeki bilgi paneline yazdırılmasını saglar.
    public void isimSoyisimYazdır() {

        ArrayList<Integer> idsListesi = new ArrayList<>(HacerEbraOzdemir_Data.idList);
        if (idsListesi.size() >= 1) {
            int id1 = idsListesi.get(0);//id1 değişkeni, listedeki ilk ID'yi tutar.
            //oyuncu1 degiskeni null degilse, oyuncu1.adSoyad öğesi (oyuncunun adı ve soyadı) oyun frame'indeki pnl_bilgi paneline eklenir.(Siyah renk belirtmesiyle oyuncu1 in ilk oyuncu oldugunu belirttim.)
            HacerEbraOzdemir_Oyuncu oyuncu1 = null;
            for (HacerEbraOzdemir_Oyuncu oyuncu : HacerEbraOzdemir_Data.oyuncuList) {
                if (oyuncu.id == id1) {
                    oyuncu1 = oyuncu;
                    break;
                }
            }
            if (oyuncu1 != null) {
                pnl_bilgi.add(new JTextField(oyuncu1.adSoyad + "  (Siyah)"));

            }
        }

        if (idsListesi.size() == 2) {
            int id2 = idsListesi.get(1);//id2 değişkeni, listedeki ikinci ID'yi tutar.
            //oyuncu2 degiskeni null degilse, oyuncu2.adSoyad öğesi (oyuncunun adı ve soyadı) oyun frame'indeki pnl_bilgi paneline eklenir.(Beyaz renk belirtmesiyle oyuncu1 in ikinci oyuncu oldugunu belirttim.)
            HacerEbraOzdemir_Oyuncu oyuncu2 = null;
            for (HacerEbraOzdemir_Oyuncu oyuncu : HacerEbraOzdemir_Data.oyuncuList) {
                if (oyuncu.id == id2) {
                    oyuncu2 = oyuncu;
                    break;
                }
            }
            if (oyuncu2 != null) {
                pnl_bilgi.add(new JTextField(oyuncu2.adSoyad + "  (Beyaz)"));

            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
