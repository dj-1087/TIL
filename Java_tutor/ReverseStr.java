package test;

import java.util.Scanner;

public class ReverseStr {
	public static String reverseStr(String str) {
		char[] chars = str.toCharArray();
		char[] reverseChars = new char [chars.length];
		for (int i = 0; i < chars.length; i++) {
			reverseChars[i] = chars[chars.length-i-1];
		}
		chars = reverseChars;
		return new String(chars);
	}
	public static void main(String[] args) {
		System.out.print("영단어를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("거꾸로된 영단어는: "+ReverseStr.reverseStr(str));
		sc.close();
	}
}
