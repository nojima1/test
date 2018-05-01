package x;

public class Test7_1 {

	public static void main(String[] args) {
		String s = "12.3456";
		change(s);

	}
	public static void change(String s) {
		try {
			double i = Double.parseDouble(s);
			System.out.println(i);
		}catch(Exception e) {
			System.out.println("caught exeception :" + e);
			
		}finally {
			System.out.println();
		}
	}

}
