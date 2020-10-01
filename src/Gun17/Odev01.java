/*
Author:Otosun
Tarih :17/06/2020
*/
package Gun17;

/*
        //TODO Write program that prints this using loops
        // ***********
        //  *********
        //   *******
        //    *****
        //     ***
        //      *
@Student
 */
public class Odev01 {
    public static void main(String[] args) {

        for (int satir = 0; satir <= 5; satir++) {
            for (int bosluk = 0; bosluk < satir; bosluk++) {
                System.out.print(" ");
            }
            for (int yildiz = 0; yildiz < 11 - satir * 2; yildiz++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
