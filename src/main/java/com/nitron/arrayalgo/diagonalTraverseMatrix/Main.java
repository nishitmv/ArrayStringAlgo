package com.nitron.arrayalgo.diagonalTraverseMatrix;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,8},
                          {4,5,6,11},
                          {7,8,9,10},
                          {4,7,9,3}};

        System.out.println(new DiagonalTraverserProper().traverse(matrix));

    }

}
