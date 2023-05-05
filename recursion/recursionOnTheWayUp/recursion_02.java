// Print Stair Paths

// Input :- 3

// Output :-

// 111
// 12
// 21
// 3



package recursion.recursionOnTheWayUp;

import java.util.Scanner;

public class recursion_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :- ");

        int n = scn.nextInt();

        System.out.println("Output :- ");
        printStairPaths(n,"");

        scn.close();
    }

    public static void printStairPaths(int n, String path) {
        if(n == 0) {
            System.out.println(path);
            return;
        }

        if(n-1 >= 0) {
            printStairPaths(n-1, path + "1");
        }

        if(n-2 >= 0) {
            printStairPaths(n-2, path + "2");
        }

        if(n-3 >= 0) {
            printStairPaths(n-3, path + "3");
        }
    }    
}
