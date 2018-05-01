package tsd;

public class FruitsMain {

	public static void main(String[] args) {

		Fruits fru1 = new Fruits("orange", "オレンジ", 50); //Fruitsクラスインスタンス化
		Fruits fru2 = new Fruits("banana", "黄色", 100);
		Fruits fru3 = new Fruits("apple", "赤", 150);

		System.out.println("その果物名は"+ fru1.getName()+ "です。色は" + fru1.getColor()+ "で、値段は"+fru1.getPrice()+"円です");
		System.out.println("その果物名は"+ fru2.getName()+ "です。色は" + fru2.getColor()+ "で、値段は"+fru2.getPrice()+"円です");
		System.out.println("その果物名は"+ fru3.getName()+ "です。色は" + fru3.getColor()+ "で、値段は"+fru3.getPrice()+"円です");




	}

}
class Fruits{   //クラス作成
	private String name;   //属性定義
	private String color;
	private int price;
	public Fruits(String n, String c, int p) {
		name = n;  //属性の値をセット
		color = c;
		price = p;


	}
	public String getName() { //return
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getPrice() {
		return price;
	}



}
