package practice;

import java.util.function.Predicate;


public class Mondai0425 {

	public static void main(String[] args) {
		//implements
		PredicateImpl pl = new PredicateImpl();
		System.out.println(pl.test("おはようございます。"));

		//匿名クラス
		Predicate<String> pre = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.length() >= 10;
			}
		};
		System.out.println(pre.test("今日は水曜日"));

		//ラムダ式
		Predicate<String> pre1 = t -> t.length() >= 10;
		System.out.println(pre1.test("これは10文字以上ですか"));

	}

}
class PredicateImpl implements Predicate<String>{
	@Override
	public boolean test(String t) {
		return t.length() >= 10;
	}

}