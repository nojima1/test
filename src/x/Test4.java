package x;
class Animal3 {
	void cry() {
		System.out.println("????");
	}
}
class Dog2 extends Animal3{
	void cry() {
		System.out.println("わんわん");
		
		
	}
}
class Cat2 extends Animal3{
	void cry () {
		System.out.println("にゃー");
	}
	
}

public class Test4 {

	public static void main(String[] args) {
		//ポリモーフィズム
		Animal3 a = new Dog2();
		a.cry();
		
		//事前に暗黙的型変換されたものを戻す
		if(a instanceof Dog2) {
			Dog2 d = (Dog2) a;
			
		}
		
		
	}

}
