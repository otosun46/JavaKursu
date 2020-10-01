/*
Author:Otosun
Tarih :22/06/2020
*/
package Gun21;

//  {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}  int 2D arrayini  olustur
//   2D arrayinden max number print et
public class JavaMat1 {
    public static void main(String[] args) {
        int[][] diziMax = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 10, 3}};
        int max = diziMax[0][0];
        for (int i = 0; i < diziMax.length; i++) {
            for (int j = 0; j < diziMax[i].length; j++) {
                if (max < diziMax[i][j]) {
                    max = diziMax[i][j];
                }
            }

        }
        System.out.println(max);
    }
}
