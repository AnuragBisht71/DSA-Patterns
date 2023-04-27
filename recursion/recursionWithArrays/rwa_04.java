// First Index

// Input :-

// 6 --> no. of element 
// 15
// 11
// 40
// 4
// 4
// 9
// 4 --> first index 

// Output :-

// 3



package recursion.recursionWithArrays;

import java.util.Scanner;

public class rwa_04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int n = scn.nextInt();
        
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scn.nextInt();
        }
        
        int x = scn.nextInt();
        System.out.println("Output :-");
        System.out.println(firstIndex(arr, 0 , x));

        scn.close();
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(x == arr[idx]) {
            return idx;
        }
        else if(idx == arr.length-1) {
            return -1;
        }

        int fi = firstIndex(arr, idx+1, x);
        return fi;
    }
}
