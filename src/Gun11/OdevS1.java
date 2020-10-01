/*
Author:Otosun
Tarih :08/06/2020
*/
package Gun11;

import java.util.Scanner;

public class OdevS1 {

    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        while (true) {


        int x, y;
        System.out.println("P notasinin x ve y degerlerini giriniz");
        System.out.print("x : ");
        x = oku.nextInt();
        System.out.print("y : ");
        y = oku.nextInt();

        System.out.println("Koordinat : P(" + x + "," + y + ")");

        if ((x > -2 && x < 8) && (y > 1 && y < 4))
            System.out.println("Icinde");

        else if ((x == -2 || x == 8) && (y == 1 || y == 4))
            System.out.println("Ustunde");
        else System.out.println("Disinda");
    }
    }
}
