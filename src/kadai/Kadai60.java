package kadai;

import java.util.Scanner;

public class Kadai60 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("1からzまでの和を求めます。");
		System.out.print("zまでの値：");
		int n1 = scn.nextInt();

		Test60 t = new Test60();
		int i = t.sumup(n1);
		System.out.println("1から"+ n1 + "までの和は"+ t.sumup(n1));

		scn.close();


	}

}
class Test60{

	int sumup(int n) {
		int sum = 0;
		for(int i = 0; i < n ; i++) {
			sum += i+1;
		}

		return sum;

	}
}