/*
Task
A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself. Given a number,n, determine and print whether it is prime or notPrime.

Note: If possible, try to come up with a O(√n) primality algorithm, or see what sort of optimizations you come up with for an O(n) algorithm. Be sure to check out the Editorial after submitting your code.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) 
        {
            int n = in.nextInt();
            if (n >= 2 && isPrime(n))
                System.out.println("Prime");
            else System.out.println("Not prime");
        }
    
    }
    
    public static boolean isPrime(int n) 
    {
        for (int i = 2; i <= Math.sqrt(n); i++) 
        {
            if (n % i == 0) 
            {
                return false;
            }
        }
        return true;
    }  
}
