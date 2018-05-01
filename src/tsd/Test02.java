package tsd;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System. in);


		System.out.print("人数：");
		int p = scn.nextInt();

		System.out.println("点数を入力せよ。");

		int[] n = new int[p];
		double sum = 0;
		double average = 0.0;
		int max = 0;
		int min = 100;

		for(int i = 0; i < p ; i++) {
			System.out.print((i+1)+ "番目の点数:");
			n[i] = scn.nextInt();
			sum += n[i];
			average = sum / p;

			if(max < n[i]) {
				max = n[i];

			}
			if(min > n[i]);{
				min = n[i];

			}

		}
		System.out.println("合計点は"+ sum + "です。");
		System.out.println("平均点は"+ average + "です。");
		System.out.println("最高点は"+ max + "です。");
		System.out.println("最低点は"+ min + "です。");
		scn.close();


	}

}
