/*
Author:Otosun
Tarih :02/07/2020
*/
package Gun29;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Kullaniciya
1. Ekleme
2. Listeleme
3. Arama
4. Duzeltme
5. Cikis
secenekleri vererek username ve password ve userTipi (Mudur, calisan)olan bir Map tanimlayiniz.
Kullanicidan Secimine gore her bir islemi ayri metodda yaptirin
Mainde sadece secenekler ve metodlarin cagrilmasi olsun
 */
public class Task1 {
    public static void main(String[] args) {
        Map<String, Map<String,String>> users=new HashMap<>();

        Scanner oku=new Scanner(System.in);

        int secim=0;
        do {
            System.out.println("********Menu**************");
            System.out.println("1. Ekleme\n" +
                    "2. Listeleme\n" +
                    "3. Arama\n" +
                    "4. Duzeltme\n" +
                    "5. Cikis");
            System.out.print("Yapmak istediginiz islemi seciniz:");
            secim=oku.nextInt();
            switch (secim) {
                case 1: Ekleme(users);

                    break;
                case 2:Listeleme(users);

                    break;
                case 3:Arama(users);

                    break;
                case 4:Duzeltme(users);


                    break;
                default:

            }
        }while (secim!=5);

    }
    public static void Ekleme(Map<String, Map<String,String>> users){
        Scanner oku=new Scanner(System.in);

        System.out.print("Username=");
        String username=oku.nextLine();

        System.out.print("Password=");
        String password=oku.nextLine();

        System.out.print("userType=");
        String userTipi=oku.nextLine();

        Map<String, String> bilgilerMap = new HashMap<>();  // burada bir kartvizit gibi mape atıldı
        bilgilerMap.put("password",password);
        bilgilerMap.put("userType",userTipi);

        users.put(username, bilgilerMap); // burada kullanıcının verdiği isme kartvizit gibi bilgiler atıldı
    }
    public static void Listeleme(Map<String, Map<String,String>> users){
        {
            System.out.print("users = " + users);
        }

    }
    public static void Arama(Map<String, Map<String,String>> users){
        Scanner scr=new Scanner(System.in);
        System.out.print("username giriniz:");
        String username=scr.nextLine();

        System.out.println(users.get(username));
    }
    public static void Duzeltme(Map<String, Map<String,String>> users){
        Scanner scr=new Scanner(System.in);
        System.out.print("username giriniz:");
        String username=scr.nextLine();

        System.out.print("yeni pass giriniz:");
        String yenipass=scr.nextLine();

        System.out.print("yeni user tip giriniz:");
        String yeniusertip=scr.nextLine();




        users.get(username).put("password",yenipass);
        users.get(username).put("usertip",yeniusertip);

    }
}
