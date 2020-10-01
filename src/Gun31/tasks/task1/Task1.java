/*
Author:Otosun
Tarih :06/07/2020
*/
package Gun31.tasks.task1;

import java.util.ArrayList;

// create class student with fields
//string name ,int not
//daha sonra 3 tane öğrenci ve notu olusturunuz. bu öğrencileri bir arrayliste ekleyin.
//Daha öğrenci bilgilerin yazdıran bir metod yazarak arraylistteki öğrenci bilgilerini döngü yazdırınız.
//daha sonra bütün öğrenc lerin not ortalamasını bir metod aracılıgı bularak mainde yazdırınız.
public class Task1 {
    public static void main(String[] args) {
        Student ogrenci1=new Student();
        Student ogrenci2=new Student();
        Student ogrenci3=new Student();


        ogrenci1.name="Ahmet";
        ogrenci2.name="Mehmet";
        ogrenci3.name="Ali";
        ogrenci1.not=80;
        ogrenci2.not=70;
        ogrenci3.not=85;
        ArrayList<Student> ogr =new ArrayList();
        ogr.add(ogrenci1);
        ogr.add(ogrenci2);
        ogr.add(ogrenci3);

        bilgiYazdir(ogr);
        notOrtalamasi(ogr);

    }
    public static void bilgiYazdir(ArrayList<Student> ogr){
        for (Student ogrenci:ogr) {
            System.out.println("Adi : "+ogrenci.name+" \nNotu: "+ogrenci.not);

        }
    }

    public static void notOrtalamasi(ArrayList<Student> ogr){
        int toplam=0;
        for (int i = 0; i <ogr.size() ; i++) {
            toplam+=ogr.get(i).not;
        }
        double ortalama=toplam/ogr.size();
        System.out.println("Ortalama: "+ortalama);
    }
}
