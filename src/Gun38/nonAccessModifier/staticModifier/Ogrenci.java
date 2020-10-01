/*
Author:Otosun
Tarih :15/07/2020
*/
package Gun38.nonAccessModifier.staticModifier;

public class Ogrenci {
    String ad;
    String soyad;
    static String okulAd="Yildirim";

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
        //this.okulAd = okulAd;
    }
    void print()
    {
        System.out.println(ad+" "+soyad+" "+okulAd);
    }
}
