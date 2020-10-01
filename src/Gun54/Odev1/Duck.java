/**
 * @Author:Otosun Tarih :12/08/2020
 */
package Gun54.Odev1;

public class Duck implements ISailing,IFyling{
    @Override
    public String fyling() {
        return "Ordek ucuyor";
    }

    @Override
    public String sailing() {
        return "Ordek yuzuyor";
    }

    @Override
    public String food() {
        return "Ordek besleniyor";
    }
}
