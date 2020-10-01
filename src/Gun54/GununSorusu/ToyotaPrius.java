/**
 * @Author:Otosun Tarih :11/08/2020
 */
package Gun54.GununSorusu;

public class ToyotaPrius extends Vehicle implements IElectric, IGas {


    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public void changeOil() {
        System.out.println("30 l yakit ile 1000 km gider");
    }

    @Override
    public String drive() {
        return "ilk 10 km elektrikli ";
    }

    @Override
    public String changeBattery() {
        return "Omur boyu batarya omru";
    }
}
