/*
Author:Otosun
Tarih :17/06/2020
*/
package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        int[] dizi1 = new int[5];
        Scanner oku = new Scanner(System.in);

        for (int i = 0; i < dizi1.length; i++) {

            dizi1[i] = (int) (Math.random() * 10);
            System.out.print(dizi1[i] + " ");

        }
        System.out.println("\n" + Arrays.toString(dizi1));
        for (int deger:dizi1) {
            System.out.println("deger = "+ deger);
        }
    }
}
