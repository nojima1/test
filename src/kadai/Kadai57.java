package kadai;

import java.util.Scanner;

public class Kadai57 {

	public static void main(String[] args) {

		//入力を受け取るプログラム
		Test57 t1 = new Test57();
		Scanner scn = new Scanner(System.in);
		System.out.print("整数x :");
		int x = scn.nextInt();
		//sighOfメソッドを実行するプログラム
		int i= t1.signOf(x);
		//下のほう

		//実行結果出力
		System.out.println("signOf(x)は"+i+("です。"));
		scn.close();
	}

}

class Test57{
	//signOfメソッドを作る
	//(syoutを入れない)
	int signOf(int n) {

		if (n == 0) {
			int x = 0;
			return x;
		}else if(n > 0) {
			int x =1;
			return x;
		}else {
			int x = -1;
			return x;

		}

	}


}
