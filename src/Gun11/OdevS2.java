/*
Author:Otosun
Tarih :09/06/2020
*/
package Gun11;

import java.util.Scanner;

public class OdevS2 {
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

            if (x>0 ){
                if (y>0) System.out.println("Bolge : A");
                else System.out.println("Bolge : D");
            }

            else {
                if (y>0) System.out.println("Bolge : B");
                else System.out.println("Bolge : C");
            }

        }
    }
}
