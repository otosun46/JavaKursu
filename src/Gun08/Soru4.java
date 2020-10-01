package Gun08;

import java.util.Scanner;

public class Soru4 {

    public static void main(String[] args) {

        while (true){


        Scanner oku = new Scanner(System.in);

        System.out.print("Bir string giriniz : ");
        String text = oku.nextLine();

        boolean boslukVarMi = text.contains(" ");

        System.out.println("boslukVarMi = " + boslukVarMi);

        boolean bosMu = text.isEmpty();
        System.out.println("bosMu = " + bosMu);
        }
    }
}
