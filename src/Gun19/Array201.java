/*
Author:Otosun
Tarih :18/06/2020
*/
package Gun19;

import java.util.Scanner;

public class Array201 {
    public static void main(String[] args) {


        int[] dizi = new int[5];
        Scanner oku = new Scanner(System.in);

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Bir sayi giriniz:");
            dizi[i] = oku.nextInt();
        }
        for (int i = dizi.length - 1; i >= 0; i--) {
            System.out.println(dizi[i]);
        }
    }
}
