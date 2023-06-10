// Input :-

// 4

// Output :-

// 10



package dynamicProgramming;

import java.util.Scanner;

public class friends_pairing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int n = scn.nextInt();

        int f = 1 , s = 1;

        for(int i = 2 ; i <= n ; i++) {
            int t = f * (i-1) + s;

            f = s;
            s = t;
        }

        System.out.println("Output :-");
        System.out.println(s);

        scn.close();
    }
}
