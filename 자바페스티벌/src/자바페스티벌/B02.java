package �ڹ��佺Ƽ��;

import java.util.Scanner;

public class B02 {

	public static void main(String[] args) {

		System.out.println(getMiddle("test"));

	}

	public static String getMiddle(String word) {

		String[] arr = word.split("");

		return arr.length % 2 == 0 ? arr[arr.length / 2 - 1] + arr[arr.length / 2] : arr[arr.length / 2];
	}

}
