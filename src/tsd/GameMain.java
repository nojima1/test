package tsd;

public class GameMain {

	public static void main(String[] args) {
		Yusya y = new Yusya(200,40,"勇気");
		System.out.println("勇者 HP:"+ y.getHp() + " MP:"+ y.getMp() +" 特性:"+ y.getCharacteristic());
		y.showAttack();
		y.showMagic();

		System.out.println();

		Magician m = new Magician(120,100,"魔法攻撃力");
		System.out.println("魔法使い HP:"+ m.getHp() + " MP:"+ m.getMp()+" 特性:"+ m.getCharacteristic() );
		m.showMagic();
		m.showYasumu();

	}

}
class Adventurer{
	private int hp;
	private int mp;
	private String characteristic;

	public Adventurer(int hp, int mp, String characteristic){
			this.hp = hp ;
			this.mp = mp ;
			this.characteristic = characteristic;
	}
	public void setHp(int hp) {
		this.hp= hp;
	}
	public void setMp(int mp) {
		this.mp= mp;
	}
	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}
	public int getHp() {
		return hp;
	}
	public int getMp() {
		return mp;
	}
	public String getCharacteristic() {
		return characteristic;
	}
	public void showMagic() {
		System.out.println("魔法で攻撃");
	}
}

class Yusya extends Adventurer{

	public Yusya(int hp, int mp, String characteristic){
		super(hp, mp,characteristic);
	}
	public void showAttack() {
		System.out.println("武器で攻撃");
	}

}
class Magician extends Adventurer{
	public Magician(int hp, int mp, String characteristic){
		super(hp, mp, characteristic);
	}
	public void showYasumu() {
		System.out.println("休む");
	}


}

