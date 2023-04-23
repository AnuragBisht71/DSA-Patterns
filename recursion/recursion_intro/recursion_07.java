// Print Zigzag

// Input :-

// 3

// Output :-

// 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3



package recursion.recursion_intro;

import java.util.Scanner;

public class recursion_07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int n = scn.nextInt();

        System.out.println("Output :-");
        pzz(n);

        scn.close();
    }

    public static void pzz(int n){
        if(n == 1) {
            System.out.print("1 1 1 ");
            return;
        }

        System.out.print(n + " ");
        pzz(n-1);
        System.out.print(n + " ");
        pzz(n-1);
        System.out.print(n + " ");
    }
}
