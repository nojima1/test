package kadai;

import java.util.Scanner;

public class Kadai16 {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);

		int y;

		do {
			System.out.print("整数値:");
			int i = scn.nextInt();

			if(i > 0) {
				System.out.println("その値は正です。");
			}else if(i == 0) {
				System.out.println("その値は0です。");
			}else {
				System.out.println("その値は負です。");
			}
			System.out.print("もう一度？ 1...Yes/0...No :");
			y =scn.nextInt();


		}while(y == 1);
		scn.close();


	}

}
