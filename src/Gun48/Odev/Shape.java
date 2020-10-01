/**
 * @Author:Otosun Tarih :29/07/2020
 */
package Gun48.Odev;
//Sekil
public class Shape {

    String name;

    public Shape(String name) {
        this.name = name;
    }

    public double alanHesapla(){
        throw new RuntimeException("Bu sinifin bu metod ozelligi yoktur.");
    }
    public double cevreHesapla(){
        throw new RuntimeException("Bu  sinifa bu metod implemente edilmemistir.");
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}
