package Gun54.GununSorusu;

public interface IElectric extends IVehicle{
    final static int batteryLife=100;

    String changeBattery();

    default void printOto(){
        System.out.println("default belirteciyle metod yazilabilir");
    }
    static void autoPilot(){
        System.out.println("otonom surus modu");
    }
}
