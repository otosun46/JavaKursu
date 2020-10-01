package Gun08;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {


    Scanner oku = new Scanner(System.in);
    String isim;

        System.out.print("Isminizi giriniz : ");
    isim = oku.nextLine();
    int ilkboslukIndex= isim.indexOf(" ");
    int sonboslukIndex= isim.lastIndexOf(" ");

    String ad = isim.substring(0,ilkboslukIndex);
    String ad2 = isim.substring(ilkboslukIndex+1,sonboslukIndex);
    String soyad = isim.substring(sonboslukIndex+1);
        System.out.println("Ad = " + ad);
        System.out.println("Ad2 = " + ad2);
        System.out.println("Soyad = " + soyad);
}
}
