/*
Author:Otosun
Tarih :15/07/2020
*/
package Gun38.nonAccessModifier.finalModifier.example;

public class Ex1 {
    public static void main(String[] args) {
        int yaricap=4;
        double alan = yaricap *yaricap* Constants.pi;
        System.out.println("alan = " + alan);
        int gun = 23;
        int saat = 7;
        int dakika=25;
        int sonuc=gun*Constants.hourInDay*Constants.minuteInHour*Constants.secondInMinute+
                saat*Constants.minuteInHour*Constants.secondInMinute+
                dakika*Constants.secondInMinute;
        System.out.println("Sonuc = " + sonuc+" Saniye");

    }
}
