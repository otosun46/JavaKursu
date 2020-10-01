package Gun08;

import java.util.Scanner;

/*
1- Girilen 2 veya 3 kelimeli ad ve soyadların ilk harflerinin
hepsini küçük ve daha sonra büyük hallerini yazdırınız.
2- Girilen bir string içinde bir kelime arayınız, büyük harf veya küçük harf de olsa aranan kelimede bulsun
3-Girilen bir stringdeki bütün boşluk karakterlerini _ ile değiştiriniz.
4- Kullanıcdan alacağını şifreniz sizin sabit belirlediğiniz şifre ile aynı olup olmadığını , büyük küçük harf ayırımı olmadan kontrol ederek sonucu yazdırınız
String Metodlar  için Ödevleriniz yayında
* */

public class OdevMaster {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("Isminizi giriniz : ");
        String isim = oku.nextLine();
        System.out.println(isim.toLowerCase());
        int birinciBosluk= isim.indexOf(" ");
        int ikinciBosluk= isim.lastIndexOf(" ");
        System.out.println(birinciBosluk+"  "+ikinciBosluk);
       // System.out.println(isim.);
    }
}
