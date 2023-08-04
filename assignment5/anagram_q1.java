package assignment5;

import java.util.Arrays;

public class anagram_q1 {
	public static void main(String args[]) {
		String str1 = "gramtrew" ;
		String str2 = "aewrtgrm";
		char[] ch1 = new char[str1.length()];
		for (int i = 0; i < str1.length(); i++) {
			ch1[i] = str1.charAt(i);
		}
		char[] ch2 = new char[str2.length()];
		for (int i = 0; i < str2.length(); i++) {
			ch2[i] = str2.charAt(i);
		}
		int n1 = ch1.length;
		int n2 = ch2.length;
		 if (n1 != n2) {
			 System.out.println("The two strings are not anagram of each other");
			 return;
		 }
		 Arrays.sort(ch1);
		 Arrays.sort(ch2);
		 for (int i = 0; i < n1; i++)
			 if (ch1[i] != ch2[i]) {
				 System.out.println("The two strings are not anagram of each other");
				 return;
			 }
		 System.out.println("The two strings are anagram of each other");
	}
}

