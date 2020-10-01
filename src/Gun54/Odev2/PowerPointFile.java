/**
 * @Author:Otosun Tarih :12/08/2020
 */
package Gun54.Odev2;

public class PowerPointFile implements IReadFile{
    @Override
    public String open() {
        return "opening.ppt";
    }

    @Override
    public String read() {
        return "readeng.ppt";
    }

    @Override
    public String save() {
        return "saving.ppt";
    }

    @Override
    public String close() {
        return "closing.ppt";
    }
}
