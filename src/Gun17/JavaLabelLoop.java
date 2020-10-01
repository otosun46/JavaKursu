/*
Author:Otosun
Tarih :16/06/2020
*/
package Gun17;

import javax.swing.*;

public class JavaLabelLoop {
    public static void main(String[] args) {
        disDongu:
        for (int i = 0; i < 10; i++) {

            icDongu:
            for (int j = 0; j < 10; j++) {
                System.out.println("i=" + i + "j=" + j);
                if (i == 5 && j == 8)
                    break disDongu;
            }
            System.out.println();
        }


    }
}
