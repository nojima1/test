package tsd;

class StaffOv{
	private String name = "名無し";//privateをつけたら....
	
	void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	
}
class ManagerOv extends StaffOv{
	int salary = 5000000;
	
	int getSalary() {
		return salary;
	}
	
	@Override//アノテーション
	public String getName() {//オーバーライド
		
		//再帰呼び出し（実行）
//		return"【マネージャー】" + getName();    getNameを呼び出してのループ
		return"【マネージャー】" + super.getName();
		
	}
}
public class Sample6_4 {

	public static void main(String[] args) {
		StaffOv s1 = new StaffOv();
		System.out.println("--------スーパークラス--------");
		System.out.println("名前:"+ s1.getName());
		
		System.out.println();
		ManagerOv m1 = new ManagerOv();
		
		System.out.println("--------サブクラス--------");//サブクラスで定義したメソッド
		m1.setName("田中");
		System.out.println("名前:"+ m1.getName());
		System.out.println("給与:"+ m1.getSalary());
		
	}

}
