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

public class C13 {
    public String removeDuplicates(String input) {
        if (input==null || input.equalsIgnoreCase(""))
            return "";
        char lastc=0;
        LinkedList<Character> lincBuffer = new LinkedList<Character>(input.chars().mapToObj(i -> (char) i).collect(Collectors.toList()));
        ListIterator<Character> iter = lincBuffer.listIterator();
        while(iter.hasNext()){
            Character currentc = iter.next();
            if (currentc==lastc)
            {
                iter.remove();
            }
            else
            {
                lastc = currentc;
            }
        }
        
        return lincBuffer.toString();

    }
    
    public static void main(String[] args)
    {
    	C13 slt = new C13();
    	
    	System.out.println(slt.removeDuplicates("Fuuuuucck"));
    }
}