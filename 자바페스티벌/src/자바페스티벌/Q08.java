package �ڹ��佺Ƽ��;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		System.out.println("�ݿø��� : "+(num%10>=5? num/10*10+10 : num/10*10));
		

	}

}
