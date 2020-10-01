/*
Author:Otosun
Tarih :15/06/2020
*/
package Gun16;

import java.util.Scanner;

public class For03 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("Bir sitring giriniz : ");
        String str = oku.nextLine();
        int aHarfi = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                aHarfi++;
            }
            if (str.charAt(i) == 'c') {
                break;
            }
        }
        System.out.println(aHarfi);

    }
}
