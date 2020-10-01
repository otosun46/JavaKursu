/**
 * @Author:Otosun Tarih :28/07/2020
 */
package Gun47.task1;

import java.util.ArrayList;

public class Okul {
    private String okulad;
    private int maxOgrenciSayisi;
    private ArrayList<Ogrenci> ogrencileri;

    public Okul() {

    }

    public Okul(String okulad, int maxOgrenciSayisi) {
        setOkulad(okulad);
        setMaxOgrenciSayisi(maxOgrenciSayisi);
        setOgrencileri(ogrencileri);
    }

    public String getOkulad() {
        return okulad;
    }

    public void setOkulad(String okulad) {
        this.okulad = okulad;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public ArrayList<Ogrenci> getOgrencileri() {
        return ogrencileri;
    }

    public void setOgrencileri(ArrayList<Ogrenci> ogrencileri) {
        this.ogrencileri = ogrencileri;
    }
}
