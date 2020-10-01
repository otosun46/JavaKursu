/*
Author:Otosun
Tarih :08/06/2020
*/
package Gun11;

import java.util.Scanner;

public class ifElseLogic1 {

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("Bir parola giriniz: ");

        String str = oku.nextLine();

        if (str.length() >= 8 && !str.contains("pass") && str.length() <= 12)
            System.out.println("Parolaniz uygundur");
        else System.out.println("Parolaniz uygun degildir");
    }
}
