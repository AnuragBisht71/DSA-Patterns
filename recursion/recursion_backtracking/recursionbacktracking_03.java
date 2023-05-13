// Knights Tour

// Input :-

// 5
// 2
// 0

// Output :-

// 25 2 13 8 23           19 2 13 8 21           25 2 13 8 19 
// 12 7 24 3 14           12 7 20 3 14           12 7 18 3 14 
// 1 18 15 22 9           1 18 15 22 9           1 24 15 20 9 
// 6 11 20 17 4           6 11 24 17 4           6 11 22 17 4 
// 19 16 5 10 21          25 16 5 10 23          23 16 5 10 21 



package recursion.recursion_backtracking;

import java.util.Scanner;

public class recursionbacktracking_03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int n = scn.nextInt();
        int r = scn.nextInt();
        int c = scn.nextInt();

        System.out.println("Output :-");
        printKnightsTour(new int[n][n], r, c, 1);

        scn.close();
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        if(r < 0 || c < 0 || r >= chess.length || c >= chess[0].length) {
            return;
        }

        if(chess[r][c] != 0) {
            return;
        }

        if(upcomingMove == chess.length * chess[0].length) {
            chess[r][c] = upcomingMove;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }

        chess[r][c] = upcomingMove;

        printKnightsTour(chess, r - 2, c + 1, upcomingMove + 1);
        printKnightsTour(chess, r - 1, c + 2, upcomingMove + 1);
        printKnightsTour(chess, r + 1, c + 2, upcomingMove + 1);
        printKnightsTour(chess, r + 2, c + 1, upcomingMove + 1);
        printKnightsTour(chess, r + 2, c - 1, upcomingMove + 1);
        printKnightsTour(chess, r + 1, c - 2, upcomingMove + 1);
        printKnightsTour(chess, r - 1, c - 2, upcomingMove + 1);
        printKnightsTour(chess, r - 2, c - 1, upcomingMove + 1);

        chess[r][c] = 0;
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
