/**
 * @Author:Otosun Tarih :30/07/2020
 */
package Gun49.task2.paket2;

import Gun49.task2.paket1.pak1Hayvan;

public class pak2Kedi extends pak1Hayvan {

    public pak2Kedi(String ad, String cinsi) {
        super.ad = ad;
        super.cinsi =cinsi;
    }

    public void BilgiYaz()
    {
        System.out.println("super.ad = " + super.ad);
        System.out.println("super.cinsi = " + super.cinsi);
    }

}
