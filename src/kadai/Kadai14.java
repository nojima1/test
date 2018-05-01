package kadai;

import java.util.Scanner;

public class Kadai14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = 50;
		System.out.println("整数 : " + a);
		

		if(a % 3 == 0) {
			System.out.println("入力された値は 3 の倍数です。");
		}else if(a % 3 == 1) {
			System.out.println("入力された値を 3 で割ると1余ります。");
		}else if(a % 3 == 2){
			System.out.println("入力された値を 3 で割ると2余ります。");
		}else {
			System.out.println("数字を入力してください。");
		}



	}

}
