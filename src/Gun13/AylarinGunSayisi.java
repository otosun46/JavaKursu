/*
Author:Otosun
Tarih :11/06/2020
*/
package Gun13;

import java.util.Scanner;

public class AylarinGunSayisi {
    public static void main(String[] args) {
        int donguSayisi=5;
        while(donguSayisi>0){

donguSayisi--;
        Scanner oku = new Scanner(System.in);

        System.out.print("Hangi ay? : ");
        int sayi = oku.nextInt();

        int gunSayisi=0;

        String ay=null;

        switch (sayi) {

            case 1:
               gunSayisi=31;
               ay="Ocak";
                break;
            case 2:
                gunSayisi=28;
                ay="Subat";
                break;
            case 3:
                gunSayisi=31;
                ay="Mart";
                break;
            case 4:
                gunSayisi=30;
                ay="Nisan";
                break;
            case 5:
                gunSayisi=31;
                ay="Mayis";
                break;
            case 6:
                gunSayisi=30;
                ay="Haziran";
                break;
            case 7:
                gunSayisi=31;
                ay="Temmuz";
                break;
            case 8:
                gunSayisi=31;
                ay="Agustos";
                break;
            case 9:
                gunSayisi=30;
                ay="Eylul";
                break;
            case 10:
                gunSayisi=31;
                ay="Ekim";
                break;
            case 11:
                gunSayisi=30;
                ay="Kasim";
                break;
            case 12:
                gunSayisi=31;
                ay="Aralik";
                break;
        }
      /*
 switch (sayi){
     case 1:
     case 3:
     case 5:
     case 7:
     case 8:
     case 10:
     case 12: gunSayisi=31;break;
     case 4:
     case 6:
     case 9:
     case 11: gunSayisi=30; break;
     case 2:{
         System.out.print("Yil: ");
         int yil= oku.nextInt();
         if (yil%4==0) gunSayisi=29;
         else gunSayisi=28;
         break;
     }


 }*/
        System.out.println(ay+" ayi "+gunSayisi+" gundur.");
       // System.out.println("Gun sayisi: "+gunSayisi);
    }
    }
}
