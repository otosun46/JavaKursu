/**
 * @Author:Otosun Tarih :12/08/2020
 */
package Gun54.Odev2;

public class FiliMain {
    public static void main(String[] args) {
        TxtFile txtFile =new TxtFile();
        PowerPointFile powerPointFile=new PowerPointFile();
        DGMFile dgmFile=new DGMFile();
        EXEFile exeFile=new EXEFile();

        System.out.println(txtFile.open());
        System.out.println(txtFile.read());
        System.out.println(txtFile.save());
        System.out.println(txtFile.close());
        System.out.println();
        System.out.println(powerPointFile.open());
        System.out.println(powerPointFile.read());
        System.out.println(powerPointFile.save());
        System.out.println(powerPointFile.close());
        System.out.println();
        System.out.println(dgmFile.open());
        System.out.println(dgmFile.read());
        System.out.println(dgmFile.save());
        System.out.println(dgmFile.close());
        System.out.println();
        System.out.println(exeFile.open());
        System.out.println(exeFile.read());
        System.out.println(exeFile.save());
        System.out.println(exeFile.close());


    }
}
