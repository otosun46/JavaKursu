/*
Author:Otosun
Tarih :11/06/2020
*/
package Gun14;

import java.util.Scanner;

public class DowhileDene {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        String text;
        boolean karsilastirma = true;
        do {
            System.out.print("Bir string giriniz: ");
            text = oku.nextLine();
            karsilastirma = text.equalsIgnoreCase("x");
        } while (!karsilastirma);
    }
}
