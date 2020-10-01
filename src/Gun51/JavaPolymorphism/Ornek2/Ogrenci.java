package Gun51.JavaPolymorphism.Ornek2;

public class Ogrenci extends Kisi{
    private String sube;

    public Ogrenci(String ad, String soyad, String gorev, String sube) {
        super(ad, soyad, gorev);
        this.sube = sube;
    }

    public String getSube() {
        return sube;
    }

    public void setSube(String sube) {
        this.sube = sube;
    }

    @Override
    public void kimlikYaz()
    {
        System.out.println("============================");
        System.out.println("Ad="+ getAd());
        System.out.println("Soyad="+ getSoyad());
        System.out.println("Görev="+ getGorev());
        System.out.println("Sube="+getSube());
        System.out.println("============================");
    }
}
