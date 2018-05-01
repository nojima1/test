package kadai;

public class Kadai08 {

	public static void main(String[] args) {
		int a = 33;
		int b = 11;
		int c = 22;

		if(a < b && b < c) {
			System.out.println("最小値は"+a+"です。");
		}else if(a < c && c < b) {
			System.out.println("最小値は"+a+"です。");
		}else if(b < a && a < c) {
			System.out.println("最小値は"+b+"です。");
		}else if(b < c && c < a) {
			System.out.println("最小値は"+b+"です。");
		}else if(c < a && a < b) {
			System.out.println("最小値は"+c+"です。");
		}else if(c < b && b < a) {
			System.out.println("最小値は"+c+"です。");

		}

	}

}
