package kadai;

import java.util.Scanner;

public class Kadai59 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("整数a:");
		int a2 = scn.nextInt();
		System.out.print("整数b:");
		int b2 = scn.nextInt();
		System.out.print("整数c:");
		int c2 = scn.nextInt();


		Test59 t = new Test59();
		int i = t.med(a2,b2,c2);
		System.out.println("中央値は"+i+"です。");
		
		scn.close();

	}

}
class Test59{


	int med(int a, int b, int c) {
		if(b >= c && a >= c && b >= a) {
			return a;
		}else if(c >= b && a >= b && c >= a) {
			return a;
		}else if(a >= c && b >= c && a >= b) {
			return b;
		}else if(c >= a && b >= a && c >= b) {
			return b;
		}else if(b >= a && c >= a && b >= c) {
			return c;
		}else {
			return c;
			
			

		}





		
	}
}