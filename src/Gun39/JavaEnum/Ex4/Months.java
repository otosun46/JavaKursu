/*
Author:Otosun
Tarih :16/07/2020
*/
package Gun39.JavaEnum.Ex4;

public enum Months {

    OCAK(31,10),
    SUBAT(28,12),
    MART(31,15),
    NISAN(30,20),
    MAYIS(31,25),
    HAZIRAN(30,26),
    TEMMUZ(31,30),
    AGUSTOS(31,29),
    EYLUL(30,27),
    EKIM(31,25),
    KASIM(30,18),
    ARALIK(31,12);
    int days;
    int sicaklik;
    // bu bölüm atama yapıldığı zaman çalışıyor
    Months(int gunMiktari,int sicaklik){
        days=gunMiktari;
        this.sicaklik=sicaklik;
    }

    void getGunMiktari()
    {
        System.out.println("days = " + days+" sicaklik "+sicaklik);
    }
}
