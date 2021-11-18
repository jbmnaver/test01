package 자바페스티벌;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("일한 시간을 입력하세요 : ");
		int time = sc.nextInt();
		int wageH = 5000;
		int regular = 8;
		int overWage = (int) (wageH * 1.5);

		int wageOfDay = time > regular ? regular * wageH + (time - regular) * overWage : regular * wageH;
		System.out.printf("총 임금은 %d원 입니다\n", wageOfDay);

	}

}
