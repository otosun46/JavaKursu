/*
Author:Otosun
Tarih :23/06/2020
*/
package Gun21;

public class Odev2 {
    public static void main(String[] args) {
        int x=3;
        int y=3;
        int[][] mat1 = new int[x][y];
        int[][] mat2 = new int[x][y];
        int[][] sonuc = new int[x][y];

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                mat1[i][j] = (int) (Math.random() * 10);
                mat2[i][j] = (int) (Math.random() * 10);
                int carpim = 0;
                for (int k = 0; k < sonuc.length; k++) {
                    carpim += mat1[i][k] * mat2[k][j];
                    System.out.print(mat1[i][k] +"*"+ mat2[k][j]+" + ");
                }
                sonuc[i][j] = carpim;
                System.out.print("= "+sonuc[i][j]+"\t\t");

            }
            System.out.println("\n");
        }


        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        /*
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                int carpim = 0;
                for (int k = 0; k < sonuc.length; k++) {
                    carpim += mat1[i][k] * mat2[k][j];
                }
                sonuc[i][j] = carpim;
            }
        }
*/
        for (int k = 0; k < sonuc.length; k++) {
            for (int l = 0; l < sonuc[k].length; l++) {
                //   sonuc[k][l] = mat1[k][0] * mat2[0][l] + mat1[k][1] * mat2[1][l] + mat1[k][2] * mat2[2][l];

                System.out.print(mat1[k][0] + "*" + mat2[0][l] + " + " + mat1[k][1] + "*" + mat2[1][l] + " + "
                        + mat1[k][2] + "*" + mat2[2][l] + "= " + sonuc[k][l] + "\t\t");
            }
            System.out.println("\n");
        }
        int m, n;
        for (m = 0; m < sonuc.length; m++) {
            for (n = 0; n < sonuc[m].length; n++) {
                if (n == 0) System.out.print("| ");
                System.out.print(mat1[m][n] + " ");
                if (n == sonuc[m].length - 1) System.out.print("|");
            }
            if (m == sonuc[m].length / 2) System.out.print("\tX\t");
            else System.out.print("\t\t");
            for (n = 0; n < sonuc[m].length; n++) {
                if (n == 0) System.out.print("| ");
                System.out.print(mat2[m][n] + " ");
                if (n == sonuc[m].length - 1) System.out.print("|");
            }
            if (m == sonuc[m].length / 2) System.out.print("\t=\t");
            else System.out.print("\t\t");
            for (n = 0; n < sonuc[m].length; n++) {
                if (n == 0) System.out.print("| ");
                System.out.print(sonuc[m][n] + " ");
                if (n == sonuc[m].length - 1) System.out.print("|");
            }
            System.out.println();
        }
    }
}
