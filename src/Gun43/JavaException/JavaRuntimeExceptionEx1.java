/**
 * @Author:Otosun Tarih :22/07/2020
 */
package Gun43.JavaException;

import java.util.Scanner;

public class JavaRuntimeExceptionEx1 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("1.Sayıyı giriniz=");
        int a=oku.nextInt();

        System.out.print("2.Sayıyı giriniz=");
        int b=oku.nextInt();

        System.out.println("a/b = " + a/b);
    }
}
