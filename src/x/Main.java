package x;

public class Main {

	public static void main(String[] args) {
		Fruits banana = new Fruits("バナナ");
		Fruits apple = new Fruits("リンゴ");
		
		
		banana.method2();
		apple.method2();
		

	}

}
class Fruits{
	private String name;
	
	public Fruits() {
		this.name = "ななし";
	}
	public Fruits(String name ) {
		this.name = name;
	}
	
	public String method1() {
		return "{" +this.name+"}";
		
	}
	public void method2() {
		System.out.println("test");
		System.out.println(this.method1());
		
	}
}
