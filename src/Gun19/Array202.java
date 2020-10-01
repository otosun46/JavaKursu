package Gun19;/*
Author:Otosun
Tarih :18/06/2020
*/

import java.util.Scanner;

public class Array202 {
    public static void main(String[] args) {

        String[] dizi = new String[5];
        Scanner oku = new Scanner(System.in);

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Bir meyve adi giriniz:");
            dizi[i] = oku.next();
        }
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i].equalsIgnoreCase("elma"))
                System.out.println("Dizinin " + (i + 1) + ". elemani = " + dizi[i]);
        }
    }
}

