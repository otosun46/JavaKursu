/**
 * @Author:Otosun Tarih :12/08/2020
 */
package Gun54.Odev2;

public class TxtFile implements IReadFile {
    @Override
    public String open() {
        return "opening.txt";
    }

    @Override
    public String read() {
        return "readeng.txt";
    }

    @Override
    public String save() {
        return "saving.txt";
    }

    @Override
    public String close() {
        return "closing.txt";
    }
}
