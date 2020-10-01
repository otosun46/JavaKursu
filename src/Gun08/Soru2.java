package Gun08;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        String isim;

        System.out.print("Isminizi giriniz : ");
        isim = oku.nextLine();
        int boslukIndex= isim.indexOf(" ");
       String ad = isim.substring(0,boslukIndex);
       String soyad = isim.substring(boslukIndex+1);
        System.out.println("Ad = " + ad);
        System.out.println("Soyad = " + soyad);

    }
}
