/*
Author:Otosun
Tarih :06/07/2020
*/
package Gun31.example.Ex1;

// bir student class i tanimlayiniz fields:name, grade
public class Ex1 {
    public static void main(String[] args) {
        Student ogrenci1 = new Student();
        ogrenci1.name="Ayse";
        ogrenci1.grade=3;


        School okulu=new School();
        okulu.adress="goztepe";
        okulu.name="Marmara Universitesi";
        okulu.princepalName="Rektor";
        okulu.tuitionFees =0;

        ogrenci1.schoolInfo=okulu;

        //2.yontem
        ogrenci1.schoolInfo=new School();
        ogrenci1.schoolInfo.adress="Goztepe";
        ogrenci1.schoolInfo.name="Marmara Universitesi";
        ogrenci1.schoolInfo.tuitionFees =0;

        System.out.println("ogrenci1       = " + ogrenci1.name);
        System.out.println("ogrenci1.grade = " + ogrenci1.grade);








    }
}
