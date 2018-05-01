package kadai;

import java.util.ArrayList;

public class MainKatana {

	public static void main(String[] args) {
		ArrayList<Katana> katanas = new ArrayList<>();
		
		katanas.add(new Katana("大包平", "太刀","オオカネヒラ"));
		katanas.add(new Katana("鬼切丸", "太刀","オニキリマル"));
		katanas.add(new Katana("大包平", "太刀","イズミノカミカネサダ"));
		
		for(int i = 0 ; i< katanas.size(); i++) {
			katanas.get(i).show();
			
//			katana K = katanas.get(i);
//			k.show();
			
		}
		

	}

}
class Katana{
	String name ;
	String type;
	String kana;
	
	
	Katana(String n, String t, String k){
		name = n;
		type = t;
		kana = k;
			
			
	}
	void show() {
			System.out.println("名前：" + name + "、種類:" + type + "、読み仮名: " +kana );
				
			
	}
}