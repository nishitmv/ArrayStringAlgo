package com.nitron.arrayalgo.matrixSpiralOrderTraversal;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrderTraverser {

    public List<Integer> traverseSpiralOrder(int[][] matrix)
    {
        int m = matrix.length;
        int n = matrix[0].length;

        int length = m*n;
        List<Integer> result = new ArrayList<>(length);

        int i =0;
        int j=0;
        int jRightBound =n-1;
        int jLeftBound =0;
        int iUpBound =1;
        int iDownBound= m-1;
        while(result.size()<length)
        {

            while(j<=jRightBound && result.size()<length)
            {
                result.add(matrix[i][j]);
                j++;
            }
            i++;
            j--;
            while(i<=iDownBound && result.size()<length)
            {
                result.add(matrix[i][j]);
                i++;
            }
            i--;
            j--;
            while (j>=jLeftBound && result.size()<length)
            {
                result.add(matrix[i][j]);
               j--;
            }
            j++;
            i--;
            while(i>=iUpBound && result.size()<length)
            {
                result.add(matrix[i][j]);
                i--;
            }
            i++;
            j++;
            jRightBound--;
            iDownBound--;
            jLeftBound++;
            iUpBound++;

        }

        return result;

    }

}
