package practice;

public class FruitsMain {

	public static void main(String[] args) {
		Fruits fru1 = new Fruits("orange","オレンジ", 50);
		Fruits fru2 = new Fruits("apple","赤", 100);
		Fruits fru3 = new Fruits("banana","黄", 80);

		System.out.println("その果物の名前は"+ fru1.getName()+ "です。 色は"+ fru1.getColor()
		+"で、値段は" + fru1.getPrice()+ "円です。" );
		System.out.println("その果物の名前は"+ fru2.getName()+ "です。 色は"+ fru2.getColor()
		+"で、値段は" + fru2.getPrice()+ "円です。" );
		System.out.println("その果物の名前は"+ fru3.getName()+ "です。 色は"+ fru3.getColor()
		+"で、値段は" + fru3.getPrice()+ "円です。" );


	}

}
class Fruits{
	private String name;
	private String color;
	private int price;

	public Fruits(String name, String color, int price) {//セッター
		this.name = name ;
		this.color = color;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getPrice() {
		return price;
	}

}
