/*
Author:Otosun
Tarih :11/06/2020
*/
package Gun14;

import java.util.Scanner;

public class WhileLop2 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        int sayac = 1;
        int buyukSayi = 0;
        while (sayac <= 5) {
            System.out.print(sayac + ".sayiyi giriniz:");
            int sayi = oku.nextInt();
            if (sayi > buyukSayi) {
                buyukSayi = sayi;
            }
            sayac++;

        }
        System.out.println("En buyuk sayi:" + buyukSayi);
    }
}
