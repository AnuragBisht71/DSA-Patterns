// Broken economy

// Input :-

// 10 --> no. of elements
// a = {1 , 5 , 10 , 15 , 22 , 33 , 40 , 42 , 55 , 66 };
// 34 --> d(required to find the ceil and floor of d in array a)

// Output :-

// 40 
// 33



package arrays;

import java.util.Scanner;

public class array_09 {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter input :-");

    int n = scn.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++) {
        arr[i] = scn.nextInt();
    }

    int k = scn.nextInt();
    brokenEconomy(arr, k);

    scn.close();
    }

    public static void brokenEconomy(int[] arr, int k) {
        int lo = 0; 
        int hi = arr.length-1;
        int ceil = -1;
        int floor = -1;

        while(lo <= hi) {
            int mid = (lo + hi) / 2;

            if(k == arr[mid]) {
                ceil = floor = arr[mid];
                break;
            }

            else if(k > arr[mid]) {
                lo = mid + 1;
                floor = arr[mid];
            }

            else if(k < arr[mid]) {
                hi = mid - 1;
                ceil = arr[mid];
            }
        }
        
        System.out.println("Output :-");
        System.out.println(ceil);
        System.out.println(floor);
    }
}
