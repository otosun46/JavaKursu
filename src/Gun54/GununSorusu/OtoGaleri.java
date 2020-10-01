/**
 * @Author:Otosun Tarih :11/08/2020
 */
package Gun54.GununSorusu;


import java.util.ArrayList;

public class OtoGaleri {
    public static void main(String[] args) {
        TeslaCar tesla = new TeslaCar("tesla S", 310);
        ToyotaPrius prius = new ToyotaPrius("Prius", 250);
        Bus bus = new Bus("Maraton", 8000);

        System.out.println(tesla.drive());
        System.out.println(prius.drive());
        System.out.println(bus.drive());


        IElectric.autoPilot();
        tesla.printOto();


        ArrayList<Vehicle> arabalar = new ArrayList();
        arabalar.add(tesla);
        arabalar.add(prius);
        arabalar.add(bus);
        for (Vehicle araba : arabalar) {
            System.out.println("ClassName: " + araba.getClass().getSimpleName());
        }


    }
}





