package spiral;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] arg){
//      int[][] array= {{1,2,3,4},{5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
//        int[][] array= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int[][] array={{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
        System.out.println(spiralMatrix(array));
    }

    static List<Integer> spiralMatrix(int[][] array) {
        int row = 0;
        int lastColumn = array[0].length - 1;
        int lastRow = array.length - 1;
        int firstCol = 0;
        List<Integer> newList=new ArrayList<>();
        while(firstCol<=lastColumn && row<=lastRow){
            //iterate the first row till the end
            for (int i = firstCol; i <= lastColumn; i++) {
//                System.out.print(array[row][i] + " ");
                newList.add(array[row][i]);
            }
//            //iterate the last column from top to bottom
            for (int i = row+1; i <= lastRow; i++) {
//                System.out.print(array[i][lastColumn] + " ");
                newList.add(array[i][lastColumn]);
            }
//            //iterate the last row in reverse order
            for (int i = lastRow-1; i >=row; i--) {
//                System.out.print(array[lastRow][i] + " ");
                newList.add(array[lastRow][i]);
            }

//            //iterate the column in bottom to top
            for (int i = lastColumn-1; i >firstCol; i--) {
//                System.out.print(array[i][firstCol] + " ");
                newList.add(array[i][firstCol]);
            }
            row++;
            lastColumn--;
            lastRow--;
            firstCol++;
        }

        return newList;
    }
}
