/*
Author:Otosun
Tarih :09/07/2020
*/
package Gun34.task.task1;

import java.util.ArrayList;


public class Student {
    String name;
    int maxAlabilecegiDersSaatMiktari;

    ArrayList<Lesson> studentLessons = new ArrayList<>();

    public static Student createStudent(String name, int maxHour) {
        Student ogrenci = new Student();
        ogrenci.name = name;
        ogrenci.maxAlabilecegiDersSaatMiktari = maxHour;
        return ogrenci;
    }

    public void lessonAdd(Lesson ders) {
        int toplamDers = 0;

        for (Lesson aldigiDersSaati : studentLessons) {
            toplamDers += aldigiDersSaati.hour;

        }
        if (toplamDers + ders.hour < maxAlabilecegiDersSaatMiktari) {
            studentLessons.add(ders);
        } else
            System.out.println(name+" "+ders.name+" Alabilecegi ders saat siniri asildi.Ders eklenemez");
    }

    public void dersYazdir() {
        System.out.println();
        System.out.println(name + "'nin Aldigi Dersler");
        System.out.println("___________________________________");

        int aldigiToplamSaat=0;
        for(Lesson ders: studentLessons)
        {
            System.out.printf("%-26s %2d Saat\n",ders.name,ders.hour);
            aldigiToplamSaat+=ders.hour;
        }
        System.out.printf("Aldigi Toplam Ders Saati = %2d Saat" ,aldigiToplamSaat);
        System.out.println();
    }

}
