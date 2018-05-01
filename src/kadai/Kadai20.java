package kadai;

import java.util.Scanner;

public class Kadai20 {

	public static void main(String[] args) {
		Scanner  scn = new Scanner(System.in);

		System.out.println("カウントダウンします。");
		System.out.print("正の数値:");
		int a = scn.nextInt();
		scn.close();

		while(0 <= a) {
			System.out.println(a);
			a--;
		}

	}

}
