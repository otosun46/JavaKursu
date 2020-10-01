/*
Author:Otosun
Tarih :13/07/2020
*/
package Gun36.exemple.ex1;

public class JavaConstructors {
    public static void main(String[] args) {
        //1. Yontem
        /*
        Student ogrenci1=new Student();

        ogrenci1.id = 1;
        ogrenci1.name = "Ayse";
        ogrenci1.surName = "Yilmaz";
        ogrenci1.classroom=10;

        //2. Yontem
       Student ogrenci2=Student.createStudent(2,"Ahmet","Yeni",11);
       */
        Student ogrenci3 = new Student(3, "Ali", "Dogan", 9);
        System.out.println(ogrenci3.name);

        Student ogrenci4 = new Student(4, "Zeynep", "Toprak");
        System.out.println(ogrenci4.name);

        Student ogrenci5 = new Student(5, "Zeynep");
        System.out.println(ogrenci5.name);

        Student ogrenci6 = new Student(6);
        System.out.println(ogrenci6.name);

        Student ogrenci7 = new Student();   //ilk duruma geldi hic bir veri girilmeden
                                            //ogrenci olusturulmus oldu bilgiler sonradan giriliyor
        ogrenci7.id = 7;
        ogrenci7.name = "Veli";
        ogrenci7.surName = "Yilmaz";
        ogrenci7.classroom = 7;
        System.out.println(ogrenci7.name);
    }


}
