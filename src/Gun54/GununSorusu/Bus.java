/**
 * @Author:Otosun Tarih :11/08/2020
 */
package Gun54.GununSorusu;

public class Bus extends Vehicle implements IDiesel{
    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public void changeDiesel() {
        System.out.println("Dolu depo ile 1000 km. gider.");
    }

    @Override
    public String drive() {
        return "yavas surus, yolculari rahatsiz etmeme";
    }
}
