/**
 * @Author:Otosun Tarih :29/07/2020
 */
package Gun48.Extends_2;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        Hayvan hayvan=new Hayvan("yok",0, "Genel");
        hayvan.konustu();

        Kopek kopek1=new Kopek("beyaz", 10, "köpek");
        kopek1.konustu();

        Kus kus1=new Kus("gri",1, "Kuş");
        kus1.konustu();
    }
}
