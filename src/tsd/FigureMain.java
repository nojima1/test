package tsd;

public class FigureMain {

	public static void main(String[] args) {
		
		// Circleをインスタンス化
		Circle circle = new Circle();
		circle.setRadius(10);
		System.out.println(circle.getArea());

		//Squareインスタンス化
		Square squ1 = new Square();
		squ1.setSide(10);
		System.out.println(squ1.getArea());
		
		//Circle    Cylinderインスタンス化
		
		Cylinder c = new Cylinder(10, circle);
		System.out.println(c.getVolume());
	}

}
class Circle{

	private int radius ;//属性

	public Circle(){//コンストラクタ
		radius = 0;
	}
	public void setRadius(int r){//セッター
		radius = r ;
	}
	public int getRadius(){//ゲッター
		return radius;
	}
	public double getArea() {
		double area = radius * radius * 3.14;
		return area;
	}

}

class Square{//Square クラス
	private int side;
	
	public Square() {//コンストラクタ
		side = 0;
	}
	public int getSide() {//ゲッター
		return side;
	}
	public void setSide(int s) {
		side = s;
		
	}
	public int getArea() {
		int area = side * side;
		return area;
	}
	
}
class Cylinder{
	//円柱→体積を求めたい
	//底面積(円→circle)、高さ
	private int height;
	private Circle circle;//circleという変数を属性として持っている
	public Cylinder(int h, Circle c) {
		height = h;
		circle = c;
	}
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle c) {
		circle = c;
	}
	public double getVolume() {
		return circle.getArea() * height;
	}
}



