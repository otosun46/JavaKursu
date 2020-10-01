/*
Author:Otosun
Tarih :17/06/2020
*/
package Gun18;

import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        int[] dizi1 = new int[5];
        Scanner oku = new Scanner(System.in);
        int toplam = 0;
        for (int i = 0; i < dizi1.length; i++) {
            System.out.print("Bir sayi giriniz:");
            dizi1[i] = oku.nextInt();
            toplam = toplam + dizi1[i];
        }
        int buyuksayi = 0;
        int ortalama = toplam / dizi1.length;
        for (int i = 0; i < dizi1.length; i++) {
            if (ortalama < dizi1[i])
                buyuksayi++;
        }
        System.out.println("Ortalamanin ustundeki sayilarin miktari = " + buyuksayi);
    }
}
