package tsd;

class FinTest{
	final int a = 15;//finala指定のインスタンス変数
	static final int b = 25;//final指定のstatic変数です。
	static int c = 35;//static 変数です（変更可能）
	int d = 45;//インスタンス変数
	int e;//インスタンス変数（デフォルト値で初期化）

	void method() {
		int f;//ローカル変数(初期化されていない)ので表示されない
		System.out.println("a " + a);
		System.out.println("b " + b);
		System.out.println("c " + c);
		System.out.println("d " + d);
		System.out.println("e " + e);
	}

}

public class Sample6_5 {

	public static void main(String[] args) {

		FinTest.c= 50;

		FinTest f = new FinTest();
		f.method();


	}

}
