package com.melodia;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(2);
        s1.push(9);
        s1.push(5);
        System.out.println(s1);
      //  s1.pop();
        System.out.println(s1);
        System.out.println(s1.peek());
        boolean status = s1.empty();
        System.out.println(status);
        int indexFound = s1.search(4);
        System.out.println(indexFound);
        //how to iterate over a Stack
        Iterator it = s1.iterator();
        while (it.hasNext()) {
            Object s2 = it.next();
            System.out.print(s2);
        }
        System.out.println();
        System.out.println(s1.size());
        s1.sort(null);
        System.out.println(s1);
    }
}
