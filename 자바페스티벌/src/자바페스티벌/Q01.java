package �ڹ��佺Ƽ��;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ : ");
		int now = sc.nextInt();
		System.out.print("��ǥ ������ : ");
		int goal = sc.nextInt();
		int week = 1;
		while (true) {
			System.out.print(week + "���� ���� ������ : ");
			int loss = sc.nextInt();
			week++;
			now -= loss;
			if (now <= goal) {
				System.out.println(now + "kg �޼�! �����մϴ�!");
				break;
			}

		}
	}

}
