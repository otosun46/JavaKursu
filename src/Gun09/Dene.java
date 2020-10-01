/*
Author:Otosun
Tarih :05/06/2020
*/
package Gun09;

import java.util.Scanner;

//  1- Girilen bir sayının birler basamağını ekrana yazdırınız.
//  2- Girilen bir sayının onlar basamağını ekrana yazdırınız.
// 3- Girilen bir sayının yüzler basamağını ekrana yazdırınız.
// 4- Girilen 3 basamaklı bir sayınızn basamaklarının toplamını ekrana yazdırınız.
// -> 435 -> 4,3,5  => 4+3+5 => 12
// 5- Girilen 3 basamaklı bir sayının basamaklarına göre tersini bir sayı olarak
// ekrana yazdırınız.Örneğin 435 -> 534 sayı olarak bulunacak.
public class Dene {
    public static void main(String[]args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir tamsayi giriniz : ");

        int sayi = oku.nextInt();
        System.out.println("-------------------------------");
        int birlerBasamagi = sayi % 10;
        int onlarBasamagi = (sayi % 100) / 10;
        int yuzlerBasamagi = (sayi % 1000) / 100;
        int binlerBasamagi = sayi / 1000;

        System.out.println("sayi           = " + sayi);
        System.out.println("birlerBasamagi = " + birlerBasamagi);
        System.out.println("onlarBasamagi  = " + onlarBasamagi);
        System.out.println("yuzlerBasamagi = " + yuzlerBasamagi);
        System.out.println("binlerBasamagi = " + binlerBasamagi);
        int basamakToplami = birlerBasamagi + onlarBasamagi + yuzlerBasamagi + binlerBasamagi;
        System.out.println("basamakToplami = " + basamakToplami);

        System.out.println("Ters sayi      = " + birlerBasamagi + onlarBasamagi + yuzlerBasamagi + binlerBasamagi);
        System.out.println("-------------------------------");


    }
}
