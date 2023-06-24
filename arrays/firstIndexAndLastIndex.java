// Input :-

// 15 --> no. of elements
// arr = { 1 , 5 , 10 , 15 , 22 , 33 , 33 , 33 , 33 , 33 , 40 , 42 , 55 , 66 , 77 }
// 33 --> find the first and last index

// Output :-

// 5
// 9



package arrays;

import java.util.Scanner;

public class firstIndexAndLastIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int n = scn.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();
        System.out.println("Output :-");
        System.out.println(firstIndex(arr,k));
        System.out.println(lastIndex(arr,k));

        scn.close();
    }

    public static int firstIndex(int[] arr, int k) {
        int lo = 0;
        int hi = arr.length-1;
        int fi = -1;

        while(lo <= hi) {
            int mid = (lo + hi) / 2;

            if(k == arr[mid]) {
                fi = mid;
                hi = mid - 1;
            }
            else if(k > arr[mid]) {
                lo = mid + 1;
            }
            else if(k < arr[mid]) {
                hi = mid - 1;
            }
        }

        return fi;
    }
    
    public static int lastIndex(int[] arr, int k) {
        int lo = 0;
        int hi = arr.length-1;
        int li = -1;

        while(lo <= hi) {
            int mid = (lo + hi) / 2;

            if(k == arr[mid]) {
                li = mid;
                lo = mid + 1;
            }
            else if(k > arr[mid]) {
                lo = mid + 1;
            }
            else if(k < arr[mid]) {
                hi = mid - 1;
            }
        }

        return li;
    }
}
