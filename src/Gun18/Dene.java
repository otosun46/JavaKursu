/*
Author:Otosun
Tarih :17/06/2020
*/
package Gun18;

import java.util.Scanner;

public class Dene {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] dizi1 = new int[5];
        int toplam= 0;
        for(int i=0; i<dizi1.length; i++){
            System.out.print("Bir sayı giriniz: ");
            dizi1[i] = sc.nextInt();
            toplam=toplam+dizi1[i];
        }
        int buyuk=0;
        int ort = toplam / dizi1.length;
        for(int i=0; i<dizi1.length; i++){
            if(ort < dizi1[i])
                buyuk++;}

        System.out.println("buyuk = " + buyuk);
    }
}
