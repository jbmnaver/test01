package �ڹ��佺Ƽ��;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ð��� �Է��ϼ��� : ");
		int time = sc.nextInt();
		int wageH = 5000;
		int regular = 8;
		int overWage = (int) (wageH * 1.5);

		int wageOfDay = time > regular ? regular * wageH + (time - regular) * overWage : regular * wageH;
		System.out.printf("�� �ӱ��� %d�� �Դϴ�\n", wageOfDay);

	}

}
