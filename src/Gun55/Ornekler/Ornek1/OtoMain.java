/**
 * @Author:Otosun Tarih :12/08/2020
 */
package Gun55.Ornekler.Ornek1;

public class OtoMain {
    public static void main(String[] args) {
        ford ford1 = new ford();
        ford1.setUretimYili(2020);
        System.out.println(ford1.getMarka());
        ford1.getUretimYili();
    }
}