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
		System.out.print("���ܾ �Է��ϼ���: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("�Ųٷε� ���ܾ��: "+ReverseStr.reverseStr(str));
		sc.close();
	}
}
