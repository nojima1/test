package tsd;

public class Test07 {
	int x = 5;
	static int y = 7;

	public static void main(String[] args) {
		int x = 12;
		int y = 12;
		Test07 obj = new Test07();
		obj.printIt();
		obj.printIt(y);
		

	}
	
	Test07(){ x = x + 2;}
	static { y += y;}
	
	void printIt() {
		System.out.print(++x);
	}
	void printIt(int y) {
		System.out.print(" " + ++y);
	}

}
