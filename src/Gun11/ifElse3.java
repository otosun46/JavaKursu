/*
Author:Otosun
Tarih :08/06/2020
*/
package Gun11;

import java.util.Scanner;

public class ifElse3 {

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("Kaldigi saati giriniz: ");

        int sayi = oku.nextInt();

        if (sayi<=2)
            System.out.println("5 € ");
        else if (sayi<=5)
            System.out.println("10 € ");
        else
            System.out.println("15 € ");
    }
}
