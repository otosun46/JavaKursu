/*
Author:Otosun
Tarih :23/06/2020
*/
package Gun21;
/*
Günün Sorusu :  3x3 lük 2 matrisi random (0-9 arası) doldurup,
çarpımını ekrana yan yana yani 1.matris x 2.matris = sonuç matrisi şeklind eyazdırınız
 */
/*
Burada matris çarpma işlemi şöyledir:

{\displaystyle \mathbf {AB} ={\begin{pmatrix}a&b&c\
\p&q&r\\u&v&w\end{pmatrix}}{\begin{pmatrix}\alpha &\beta &\gamma \\\lambda &\mu &\nu \\\rho &\sigma &\tau \\\end{pmatrix}}={\begin{pmatrix}a\alpha +b\lambda +c\rho &a\beta +b\mu +c\sigma &a\gamma +b\nu +c\tau \\p\alpha +q\lambda +r\rho &p\beta +q\mu +r\sigma &p\gamma +q\nu +r\tau \\u\alpha +v\lambda +w\rho &u\beta +v\mu +w\sigma &u\gamma +v\nu +w\tau \end{pmatrix}}\,,}{\displaystyle \mathbf {AB} ={\begin{pmatrix}a&b&c\\p&q&r\\u&v&w\end{pmatrix}}{\begin{pmatrix}\alpha &\beta &\gamma \\\lambda &\mu &\nu \\\rho &\sigma &\tau \\\end{pmatrix}}={\begin{pmatrix}a\alpha +b\lambda +c\rho &a\beta +b\mu +c\sigma &a\gamma +b\nu +c\tau \\p\alpha +q\lambda +r\rho &p\beta +q\mu +r\sigma &p\gamma +q\nu +r\tau \\u\alpha +v\lambda +w\rho &u\beta +v\mu +w\sigma &u\gamma +v\nu +w\tau \end{pmatrix}}\,,}
 */
public class Odev1 {
    public static void main(String[] args) {
        int[][] mat1=new int[3][3];
        int[][] mat2=new int[3][3];
        int[][] sonuc=new int[3][3];

        for (int i=0;i<mat1.length;i++){
            for (int j=0;j<mat1[i].length;j++){
                mat1[i][j]=(int)(Math.random()*10);
                mat2[i][j]=(int)(Math.random()*10);
            }
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
        for (int k = 0; k < sonuc.length; k++) {
            for (int l = 0; l < sonuc[k].length; l++) {
                sonuc[k][l] = mat1[k][0] * mat2[0][l] + mat1[k][1] * mat2[1][l] + mat1[k][2] * mat2[2][l];

                System.out.print(mat1[k][0] + "*" + mat2[0][l] + " + " + mat1[k][1] + "*" + mat2[1][l] + " + "
                        + mat1[k][2] + "*" + mat2[2][l] + "= " + sonuc[k][l] + "\t\t");
            }
            System.out.println("\n");
        }



    }
}
