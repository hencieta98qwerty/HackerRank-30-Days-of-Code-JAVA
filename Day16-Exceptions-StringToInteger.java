/*
Task
Read a string, S, and print its integer value; if S cannot be converted to an integer, print Bad String.

Note: You must use the String-to-Integer and exception handling constructs built into your submission language. If you attempt to use loops/conditional statements, you will get a 0 score.
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
        String S = in.next();
        try
        {
             Integer integer = Integer.parseInt(S);
            System.out.println(integer);
        }
        catch (Exception e)
        {
             System.out.println("Bad String");
        }
    
    }
}
