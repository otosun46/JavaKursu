/**
 * @Author:Otosun Tarih :20/07/2020
 */
package Gun41.creatingandformatting;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class JavaLocalZoneDateTime {
    public static void main(String[] args) {

        // Başka ülke veya bölgelerin saat dilimine göre zamanı alma

        // Newyork un saat dilimine saati aldım.
        ZonedDateTime zdt=ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime zdtLocal=ZonedDateTime.now();

        System.out.println("zdtLocal = " + zdtLocal);
        System.out.println("zdt = " + zdt);


//        Set<String> bolgeler=ZoneId.getAvailableZoneIds();
//
//        for (String s: bolgeler) {
//             System.out.println("s = " + s);
//        }
        DateTimeFormatter format1= DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        System.out.println("zdtLocal = " + zdtLocal.format(format1));
        System.out.println("zdt = " + zdt.format(format1));

    }
}
