package Gun51.JavaPolymorphism.Ornek2;

public class Kisi {
    private String ad;
    private String soyad;
    private String gorev;

    public Kisi(String ad, String soyad, String gorev) {
        this.ad = ad;
        this.soyad = soyad;
        this.gorev = gorev;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public void kimlikYaz()
    {
        System.out.println("============================");
        System.out.println("Ad="+ getAd());
        System.out.println("Soyad="+ getSoyad());
        System.out.println("Görev="+ getGorev());
        System.out.println("============================");
    }

}
