/**
 * @Author:Otosun Tarih :27/07/2020
 */
package Gun46.example.ex1;

public class Kisi {
    String ad;
    String soyad;
   private int yas;
    // setter method
    public void setYas(int yas)
    {
        this.yas = Math.abs(yas);

        // 2.yöntem
//        if (yas > 0 ) {
//            this.yas = yas;
//        }
//        else
//        {
//            this.yas = -yas;
//        }
    }

    // getter method
    public int getYas()
    {
        return this.yas;
    }
}
