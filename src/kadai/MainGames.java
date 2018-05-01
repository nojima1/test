package kadai;

import java.util.ArrayList;

class Game {
	String name;
	String type;
	int sale;

	public Game(String n, String t, int s) {
		name = n;
		type = t;
		sale = s;
	}
	public void show() {
		System.out.println("ゲーム名：" + name + "、ジャンル：" + type + "、販売本数は" + sale + "万本");
	}
}


public class MainGames {

	public static void main(String[] args) {

		ArrayList<Game> games = new ArrayList<>();


		games.add(new Game("スプラトゥーン2", "アクションシューティングゲーム", 712));
		games.add(new Game("モンスターハンターワールド", "アクションロールプレイングゲーム", 936));
		games.add(new Game("ドラゴンクエストXI", "ロールプレイングゲーム", 317));


		for(Game game : games) {
			game.show();
		}

	}


}

//配列バージョン
//package kadai;
//
//public class MainGames_2 {
//
//	public static void main(String[] args) {
//		//配列宣言
//		Game[]games = new Game[3];
//		
//		//配列の中にオブジェクトを代入
//		games[0] = new Game("スプラトゥーン２","アクションシューティング",712);
//		games[1] = new Game("モンスターハンターワールド","アクションロールプレイングゲーム",936);
//		games[2] = new Game("ドラゴンクエストXI","ロールプレイングゲーム",317);
//		
//		for(Game game :games) {
//			game.show();
//			
//			
//		}
//	
//
//	}
//
//}
//class Game{
//	String name;
//	String type;
//	int sale;
//	
//	 Game(String n, String t, int s){
//		name = n;
//		type = t;
//		sale = s;
//		
//		
//	}
//	void show() {
//			System.out.println("ゲーム名：" + name + "、ジャンル；" + type + "、販売本数 [" +sale + "]");
//			
//		
//	}
//}