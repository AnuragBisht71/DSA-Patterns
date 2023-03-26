// Any base subtraction

// Input :-

// 8 --> base
// 1 --> n1 
// 100 --> n2

// Output :-

// 77

package functions;

import java.util.Scanner;

public class function_6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
    
        int d = getDifference(b, n1, n2);
        System.out.println(d);

        scn.close();
    }

    public static int getDifference(int b, int n1, int n2) {
        return n2;
    }
}
