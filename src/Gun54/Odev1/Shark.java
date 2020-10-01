/**
 * @Author:Otosun Tarih :12/08/2020
 */
package Gun54.Odev1;

public class Shark implements ISailing {
    @Override
    public String sailing() {
        return "Shark is sailing";
    }

    @Override
    public String food() {
        return "Kopekbaligi besleniyor.";
    }
}
