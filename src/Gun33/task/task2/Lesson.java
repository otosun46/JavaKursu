/*
Author:Otosun
Tarih :08/07/2020
*/
package Gun33.task.task2;

import java.util.ArrayList;

public class Lesson {
    String name;
    int credit;

    public static Lesson LessonCreate(String name, int credit) {
        Lesson ders = new Lesson();
        ders.name = name;
        ders.credit = credit;
        return ders;
    }
}
