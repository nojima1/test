package tsd;
abstract class Ca{
	Ca(){
		System.out.println("自動車を作成します");

	}
	abstract public String setLight();

}
class CaA extends Ca{
	CaA(){
		System.out.println("A社のパーツを使います。");
	}

	public String setLight() {
		return "丸ライト";
	}
}

class CaB extends Ca{
	CaB(){
		System.out.println("B社のパーツを使います");
	}
	@Override
	public String setLight() {
		return "四角ライト";
	}


}
public class Sample6_10 {

	public static void main(String[] args) {
		Ca a1 = new CaA();
		System.out.println("ライトは"+ a1.setLight()+ "を取り付けました。");

		System.out.println();

		Ca b1 = new CaB();
		System.out.println("ライトは"+ b1.setLight()+ "を取り付けました。");


	}

}
