/**
 * @Author:Otosun Tarih :29/07/2020
 */
package Gun48.Extends_3;

public class Firma {
    public static void main(String[] args) {
        Calisan calisan1=new Calisan("Mehmet", 2000, 2);
        System.out.println("calisan1.toString() = " + calisan1.toString());
        System.out.println("calisan1.maasHesapla() = " + calisan1.maasHesapla());

        GenelMudur gm=new GenelMudur("Ayşe",6000, 2, 3);
        System.out.println("gm.toString() = " + gm.toString());
        System.out.println("gm.maasHesapla() = " + gm.maasHesapla());
    }
}