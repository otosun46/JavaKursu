package Gun06;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        double boy;
        double kilo;
        System.out.print("Boyunuzu giriniz (Orn:1.72) : ");
        boy = oku.nextDouble();

        System.out.print("Kilonuzu giriniz (Orn:77.5) : ");
        kilo = oku.nextDouble();

        System.out.println("Boyunuz: "+ boy+" m. Kilonuz: "+ kilo+" kg.");
    }
}
