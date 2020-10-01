/*
Author:Otosun
Tarih :23/06/2020
*/
package Gun22;

import java.util.Scanner;

public class JavaMethods04 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("1. sayiyi giriniz: ");
        int sayi1=oku.nextInt();
        System.out.print("2. sayiyi giriniz: ");
        int sayi2=oku.nextInt();
        int toplam=toplamYaz(sayi1,sayi2);
        System.out.println(toplam);
        toplamYaz(sayi1,sayi2);
    }


    public static int toplamYaz(int s1, int s2) {
        int toplam;
        toplam=s1 + s2;
        return toplam;
    }

}
