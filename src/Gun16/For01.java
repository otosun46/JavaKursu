/*
Author:Otosun
Tarih :15/06/2020
*/
package Gun16;

import java.util.Scanner;

public class For01 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayi giriniz");
        int i;
        int toplam=0;
        int b=oku.nextInt();
        for (i=0; i<b; i++){
            toplam+=i;
            System.out.println(i);
        }
        System.out.println("toplam:"+toplam);

    }
}
