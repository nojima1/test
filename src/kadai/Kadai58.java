package kadai;

import java.util.Scanner;

public class Kadai58 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("整数a:");
		int a = scn.nextInt();
		System.out.print("整数b:");
		int b = scn.nextInt();
		System.out.print("整数c:");
		int c = scn.nextInt();
		//minメソッドを実行するプログラム
		Test58 t = new Test58();
		//下のほう
		int i = t.min(a, b, c);
		//実行結果出力
		System.out.println("最小値は"+i+"です。");
		scn.close();
		
	}

}

class Test58{
	int min(int a, int b, int c) {
		if(a > b && b > c) {
			return c;
		}else if(b > a && a > c) {
			return c;
		}else if(a > c && c > b) {
			return b;
		}else if(c > a && a > b) {
			return b;
		}else if(c > b && b > a) {
			return a;
		}else {
			return a;
			
		}
			
		
	}
}
