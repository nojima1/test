package kadai;
//
//import java.util.ArrayList;
//
//
//public class FruitsBascketMain {
//
//	public static void main(String[] args) {
//		FruitsBascket fb = new FruitsBascket(2);
//		fb.put(new Fruits("リンゴa","赤", 100));
//		fb.put(new Fruits("リンゴb","赤", 100));
//		fb.put(new Fruits("リンゴc","赤", 100));
//	}
//
//}
//class Fruits{
//	private String name;
//	private String color;
//	private int price;
//
//	public Fruits(String n, String c, int p) {
//		name = n;
//		color = c;
//		price = p;
//
//		public String getName() {
//			return name;
//		}
//		public String getColor() {
//			return color;
//		}
//		public int getPrice() {
//			return price;
//		}
//
//	}
//}
//
//class FruitsBascket{
//	//has-a 関係
//	private ArrayList<Fruits> fruitsList = new ArrayList<>();
//	private int limit;
//
//	public FruitsBascket(int limit) {
//		this.limit = limit;
//	}
//
//	public void put(Fruits fruits) {
//		if(fruitsList.size() == limit) {
//			System.out.println(fruits.getName()  + "もう入りません。");
//		}
//		System.out.println(fruits.getName() + "が入りました。");
//		fruitsList.add(fruits);
//
//	}
//	public Fruits take(int index) {
//		return  fruitsList.remove(index);
//
//	}
//
//}

