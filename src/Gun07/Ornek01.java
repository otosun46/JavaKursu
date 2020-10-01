package Gun07;

import java.util.Scanner;

public class Ornek01 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Ad soyad : ");
        String cumle = oku.nextLine();
        int ilk, ikinci;
        ilk= cumle.lastIndexOf(" ");
        



       System.out.println("Yazdiginiz cumle "+ ilk);
      //  System.out.println("Yazdiginiz kelimenin son harfi "+ ikinci );
    }
}
