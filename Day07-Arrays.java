/*
Task
Given an array,A , of N integers, print A's elements in reverse order as a single line of space-separated numbers.
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) 
        {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) 
        {
            int idx = n - i - 1;
            System.out.print(arr[idx] + " ");
        }

        in.close();
    }
}
