/*
Author:Otosun
Tarih :12/06/2020
*/
package Gun14;

/*
Bir çalışanın başlangıç maaşı 2000 tl olsun.
Her yıl %15 zam yapılırsa, 5 yıl sonra çalışanın maaşı kaç lira olur.
 */
public class GununSorusu05 {
    public static void main(String[] args) {
        int sayac = 1;
        int maas = 2000;
        int yil = 5;
        int zamMiktari = 15;

        while (sayac <= yil) {
            maas = (int) (maas + maas * zamMiktari / 100);
            sayac++;
        }
        System.out.println("Calisanin " + yil + " yil sonraki zamli maasi " + maas + " tl dir.");
    }
}
