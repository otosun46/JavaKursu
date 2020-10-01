/**
 * @Author:Otosun Tarih :23/07/2020
 */
package Gun44.uncheckedAncheckedException;

import java.io.FileInputStream;

public class JavaCheckedException {
    public static void main(String[] args) {
        // Dosya okuma/yazma işlemi
        // bu işlemlerde hata olasılığı yüksek olduğundan
        // hata kontrolü zorunlu tutuluyor.
        // bu yüzden try-catch e alınması bu kodun zorunlu tutuluyor.
        // bu gibi surumlara karşılk gelen hatalara Checked Exception denir.

        try {
            FileInputStream file = new FileInputStream("dosya.txt");
        } catch (Exception ex) {
            System.out.println("hata yapti");
        }
    }
}
