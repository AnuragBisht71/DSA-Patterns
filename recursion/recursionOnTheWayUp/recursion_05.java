// Print Maze Paths With Jumps

// Input :-

// 3
// 3

// Output :-

// h1h1v1v1
// h1h1v2
// h1v1h1v1
// h1v1v1h1
// h1v1d1
// h1v2h1
// h1d1v1
// h2v1v1
// h2v2
// v1h1h1v1
// v1h1v1h1
// v1h1d1
// v1h2v1
// v1v1h1h1
// v1v1h2
// v1d1h1
// v2h1h1
// v2h2
// d1h1v1
// d1v1h1
// d1d1
// d2



package recursion.recursionOnTheWayUp;

import java.util.Scanner;

public class recursion_05 {
    public static void main(String[] args) {
        System.out.println("Enter Input :-");
        Scanner scn = new Scanner(System.in);

        int sr = scn.nextInt();
        int sc = scn.nextInt();

        System.out.println("Output :-");
        printMazePaths(0,0,sr-1,sc-1,"");

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

        for(int jmp = 1 ; sc + jmp <= dc ; jmp++) {
            printMazePaths(sr ,sc + jmp , dr , dc , psf + "h" + jmp);
        }

        for(int jmp = 1 ; sr + jmp <= dr ; jmp++) {
            printMazePaths(sr + jmp , sc , dr , dc , psf + "v" + jmp);
        }

        for(int jmp = 1 ; sc + jmp <= dc && sr + jmp <= dr ; jmp++) {
            printMazePaths(sr + jmp , sc + jmp , dr , dc , psf + "d" + jmp);
        }
    }    
}
