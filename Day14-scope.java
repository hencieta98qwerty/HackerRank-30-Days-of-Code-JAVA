/*
Task
Complete the Difference class by writing the following:
>>> A class constructor that takes an array of integers as a parameter and saves it to the __elements instance variable.
>>> A computeDifference method that finds the maximum absolute difference between any 2 numbers in __elements and stores it in the maximumDifference instance variable.
*/

mport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    
    Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        int max = 0;

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int abs = Math.abs(elements[i] - elements[j]);
                if (abs > max) max = abs;
            }
        }

        maximumDifference = max;
    }

} 
