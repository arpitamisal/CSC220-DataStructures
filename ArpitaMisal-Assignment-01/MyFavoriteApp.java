/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arpitamisal
 * CSC 220.03
 * Arpita Misal, SFSU ID: 921644032
 * Assignment 01
 * Due Date & Time: 01-31-2022 at 11:55 PM

 */

import java.util.*;
public class MyFavoriteApp {
   public static void main(String[] args)
    {
        int[] A=null; 
        int size; 
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array: ");   
        size = input.nextInt();     
        A = new int[size];
        System.out.println("Enter " + size + " integer data: ");      
        for(int i = 0; i < size; i++){
            A[i] = input.nextInt();
        }

        //call display() method to display array data
        System.out.println("======================");
        System.out.println("Array values:");
        display(A);
        System.out.println("======================");

        // Selection sort algorithm to sort data in A
        selectionSort(A);

        //display sorted array data
        System.out.println("Sorted array values:");
        display(A);
    }
    // display content of integer array
    static void display(int[] B) {
        for (int i=0; i<B.length; i++) {
            System.out.println("array value:"+i+":"+B[i]);
        }
    }
    
    // Sort values in B using Selection sort method 
    static void selectionSort(int[] B) {
        int n = B.length;      
        for (int i=0; i<n-1; i++) {
            
            int x=findMinimumIndex(B, i, n);

            swapData(B, i, x);
        }
    }

    // find index with minimum value in array B[i...n)
    static int findMinimumIndex(int[] B, int i, int n) {
        int min = i;
        
        n = B.length;   
        for(int j = i + 1; j < n; j++){
            if(B[j] < B[min]){
                min = j;
            }
        }
        return min;
    }

    // Swap B[i] and B[j]
    static void swapData(int[] B, int i, int j) {
        int temp = B[i];
        B[i] = B[j];
        B[j] = temp;
    }
}

