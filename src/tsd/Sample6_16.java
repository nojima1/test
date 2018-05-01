package tsd;

public class Sample6_16 {

	public static void main(String[] args) {
		String str1 = args[0];
		String str2 = args[1];
		
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		//10 20 のコマンドライン引数
		
		//String型の表示
		System.out.println("str1 + str2 = " + str1 + str2);
		
		//int型に変換↓
		System.out.println("合計  :  " + (num1 + num2));

	}

}
