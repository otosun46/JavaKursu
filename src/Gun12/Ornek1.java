/*
Author:Otosun
Tarih :09/06/2020
*/
package Gun12;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("1.sayiyi giriniz: ");
        int sayi=oku.nextInt();

        System.out.print("2.sayiyi giriniz: ");
        int sayi2=oku.nextInt();

        System.out.print("3.sayiyi giriniz: ");
        int sayi3=oku.nextInt();

        int max= Math.max(sayi,Math.max(sayi2,sayi3));
        System.out.println("max = " + max);
    }
}
