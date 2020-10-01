/**
 * @Author:Otosun Tarih :10/08/2020
 */
package Gun53.Ornekler.Ornek3;

public class A4 implements IGosterilebilir,IYazdirilabilir{
    @Override
    public void goster() {
        System.out.println("gosterildi...");
    }

    @Override
    public void yaz() {
        System.out.println("yazdirildi...");
    }
}
