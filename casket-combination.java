/*
casket combinations

Maria has forgotten the combination to the casket. The casket contains this month's salaries.To open the casket, N boxes and N balls are used. The casket has N boxes that numbered from 1 to N which are unique. Each box can contain only one ball. Now, the box i contains one ball that numbered i, and the casket is locked.The only things which Maria remember for unlocking the casket are the followings:
She must put every ball into some box.Let the box i contains the ball Ai. When the casket is opened the number of divisors of i equals to the number of divisors of Ai for all i from 1 to N.
How many combinations which satisfy above conditions should she check? The number of combinations can be very large, so you should print this number modulo 5000095 *105+9).

Input Format:
an integer N cases. Then T test cases follow. The only line of each test case contains The first line contains an integer T, the number of test

Output Format: Output should print the number of combinations modulo 500009
Sample Test Case:
Input:
2
5
10
Output:
5
287
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int factorial(int n){
        double s=1;
        for(int i=2;i<=n;i++){
            s = s*i;
            s = s % 500009;
        }
        return (int)(s%500009);
    } 

    public static int factors(int n){
        int c=0;
        for(int i=1;i<=n;i++)
            if(n%i==0)
                c++;
        return c;
    } 
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        int n,t,i,val,count;
        Scanner s = new Scanner(System.in);
        t = s.nextInt();
        Map<Integer,Integer> ar = new HashMap<Integer,Integer>();
        double ans = 1;
        while(t-- > 0){
            n = s.nextInt();
            val = 1;

            for(i=2;i<=n;i++){
                count = factors(i);
                if(ar.containsKey(count)){
                    ar.put(count, ar.get(count)+1);
                }else {
                    ar.put(count, 1);
                }
            }

            // System.out.println(ar.toString());
            for(Integer num:ar.keySet()){
                ans = ans * (factorial(ar.get(num)) % 500009) ;
                ans = ans % 500009;
            }
            ar.clear();
            System.out.println((int)ans-1);
            ans = 1;
        }
    }
}