package test;

import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDesString();
	protected double ratio;
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString()+"�� "+getDesString()+"�� �ٲߴϴ�.");
		System.out.print(getSrcString()+"�� �Է��ϼ���>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���: "+res+getDesString()+" �Դϴ�.");
		scanner.close();
	}
}

public class Km2Mile extends Converter {
	private String srcString, desString;
	public Km2Mile() {
		this.ratio = 0.62;
		srcString = "Km";
		desString = "mile";
	}
	
	public String getSrcString() {
		return srcString;
	}

	public String getDesString() {
		return desString;
	}
	@Override
	protected double convert(double src) {
		return src*ratio;
	}
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile();
		toMile.run();
	}

}
