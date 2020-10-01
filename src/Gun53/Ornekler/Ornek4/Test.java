/**
 * @Author:Otosun Tarih :10/08/2020
 */
package Gun53.Ornekler.Ornek4;

public class Test implements IGoster, IYazdir {
    @Override
    public void yaz() {
        System.out.println("goster yaz...");
    }

    @Override
    public void goster() {
        System.out.println("goster...");
    }
}
