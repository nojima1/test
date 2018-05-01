package tsd;


class Trainer{
	
	String name;
	
	Trainer(){
		name = "名無し";
		
	}
	Trainer(String n){
		name = n;
	}
}

class Sample5_7 {
	public static void main(String[] args) {
		
		//名無しオブジェクトをインスタンス化
		Trainer s1 = new Trainer();
		
		
		//田中さんオブジェクトをインスタンス化
		Trainer s2 = new Trainer("田中さん");
		
		//名前を表示
		System.out.println("名前：" + s1.name);
		System.out.println("名前：" + s2.name);
		
	}

}
