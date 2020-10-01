package Gun08;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir string yaziniz : ");
        String text = oku.nextLine();
        text= text.toLowerCase();

        System.out.print("Aranan kelime: ");
        String kelime = oku.next();
        kelime= kelime.toLowerCase();
        boolean varMi = text.contains(kelime);

        System.out.println(varMi);
    }
}
