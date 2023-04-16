// Print All Permutations Of A String Iteratively

// Input :- a b c

// Output :- 

// abc
// bac
// cab
// acb
// bca
// cba



package strings_stringbuilder_arraylist.strings.strings.strings_stringbuilder;

import java.util.Scanner;

public class string_04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

		String str = scn.next();
		
        System.out.println("Output :-");
        solution(str);

        scn.close();
    }

    public static int fact(int num) {
        int res = 1;
        for(int i = 1 ; i <= num ; i++) {
            res = res * i;
        }
        return res;
    }
    
    public static void solution(String str) {
        int n = str.length();
        int totalPerm = fact(n);

        for(int num = 0 ; num < totalPerm ; num++) {
            int tmp = n;
            int val = num;
            String mStr = str;
            String perm = "";

            while(tmp != 0) {
                int rem = val % tmp;
                val = val / tmp;
                perm = perm + mStr.charAt(rem);

                String lp = mStr.substring(0,rem);
                String rp = mStr.substring(rem+1);
                mStr = lp + rp;
                tmp--;
            }

            System.out.println(perm);
        }
    }
}
