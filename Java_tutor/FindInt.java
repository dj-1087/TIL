package test;

import java.util.Scanner;

public class FindInt {

	public static void main(String[] args) {
		System.out.println("�� ���α׷��� �־��� ���� ����Ʈ���� ū ���� 2���� ã�� ���α׷��Դϴ�.\n�� �ٿ� �ϳ��� ������ �Է��ϰ�, ���α׷��� �����ϰ� ������ 0�� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		int num, max=0, max2=0;
		do {?��
			System.out.print("Enter an integer: ");
			num = sc.nextInt();
			if(num>max2) {
				if(num>max) {
					max=num;
				}else {
					max2=num;
				}
			}
		}while(num!=0);
		System.out.println("���� ū ������ "+max+"\n�ι�°�� ū ������ "+max2);
		sc.close();
	}

}
