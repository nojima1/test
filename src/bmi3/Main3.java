package bmi3;

interface Myinterface{   //インターフェースでメソッド宣言
	public abstract String getName();
	public abstract double getHeight();
	public abstract double getWeight();
	public abstract double getMax();
	public abstract double getMin();
}

class Human implements Myinterface{

	private String name;
	private double height;
	private double weight;
	private double max;
	private double min;

	public Human(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;

	}
	//インターフェース内で定義されているabstractメソッドをすべてオーバーライド
	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getHeight() {
		return height;
	}

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public double getMax() {
		return max;
	}

	@Override
	public double getMin() {
		return min;
	}


}

class Child implements Myinterface{

	private String name;
	private double height;
	private double weight;
	private double max;
	private double min;

	public Child(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;

	}
//インターフェース内で定義されているabstractメソッドをすべてオーバーライド
	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getHeight() {
		return height;
	}

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public double getMax() {
		return max;
	}

	@Override
	public double getMin() {
		return min;
	}

}

class BMI{

	public static double calc(Myinterface m) {
		return m.getWeight()/m.getHeight()/m.getHeight();
		//体重/身長/身長
	}

	public static String judge(Myinterface m) {
		double bmi = calc(m);
		if(m.getMax() < bmi) {
			return "太りすぎです。";
		}else if( m.getMin() <= bmi  ) {
			return "標準です。";
		}else {
			return"痩せすぎです。";

		}
	}

}
public class Main3 {

	public static void main(String[] args) {
		Human h = new Human("kato", 1.77, 69.5);
		System.out.println("----- BMI -----");
		System.out.println(h.getName() + "さんのBMIは" + BMI.calc(h));
		System.out.println(BMI.judge(h));
		System.out.println("---------------");

		System.out.println();

		Child c = new Child("taro", 1.77, 69.5);
		System.out.println("----- BMI -----");
		System.out.println(c.getName() + "ちゃんのBMIは" + BMI.calc(c));
		System.out.println(BMI.judge(c));
		System.out.println("---------------");

	}

}
