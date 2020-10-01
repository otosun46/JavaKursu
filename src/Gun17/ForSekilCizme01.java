/*
Author:Otosun
Tarih :17/06/2020
*/
package Gun17;

/*

 *
 **
 ***
 ****
 *****
 ******
 *******

 */

/*
        for (int satir = 1; satir <= 7; satir++) {
            for (int sutun = 1; sutun <= 7; sutun++) {
                System.out.print("*");
            }
            System.out.println();
        }

 */
public class ForSekilCizme01 {
    public static void main(String[] args) {
        for (int satir = 1; satir <= 7; satir++) {
            for (int sutun = 1; sutun <= satir; sutun++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
