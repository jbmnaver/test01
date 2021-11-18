package 자바페스티벌;

import java.util.Scanner;

public class B01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = 0, B = 0;
		while (true) {
			System.out.print("A 입력 : ");
			A = sc.nextInt();
			System.out.print("B 입력 : ");
			B = sc.nextInt();

			if (A == 0 && B == 0) {
				break;
			}
			System.out.println("결과 : " + (A - B));

		}
	}

}
