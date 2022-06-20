package com.nitron.arrayalgo.matrixSpiralOrderTraversal;

public class Main {

    public static void main(String[] args) {

      int[][] matrix =  {{1,2,3,4,6},
                         {5,6,7,8,0},
                         {7,3,8,2,9},
                         {1,5,7,3,6},
                        {9,3,2,5,1}};

      int[][] matrix2 = {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12}};

        System.out.println(new SpiralOrderTraverser().traverseSpiralOrder(matrix2));

    }

}
