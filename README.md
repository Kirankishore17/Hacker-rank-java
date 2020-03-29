# Hacker-rank-java
 Solutions for Hacker rank questions:
## Questions
### 1.Sum of non negative slice.

Given an array A, we need to find the sum of maximum sum of the non-negative slice.
Example: Let's say A = [ 1234513212 2], then we have 3 slices [1, 2, 3], [5, 1, 3] and [12, 2]. Occurrence of a negative number ends the slice.From these slices we have find the maximum sum. Which in this example would be 12, 2 = 14.

Input Format:
First line of the input will be the length of the array followed by the array elements.

Output Format:
Return the maximum sum of the non-negative slice.

### 2.Maximum occurrences of 1's

Given an array A=[0,1,0,0,1,1,1,1,0,1,0,1,1,1,1,0] of size n.
You have to print max count of 1's in given array are 1,1,1,1 and it repeated 2 times.
So it has to consider first occurrence of 1,1,1,1 and it's starting index position is '4".
Note: If array doesn't have 1's and having only 0's then it has to return -1 value.

Input Format: 1st line size of array n next size line element of array

Output Format: Integer

### 3.Casket combinations

Maria has forgotten the combination to the casket. The casket contains this month's salaries.To open the casket, N boxes and N balls are used. The casket has N boxes that numbered from 1 to N which are unique. Each box can contain only one ball. Now, the box i contains one ball that numbered i, and the casket is locked.The only things which Maria remember for unlocking the casket are the followings:
She must put every ball into some box.Let the box i contains the ball Ai. When the casket is opened the number of divisors of i equals to the number of divisors of Ai for all i from 1 to N.
How many combinations which satisfy above conditions should she check? The number of combinations can be very large, so you should print this number modulo 5000095 *105+9).

Input Format:
an integer N cases. Then T test cases follow. The only line of each test case contains The first line contains an integer T, the number of test

Output Format: Output should print the number of combinations modulo 500009

### 4.Repeating element

Find the first repeating element in an array of integers Given an array of integers 'A', find the first repeating element in it. We need to find the element that occurs more than once and whose index of first occurrence is smallest.

Input Format:
First line of the input will be the length of the array followed by the array elements.

Output Format:
Return the first repeating element. If there are no repeating elements return 0.

Constraints:
length of A <= 100

Sample Test Case:
Input:
7
10
5
3
4
3
5
6

Output:
5

### 5.Smallest positive integer.

Given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.Given A = [1,2,3], the function should return 4.

Input Format: First line of the input will be the length of the array followed by the array elements.

Output Format : Return the smallest positive integer that does not occur in A.

Constraints:
N is an integer within the range [ 1100000 ]; each element of array A is an integer within the range [-1,000,000.1,000,000].

Sample Test Case:
Input:
2
-1
-3

Output:
1

