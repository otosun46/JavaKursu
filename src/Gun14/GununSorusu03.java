/*
Author:Otosun
Tarih :12/06/2020
*/
package Gun14;

import java.util.Scanner;

/*
Girilen 5 sayının toplamını ekrana yazdırınız.
 */
public class GununSorusu03 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int toplam=0;
        int sayacSayi=1;
        System.out.println("Girilen 5 sayının toplamını ekrana yazdırılacaktir");
        System.out.println("**************************************************");
        while (sayacSayi<=5){
            System.out.print(sayacSayi+". sayiyi giriniz: ");
            int sayi=oku.nextInt();
            toplam=toplam+sayi;
            sayacSayi++;
        }
        System.out.println("Girilen sayilarin toplami= "+toplam);
    }

}
