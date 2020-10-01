/**
 * @Author:Otosun Tarih :10/08/2020
 */
package Gun53.Ornekler.Ornek2;
//bir interface den bir cok class implement edilebilir.
public class Grafikler {
    public static void main(String[] args) {
        Cember cember=new Cember();
        Dikdortgen dikdortgen=new Dikdortgen();

        cember.ciz();
        dikdortgen.ciz();

        ICizilebilir cember2=new Cember();
        cember2.ciz();
    }

}
