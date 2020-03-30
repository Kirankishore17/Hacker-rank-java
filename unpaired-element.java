/*

A non-empty zero-indexed array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.
For example, in array A such that:A[0] = 9 A[1] = 3 A[2] = 9 A[3] = 3 A[4] = 9 A[5] = 7 A[6] = 9 the elements at indexes 0 and 2 have value 9, the elements at index 1 and 3 have value 3, the elements at index 4 and 6 have value 9, the element at index 5 has value 7 and is unpaired.Write a function such that given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        int n,i;
        int temp;
        Scanner s = new Scanner(System.in);
        Map<Integer,Integer> ar = new HashMap<Integer,Integer>();
        n = s.nextInt();
        for(i=0;i<n;i++){
            temp = s.nextInt();
            if(ar.containsKey(temp)){
                ar.put(temp, ar.get(temp) + 1);
            } else {
                ar.put(temp,1);
            }
        }
        for(Integer t:ar.keySet()){
            if(ar.get(t) % 2 == 1){
                System.out.print(t);
                break;
            }
        }
    }
}