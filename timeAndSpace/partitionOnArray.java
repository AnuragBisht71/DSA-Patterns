// Input :-

// 5 --> elements of array
// 7
// -2
// 4
// 1
// 3
// 3 --> partition on this number

// Output :-

// -2
// 1
// 3
// 7
// 4



package timeAndSpace;

import java.util.Scanner;

public class partitionOnArray {
    public static void partition(int[] arr, int pivot){
        int i = 0 , j = 0 ;
    
        while(i < arr.length) {
            if(arr[i] > pivot) {
                i++;
            }
    
            else {
                swap(arr,i,j);
                i++;
                j++;
            }
        }
        
      }
    
      // used for swapping ith and jth elements of array
      public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    
      public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
        }
        System.out.println();
      }
    
      public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int n = scn.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        
        int pivot = scn.nextInt();
        
        System.out.println("Output :-");
        partition(arr,pivot);
        print(arr);

        scn.close();
      }
}
