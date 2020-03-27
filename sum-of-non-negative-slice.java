/*
Sum of non negative slice.

Given an array A, we need to find the sum of maximum sum of the non-negative slice.
Example: Let's say A = [ 1234513212 2], then we have 3 slices [1, 2, 3], [5, 1, 3] and [12, 2]. Occurrence of a negative number ends the slice.
From these slices we have find the maximum sum. Which in this example would be 12, 2 = 14.

Input Format:
First line of the input will be the length of the array followed by the array elements.

Output Format:
Return the maximum sum of the non-negative slice.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        int i,n,sum=0,temp,max=0;
        Scanner s = new Scanner(System.in);
        List<Integer> a = new ArrayList<Integer>();
        n = s.nextInt();
        int arr[] = new int[n];
        for(i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        for(i=0;i<n;i++){
            if((sum + arr[i]) < sum)
                sum = 0;
            else
                sum = sum + arr[i];
            if(sum > max)
                max = sum;
        }
        System.out.print(max);
    }
}