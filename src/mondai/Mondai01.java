package mondai;

import java.util.function.Predicate;

public class Mondai01 {

	public static void main(String[] args) {
		//implements オーソドックスな奴
		PredicateImpl pl = new PredicateImpl();
		System.out.println(pl.test("おはようございます。"));


		//匿名クラス
		Predicate<String> pre = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.length() >= 10;
			}
		};
		System.out.println(pre.test("私は"));

		//ラムダ式
		Predicate<String> pre1 = (String t)->{
			return t.length() >= 10;
		};
		System.out.println(pre1.test("これは10文字以上なのか？"));

		//ラムダ式省略
		Predicate<String> pre2 =  t -> t.length() >=10;
			System.out.println(pre2.test("私の名前は"));;



	}

}
class PredicateImpl implements Predicate<String>{
	@Override
	public boolean test(String t) {
		return t.length() >= 10;
	}


}
