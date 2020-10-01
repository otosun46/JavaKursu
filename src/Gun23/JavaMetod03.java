/*
Author:Otosun
Tarih :24/06/2020
*/
package Gun23;

import java.util.Scanner;

/*
        //Kullanıcı bir öğretmendir.
        // Önce ögrencının adı gırılecek,sonra aldıgı farklı mıktardakı notlar gırılecek
        // Ahmet Demir bu okunduktan sonra
        // 80 56 78 90 okutulacak ve ogrencı adı ve ortalaması yazılacak ekrana
        // Ortalama bulma ıslemını bır fonksıyonda yapınız,fakat sonucu yazdırma ıslemını maınde yaptırınız
        //Her ogrencıye farklı sayıda not gırılebılır

 */
public class JavaMetod03 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Öğrencinin Adı Soyadı=");
        String isim=oku.nextLine();

        System.out.print("Öğrencinin notları=");
        String strNotlar=oku.nextLine(); // 60 40 70 80

        System.out.println("Öğrenci = " + isim);
        System.out.println("Ortalaması = " + ortalamaBul(strNotlar));
    }

    public static double ortalamaBul(String notlar)
    {
        double toplam=0;
        String[] notDizi=notlar.split(" ");

        for(int i=0;i<notDizi.length;i++)
        {
            toplam += Integer.parseInt(notDizi[i]);
        }

        return toplam/notDizi.length;
    }


}

