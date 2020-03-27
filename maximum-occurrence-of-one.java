/*
Maximum occurrences of 1's

Given an array A=[0,1,0,0,1,1,1,1,0,1,0,1,1,1,1,0] of size n.
You have to print max count of 1's in given array are 1,1,1,1 and it repeated 2 times.
So it has to consider first occurrence of 1,1,1,1 and it's starting index position is '4".
Note: If array doesn't have 1's and having only 0's then it has to return -1 value.

Input Format: 1st line size of array n next size line element of array

Output Format: Integer
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        int n,i,max=0,count=0,pos=0;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int[] a = new int[n];
        for(i=0;i<n;i++)
            a[i] = s.nextInt();
        for(i=0;i<n;i++){
            if(a[i] == 1)
                count++;
            else
                count = 0;
            if(count>max){
                max = count;
                pos = i;
            }
            // System.out.println(a[i] + " " + count);
        }
        System.out.print(max==0?"-1":pos-max + 1);
    }
}