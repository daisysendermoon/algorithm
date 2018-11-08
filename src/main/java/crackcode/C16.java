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



public class C16 {
    public int[][] transpose(int[][] matrix) {
        if (matrix==null || matrix[0] == null)
            return null;
        for (int i=0; i<matrix.length; i++)
        {
            for (int j=0; j<=i; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }
    
    public static void main(String[] args)
    {
    	C16 slt = new C16();
    	int[][] a = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}, 
        };
        int[][] b = slt.transpose(a);
        for (int i=0; i<b.length; i++)
        {
            for (int j=0; j<b[0].length; j++)
            {
                System.out.println(b[i][j]);
            }
        }
    }
}