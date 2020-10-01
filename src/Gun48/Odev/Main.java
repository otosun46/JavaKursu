/**
 * @Author:Otosun Tarih :29/07/2020
 */
package Gun48.Odev;
// 1-aşağıdaki hiyerarşiye göre sınıfları olusturunuz
//Shape
//  Circle
//  Rectangle
//      Square

// 2- Türetilen sınıflardan uygun olanlarına yarıcap, uzunluk ve genislik ekleyiniz.
// 3- Her bir sınıfa consructor ekleyiniz.
// 4- Her metodun toStringini override yapınız.
// 5- Her sınıfa alan ve çevre hesaplaması metodlarını ekleyiniz.
// 6- Main de bunlardan nesne oluşturup sonuçları yazdırınız.
// 7- En üst sınıfta , türetilen sınıflarda uygun metodu olamayan sınıflar için hta mesajı ürettiriniz.
public class Main {
    public static void main(String[] args) {
        Shape sekil1 = new Shape("Sekil");
        Circle daire1 = new Circle("Daire", 12);
        Rectangle dikdortgen1 = new Rectangle("Dikdortgen", 8, 14);
        Square kare1 = new Square("Kare", 5);



            System.out.println("daire1 = " + daire1.toString());
            System.out.println("dikdortgen1 = " + dikdortgen1.toString());
            System.out.println("kare1 = " + kare1.toString());

            System.out.println("daire1 alani = " + daire1.alanHesapla());
            System.out.println("daire1 cevre = " + daire1.cevreHesapla());

            System.out.println("dikdortgen1 alani = " + dikdortgen1.alanHesapla());
            System.out.println("dikdortgen1 cevre = " + dikdortgen1.cevreHesapla());

            System.out.println("kare1 alani = " + kare1.alanHesapla());
            System.out.println("kare1 cevre = " + kare1.cevreHesapla());

            System.out.println("sekil1 alani = " + sekil1.alanHesapla());
            System.out.println("sekil1 cevre = " + sekil1.cevreHesapla());

    }
}
