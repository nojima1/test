package kadai;

public class Kadai09 {

	public static void main(String[] args) {
		int a = 11;
		int b = 22;

		if(a > b) {
			System.out.println("小さいほうの値は"+b+"です。");
			System.out.println("大きいほうの値は"+a+"です。");

		}else if(b > a) {
			System.out.println("小さいほうの値は"+a+"です。");
			System.out.println("大きいほうの値は"+b+"です。");

		}else {
			System.out.println("2つの値は同じです。");
		}

	}

}
