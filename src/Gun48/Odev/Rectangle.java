/**
 * @Author:Otosun Tarih :29/07/2020
 */
package Gun48.Odev;
//Dikdortgen
public class Rectangle extends Shape{

    private double uzunluk;
    private double genislik;


    public Rectangle(String name) {
        super(name);
    }

    public Rectangle(String name, double uzunluk, double genislik) {
        super(name);
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }
    @Override
    public double alanHesapla(){
        return uzunluk*genislik;
    }
    @Override
    public double cevreHesapla(){
        return 2*(uzunluk+genislik);
    }

    @Override
    public String toString() {
        return "Rectangle{name=" + name + '\''+
                "Alan=" + alanHesapla() +
                ", Cevre=" +cevreHesapla() +
                +
                '}';
    }
}
