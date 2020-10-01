/*
Author:Otosun
Tarih :09/06/2020
*/
package Gun12;

import java.util.Scanner;

public class randomSayi {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        System.out.print("Alt siniri giriniz: ");
        String stringSayi=oku.nextLine();
        int bosluk = stringSayi.indexOf(" ");
        String AltSinir=stringSayi.substring(0,bosluk);
        String ustSinir=stringSayi.substring(bosluk+1);

        int sayi2= Integer.parseInt(ustSinir) - Integer.parseInt(AltSinir);

        int sayi1 = (int)(Math.random()*sayi2+1+Integer.parseInt(AltSinir));

        System.out.println("Random sayi = " + sayi1);

        System.out.println("AltSinir = " + AltSinir);
        System.out.println("ustSinir = " + ustSinir);
    }
}
