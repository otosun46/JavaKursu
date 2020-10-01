/*
Author:Otosun
Tarih :08/06/2020
*/
package Gun11;

import java.util.Scanner;

public class ifElse1 {
    public static void main(String[] args) {
/*   System.out.print("Vize nutunu giriniz: ");
        double vize = oku.nextDouble();
        System.out.print("Vize nutunu giriniz: ");
        double finalNotu = oku.nextDouble();

        double ortalama= vize*0.40+finalNotu*0.60*/
        Scanner oku = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi=oku.nextInt();
        if (sayi%2==0) System.out.println("Sayi cifttir/");
        else System.out.println("Sayi tektir");


    }
}
