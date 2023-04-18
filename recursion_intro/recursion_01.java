// Print Decreasing

// Input :-

// 5

// Output :-

// 5
// 4
// 3
// 2
// 1



package recursion_intro;

import java.util.Scanner;

public class recursion_01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int n = scn.nextInt();

        System.out.println("Output :-");
        printDecreasing(n);
        scn.close();
    }

    public static void printDecreasing(int n){
        if(n == 0) {
            return;
        }

        System.out.println(n);
        printDecreasing(n-1);
    }
}
