// Toggle Case

// Input :- pepCODinG

// Output :- PEPcodINg



package strings_stringbuilder_arraylist.strings.strings.strings_stringbuilder;

import java.util.Scanner;

public class string_03 {
    public static String toggleCase(String str){
		String res = "";

        for(int i = 0 ; i < str.length() ; i++) {
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z') {
                char uc = (char)('A' + (ch - 'a'));
                res = res + uc;
            }
            else if(ch >= 'A' && ch <= 'Z') {
                char lc = (char)('a' + (ch - 'A'));
                res = res + lc;
            }
        }

		return res;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input:-");

		String str = scn.next();

        System.out.println("Output :-");
		System.out.println(toggleCase(str));

        scn.close();
	}
}
