/**
 * @Author:Otosun Tarih :12/08/2020
 */
package Gun55.Ornekler.Ornek1;
public class ford extends BinekOto {

    //abstract metod olduğundan zorunlu olarak
    // yazılmak zorunda (imlemente edildi.)
    @Override
    public String getMarka() {
        return "Ford Focus";
    }


    //abstract class daki yazılmış somut metodları
    // ister olduğu gibi kullanabiliriz.
    // istenirse override yapabiliriz.
    @Override
    public int getUretimYili() {
        System.out.println(super.getUretimYili());
        return super.getUretimYili();
    }
}