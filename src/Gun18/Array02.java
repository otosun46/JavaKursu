/*
Author:Otosun
Tarih :17/06/2020
*/
package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        int[] dizi1 = new int[7];
        Scanner oku = new Scanner(System.in);

        for (int i = 0; i < dizi1.length; i++) {
            System.out.print("Bir sayi giriniz:");
            dizi1[i] = oku.nextInt();
        }
        System.out.println(Arrays.toString(dizi1));
        int teksayi = 0;
        for (int i = 0; i < dizi1.length; i++) {
            if (dizi1[i] % 2 == 1)
                teksayi++;
        }
        System.out.println("teksayi = " + teksayi);
    }
}
