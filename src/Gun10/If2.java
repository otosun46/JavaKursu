/*
Author:Otosun
Tarih :05/06/2020
*/
package Gun10;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        Scanner oku =new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int sayi1= oku.nextInt();


        if (sayi1 %10 ==0){
            System.out.println("Sifir");
        }
        if (sayi1 %10 ==1){
            System.out.println("Bir");
        }
        if (sayi1 %10 ==2){
            System.out.println("Iki");
        }
        if (sayi1 %10 ==3){
            System.out.println("Uc");
        }
        if (sayi1 %10 ==4){
            System.out.println("Dort");
        }
        if (sayi1 %10 ==5){
            System.out.println("Bes");
        }
        if (sayi1 %10 ==6){
            System.out.println("Alti");
        }
        if (sayi1 %10 ==7){
            System.out.println("Yedi");
            }
        if (sayi1 %10 ==8){
            System.out.println("Sekiz");
            }
        if (sayi1 %10 ==9){
            System.out.println("Dokuz");
            }



    }
}
