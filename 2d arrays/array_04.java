// Sprial Display

// Input :-

// 3 --> no. of rows
// 5 --> no. of columns

// 11 12 13 14 15
// 21 22 23 24 25
// 31 32 33 34 35

// Output :-

// 11
// 21
// 31
// 32
// 33
// 34
// 35
// 25
// 15
// 14
// 13
// 12
// 22
// 23
// 24



import java.util.Scanner;

public class array_04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int nr = scn.nextInt();
        int nc = scn.nextInt();
        int mat[][] = new int[nr][nc];
        for(int i = 0 ; i < nr ; i++) {
            for(int j = 0 ; j < nc ; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        
        System.out.println("Output :-");
        spiralDisplay(mat);

        scn.close();
    }

    public static void spiralDisplay(int[][]mat) {
        int rmin = 0;
        int cmin = 0;
        int rmax = mat.length-1;
        int cmax = mat[0].length-1;
        int count = 0;
        int totalEle = mat.length * mat[0].length;

        while(count < totalEle) {
            for(int i = rmin , j = cmin ; i <= rmax && count < totalEle ; i++) {
                System.out.println(mat[i][j]);
                count++;
            }

            for(int i = rmax , j = cmin + 1 ; j <= cmax && count < totalEle ; j++) {
                System.out.println(mat[i][j]);
                count++;
            }

            for(int i = rmax-1 , j = cmax ; i >= rmin && count < totalEle ; i--) {
                System.out.println(mat[i][j]);
                count++;
            }

            for(int i = rmin , j = cmax-1 ; j >= cmin+1 && count < totalEle ; j--) {
                System.out.println(mat[i][j]);
                count++;
            }

            rmin++;
            cmin++;
            rmax--;
            cmax--;
        }
    }
}
