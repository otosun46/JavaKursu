/**
 * @Author:Otosun Tarih :28/07/2020
 */
package Gun47.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {
        Okul okul = new Okul();
        okul.setOkulad("Mehmetcik");
        okul.setMaxOgrenciSayisi(3);
        okul.setOgrencileri(new ArrayList<>());
        ArrayList<Ogrenci> okulunOgrencileri = okul.getOgrencileri();
        int ogrenciSayisi = 1;


        do {
            String ogrAd = kullanicidanVeriAl("Ogrencinin Adi");
            String ogrSoyad = kullanicidanVeriAl("Ogrencinin Soyadi");
            int ogrYasi = Integer.parseInt(kullanicidanVeriAl("Ogrencinin yasi"));
            try {
                Ogrenci ogr = new Ogrenci(ogrAd, ogrSoyad, ogrYasi);
                okulunOgrencileri.add(ogr);
                ogrenciSayisi++;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                System.out.println("Yeni ogrenci giriniz");
            }


        } while (ogrenciSayisi <= okul.getMaxOgrenciSayisi());


    }

    static String kullanicidanVeriAl(String ekranYazisi) {
        Scanner oku = new Scanner(System.in);
        System.out.print(ekranYazisi + ": ");
        String str = oku.nextLine();
        return str;
    }
}
