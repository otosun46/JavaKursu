/*
Author:Otosun
Tarih :09/06/2020
*/
package Gun12;

import java.util.Scanner;

public class kisaIfadeler {

    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi=oku.nextInt();
        int sayi2=Math.max(25,Math.max(15,9));

        System.out.println("sayiDogrulama = " + sayi2);

    }
}
