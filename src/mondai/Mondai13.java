package mondai;

public class Mondai13 {

	public static void main(String[] args) {
		SummaryImpl sup = new SummaryImpl();
		System.out.println(sup.exec(5, 5));

		Summary sup2 = new Summary() {
			@Override
			public int exec(int a, int b) {

				return a + b;
			}

		};
		System.out.println( sup2.exec(5, 3));


		Summary sup3 = (int a, int b)->{
			return a+ b;
		};
		System.out.println(sup3.exec(31, 32));


		Summary sup4 = (int a, int b)-> a+ b;
		System.out.println(sup4.exec(11, 31));


	}

}
interface Summary{
	public int exec(int a, int b );

}
class SummaryImpl implements Summary{

	@Override
	public int exec(int a, int b) {
		return a+b;
	}

}