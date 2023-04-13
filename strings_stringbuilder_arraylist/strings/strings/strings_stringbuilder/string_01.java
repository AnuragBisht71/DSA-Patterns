// Print All Palindromic Substrings

// Input :-  abcc

// Output :-

// a
// b
// c
// cc
// c



package strings_stringbuilder_arraylist.strings.strings.strings_stringbuilder;

import java.util.Scanner;

public class string_01 {

    public class Main {
        
        public static boolean isPalindrome(String s) {
            int lo = 0;
            int hi = s.length()-1;

            while(lo < hi) {
                if(s.charAt(lo) != s.charAt(hi)) {
                    return false;
                }

                lo++;
                hi--;
            }

            return true;
        }

        public static void solution(String str){
            for(int sp = 0 ; sp <= str.length()-1 ; sp++) {
                for(int ep = sp+1 ; ep <= str.length() ; ep++) {
                    
                    String s = str.substring(sp,ep);
                    if(isPalindrome(s)) {
                        System.out.println(s);
                    }
                }
            }
        }
    
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter Input :-");

            String str = scn.next();

            System.out.println("Output :-");
            solution(str);

            scn.close();
        }
    
    }
}
