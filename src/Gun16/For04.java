/*
Author:Otosun
Tarih :15/06/2020
*/
package Gun16;

import java.util.Scanner;

public class For04 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int toplam = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Bir sayi giriniz : ");
            int sayi = oku.nextInt();
            if (sayi > 5 && sayi < 10)
                continue;
            toplam = toplam + sayi;
        }
        System.out.println("toplam = " + toplam);
    }
}
