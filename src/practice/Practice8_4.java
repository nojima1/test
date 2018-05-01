package practice;

public class Practice8_4 {

	public static void main(String[] args) {
		Practice8_4 p = new Practice8_4();

		p.testMethod(new Int(){
			@Override
			public void method(String s) {
				System.out.println(s);
			}
		});

	}

	void testMethod(Int i) {
		System.out.println("practiceMethod");
		i.method("hello");
	}

}
interface Int{
	public void method(String s);
}
