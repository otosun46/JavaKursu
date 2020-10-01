/**
 * @Author:Otosun Tarih :23/07/2020
 */
package Gun44.ThrowingException;

import java.util.Scanner;

public class UnchekedThrowExample {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Kullanıcı adı giriniz=");
        String username=oku.nextLine();

        if (username.length() < 6)
            System.out.println("Kullanıcı adı 6 karakterden az olamaz");

        if (username.length() > 10)
            System.out.println("Kullanıcı adı 10 karakterden büyük olamaz.");
    }
}
