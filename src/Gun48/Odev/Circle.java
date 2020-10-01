/*
 * @Author:Otosun Tarih :29/07/2020
 */
package Gun48.Odev;
//Daire
public class Circle extends Shape {
   private double yariCap;

    public Circle(String name) {
        super(name);
    }

    public Circle(String name, double yariCap) {
        super(name);
        this.yariCap = yariCap;
    }
    @Override
    public double cevreHesapla(){
        return 2*Math.PI*yariCap;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                "yariCap=" + yariCap +
                " cevre  ="+cevreHesapla()+

                '}';
    }
}
