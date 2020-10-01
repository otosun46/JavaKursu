/**
 * @Author:Otosun Tarih :23/07/2020
 */
package Gun44.MultiCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaMultiCatch {
    public static void main(String[] args) {
        // Kullanıcıdan 5 kez 2 adet sayı alınız ve bölüm sonucunu ekranda gösteriniz.
        for (int i = 0; i < 3; i++) {

            try {
                System.out.print("1.Sayıyı giriniz=");
                Scanner oku = new Scanner(System.in);
                int a = oku.nextInt();

                System.out.print("2.Sayıyı giriniz=");
                Scanner oku2 = new Scanner(System.in);
                int b = oku2.nextInt();

                int c = a / b;
                System.out.println("c = " + c);
            } catch (ArithmeticException hata) { // oluşan hataya ilşkin bir catch var ise önce oraya düşer
                System.out.print("hata oldu : ");
                System.out.println("2.Sayıyı 0 vermeyiniz.");
                i--;
            } catch (InputMismatchException hata) { // buraya üstteki hataya düşmezse düşer
                System.out.print("hata oldu");
                System.out.println("Lütfen sayı giriniz.");
                i--;
            }
        }
    }
}
