package kadai;

import java.util.Random;
import java.util.Scanner;
public class Kadai45 {

	public static void main(String[] args) {
		//Test04にメモ
		Scanner scn = new Scanner(System.in);
		System.out.print("要素数:");
		int count = scn.nextInt();
		scn.close();

		int[]arr = new int[count];
		for(int i = 0; i < arr.length; i++) {
			//1~10のRandom
			arr[i] = new Random().nextInt(10)+1;
		}

		for(int i : arr) {
			System.out.print(i +" ");
		}
		System.out.println();

		for(int j = 0 ; j < arr.length; j++) {
			for (int i = 0; i < arr.length; i++) {
				if(j == arr [i]) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print("--");
		}
		System.out.println();

		for(int i = 0; i <arr.length ; i++) {
			System.out.println((i % 10)+ " ");
		}




//		String[][] b = new String[10][count];
//		int[] x = new int[count];




//
//		for(int i = 0; i<a;i++) {
//			System.out.println("*");
//		}




		//1から10までのランダム
		//int r = new Random(). nextInt(10)+ 1;

	}

}
