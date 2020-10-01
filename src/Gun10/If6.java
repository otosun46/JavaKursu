/*
Author:Otosun
Tarih :05/06/2020
*/
package Gun10;

import java.util.Scanner;

public class If6 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayiyi giriniz:");
        int sayi1 = oku.nextInt();

        if (sayi1/10 % 2 == 0) System.out.println("Sayi cifttir");
        if (sayi1/10 % 2 ==1) System.out.println("Sayi tektir");



    }

}
