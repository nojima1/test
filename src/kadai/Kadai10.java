package kadai;

public class Kadai10 {

	public static void main(String[] args) {
		int a = 55;
		int b = 33;
		int c = 44;

		System.out.println("a <= b <= cとなるようソートしました。");

		if (a <= b && b<= c) {
			System.out.println("変数aは"+a+"です。");
			System.out.println("変数bは"+b+"です。");
			System.out.println("変数cは"+c+"です。");
		}else if (a <= c && c <= b) {
			System.out.println("変数aは"+a+"です。");
			System.out.println("変数bは"+c+"です。");
			System.out.println("変数cは"+b+"です。");
		}else if (b <= a && a <= c) {
			System.out.println("変数aは"+b+"です。");
			System.out.println("変数bは"+a+"です。");
			System.out.println("変数cは"+c+"です。");
		}else if (b <= c && c <= a) {
			System.out.println("変数aは"+b+"です。");
			System.out.println("変数bは"+c+"です。");
			System.out.println("変数cは"+a+"です。");
		}else if (c <= a && a <= b) {
			System.out.println("変数aは"+c+"です。");
			System.out.println("変数bは"+a+"です。");
			System.out.println("変数cは"+b+"です。");
		}else if (c <= b && b <= a) {
			System.out.println("変数aは"+c+"です。");
			System.out.println("変数bは"+b+"です。");
			System.out.println("変数cは"+a+"です。");

		}
	}

}
