/*
Author:Otosun
Tarih :15/07/2020
*/
package Gun38.nonAccessModifier.finalModifier.example2;

public class Persons {
    public static void main(String[] args) {

        Person kisi1=new Person("ismet",12);
        //kisi1.fingerprintCode =12; // değer değiştirilemez
        // çünkü ilk değeri aldı.
        System.out.println("kisi1 = " + kisi1);

       // Person kisi2=new Person("ahmet",15);
        //kisi2.fingerprintCode =17; değiştirilemez.
        Persons.olustur();
       // System.out.println("kisi2 = " +kisi2);
    }

    static void olustur(){
        Person kisi2=new Person("ahmet",15);

    }
}
