/*
Author:Otosun
Tarih :11/06/2020
*/
package Gun13;

import java.util.Scanner;

public class ifInIf {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = oku.nextInt();

        if (sayi < 100) {
            System.out.println("Sayi 100 den kucuktur");
            if (sayi < 50) {
                System.out.println("Sayi 50 den kucuktur");
                if (sayi < 25) {
                    System.out.println("Sayi 25 den kucuktur");
                }

            }
        }
    }
}
