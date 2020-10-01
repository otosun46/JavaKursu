/*
Author:Otosun
Tarih :11/06/2020
*/
package Gun13;

import java.util.Scanner;

//Girilen uc basamakli bir sayiyi yazi ile yazdiriniz
public class UcBasamakliSayilariYaziIleYazdirma {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("Bir sayi giriniz : ");
        int sayi = oku.nextInt();

        int birBasamagi = sayi % 10;
        int onlarBasamagi = sayi / 10 % 10;
        int yuzlerBasamagi = sayi / 100 % 10;
        String birler=null,onlar=null,yuzler=null;

        switch (birBasamagi) {

            case 1:
                birler=("bir");
                break;
            case 2:
                birler=("iki");
                break;
            case 3:
                birler=("uc");
                break;
            case 4:
                birler=("dort");
                break;
            case 5:
                birler=("bes");
                break;
            case 6:
                birler=("alti");
                break;
            case 7:
                birler=("yedi");
                break;
            case 8:
                birler=("sekiz");
                break;
            case 9:
                birler=("dokuz");
                break;
            case 0:
                birler=("");
                break;
        }
        switch (onlarBasamagi) {

            case 1:
                onlar=("on");
                break;
            case 2:
                onlar=("yirmi");
                break;
            case 3:
                onlar=("otuz");
                break;
            case 4:
                onlar=("kirk");
                break;
            case 5:
                onlar=("elli");
                break;
            case 6:
                onlar=("atmis");
                break;
            case 7:
                onlar=("yetmis");
                break;
            case 8:
                onlar=("seksen");
                break;
            case 9:
                onlar=("doksan");
                break;
            case 0:
                onlar=("");
                break;

        } switch (yuzlerBasamagi) {

            case 1:
               yuzler=("Yuz");
                break;
            case 2:
                yuzler=("Ikiyuz");
                break;
            case 3:
                yuzler=("Ucyuz");
                break;
            case 4:
                yuzler=("Dortyuz");
                break;
            case 5:
                yuzler=("Besyuz");
                break;
            case 6:
                yuzler=("Altiyuz");
                break;
            case 7:
                yuzler=("Yediyuz");
                break;
            case 8:
                yuzler=("Sekizyuz");
                break;
            case 9:
                yuzler=("Dokuzyuz");
                break;
            case 0:
                yuzler=("");
                break;
        }
        String okunus= yuzler+onlar+birler;

        System.out.println( okunus);
    }
}
