/*
Author:Otosun
Tarih :08/06/2020
*/
package Gun11;

import java.util.Scanner;

public class ifElse4 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("Hangi islemi yapmak istiyorsunuz(" +
                "\nToplama için  T " +
                "\nÇıkarma için  C " +
                "\nCarpma için   P " +
                "\nBölme için    B ");
        String islem = oku.next();
        System.out.print("Birinci sayiyi giriniz: ");

        int sayi = oku.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        int sayi2 =oku.nextInt();
        if (islem.equalsIgnoreCase("T"))
            System.out.println("sayi+sayi2 = " + (sayi+sayi2));
        else if (islem.equalsIgnoreCase("C"))
            System.out.println("sayi-sayi2 = " + (sayi - sayi2));
        else if (islem.equalsIgnoreCase("P"))
            System.out.println("sayi*sayi2 = " + (sayi*sayi2));
        else if (islem.equalsIgnoreCase("B"))
            System.out.println("sayi/sayi2 = " + (sayi/sayi2));
    }

}
