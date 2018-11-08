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

public class C14 {
    public boolean testanagrams(String input1, String input2) {
        if (input1==null || input1.equalsIgnoreCase("") || input2==null || input2.equalsIgnoreCase("") || input2.length()!=input1.length())
            return false;
        for (int i=0; i < input1.length(); i++)
        {
            if (input1.charAt(i) != input2.charAt(input2.length()-1-i))
            {
                return false;
            }
        }
        
        return true;

    }
    
    public static void main(String[] args)
    {
    	C14 slt = new C14();
    	
    	System.out.println(slt.testanagrams("ilovtu1", "uevoli"));
    }
}