package com.melodia;

public class CLList {
    
    Node head, tail;
    
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
        }
    }
    
    void insertElement(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            tail.next = newNode;
        }
    
        else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    
    void displayElements(){
        Node n1 = head;
        if(tail == null && head == null){
            System.out.println("Circular LL is empty, nothing to display");
        }
        else{
            do {                
                System.out.println(n1.data);
                n1=n1.next;
            } while(n1!=head);
        }
    }
    
    void deleteEelements(){
        if(tail!=head){
            head = head.next;
            tail.next = head;
        }
        else{
            head=tail=null; 
        }
    }
    
    public static void main(String[] args) {
        
        CLList list1 = new CLList();
        list1.insertElement(2);
        list1.insertElement(7);
        list1.insertElement(8);
        list1.displayElements();
        list1.deleteEelements();
        list1.displayElements();
    }
}
