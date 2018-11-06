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

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class C22 {
    public void getNToLast(Node input, int n) {
        if (input==null || n<0)
        {
            System.out.println("no list");
            return;
        }
        
        Node output = null;    
        
        while (input!=null && n>=0)
        {
            input = input.next;
            n--;
        }

        if (n>0)
        {
            System.out.println("no list");
            return;
        }        
        
        output = input;
        
        while (output!=null)
        {
            System.out.print(output.data);
            System.out.print("  ");
            output= output.next;
        }
        return;
    }
    
    public static void main(String[] args)
    {
    	C22 slt = new C22();
        int[] narray = {1, 2, 3, 4, 5, 6, 7, 2, 4, 8, 3, 9};
        Node root = new Node(0);
        Node ci = root;
        for (int i: narray)
        {
            Node nn = new Node(i);
            ci.next = nn;
            ci = nn;
        }


        int n = 5;
   	    slt.getNToLast(root, n);
    }
}