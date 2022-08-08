/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.melodia;

import java.util.Arrays;

/**
 *
 * @author Tony
 */
public class ArraySort {

    /**
     * @param args the command line arguments
     */
    public static int search(int array[], int key){
        
        for(int i=0; i<array.length; i++){
            if(array[i]==key){
                return i;
            }
     
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int a1[]= new int[]{3,6,2,9,5,8,1};
        for(int i=0; i<a1.length; i++){
            System.out.print(a1[i]);
        }
        Arrays.sort(a1);
        System.out.println("");
        for(int i=0; i<a1.length; i++){
            System.out.print(a1[i]);
        }
        int indexValue = search(a1,9);
        System.out.println("");
        if(indexValue == -1){
            System.out.println("The element does not exist in the arry");
        }
        else{
            System.out.println("Element is found and is at index "+indexValue);
        }
        
    }
    
}