/*
Task
Complete the insert function in your editor so that it creates a new Node (pass data as the Node constructor argument) and inserts it at the tail of the linked list referenced by the head parameter. Once the new node is added, return the reference to the head node.

Note: The head argument is null for an empty list.
*/

import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}
class Solution {

    public static  Node insert(Node head,int data) {
        //Complete this method
        if (head == null) 
         head = new Node(data);
         else
         {
              Node curr = head;
            while (curr.next != null) curr = curr.next;
            curr.next = new Node(data);
         }
         return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
