/**
 * @Author:Otosun Tarih :11/08/2020
 */
package Gun54.GununSorusu;

public class TeslaCar extends Vehicle implements IElectric {

    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
    return "10 yil batarya omru";
    }

    @Override
    public String drive() {
        return "Hizli surus, otopilot ";
    }
}
