package kadai;

public class MangaMain {
	public static void main(String[] args) {

		Manga m = new Manga("デスノート",421);
		System.out.println("作品名:"+ m.getName() + "  価格は"+ m.getPrice() + "円です。");
		m.read();
		m.see();

		Novel n = new Novel("ホームレス中学生",489 );
		System.out.println("作品名:"+ n.getName() + " 価格は"+ n.getPrice() + "円です。");
		n.read();
		n.imagine();
	}

}

class Book{
	private String name;//メンバ変数
	private int price;

	public Book(String name, int price) {//コンストラクタ
		this.name = name;
		this.price = price;
	}
	public void setName(String name) {//セッター
		this.name = name ;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName(){//ゲッター
		return name;
	}
	public int getPrice() {
		return price;
	}
	public void read() {
		System.out.println("読む");//スーパークラスBook 読む
	}
}

class Manga extends Book{

	public Manga(String name, int price) {
		super(name, price);//スーパークラスのコンストラクタ呼び出し
	}
	public void see() {
		System.out.println("見る");//
	}

}

class Novel extends Book{

	public Novel(String name, int price) {
		super(name, price);//スーパークラスのコンストラクタ呼び出し
	}
	public void imagine() {
		System.out.println("想像する");
	}

}

