/*
Author:Otosun
Tarih :05/06/2020
*/
package Gun10;

import java.util.Scanner;

public class If4 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int sayi1 = oku.nextInt();

        if (sayi1 < 0) sayi1 = sayi1 * -1;
        int sayi2 = sayi1 % 10;

        if (sayi2 == 0) System.out.println("Sifir");
        if (sayi2 == 1) System.out.println("Bir");
        if (sayi2 == 2) System.out.println("Iki");
        if (sayi2 == 3) System.out.println("Uc");
        if (sayi2 == 4) System.out.println("Dort");
        if (sayi2 == 5) System.out.println("Bes");
        if (sayi2 == 6) System.out.println("Alti");
        if (sayi2 == 7) System.out.println("Yedi");
        if (sayi2 == 8) System.out.println("Sekiz");
        if (sayi2 == 9) System.out.println("Dokuz");
    }
}
