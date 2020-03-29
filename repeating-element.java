/*
Repeating element

Find the first repeating element in an array of integers Given an array of integers 'A', find the first repeating element in it. We need to find the element that occurs more than once and whose index of first occurrence is smallest.

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        List<Integer> ar = new ArrayList<Integer>();
        int i,ans=0,pos=n-1;
        for(i=0;i<n;i++)
            ar.add(s.nextInt());
        for(i=0;i<n;i++)
            if(ar.indexOf(ar.get(i)) != i)
            if(pos > ar.indexOf(ar.get(i))){
                pos = ar.indexOf(ar.get(i));
                ans = ar.get(i);
            }
        System.out.print(ans);
    }
}