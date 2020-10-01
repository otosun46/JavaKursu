/*
Author:Otosun
Tarih :11/06/2020
*/
package Gun13;

import java.util.Scanner;

/*
Haftanin gunlerini yazdiriniz
Bu gunden sonraki girilen gun kadar sonraki gun haftanin hangi gunudur
*/
public class SwitchCaseHaftaninGunleriniYazdirma {
    public static void main(String[] args) {
        int gunNo;
        int buGun;
        Scanner oku = new Scanner(System.in);

            System.out.print("Gun sayisi = ");

            gunNo = oku.nextInt();
            System.out.print("Bu gun kacinci gun = ");
            buGun = oku.nextInt();
            gunNo = (gunNo+buGun-1) % 7;//modun ilk gunu 0 oldugu icin -1 yapildi


        switch (gunNo) {

            case 0:
                System.out.println("Pazartesi");
                break;
            case 1:
                System.out.println("Sali");
                break;
            case 2:
                System.out.println("Carsamba");
                break;
            case 3:
                System.out.println("Persembe");
                break;
            case 4:
                System.out.println("Cuma");
                break;
            case 5:
                System.out.println("Cumartesi");
                break;
            case 6:
                System.out.println("Pazar");
                break;

        }
    }
}
