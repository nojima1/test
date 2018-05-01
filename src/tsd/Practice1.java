package tsd;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("a = ");
		int x = scn.nextInt();
		System.out.print("b = ");
		int y = scn.nextInt();

		Kuraberu k1 = new Kuraberu();

		k1.a = x;
		k1.b = y;

		int i = k1.getBigger();

		System.out.println("大きい方の値は"+ i + "です。");

		scn.close();
//		Kuraberu k = new Kuraberu();
//
//		int x = 100;
//		int y = 101;
//
//		k.a = x;
//		k.b =y;
//
//		int bigger = k.getBigger();
//		System.out.println("大きいほうの値は"+ bigger + "です。");


	}

}
class Kuraberu{
//	属性：int a , int b
//	操作：属性値aとbを比較し、大きいほうを戻すメソッド(引数なし)
//	メソッド名：getBigger() *戻り値はどうするか？？
	int a;
	int b;

	int getBigger() {

		if(a > b) {
			return a;
		}else {
			return b;
		}




	}



}
