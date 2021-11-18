package 자바페스티벌;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = num -i - 1; j >= 0; j--) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
