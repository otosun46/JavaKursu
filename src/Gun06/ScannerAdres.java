package Gun06;

import java.util.Scanner;

public class ScannerAdres {
    public static void main(String[] args) {

        Scanner oku =new Scanner(System.in);

        String il, ilce, mahalle, cadde, sokak;
        int postaKodu;
        System.out.print("Oturdugunuz ili giriniz: ");
        il =oku.nextLine();
        System.out.print("Ilceyi giriniz: ");
        ilce =oku.nextLine();
        System.out.print("Mahalleyi giriniz: ");
        mahalle =oku.nextLine();
        System.out.print("Caddeyi giriniz: ");
        cadde =oku.nextLine();
        System.out.print("Sokak giriniz: ");
        sokak =oku.nextLine();
        System.out.print("Posta kodunu giriniz: ");
        postaKodu=oku.nextInt();

        System.out.println(mahalle+" "+ cadde + " " + sokak);
        System.out.println(postaKodu+ " "+ ilce+ "/ " + il);
    }
}
