/*
Author:Otosun
Tarih :11/06/2020
*/
package Gun14;

import java.util.Scanner;

public class DoWhileDeneme {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Dongu sayisini giriniz: ");
        int sayac = oku.nextInt();
        int baslangic = sayac;
        do {
            System.out.println(baslangic - sayac+1);
            sayac--;
        } while (sayac > 0);
    }
}
