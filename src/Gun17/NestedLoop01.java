/*
Author:Otosun
Tarih :16/06/2020
*/
package Gun17;

public class NestedLoop01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println(i + " + " + j + " = " + (i + j));
            }
            System.out.println("*************************************");
        }
    }
}
