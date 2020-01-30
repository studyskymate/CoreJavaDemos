package com.studyskymate.dinesh.corejava.dsa;

public class ReverseWord {

	public static void main(String[] args) {
		String str = "Welcome to geeksforgeeks";

		char c[] = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			int k = i;
			while (i < c.length && c[i] != ' ') {
				i++;
			}
			reverse(c, k, i - 1);
		}

		System.out.println(new String(c));

		System.out.println("GfG!");
	}

	private static void reverse(char[] c, int k, int i) {
		System.out.println("k: "+k+" i:"+i);
		while (k < i) {
			char temp = c[k];
			c[k] = c[i];
			c[i] = temp;
			k++;
			i--;
		}

	}

}
