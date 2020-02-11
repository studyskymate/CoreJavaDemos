package com.studyskymate.dinesh.corejava.dsa;

public class StringMan {

	public static void main(String[] args) {

		System.out.println("Hello World");

		String s = "geeks for geeks";

		// Method 1
		String str[] = s.split("\\s");

		String output = "";
		for (String st : str) {
			System.out.println(" " + st);
			char s1 = st.charAt(0);
			char s2 = st.charAt(st.length() - 1);
			String substr = st.substring(1, st.length() - 1);
			output = output + s2 + substr + s1 + " ";
			System.out.println(output);
		}
		System.out.println("*****************************");
		// Method 2
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) {

			int k = i;
			while (i < c.length && c[i] != ' ') {
				i++;
			}
			swap(c, k, i);
		}

		System.out.println(new String(c));

	}

	private static void swap(char[] c, int k, int i) {
		char temp = c[k];
		c[k] = c[i-1];
		c[i-1] = temp;
	}

}
