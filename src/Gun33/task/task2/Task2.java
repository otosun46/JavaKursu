/*
Author:Otosun
Tarih :08/07/2020
*/
package Gun33.task.task2;

import java.util.ArrayList;

/*
    // Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
    // 1- Ders sınınıfı ayrı dosyada : adı: Lesson , fields : name, credit (1-3 arasında değer alıyor)
    // 2- Öğrenci Sınıfı ayrı dosyada: adı: Student, fields : name, maxCredit, dersleri listesini
    // tutacak bir liste
    // 3- 3 adet ders oluşturunuz.
    // 4- 1 adet öğrenci tanımlayınız alabileceği maxCredi si 10 olsun.
    // 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
    //    ders eklerken max alabileceği Crediyi geçmemeli, geçerse
    //    uyarı versi, alabileceğiniz max credi doldu şeklinde.
    // Ödev
    // 6- Aşağıdaki ders oluşturma kısmı için ilgili sınıfta lessonCreate adında bir metod
    //    oluşturunuz
    // 7- Öğrenciye ders ekleme bölümünü yine ilgili sınıfta bir metod olarak yazınız.
 */
public class Task2 {
    public static void main(String[] args) {
        //   Lesson math=Lesson.LessonCreate("Matematik",3);

        Student student1 = new Student();
        student1.name = "Ali";
        student1.maxCredit = 10;

        Lesson mat101 = new Lesson();
        mat101.name = "Matematik";
        mat101.credit = 3;

        Lesson java101 = new Lesson();
        java101.name = "Java Programing";
        java101.credit = 6;

        Lesson fiz101 = new Lesson();
        fiz101.name = "Fizik";
        fiz101.credit = 4;
        student1.dersListesi=new ArrayList<>();


        if (student1.totalCredit() + mat101.credit <= student1.maxCredit){
            student1.dersListesi.add(mat101);
        }
        else System.out.println("Alabileceginiz kredi miktari doldu");

        if (student1.totalCredit() + java101.credit <= student1.maxCredit)
            student1.dersListesi.add(java101);
        else System.out.println("Alabileceginiz kredi miktari doldu");

        if (student1.totalCredit() + fiz101.credit <= student1.maxCredit)
            student1.dersListesi.add(fiz101);
        else System.out.println("Alabileceginiz kredi miktari doldu");


    }
}
