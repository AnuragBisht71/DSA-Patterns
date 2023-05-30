// Input :-

// 5 --> no. of elements in array
// 7 
// 2 
// 4 
// 1 
// 3

// Output :-

// After sorting on 1 place -> 1 2 3 4 7 
// 1 2 3 4 7 



package timeAndSpace;

import java.util.Scanner;

public class radix_sort {
    public static void radixSort(int[] arr) {
        int max = Integer.MIN_VALUE;

        for(int val : arr) {
            if(val > max) {
                max = val;
            }
        }

        int count = 0;
        while(max != 0) {
            count++;
            max = max / 10;
        }

        int exp = 1;
        while(count != 0) {
            count--;
            countSort(arr, exp);
            exp = exp * 10;
        }
    }
    
    public static void countSort(int[] arr, int exp) {
        int freq[] = new int[10];
        for(int vl : arr) {
            freq[(vl / exp) % 10]++;
        }

        for(int i = 1 ; i < 10 ; i++) {
            freq[i] += freq[i-1];
        }

        int res[] = new int[arr.length];
        for(int i = arr.length-1 ; i >= 0 ; i--) {
            int val = arr[i];
            int pos = (val/exp) % 10;
            int place = freq[pos];
            res[place-1] = val;
            freq[pos]--;
        }

        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = res[i];
        }


        System.out.print("After sorting on " + exp + " place -> ");
        print(arr);
    }
    
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Output :-");
        radixSort(arr);
        print(arr);

        scn.close();
    }
}
