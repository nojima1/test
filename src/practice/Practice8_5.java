package practice;

import java.util.function.Predicate;

public class Practice8_5 {

	public static void main(String[] args) {
		//オーソドックス implements new	する
		Pre1 p1 = new Pre1();
		System.out.println(p1.test(100));

		//匿名クラス
		Predicate<Integer> p2 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t == 1;
			}

		};
		System.out.println(p2.test(100));
		
		//ラムダ式
		Predicate<Integer> p3 =  t -> t==1;
		System.out.println(p3.test(11));;


	}

}
class Pre1 implements Predicate<Integer>{
	@Override
	public boolean test(Integer t) {
		return t == 1;
	}
}
