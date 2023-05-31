// Input :-

// 10 --> no. of element in array
// 1
// 0
// 2
// 2
// 1
// 0
// 2
// 1
// 0
// 2

// Output :-

// 0
// 0
// 0
// 1
// 1
// 1
// 2
// 2
// 2
// 2



package timeAndSpace;

import java.util.Scanner;

public class sort_012 {
    public static void sort01(int[] arr){
        int i = 0 , j = 0 , k = arr.length - 1;
    
        while(i <= k) {
            if(arr[i] == 0) {
                swap(arr,i,j);
                i++;
                j++;
            } 
    
            else if(arr[i] == 1) {
                i++;
            }
    
            else if(arr[i] == 2) {
                swap(arr,i,k);
                k--;
            }
    
        }
        
      }
    
      // used for swapping ith and jth elements of array
      public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping index " + i + " and index " + j);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    
      public static void print(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
          System.out.println(arr[i]);
        }
      }
      public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i < n; i++){
          arr[i] = scn.nextInt();
        }

        System.out.println("Output :-");
        sort01(arr);
        print(arr);

        scn.close();
      }
}
