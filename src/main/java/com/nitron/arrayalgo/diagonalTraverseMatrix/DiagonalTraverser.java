package com.nitron.arrayalgo.diagonalTraverseMatrix;


public class DiagonalTraverser {
    public int[] traverse(int[][] matrix) {



        int m = matrix.length-1;
        int n = matrix[0].length-1;
        int[] result = new int[(m+1)*(n+1)];
        if(matrix.length<=1)
        {
            for(int i=0;i<=n;i++)
                result[i] = matrix[0][i];
            return result;
        }

        int i = 0;
        int j = 1;

        result[0] = matrix[0][0];
        int k=1;

        while (i <= m || j <= n) {


                while (j >= 0 && i<=m) {
                    result[k]=matrix[i][j];
                    k++;
                    i++;
                   j--;
                }
                    j++;
                if(i>m) {
                    j++;
                    i--;
                }
                while (i >= 0 && j<=n) {
                    result[k]=matrix[i][j];
                    k++;
                        i--;
                        j++;
                }
                i++;
                if(j>n) {
                    i++;
                    j--;
                }
        }
        return result;
    }
}
