/**
 * @Author:Otosun Tarih :21/07/2020
 */
package Gun42.manipulation;

import org.junit.Assert;
import org.junit.Test;


import java.time.LocalTime;

public class LocalTimeTest {

    @Test
    public void test1(){
        LocalTime simdi= LocalTime.now();
        LocalTime actual=simdi.plusHours(1).plusMinutes(1);
        //String expectHour="22";
//        System.out.println("actual = " + actual.getHour());
//        System.out.println("actual = " + actual.getMinute());


        Assert.assertEquals(22,actual.getHour());
        Assert.assertEquals(48,actual.getMinute());



    }
    @Test
    public void testMinus(){
        LocalTime simdi= LocalTime.now();
        LocalTime actual=simdi.minusHours(1).minusMinutes(1);


        Assert.assertEquals(20,actual.getHour());
     //   Assert.assertEquals(47,actual.getMinute());
    }



}
