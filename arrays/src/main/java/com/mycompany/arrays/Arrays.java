/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author uwais
 */
public class Arrays {

    public static void main(String[] args) {
        
        int[] arr1 = {18,7,25,10,12};
        
        System.out.println("Array: [18,7,25,10,12]");
        
        boolean running = true;
        
       
        Scanner sc = new Scanner(System.in);
        
         while (running) {
             
        System.out.println("\n\nChoose an Array method.");
        System.out.println("1) Bubble Sort in Ascending Order");
        System.out.println("2) Bubble Sort in Descending Order");
        System.out.println("3) Insertion Sort in Ascending Order");
        System.out.println("4) Insertion Sort in Descending Order");
        System.out.println("5) Teacher question in Bubble Sort");
        System.out.println("6) Liberian question in Insertion Sort Ascending");
        System.out.println("7) 2D Array Display for random set of numbers");
        System.out.println("8) Display Working Schedule for Employees");
        System.out.println("9) Sales Data");
        System.out.println("10) Exit the program");
        System.out.print("\nChoose an option: ");
        String option = sc.nextLine();
        
        
      
        
        switch(option) {
            
            case "1": int n = arr1.length;
           for (int i = 0; i < n -1; i++) {
             for (int j = 0; j < n - 1 -i; j++) {
                 if (arr1[j] > arr1[j+1]) {
                     int temp = arr1[j];
                     arr1[j] = arr1[j+1];
                     arr1[j+1] = temp;
                 }
                 
             }
             System.out.print("\nAfter pass " + (i+1) + ": ");
             printArray(arr1);
             
           } 
            break;
            
            case "2": int m = arr1.length;
         for (int a = 0; a < m -1; a++) {
             for (int b = 0; b < m - 1 -a; b++) {
                 if (arr1[b] < arr1[b+1]) {
                     int temp = arr1[b+1];
                     arr1[b+1] = arr1[b];
                     arr1[b] = temp;
                 }
                 
             }
             System.out.print("\nAfter pass " + (a+1) + ": ");
             printArray(arr1);
             
         } 
         break;       
           
            case "3": //insertion
                for (int x = 1; x < arr1.length; x++) {
                int key = arr1[x];
                int y = x-1;
                while (y >= 0 && arr1[y]>key) {
                    arr1[y+1] = arr1[y];
                    y--;
                }
                arr1[y+1] = key;
                
                System.out.print("\nAfter pass " + (x) + ": ");
                printArray(arr1);
            }
                break;
            
            case "4":
                 for (int c = 1; c < arr1.length; c++) {
                int key = arr1[c];
                int d = c-1;
                while (d >= 0 && arr1[d]<key) {
                    arr1[d+1] = arr1[d];
                    d--;
                }
                arr1[d+1] = key;
                
                System.out.print("\nAfter pass " + (c) + ": ");
                printArray(arr1);
            }
                break;
                
                
            case "5": 
                int[] arrMarks = {78,45,90,62,55,81};
                printArray(arrMarks);
               
                shiftCountArray(arrMarks);
                
                break;
                
                
            case "6":
                int[] arrBooks = {108,102,115,101,110,104};
                printArray(arrBooks);
                
                booksAscendArray(arrBooks);
                
                break;
                
            
            case "7":
                int[][] arrNums = { {24,16,89}, {15,11,82}, {20,70,45} };
                
                //traversal
                traversal2DArray(arrNums);
                
                //row and column sum
                rowColumnSum(arrNums);
                
                //diagonal
                diagArray(arrNums);
                
                break;
                
             
            case "8": 
                int[][] arrSchedule = {
                    {6,7,9,5,3},
                    {9,5,3,3,9},
                    {4,5,6,7,7},
                    {2,6,6,9,5},
                    {1,0,9,8,7},
                    {7,7,9,6,6}};
                    
                displaySchedule(arrSchedule);
                
                
                break;
                
            case "9":
                int[][] arrSales = new int [5][4];
                
                for (int d=0; d< arrSales.length; d++) {
                    
                    for (int e=0; e< arrSales[d].length; e++){
                        
                        System.out.print("Enter the sales for product " + (d+1) + " for week " + (e+1) + ": ");
                        
                        arrSales[d][e] = sc.nextInt();
                        
                    }
                    
                }
                
                for (int d=0; d< arrSales.length; d++) {
               System.out.println();
               for (int e=0; e< arrSales[d].length; e++) {
               System.out.print(arrSales[d][e] + " ");
         }
     }
               rowColumnSum(arrSales);
                
                break;
                
            case "10": System.out.println("Goodbye!");
                running = false;
                return;
                
            default: System.out.println("Error!");
           
        } 
        
       
        }sc.close();
        
        
    }
    
    
    
    public static void printArray(int[] arr1) {
        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i < arr1.length - 1) {
                System.out.print(",");
            }
            
        } System.out.print("]");
    }
    
  public static void shiftCountArray(int[] arr1) {
      int n = arr1.length;
      int shifts = 0;
      for (int i = 0; i < n -1; i++) {
             for (int j = 0; j < n - 1 -i; j++) {
                 if (arr1[j] > arr1[j+1]) {
                     int temp = arr1[j];
                     arr1[j] = arr1[j+1];
                     arr1[j+1] = temp;
                     shifts++;
                 }
                 
             }
             System.out.print("\nAfter pass " + (i+1) + ": ");
             printArray(arr1);
             
           } 
      System.out.println("\n" + shifts + " of Shifts were made.");
  }  
  
 public static void booksAscendArray(int[] arr1) {
      for (int x = 1; x < arr1.length; x++) {
                int key = arr1[x];
                int y = x-1;
                while (y >= 0 && arr1[y]>key) {
                    arr1[y+1] = arr1[y];
                    y--;
                }
                arr1[y+1] = key;
                
                System.out.print("\nAfter pass " + (x) + ": ");
                printArray(arr1);
            }
     
 } 
 
 public static void traversal2DArray(int[][] arr1) {
     for (int r=0; r< arr1.length; r++) {
         System.out.println();
         for (int c=0; c< arr1.length; c++) {
             System.out.print(arr1[r][c] + " ");
         }
     }
     
 }
 
 public static void rowColumnSum(int[][] arr1) {
     //row sum
     System.out.print("\n");
     for (int r= 0; r< arr1.length; r++) {
         int rowSum = 0;
         for (int c=0; c< arr1[r].length; c++) {
             rowSum += arr1[r][c];
         }
         System.out.println("Sum of Row " + (r + 1) + " = " + rowSum);
     }
     System.out.print("\n");
     //column sum
     for (int c= 0; c<arr1.length; c++) { 
         int colSum = 0;
         for (int r=0; r<arr1[c].length; r++) {
             colSum += arr1[r][c];
         }
         System.out.println("Sum of Column " + (c + 1) + " = " + colSum);
     
 }
    System.out.print("\n");
 }
  
 public static void diagArray(int[][] arr1) {
     //diagonal
     int diagSum = 0;
    for (int r= 0; r< arr1.length; r++) {
         
         for (int c=0; c< arr1[r].length; c++) {
             if (r == c){
             diagSum += arr1[r][c];
             }
         }
        
     } 
      System.out.println("\nSum of Diagonals = " + diagSum);
 }
 
public static void displaySchedule(int[][] arr1){
    System.out.println("Employees    Monday Tuesday Wednesday Thursday Friday");
     for (int r=0; r< 6; r++) {
         System.out.println();
         System.out.print("Employee " + (r+1) + "   ");
         for (int c=0; c< 5; c++) {
             
             System.out.print("   " + arr1[r][c] + "    ");
         }
         
     }
} 
 
 
}
