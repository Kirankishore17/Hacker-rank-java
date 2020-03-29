/*

Given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5. Given A = [1,2,3], the function should return 4.

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        List<Integer> ar = new ArrayList<Integer>();
        int i;
        for(i=0;i<n;i++)
            ar.add(s.nextInt());
        for(i=1;i<=n+1;i++)
        if(!ar.contains(i)){
            System.out.print(i);
            break;
        }
    }
}