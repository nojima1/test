package bmi2;


abstract class God{
	//スーパークラス
	public double max;
	public double min;
	private String name;
	private double height;
	private double weight;

	public God(String name,double height,double weight,double max,double min){
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.max = max;
		this.min = min;
	}
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public double getMax() {
		return max;
	}
	public double getMin() {
		return min;
	}

}

class Human extends God{
	public Human(String name,double height, double weight) {
		super(name, height , weight,25.0,18.5);
	}

}

class Child extends God{
	public Child(String name,double height, double weight) {
		super(name, height , weight,18,15);
	}
}

class BMI{

	public static double calc(God god) {
		return god.getWeight()/god.getHeight()/god.getHeight();//スーパークラスから
		//体重/身長/身長

	}

	public static String judge(God god) {
		double bmi = calc(god);
		if(god.getMax() < bmi) {
			return "太りすぎです。";
		}else if( god.getMin() <= bmi  ) {
			return "標準です。";
		}else {
			return"痩せすぎです。";
		}
	}

}

public class Main2 {
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
