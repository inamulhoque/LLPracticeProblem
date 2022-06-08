package com.bridgelabz;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        next = null;
    }
}
public class Linkedlist {
    static Node firstNode;
    static Scanner sc = new Scanner(System.in);
    public static void printData(){
        Node temp = firstNode;
        while (temp != null){
            System.out.print("Data: "+temp.data+" -> ");
            temp = temp.next;
        }
    }
    public static void getData(int data){
        Node newNode = new Node(data);
        if (firstNode==null){
            firstNode=newNode;
        } else {
            Node temp =firstNode;
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void main(String[] args) {
        byte x = 1;
        do {
            System.out.println("Enter data: ");
            int data = sc.nextInt();
            getData(data);
            printData();
            System.out.println("Do you want to add more data? Yes:1 No:0 ");
            x = sc.nextByte();
        } while (x==1);
        printData();
    }
}
