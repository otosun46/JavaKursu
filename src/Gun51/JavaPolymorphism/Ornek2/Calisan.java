package Gun51.JavaPolymorphism.Ornek2;

public class Calisan extends Kisi{
    private String departman;

    public Calisan(String ad, String soyad, String gorev, String departman) {
        super(ad, soyad, gorev);
        this.departman = departman;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    @Override
    public void kimlikYaz()
    {
        System.out.println("============================");
        System.out.println("Ad="+ getAd());
        System.out.println("Soyad="+ getSoyad());
        System.out.println("Görev="+ getGorev());
        System.out.println("Departman="+getDepartman());
        System.out.println("============================");
    }
}
