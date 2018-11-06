// Author:   Li Long, 1988lilong@163.com
// Date:     Apr 17, 2014
// Source:   http://oj.leetcode.com/problems/two-sum/
// Analysis: http://blog.csdn.net/lilong_dream/article/details/19298357

// Given an array of integers, find two numbers such that they add up to a specific target number.
// The function twoSum should return indices of the two numbers such that they add up to the target, 
// where index1 must be less than index2. 
// Please note that your returned answers (both index1 and index2) are not zero-based.
// You may assume that each input would have exactly one solution.
// Input: numbers={2, 7, 11, 15}, target=9
// Output: index1=1, index2=2 

package crackcode;



public class C17 {
    public int[][] setzero(int[][] matrix) {
        if (matrix == null || matrix[0] == null)
            return matrix;
        boolean[] rowzero = new boolean[matrix.length];
        boolean[] columnzero = new boolean[matrix[0].length];
        for (boolean row:rowzero)
        {
            row = false;
        }
        for (boolean column:columnzero)
        {
            column = false;
        }
        for (int i=0; i<matrix.length; i++)
        {
            for (int j=0; j<matrix[0].length; j++)
            {
                if (matrix[i][j] == 0)
                {
                    if (columnzero[j])
                    {
                        continue;
                    }
                    else{
                        for (int a = 0; a<matrix.length; a++)
                        {
                            matrix[a][j] = 0;
                        }
                        columnzero[j] = true;
                    }
                    if (rowzero[i])
                    {
                        break;
                    }
                    else{
                        for (int a = 0; a<matrix[0].length; a++)
                        {
                            matrix[i][a] = 0;
                        }
                        rowzero[i] = true;
                    }
                }
            }
        }
        return matrix;
    }
    
    public static void main(String[] args)
    {
    	C17 slt = new C17();
    	int[][] a = {
            {1, 2, 0}, 
            {4, 0, 6}, 
            {7, 8, 9}, 
        };
        int[][] b = slt.setzero(a);
        for (int i=0; i<b.length; i++)
        {
            for (int j=0; j<b[0].length; j++)
            {
                System.out.println(b[i][j]);
            }
        }
    }
}