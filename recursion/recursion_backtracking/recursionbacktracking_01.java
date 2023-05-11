// Flood Fill

// Input :-

// 3 3
// 0 0 0
// 1 0 1
// 0 0 0

// Output :-

// rddr



package recursion.recursion_backtracking;

import java.util.Scanner;

public class recursionbacktracking_01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        System.out.println("Output :-");
        floodfill(arr, 0, 0, "", new boolean[n][m]);

        scn.close();
    }
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf, boolean visited[][]) {
        if(sr < 0 || sc < 0 || sr >= maze.length || sc >= maze[0].length) {
            return;
        }
        if(visited[sr][sc] == true) {
            return;
        }
        if(maze[sr][sc] == 1) {
            return;
        }

        if(sr == maze.length-1 && sc == maze[0].length-1) {
            System.out.println(asf);
            return;
        }

        visited[sr][sc] = true;

        floodfill(maze, sr-1, sc, asf + "t", visited);
        floodfill(maze, sr, sc-1, asf + "l", visited);
        floodfill(maze, sr+1, sc, asf + "d", visited);
        floodfill(maze, sr, sc+1, asf + "r", visited);

        visited[sr][sc] = false;
    }
}
