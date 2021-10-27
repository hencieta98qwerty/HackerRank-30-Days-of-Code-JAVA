/*
Task
Given an integer,n , print its first 10 multiples. Each multiple nXi (where 1<=i<=10) should be printed on a new line in the form: n x i = result.
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
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        for (int i = 1; i < 11; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    
        bufferedReader.close();
    }
}
