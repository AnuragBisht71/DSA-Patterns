// N Queens

// Input :-

// 4

// Output :-

// 0-1, 1-3, 2-0, 3-2, .
// 0-2, 1-0, 2-3, 3-1, .



package recursion.recursion_backtracking;

import java.util.Scanner;

public class recursionbacktracking_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int n = scn.nextInt();

        System.out.println("Output :-");
        printNQueens(new int[n][n] , "" , 0);

        scn.close();
    }

    public static boolean isSafe(int chess[][] , int r , int c) {
        for(int i = r-1 , j = c ; i >= 0 ; i--) {
            if(chess[i][j] == 1) {
                return false;
            }
        }
        
        for(int i = r-1 , j = c+1 ; i >= 0 && j < chess[0].length ; i-- , j++) {
            if(chess[i][j] == 1) {
                return false;
            }
        }

        for(int i = r-1 , j = c-1 ; i >= 0 && j >= 0 ; i-- , j--) {
            if(chess[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if(row == chess.length) {
            System.out.println(qsf + ".");
            return;
        }

        for(int col = 0 ; col < chess.length ; col++) {
            if(isSafe(chess , row , col)) {
                chess[row][col] = 1;
                printNQueens(chess, qsf + row + "-" + col + ",", row+1);
                chess[row][col] = 0;
            }
        }
    }
}