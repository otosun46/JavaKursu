package Gun09;

// Günün Soruları
//  1- Girilen bir sayının birler basamağını ekrana yazdırınız.
//  2- Girilen bir sayının onlar basamağını ekrana yazdırınız.
// 3- Girilen bir sayının yüzler basamağını ekrana yazdırınız.
// 4- Girilen 3 basamaklı bir sayınızn basamaklarının toplamını ekrana yazdırınız.
// -> 435 -> 4,3,5  => 4+3+5 => 12
// 5- Girilen 3 basamaklı bir sayının basamaklarına göre tersini bir sayı olarak
// ekrana yazdırınız.Örneğin 435 -> 534 sayı olarak bulunacak.
// 6- 2020 yılına kadar geçen gün sayısını bulunuz.
// 7- Kullanıcıdan vize ve final notunu alınız. ort = 0.4 * vize + 0.6 * final olarak bulunuz.

import java.util.Scanner;

public class Ders {
public static void main(String[]args){
    Scanner oku=new Scanner(System.in);
    System.out.print("Bir tamsayi giriniz : ");

int sayi = oku.nextInt();
    System.out.println("-------------------------------");
    int birlerBasamagi= sayi%10;
int onlarBasamagi= (sayi%100)/10;
int yuzlerBasamagi= (sayi%1000)/100;
int binlerBasamagi= sayi/1000;

    System.out.println("sayi           = " + sayi);
    System.out.println("birlerBasamagi = " + birlerBasamagi);
    System.out.println("onlarBasamagi  = " + onlarBasamagi);
    System.out.println("yuzlerBasamagi = " + yuzlerBasamagi);
    System.out.println("binlerBasamagi = " + binlerBasamagi);

int basamakToplami =birlerBasamagi+onlarBasamagi+yuzlerBasamagi+binlerBasamagi;

    System.out.println("basamakToplami = " + basamakToplami);

    System.out.println("Ters sayi      = "+(birlerBasamagi*1000+onlarBasamagi*100+yuzlerBasamagi*10+binlerBasamagi));
    System.out.println("-------------------------------");

    int gunSayisi;
    gunSayisi=2020*365+(2020/4);
    System.out.println("2020 yilina kadar gecen gun= "+gunSayisi);

    System.out.println("-------------------------------");
    System.out.print("Vize sinav notunu giriniz : ");
    int vizeNotu= oku.nextInt();
    System.out.print("Final sinav notunu giriniz : ");
    int finalNotu= oku.nextInt();

    System.out.println("Not Ortalamaniz = "+(double)(vizeNotu*0.4+finalNotu*0.6));
    System.out.println("Basarilar dileriz.");
    System.out.println("-------------------------------");
}
}
