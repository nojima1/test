package tsd;

interface MyInterface{
	public static final int a = 10;
	public void getComment();//抽象メソッド
}
interface SubInterface extends MyInterface{
	int getSum(); //抽象メソッド
}


class C implements SubInterface{
	public void getComment() {
		System.out.println("スパーインタフェースを実装する。");
	}
	public int getSum() {
		return (a + 5);
	}
}
public class Sample6_11 {

	public static void main(String[] args) {
		C c1 = new C();
		c1.getComment();
		System.out.println(c1.getSum());

	}

}
