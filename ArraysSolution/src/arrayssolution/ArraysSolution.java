/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayssolution;

/**
 *
 * @author Tony
 */
public class ArraysSolution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int[] arr = new int[8];
//        int count =1;
//        for(int i=0; i<arr.length; i++){
//            arr[i]=count;
//            count++;
//        }
//        for(int j=0; j<arr.length; j++){
//            System.out.print(arr[j]+" ");
//        }
        //Creation and implementation of 2D array
        int[][]arr= new int[3][4];
        int count = 1;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=count;
                count++;
            }
        }
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
