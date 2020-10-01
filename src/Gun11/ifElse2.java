/*
Author:Otosun
Tarih :08/06/2020
*/
package Gun11;

import java.util.Scanner;

public class ifElse2 {

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");

        int sayi = oku.nextInt();
        if (sayi > 0) System.out.println("Sayi pozitif");
        else if (sayi < 0) System.out.println("Sayi negatif");
        else System.out.println("Sayi sifirdir");

    }
}
