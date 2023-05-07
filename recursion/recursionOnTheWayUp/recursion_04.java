// Print Maze Paths

// Input :-

// 2
// 2

// Output :-

// hv
// vh



package recursion.recursionOnTheWayUp;

import java.util.Scanner;

public class recursion_04 {
    public static void main(String[] args) {
        System.out.println("Enter Input :-");
        Scanner scn = new Scanner(System.in);

        int nr = scn.nextInt();
        int nc = scn.nextInt();

        System.out.println("Output :-");
        printMazePaths(0,0,nr-1,nc-1,"");

        scn.close();
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }

        if(sr <= dr) {
            printMazePaths(sr+1, sc, dr, dc, psf + "h");
        }

        if(sc <= dc) {
            printMazePaths(sr, sc+1, dr, dc, psf + "v");
        }
    }
}
