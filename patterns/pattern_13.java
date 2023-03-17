// Expected Output :-

//  1
//  1     1
//  1     2     1
//  1     3     3     1
//  1     4     6     4     1
//  1     5     10    10    5    1


// Code:-

package patterns;

import java.util.Scanner;

public class pattern_13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");

        int n = scn.nextInt();

        for(int i = 0; i < n; i++) {
            
            int icj = 1;
            for(int j = 0; j <= i; j++) {
                System.out.print(icj + "\t");

                int icjp1 = icj * (i-j) / (j+1);
                icj = icjp1;
            }

            System.out.println();
        }

        scn.close();
    }
}
