/*
Author:Otosun
Tarih :07/07/2020
*/
package Gun32.exemple.ex1;

/**
 * 1. Adim: Person isimli bir class yaziniz: fields:name,surname,age;olsun.
 * 2. Adim: main de 2 tane bu siniftan nesne olusturup deger atayiniz.
 * 3. Adim: getBirdhYear isminde Person a ait bir metod yaziniz, calistiginda dogum yilini versin.
 *  4.Adım  :getInitials isminde kişiniz adının ilk harfi.soyadının ilk harfi şeklinde (Büyük harf) veren metodu yazınız
 *         // örnek ahmet demir : A.D.
 */

public class Ex1 {
    public static void main(String[] args) {
        Person kisi1=new Person();
        kisi1.name="Yusuf";
        kisi1.surname="Yilmaz";
        kisi1.age=30;

        Person kisi2=new Person();
        kisi2.name="Ayse";
        kisi2.surname="Demir";
        kisi2.age=30;

        kisi1.BilgiYazdir();
        kisi2.BilgiYazdir();
        BilgiYazdir(kisi1);
        BilgiYazdir(kisi2);
        System.out.println("kisi1.dogumYili = " + kisi1.getBirdhYear());
        System.out.println("kisi2.dogumYili = " + kisi2.getBirdhYear());
        System.out.println(kisi2.getInitials());



    }
        public static void BilgiYazdir(Person kisi){
        System.out.println("metod.name = " + kisi.name);
        System.out.println("metod.surname = " + kisi.surname);
        System.out.println("metod.age = " + kisi.age);
    }
}

class Person{
    String name;
    String surname;
    int age;

    void BilgiYazdir(){
        System.out.println("class.name = " + name);
        System.out.println("class.surname = " + surname);
        System.out.println("class.age = " + age);
    }

    int getBirdhYear(){
        return 2020-age;
    }

    String getInitials() {

        return name.substring(0, 1).toUpperCase()+"."+surname.substring(0, 1).toUpperCase();
    }
}