/*
Author:Otosun
Tarih :05/06/2020
*/
package Gun10;

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        Scanner oku =new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz:");
        int sayi= oku.nextInt();

        System.out.print("ikinci sayiyi giriniz:");
        int sayi1= oku.nextInt();

        if (sayi> sayi1){
            System.out.println("Birinci sayi buyuktur");
        }
        if (sayi<sayi1){
            System.out.println("Ikinci sayi buyuktur");
        }
        if (sayi==sayi1){
            System.out.println("Iki sayi esittir");
        }


    }
}
