/*
Author:Otosun
Tarih :12/06/2020
*/
package Gun14;

import java.util.Scanner;

/*
Girilen 10 adet sayıdan tek olanları ve çift olanların miktarlarını ayrı ayrı bularak yazdırınız.
 */
public class GununSorusu01 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int sayac = 1;
        System.out.println("Toplam 10 adet sayi gireceksiniz.\n");
        int tekSayi = 0;
        int ciftSayi = 0;

        while (sayac <= 10) {
            System.out.print(sayac + ". sayiyi giriniz:");
            int sayi = oku.nextInt();
            if (sayi % 2 == 0)
                ciftSayi++;
            else
                tekSayi++;

            sayac++;
        }
        System.out.println("Tek sayi miktari = " + tekSayi);
        System.out.println("Cift sayi miktari = " + ciftSayi);

    }
}
