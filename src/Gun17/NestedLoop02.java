/*
Author:Otosun
Tarih :16/06/2020
*/
package Gun17;

public class NestedLoop02 {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
