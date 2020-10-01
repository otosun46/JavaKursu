/**
 * @Author:Otosun Tarih :29/07/2020
 */
package Gun48.Extends_3;

public class Calisan {
    private String isim;
    protected double maas; // bu sınıftan türetilenler ulaşabilir
    int maasKatsayisi;

    public Calisan(String ismi, double maas, int maasKatsayisi) {
        this.isim = ismi;
        this.maas = maas;
        this.maasKatsayisi = maasKatsayisi;
    }

    public double maasHesapla()
    {
        return this.maas* this.maasKatsayisi;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "ismi='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatsayisi=" + maasKatsayisi +
                '}';
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}