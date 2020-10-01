/*
Author:Otosun
Tarih :12/06/2020
*/
package Gun14;

import java.util.Scanner;

/*
Bilgisayar 0-10 arası sayı tutsun(Random).
Kullanıcıdan en fazla 3 hak vererek sayıyı bulmasını isteyiniz.
Bulduğunda tebrikler yazsın.

 */
public class GununSorusu02 {

    public static void main(String[] args) {
        int sayiRandom=0;
        int sayacDeneme = 1;
        Scanner oku = new Scanner(System.in);
        sayiRandom = (int)(Math.random()*10+1);
        System.out.println("0-10 arasinda tutulan bir sayiyi tahmin ediniz!");
        System.out.println("***********************************************");
        while (sayacDeneme <=3) {
            System.out.print(sayacDeneme+". tahmininizi giriniz: ");
            int tahmin= oku.nextInt();
            if (sayiRandom== tahmin){
                System.out.println("Tebrikler");
                break;
            }
            else{
                System.out.println("Yanlis tahmin. Kalan hakkiniz: "+(3-sayacDeneme));
            }
           sayacDeneme++;
        }
        System.out.println("Rasgele sayi: "+sayiRandom);

    }
}