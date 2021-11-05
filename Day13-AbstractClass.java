/*
Task
Given a Book class and a Solution class, write a MyBook class that does the following:

>>> Inherits from Book
>>> Has a parameterized constructor taking these 3 parameters:
    1. string title
    2. string author
    3. int price
>>> Implements the Book class' abstract display() method so it prints these 3 lines:
    1. Title, a space, and then the current instance's title.
    2. Author, a space, and then the current instance's author.
    3. Price, a space, and then the current instance's price.
    
Note: Because these classes are being written in the same file, you must not use an access modifier (e.g.: ) when declaring MyBook or your code will not execute.
*/

import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

class MyBook extends Book
{
    private int price;

    MyBook(String t, String a, int p)
    {
         super(t, a);
        price = p;
    }
    void display()
    {
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: " + price);
    }
}

public class Solution {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
