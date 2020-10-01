package Gun06;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);

        int sayi1, sayi2,toplam;
        System.out.print("1. sayiyi giriniz: ");
        sayi1= oku.nextInt();
        System.out.print("2. sayiyi giriniz: ");
        sayi2= oku.nextInt();
        toplam= sayi1+sayi2;

        System.out.println("Toplam: "+ toplam);


    }
}
