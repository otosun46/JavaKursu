/*
Author:Otosun
Tarih :16/06/2020
*/
package Gun17;

public class NestedLoop03 {
    public static void main(String[] args) {
        for (int satir = 1; satir <= 5; satir++) {
            for (int bosluk = 5 - satir; bosluk > 0; bosluk--) {
                System.out.print(" ");
            }

            for (int sutun = 1; sutun <= satir; sutun++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
