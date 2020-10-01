/*
Author:Otosun
Tarih :14/07/2020
*/
package Gun37.instanceModifiers.protectedModifier.same;

public class Hospital {
    public static void main(String[] args) {
        Doctor dr = new Doctor();
        dr.name = "Ahmet";
        dr.print();

        Doctor dr2 = new Doctor("Ayse");

    }
}
