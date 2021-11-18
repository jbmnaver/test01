package 자바페스티벌;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("반올림수 : "+(num%10>=5? num/10*10+10 : num/10*10));
		

	}

}
