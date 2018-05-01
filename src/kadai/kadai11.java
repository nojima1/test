package kadai;

import java.util.Random;

public class kadai11 {

	public static void main(String[] args) {
		// 0から2までのランダムな整数を生成
		int x = new Random() .nextInt(3);	
		switch(x) {
		case 0:
			System.out.println("グー");
			break;
		case 1:
			System.out.println("チョキ");
			break;
		case 2:
			System.out.println("パー");
			
		}

	}

}
