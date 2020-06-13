
import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oyeaaa
 */
public class BubbleSort {
    
    public static int[] randomize(int r) {
        Random rand = new Random();
        
        int[] arrRand = new int[r];
        
        for(int i = 0; i < arrRand.length; i++) {
            arrRand[i] = rand.nextInt(25);
        }
        
        return arrRand;
    }
    
    public static void main(String[] args) {
      
        // Randomize array
        int[] arr = randomize(5);
        
        // Time start execute
        double t1 = System.currentTimeMillis();
        
        System.out.println("Unsorted");
        System.out.println(Arrays.toString(arr) + "\n");

        // Bubble Sort Algorithm
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        // Execute end time
        double t2 = System.currentTimeMillis();
        
        // Execute Duration
        double duration = (t2 - t1) / 1000;
        
        System.out.println("Sorted");
        System.out.println(Arrays.toString(arr) + "\n");
        
        System.out.println("Sorting time : " + duration + " s");
    }   
}
