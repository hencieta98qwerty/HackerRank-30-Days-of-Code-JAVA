/*
Consider a database table, Emails, which has the attributes First Name and Email ID. 
Given N rows of data simulating the Emails table, print an alphabetically-ordered list of people whose email address ends in @gmail.com.

Input Format

The first line contains an integer,N, total number of rows in the table.
Each of the  subsequent lines contains  space-separated strings denoting a person's first name and email ID, respectively.

Constraints
>  2<=N<=20
>  Each of the first names consists of lower case letters [a-z] only.
>  Each of the email IDs consists of lower case letters [a-z], @ and . only.
>  The length of the first name is no longer than 20.
>  The length of the email ID is no longer than 50.
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        String emailRegEx = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(emailRegEx);

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String name = in.next();
            String email = in.next();
            Matcher matcher = pattern.matcher(email);

            if (matcher.find()) list.add(name);
        }

        Collections.sort(list);

        list.forEach(System.out::println);
       
    }
}
