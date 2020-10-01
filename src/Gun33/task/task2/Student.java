/*
Author:Otosun
Tarih :08/07/2020
*/
package Gun33.task.task2;

import java.util.ArrayList;

public class Student {
    String name;
    int maxCredit;
    ArrayList<Lesson> dersListesi;

    public int totalCredit() {
        int total = 0;
        for (Lesson ders : dersListesi) {
            total += ders.credit;
        }
        return total;
    }


}
