// Expected Output :-

// 1                             1
// 1    2                   2    1
// 1    2    3         3    2    1
// 1    2    3    4    3    2    1


// Code:-

package patterns;

import java.util.Scanner;

public class pattern_16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");

        int n = scn.nextInt();

        int sp = 2 * n - 3;
        int st = -1;

        for(int i = 1; i <= n; i++) {
            
            int val = 1;
            for(int j = 1; j <= st; j++) {
                System.out.print(val + "\t");
                val++;
            }

            if(i == n) {
                st--;
                val--;
            }

            for(int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            for(int j = 1; j <= st; j++) {
                val--;
                System.out.print(val + "\t");
            }

            sp-=2;
            st++;

            System.out.println();
        }

        scn.close();
    }
}
