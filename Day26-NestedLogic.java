/*
Task
Your local library needs your help! Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). The fee structure is as follows:

1. If the book is returned on or before the expected return date, no fine will be charged (i.e.: fine=0) .
2. If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, fine=15 HackosX(the number of days late).
3. If the book is returned after the expected return month but still within the same calendar year as the expected return date, the fine=500 HackosX(the number of months late).
4. If the book is returned after the calendar year in which it was expected, there is a fixed fine of 10000 Hackos.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);

        int days = in.nextInt();
        int months = in.nextInt();
        int years = in.nextInt();

        int days1 = in.nextInt();
        int months1 = in.nextInt();
        int years1 = in.nextInt();

        int fine = 0;

        if (years > years1) fine = 10000;
        else if (years == years1) {
            if (months > months1) fine = (months - months1) * 500;
            else if (months == months1 && days > days1) fine = (days - days1) * 15;
        }

        System.out.println(fine);
    
    }
}
