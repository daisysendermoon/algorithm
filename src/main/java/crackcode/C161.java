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



public class C161 {
    public int[][] rotate(int[][] matrix) {
        if (matrix==null || matrix[0] == null)
            return null;
        if (matrix.length==1)
            return matrix;
        int n = matrix.length;
        for (int i=0; i<matrix.length/2; i++)
        {
            for (int j=i; j<n-i-1; j++)
            {
                int ax = j;
                int ay = i;
                int bx = n-i-1;
                int by = j;
                int cx = n-j-1;
                int cy = n-i-1;
                int dx = i;
                int dy = n-j-1;
                int temp = matrix[dx][dy];
                matrix[dx][dy] = matrix[cx][cy];
                matrix[cx][cy] = matrix[bx][by];
                matrix[bx][by] = matrix[ax][ay];
                matrix[ax][ay] = temp;

            }
        }
        return matrix;
    }
    
    public static void main(String[] args)
    {
    	C161 slt = new C161();
    	int[][] a = {
            {1,  2,  3,  4,  5 }, 
            {6,  7,  8,  9,  10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };
        int[][] b = slt.rotate(a);
        for (int i=0; i<b.length; i++)
        {
            for (int j=0; j<b[0].length; j++)
            {
                System.out.print(b[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}