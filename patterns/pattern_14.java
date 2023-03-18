// Expected Output :-

// 3 * 1 = 3
// 3 * 2 = 6
// 3 * 3 = 9
// .
// .
// .
// .
// 3 * 10 = 30


// Code:-

package patterns;

import java.util.Scanner;

public class pattern_14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");

        int x = scn.nextInt();

        for(int i = 1; i <= 10; i++) {

            int val = x * i;
            System.out.println(x + " * " + i + " = " + val);
        }

        scn.close();
    }
}
