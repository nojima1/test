package servey;


public class Jikken {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str4 = new String("hello");
		String str3 =  str4;

		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		System.out.println(str2.equals(str3));
		System.out.println(str2.equals(str4));
		System.out.println(str4.equals(str2));
		System.out.println(str1 == str4);

	}

}

