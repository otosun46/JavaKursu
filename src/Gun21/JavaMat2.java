/*
Author:Otosun
Tarih :22/06/2020
*/
package Gun21;
//  {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
//  2D arrayinden min number print et
public class JavaMat2 {
    public static void main(String[] args) {

        int[][] diziMin = {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};
        int min = diziMin[0][0];

        for (int i = 0; i < diziMin.length; i++) {
            for (int j = 0; j < diziMin[i].length; j++) {
                if (min > diziMin[i][j]) {
                    min = diziMin[i][j];
                }
            }

        }
        System.out.println(min);
    }
}
