/*
Author:Otosun
Tarih :09/07/2020
*/
package Gun34.task.task1;

import java.util.ArrayList;

/*
Universitede ogrencilere ders kaydi programi yapilmak isteniyor.
Once ders tanimlamalari yapilacak sonra her ogrenci icin alabilecegi ders saatini gecmeyecek sekilde
bu dersler ogrencilere eklenecek.
1. Adim: Yeni ders olusturmak icin Lesson adinda bir sinif tanimlayiniz: fields:name, hour
2. Adim: Ders olusturma metodunu "createLesson" yaziniz
3. Adim Uc adet ders tanimlayiniz mat101 6 saat, fiz101 4 saat, Java101 6 saat
4. Adim: Student isminde yeni bir class tanimlayiniz fields: name, maxAlabilecegiDersSaatMiktari
5. Adim Ogrenci olusturmayi bir metod ile yaziniz
6. Adim 2 adet ogrenci olusturunuz Adi Mehmet max ders saati 20 ; Ayse, max saat 12olsun
7. Adim: Ogrenciye ders eklemek icin Student sinifina bir ders listesi tutacak bir fields ekleyiniz studentLessons metod yaziniz .
8.Adim: Bu iki ogrenciye ders ekleyen LessenAdd isimli bir metod yaziniz fakat
ders eklenirken ogrencinin alabilecegi ders miktarini asmasin
asarsa uyari versin.
 */
public class UniversiteDersKayit {
    public static void main(String[] args) {
        Lesson mat101 = Lesson.createLesson("Matematik", 6);
        Lesson fiz101 = Lesson.createLesson("Fizik", 3);
        Lesson java101 = Lesson.createLesson("Java Programing", 6);

        Student ogrenci1 = Student.createStudent("Mehmet", 20);
        Student ogrenci2 = Student.createStudent("Ayse", 12);

        ogrenci1.lessonAdd(mat101);
        ogrenci1.lessonAdd(java101);
        ogrenci1.lessonAdd(fiz101);

        ogrenci2.studentLessons.add(mat101);
        ogrenci2.studentLessons.add(fiz101);



        ogrenci1.dersYazdir();
        ogrenci2.dersYazdir();
    }
}
