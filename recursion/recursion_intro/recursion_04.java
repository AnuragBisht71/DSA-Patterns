// Factorial

// Input :- 5

// Output :- 120



package recursion.recursion_intro;

import java.util.Scanner;

public class recursion_04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int n = scn.nextInt();

        System.out.println("Output :-");
        System.out.println(factorial(n));

        scn.close();
    }

    public static int factorial(int n){
        if(n == 0) {
            return 1;
        }

        return n * factorial(n-1);
    }
}
