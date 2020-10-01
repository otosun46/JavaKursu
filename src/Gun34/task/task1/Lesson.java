/*
Author:Otosun
Tarih :09/07/2020
*/
package Gun34.task.task1;

public class Lesson {
    String name;
    int hour;

    public static Lesson createLesson(String name, int hour){
        Lesson ders=new Lesson();
        ders.name=name;
        ders.hour=hour;

        return ders;
    }
}
