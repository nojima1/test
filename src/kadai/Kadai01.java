package kadai;

import java.util.Scanner;

public class Kadai01 {

	public static void main(String[] args) {
		System.out.print("数値を入力:");

		Scanner scn = new Scanner(System. in);
		int x = scn.nextInt();
		scn.close();

		if (x > 0) {
			System.out.println("その値は正です。");
		} else {
			System.out.println("その値は負です。");
		}

	}
}


