// Print Increasing

// Input :-

// 5

// Output :-

// 1
// 2
// 3
// 4
// 5



package recursion_intro;

import java.util.Scanner;

public class recursion_02 {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int n = scn.nextInt();

        System.out.println("Output :-");
        printIncreasing(n);

        scn.close();
    }

    public static void printIncreasing(int n){
        if(n == 0) {
            return;
        }

        printIncreasing(n-1);
        System.out.println(n);
    }
}
