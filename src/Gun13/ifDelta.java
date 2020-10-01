/*
Author:Otosun
Tarih :11/06/2020
*/
package Gun13;

import java.util.Scanner;

public class ifDelta {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        int a,b,c;
        System.out.print("a= ");
        a=oku.nextInt();
        System.out.print("b= ");
        b=oku.nextInt();
        System.out.print("c= ");
        c=oku.nextInt();

        int delta= b*b-4*a*c;
        if (delta>0) {

            System.out.println( "x1= "+ (-b+ Math.sqrt(delta))/2*a);
            System.out.println( "x2= "+ (-b- Math.sqrt(delta))/2*a);
        }
        else if (delta==0 ){

            System.out.println("x= "+( -b/2*a));
        }
        else System.out.println("Kok yoktur.");
    }
}
