package �ڹ��佺Ƽ��;

import java.util.Scanner;

public class B01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = 0, B = 0;
		while (true) {
			System.out.print("A �Է� : ");
			A = sc.nextInt();
			System.out.print("B �Է� : ");
			B = sc.nextInt();

			if (A == 0 && B == 0) {
				break;
			}
			System.out.println("��� : " + (A - B));

		}
	}

}
