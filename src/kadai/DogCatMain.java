package kadai;

class Animal{
	private int age;

	public Animal(int age){
		this.age = age;


	}
	public void setAge(int a) {
		age = a;
	}
	public int getAge() {
		return age;
	}
	public void Walk(){
		System.out.println("歩く");
	}
}

class Dog extends Animal{
	public Dog(int a) {
		super(a);


	}

	public void Bite() {
		System.out.println("噛みつく");
	}
}
class Cat extends Animal{
	public Cat(int a) {
		super(a);


	}

	public void Scrabble() {
		System.out.println("ひっかく");
	}
}

public class DogCatMain {

	public static void main(String[] args) {
		Dog d = new Dog(6);
		Cat c = new Cat(8);


		d.Walk();
		d.Bite();

		c.Walk();
		c.Scrabble();
		System.out.println("犬の年齢は" + d.getAge()+ "歳");
		System.out.println("猫の年齢は" + c.getAge()+ "歳");
	}

}


//class Animal{
//	private int age;
//
//
//	public void setAnimal(int a) {
//		age = a;
//
//
//	}
//	public int getAge() {
//		return age;
//
//
//
//	}
//	public void showWalk() {
//		System.out.println("歩く");
//	}
//
//
//
//}
//
//class Dog extends Animal{
//
//
//	public void showBite() {
//		s
//
//	}
//	public int getAnimal() {
//		return super.getAge();
//
//	}
//	public void show() {
//		System.out.println();
//	}
//
//
//
//
//}
//
//class Cat extends Animal{
//	private String scrabble;
//
//	public Cat(String s) {
//		scrabble = s;
//	}
//	public int getAnimal() {
//		return super.getAge();
//
//	}
//	public void show() {
//		System.out.println("");
//
//
//}
//
//public class DogCatMain {
//
//	public  void main(String[] args) {
//
//
//
//		}
//
//	}
//}
