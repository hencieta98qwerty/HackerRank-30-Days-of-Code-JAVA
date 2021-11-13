/*
Task
Given an array,a, of size n distinct elements, sort the array in ascending order using the Bubble Sort algorithm above. Once sorted, print the following 3 lines:

1. Array is sorted in numSwaps swaps.
   where numSwaps is the number of swaps that took place.
2. First Element: firstElement
   where firstElement is the first element in the sorted array.
3. Last Element: lastElement
   where lastElement is the last element in the sorted array.
*/

import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = in.nextInt();
        }
        int numSwaps = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    numSwaps++;
                }
            }
            if (numSwaps == 0) {
                break;
            }
        }
         System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[arr.length - 1]);
    }
}
