// Subsets of array

// Input :-

// 3
// 10
// 20
// 30

// Output :-

// -	-	-	
// -	-	30	
// -	20	-	
// -	20	30	
// 10	-	-	
// 10	-	30	
// 10	20	-	
// 10	20	30	



package arrays;

import java.util.Scanner;

public class array_12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        
        System.out.println("Output :-");
        printSubsets(arr);

        scn.close();
    }

    public static void printSubsets(int[] arr) {
        int n = arr.length;
        int tw = (int)Math.pow(2,n);
        for(int num = 0 ; num < tw; num++) {
            int bNum = getBinary(num);
            printSeq(arr, bNum);
        }
    }

    public static void printSeq(int arr[] , int bNum) {
        int n = arr.length;
        int idx = n-1;
        String str = "";
        while(n != 0) {
            int rem = bNum % 10;
            bNum = bNum / 10;

            if(rem == 0) {
                str = "-\t" + str;
            }
            else {
                str = arr[idx] + "\t" + str;
            }
            idx--;
            n--;
        }
        
        System.out.println(str);
    }

    public static int getBinary(int num) {
        int res = 0;
        int pos = 0;
        while(num != 0) {
            int rem = num % 2;
            num = num / 2;

            int pow = (int)Math.pow(10,pos);
            res = res + (rem * pow);
            pos++;
        }
        return res;
    }
}
