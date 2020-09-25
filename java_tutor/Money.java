package chapter1;

import java.util.Scanner;

public class Money {
	public static void main (String args[])  {
		int[] unit = new int [8];
		unit[0] = 50000;
		unit[1] = 10000;
		unit[2] = 1000;
		unit[3] = 500;
		unit[4] = 100;
		unit[5] = 50;
		unit[6] = 10;
		unit[7] = 1;
		
		int res;
		int money;
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		money = sc.nextInt();
		res = money;
		for (int i = 0; i < unit.length; i++) {
			res = money/unit[i];
			money = money%unit[i];
			System.out.println("오만원권 "+ res + "매");
		}
		
		sc.close();
	}

}
