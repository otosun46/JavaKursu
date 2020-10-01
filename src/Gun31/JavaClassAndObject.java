/*
Author:Otosun
Tarih :06/07/2020
*/
package Gun31;

public class JavaClassAndObject {
    public static void main(String[] args) {
        Araba araba1=new Araba();//Nesne, araba sinifindan turetildi
        araba1.model="toyota camry";
        araba1.motorHacmi=1600;
        araba1.yili=2020;
        System.out.println("araba1.model = " + araba1.model);
        System.out.println("araba1.motorHacmi = " + araba1.motorHacmi);
        System.out.println("araba1.yili = " + araba1.yili);

    }
}

class Araba {
    String model;
    int yili;
    double motorHacmi;
}
