/**
 * @Author:Otosun Tarih :29/07/2020
 */
package Gun48.Extends_2;

public class Kus extends Hayvan{
    public Kus(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void konustu() {
        System.out.println("öttü...");
    }
}
