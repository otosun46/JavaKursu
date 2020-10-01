/*
Author:Otosun
Tarih :23/06/2020
*/
package Gun21;

public class deneOdev {
    public static void main(String[] args) {
int[][]matris1={{1,2,3},{4,5,6},{7,8,9}};
        int[][]matris2={{9,8,7},{6,5,4},{3,2,1}};
        int[][]matrisCarpim=new int[3][3];
        int m, n;
        for (m = 0; m < 3; m++) {
            for (n = 0; n < 3; n++) {
                if (n == 0) System.out.print("| ");
                System.out.print(matris1[m][n] + " ");
                if (n == 2) System.out.print("|");
            }
            if (m == 1) System.out.print("\tX\t");
            else System.out.print("\t\t");
            for (n = 0; n < 3; n++) {
                if (n == 0) System.out.print("| ");
                System.out.print(matris2[m][n] + " ");
                if (n == 2) System.out.print("|");
            }
            if (m == 1) System.out.print("\t=\t");
            else System.out.print("\t\t");
            for (n = 0; n < 3; n++) {
                if (n == 0) System.out.print("| ");
                System.out.print(matrisCarpim[m][n] + " ");
                if (n == 2) System.out.print("|");
            }
        }
    }
}
