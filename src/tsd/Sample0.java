package tsd;

public class Sample0 {

	public static void main(String[] args) {
		System.out.println("main start.");


		//メインメソッドのほうは呼び出し元
		Hoge h1 = new Hoge();//Hogeをインスタンス化
//		h1.method1();//メソッドの呼び出し
//		h1.method2("hogehoge");//hogehogeがインプット ""の中を変えれば出力されるものも変わる
		//定義側と呼び出し側のデータ型をそろえる
		String s = h1.method3();//helloがアウトプット
		// →String s = "hhello"; helloが代入されて出力される。
		System.out.println(s);
		//System out.println(h1.method3());
		// -> Systemo.out.println("hello");

		int result = h1.method4(123, 456);
		System.out.println(result);

		System.out.println("main finish.");
		//前のが呼び出されてからここに戻る



	}

}
// public class }の外に書く

class Hoge{
	//引数・戻り値なし
	void method1() {
		System.out.println("method called.");
		//メソッドを定義


	}
	//引数あり、戻り値なし
	void method2(String s) {//s = "hogehoge" 見えないところで
		System.out.println("method2 called");
		System.out.println(s);
	}

	//引数なし、戻り値あり
	String method3() {
		System.out.println("method3 called");
		String h = "hello";
		return h;//戻り値：メソッドの結果を呼び出し元に返す
		//returnを書かないといけない
	}


	//引数あり、戻り値あり
	int method4(int x , int y) { //x = 123 ; y = 456;が入ってるイメージ
		System.out.println("method4 called");
		int z = x + y;
		return z;
	}



}
