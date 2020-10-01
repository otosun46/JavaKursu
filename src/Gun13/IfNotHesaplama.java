/*
Author:Otosun
Tarih :11/06/2020
*/
package Gun13;

import java.util.Scanner;

public class IfNotHesaplama {
    public static void main(String[] args) {

        String notHarfi = null;
        String fizik;

        Scanner oku = new Scanner(System.in);

        System.out.print("Vize sinav sonucunuzu giriniz : ");
        fizik = oku.nextLine();

        int fizNot = Integer.parseInt(fizik.replaceAll("[^0-9]", ""));

        if (fizNot <= 100 && fizNot >= 0) {
            if (fizNot >= 90) notHarfi = "A";
            else if (fizNot >= 80) notHarfi = "B";
            else if (fizNot >= 70) notHarfi = "C";
            else if (fizNot >= 60) notHarfi = "D";
            else if (fizNot >= 50) notHarfi = "E";
            else  notHarfi = "F";

        } else System.out.println("Hatali giris yaptiniz.");
        System.out.println("Ders ortalamaniz : " + fizNot + " harf notunuz " + notHarfi);


    }
}
