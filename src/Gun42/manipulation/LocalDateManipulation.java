/**
 * @Author:Otosun Tarih :21/07/2020
 */
package Gun42.manipulation;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LocalDateManipulation {
    /**
     * testPlus adında bir test metodu yazınız. Bugünün tarihi alınız. Daha Sonra 1 gün, 1 Ay ve 1 yıl ekleyerek
     *  2. bir tarih oluşturup, bu tarihin sonucunu Assert ile kontrol ediniz.
     */
    @Test
    public void testPlus(){
        LocalDate buGun=LocalDate.now();
        LocalDate actual=buGun.plusDays(1).plusMonths(1).plusYears(1);
      //  System.out.println("actual = " + actual);
        String expect="2021-08-22";


        Assert.assertEquals("2021-08-22",actual.toString());
    }

    /**
     * testMinus adında bir test metodu yazınız. Bugünün tarihi alınız. Daha Sonra 1 gün, 1 Ay ve 1 yıl çıkartarak
     * 2. bir tarih oluşturup, bu tarihin sonucunu Assert ile kontrol ediniz.
     */
    @Test
    public void TestMinus(){
        LocalDate buGun=LocalDate.now();
        LocalDate actual=buGun.minusDays(1).minusMonths(1).minusYears(1);
        String expect="2019-06-20";

        Assert.assertEquals("2019-06-20",actual.toString());
    }
}
