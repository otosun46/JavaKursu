package Gun08;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        String isim;

        System.out.println("Isminizi giriniz : ");
        isim = oku.nextLine();

        char ilkHarf= isim.charAt(0);
        char ikinciIlkHarf= isim.charAt(isim.indexOf(" ")+1);
        char ucuncuIlkHarf = isim.charAt(isim.lastIndexOf(" ")+1);
        System.out.println(ilkHarf+"."+ikinciIlkHarf+"."+ucuncuIlkHarf);
    }
}
