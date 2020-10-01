/*
Author:Otosun
Tarih :05/06/2020
*/
package Gun10;

import java.util.Scanner;

public class If5 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("1. sayiyi giriniz:");
        int sayi1 = oku.nextInt();
        System.out.print("2. sayiyi giriniz:");
        int sayi2 = oku.nextInt();
        System.out.print("3. sayiyi giriniz:");
        int sayi3 = oku.nextInt();


        int enBuyuk = sayi1;

        if (sayi2 > enBuyuk)
            enBuyuk = sayi2;

        if (sayi3 > enBuyuk)
            enBuyuk = sayi3;

        System.out.println("enBuyuk = " + enBuyuk);
    }



    }

