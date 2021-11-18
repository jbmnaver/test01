package 자바페스티벌;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		int out = 0;
		int sum = 0;
	for(int i=1; i<101; i++) {
		out = i%2==1? i : -i;
		sum += out;
		System.out.print(out+" ");
	}
	
	System.out.println();
	System.out.println("결과 : "+sum);
	
	
	}

}
