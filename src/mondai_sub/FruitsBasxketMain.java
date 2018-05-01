package mondai_sub;

import java.util.ArrayList;
import java.util.List;

public class FruitsBasxketMain {

	public static void main(String[] args) {
		//フルーツバスケットを作る
		FruitsBascket frb = new FruitsBascket(3);
		//フルーツバスケットに入れる
		Fruits f1 = new Fruits("orange","オレンジ", 50);
		frb.put(f1);

		Fruits f2 = new Fruits("apple","赤", 100);
		Fruits f3 = new Fruits("banana","黄", 80);
		frb.put(f2);
		frb.put(f3);


		//4つ目のフルーツバスケットを入れるとエラー
		Fruits f4 = new Fruits("peach","赤", 100);
		frb.put(f4);
		//バスケットからフルーツを取り出す
		Fruits f5 = frb.take(0);



	}

}
class FruitsBascket{
	List<Fruits> bascket = new ArrayList<Fruits>();
	private int upperlimit;

	public FruitsBascket(int upperlimit) {
		this.upperlimit = upperlimit;

	}
	public  void put(Fruits fruits) {
		if(bascket.size() >= upperlimit) {
			System.out.println("バスケットはいっぱいです");
			return;
		}
		bascket.add(fruits);


	}
	public Fruits take(int index) {
		return bascket.remove(index);

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
