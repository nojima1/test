package tsd;

abstract class School {
	String name;
	void getName() {
		System.out.println("School 名前 ;" + name);
	}
	void setName(String n) {
		name = n;
	}
}
class Students extends School {

	void getName() {
		System.out.println("Student 名前  :" + name);
		//オーバーライドした側が表示される
	}
}

public class Sample6_14 {

	public static void main(String[] args) {
		School s1 = new Students();

		s1.setName("山田");
		s1.getName();



	}

}
