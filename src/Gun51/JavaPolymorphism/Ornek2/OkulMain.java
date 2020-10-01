package Gun51.JavaPolymorphism.Ornek2;

public class OkulMain {
    public static void main(String[] args) {
        Kisi ogr1=new Ogrenci("Özal", "Soyad", "öğrenci", "4a");
        Kisi cal1=new Calisan("Faruk", "Soyad", "öğretmen", "eğitim");

        ogr1.kimlikYaz();
        cal1.kimlikYaz();
    }
}
