package chapter1;

import java.util.Scanner;

class Dictionary {
	private static String [] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
	private static String [] eng = { "love", "baby", "money", "future", "hope" };
	public String kor2Eng(String word) {
		for(int i=0; i<kor.length; i++) {
			if(word.equals(kor[i])) {
				return eng[i];
			}
		}
		return null;
	}
}

public class DicApp {
	Scanner sc = new Scanner(System.in);
	String word;
	
	public void Run() {
		while(true) {
			System.out.print("�ѱ� �ܾ�?");
			word = sc.next();
			if(word.equals("�׸�")) {
				break;
			}
			Dictionary dic = new Dictionary();
			String result = dic.kor2Eng(word);
			if(result==(null))
				System.out.println(word+"��(��) ���� ������ �����ϴ�.");
			else
				System.out.println(word+"��(��) "+result);
		}
	}
	public static void main(String[] args) {
		DicApp dicapp = new DicApp();
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		dicapp.Run();
	}
}