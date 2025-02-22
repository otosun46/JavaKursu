/**
 * @Author:Otosun Tarih :12/08/2020
 */
package Gun55.Ornekler.Ornek1;
// abstract anahtar kelimesi ile abstract class oluşturmuş oluyoruz.
public abstract class BinekOto {
    private String marka;
    private int uretimYili;
    private int vitesAdedi;

    // implemente edilmek zorunda
    public abstract String getMarka();

    // ister override yapılabilir,
    // istenirse yapılmayabilir.
    public int getUretimYili()
    {
        return this.uretimYili;
    }

    public void setUretimYili(int uretimYili){
        this.uretimYili=uretimYili;

    }

}