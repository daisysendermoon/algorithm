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

public class C21 {
    public void removeDuplicatesFromLinkList(Node input) {
        if (input==null )
        {
            System.out.println("no list");
            return;
        }
        
        if (input.next == null)
        {
            System.out.println(input.data);
            return;
        }
            
        Node ci = input.next;
        Node previous = input;
        while (ci!=null)
        {
            Node cd = input;
            boolean found = false;
            while (cd!=ci)
            {
                if (cd.data == ci.data)
                {
                    previous.next = ci.next;
                    found = true;
                    break;
                }
                cd = cd.next;
            }
            if (!found)
                previous = previous.next;
            ci = ci.next;
        }
        
        while (input!=null)
        {
            System.out.print(input.data);
            System.out.print("  ");
            input= input.next;
        }

    }
    
    public static void main(String[] args)
    {
    	C21 slt = new C21();
        int[] narray = {1, 2, 3, 4, 5, 6, 7, 2, 4, 8, 3, 9};
        Node root = new Node(0);
        Node ci = root;
        for (int i: narray)
        {
            Node nn = new Node(i);
            ci.next = nn;
            ci = nn;
        }



   	    slt.removeDuplicatesFromLinkList(root);
    }
}