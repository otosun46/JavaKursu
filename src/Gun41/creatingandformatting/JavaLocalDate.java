/**
 * @Author:Otosun Tarih :20/07/2020
 */
package Gun41.creatingandformatting;

import Gun39.JavaEnum.Ex4.Months;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class JavaLocalDate {
    public static void main(String[] args) {
        LocalDate myDate1=LocalDate.now();
        LocalDate myDate2=LocalDate.of(2019,7,20);
        LocalDate myDate3=LocalDate.of(2019, Month.JULY,20);

        System.out.println("date1.getYear() = " + myDate1.getYear());
        System.out.println("date1.getMonth() = " + myDate1.getMonth());
        System.out.println("date1.getMonthValue() = " + myDate1.getMonthValue());
        System.out.println("date1.getDayOfMonth() = " + myDate1.getDayOfMonth());
        System.out.println("date1.getDayOfWeek() = " + myDate1.getDayOfWeek());
        System.out.println("date1.getDayOfYear() = " + myDate1.getDayOfYear());



        DateTimeFormatter format1= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("date1.format(format1) = " + myDate1.format(format1));

        System.out.println("SHORT Date = " + myDate1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM Date = " + myDate1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG Date = " + myDate1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL Date = " + myDate1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));
        // yukarıda lokalizasyon yaptık

        // Sistemde kullanılabilir lokalleri aşağıdaki kod ile aldık, norveç için if e bağladık
        Locale[] kullanilabilirLokaller = Locale.getAvailableLocales();

        for(Locale l: kullanilabilirLokaller)
        {
            if (l.getDisplayCountry().toLowerCase().contains("isve"))
                System.out.println("l = " + l+ " "+ l.getDisplayCountry());
        }

        // Aşağıda Isvece göre , lokalizasyon sonucunda göre var zamanın Norveç dilindeki gösterimi oldu.
        Locale localeIsvec = new Locale("sv", "SE");
        System.out.println("FULL Date Isvec = " + myDate1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(localeIsvec)));

    }
}
