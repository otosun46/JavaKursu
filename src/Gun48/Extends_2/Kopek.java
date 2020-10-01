/**
 * @Author:Otosun Tarih :29/07/2020
 */
package Gun48.Extends_2;

public class Kopek extends Hayvan {
    public Kopek(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi); // super : superclass ı işaret eder
    }

    @Override
    public void konustu()
    {
        System.out.println("havladı...");
    }
}
