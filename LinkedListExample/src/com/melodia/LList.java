package com.melodia;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class LList {

    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();
        //Add to LinkedList
        l1.add(3);
        l1.add(7);
        l1.add(10);
        l1.add(2,6);
        //Remove From LinkedList
        l1.remove();
        l1.removeFirst();
        l1.removeLast();
        
        Iterator it = l1.iterator();
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
        System.out.println("");
        System.out.println(l1.size());
        boolean b1 = l1.contains(11);
        System.out.println(b1);
        
        //Copy elements from Stack to Linked List
        Stack<String> s1 = new Stack<>();
        LinkedList<String> l2 = new LinkedList<>();
        
        s1.push("hello");
        s1.push("everyone");
        
        l2.addAll(s1);
        
        Iterator it2 = l2.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next()+" ");
        }
    }
    
}
