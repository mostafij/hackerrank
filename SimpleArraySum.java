/*
Given an array of NN integers, can you find the sum of its elements?

Input Format

The first line contains an integer, NN, denoting the size of the array. 
The second line contains NN space-separated integers representing the array's elements.

Output Format

Print the sum of the array's elements as a single integer.

Sample Input

6
1 2 3 4 10 11
Sample Output

31
Explanation

We print the sum of the array's elements, which is: 1+2+3+4+10+11=311+2+3+4+10+11=31.*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int result = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        for(int i=0; i<n; i++){
            result = result + arr[i];
        }
        
        System.out.println(result);
    }
}
