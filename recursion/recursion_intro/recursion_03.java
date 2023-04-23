// Print Increasing Decreasing

// Input :-

// 3

// Output :-

// 3
// 2
// 1
// 1
// 2
// 3



package recursion.recursion_intro;

import java.util.Scanner;

public class recursion_03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int n = scn.nextInt();

        System.out.println("Output :-");
        pdi(n);

        scn.close();
    }

    public static void pdi(int n){
        if(n == 0) {
            return;
        }
        
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
}
