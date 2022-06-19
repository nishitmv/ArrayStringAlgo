package com.nitron.arrayalgo.diagonalTraverseMatrix;


import java.util.*;

public class DiagonalTraverserProper {
    public int[] traverse(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[(m)*(n)];

        Map<Integer, List<Integer>> map = new HashMap<>();
        int max =0;
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
            {
                int key = i+j;
                if(map.containsKey(key))
                {
                    map.get(key).add(matrix[i][j]);
                }
                else {
                    var list = new ArrayList<Integer>();
                    list.add(matrix[i][j]);
                    map.put(key, list);
                }
                max = Math.max(max, key);
            }
        int k=0;
        for(int i=0;i<=max;i++)
        {
            List<Integer> list = map.get(i);
            if(i%2==0)
                Collections.reverse(list);
            for(int val:list)
            {
                result[k] = val;
                k++;
            }
        }
        return result;
    }
}
