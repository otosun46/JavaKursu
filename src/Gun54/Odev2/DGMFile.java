/**
 * @Author:Otosun Tarih :12/08/2020
 */
package Gun54.Odev2;

public class DGMFile implements IReadFile{
    @Override
    public String open() {
        return "opening.dgm";
    }

    @Override
    public String read() {
        return "reading.dgm";
    }

    @Override
    public String save() {
        return "saving.dgm";
    }

    @Override
    public String close() {
        return "closing.dgm";
    }
}
