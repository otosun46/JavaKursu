/*
Author:Otosun
Tarih :23/06/2020
*/
package Gun22;

import java.util.Scanner;

/*
Kullanıcıya aşağıdaki gibi bir menü çıkartarak değişkenleri alınız ve
her bir menü elemanını değer alan fonksiyon olarak yazınız.
1- toplam
2- cikarma
3- carpma
4- bolme
5- Faktoriyel ekle sonra
6- cikis
Bir islem seciniz

 */
public class JavaMethods03 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int secim = 0;

        do {
            menuYaz();
            secim = oku.nextInt();
            secimYap(secim);
        } while (secim < 6);
    }

    public static void toplamYaz(int s1, int s2) {
        System.out.println("Toplam = " + (s1 + s2));
    }

    public static void cikartmaYaz(int s1, int s2) {
        System.out.println("Toplam = " + (s1 - s2));
    }

    public static void carpmaYaz(int s1, int s2) {
        System.out.println("Toplam = " + (s1 * s2));
    }

    public static void bolmeYaz(int s1, int s2) {
        System.out.println("Toplam = " + (s1 / s2));
    }

    public static void faktoryelYaz(int s1) {
        int fak = 1;
        for (int i = 1; i <= s1; i++) {
            fak *= i;
        }
        System.out.println(fak);
    }

    public static void menuYaz() {
        System.out.println("****** Menü *******");
        System.out.println("1-toplama");
        System.out.println("2-çıkarma");
        System.out.println("3-çarpma");
        System.out.println("4-bölme");
        System.out.println("5-faktöryel");
        System.out.println("6-Çıkış\n");
        System.out.print("Seçiminiz=");
    }

    public static void secimYap(int secim) {
        Scanner read = new Scanner(System.in);

        int sayi1 = 0;
        int sayi2 = 0;
        switch (secim) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.print("1.Sayı = ");
                sayi1 = read.nextInt();
                System.out.print("2.Sayı = ");
                sayi2 = read.nextInt();
                break;
            case 5:
                System.out.print("Sayı = ");
                sayi1 = read.nextInt();
        }

        switch (secim) {
            case 1:
                toplamYaz(sayi1, sayi2);
                break;
            case 2:
                cikartmaYaz(sayi1, sayi2);
                break;
            case 3:
                carpmaYaz(sayi1, sayi2);
                break;
            case 4:
                bolmeYaz(sayi1, sayi2);
                break;
            case 5:
                faktoryelYaz(sayi1);
                break;
        }
    }
}
