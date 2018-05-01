package tsd;

public class Sample6_12 {

	public static void main(String[] args) {
		int i = 5;
		double d = 2.5;

		System.out.println("int → double : ");
		double id = i;
		System.out.println(id);


		System.out.print("double → char : " );
		//char dc = d;  暗黙的返還ではdoubleが上の方なのでコンパイルエラー
		//System.out.println(dc);

	}

}
