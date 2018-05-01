package mondai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Mondai16 {
	private static final int QUESTION_COUNT =2;//定数にする

	public static void main(String[] args) {
//		１．入力データ（\\192.168.3.62\public\研修資料\data.txt）のすべてのデータを読み込み
//		(StringのArrayListに格納する)

		File inputFile = new File("\\\\192.168.3.62\\public\\研修資料\\data.txt");
		BufferedReader in = null;
		ArrayList<String> array = new ArrayList<>();
		Scanner scn = new Scanner(System.in);
		System.out.println("タイピングゲームを開始します");
		System.out.println("何かキーを入力してください：");

		System.out.println();

		try {

			in = new BufferedReader(new FileReader(inputFile));
			String line;
			while((line = in.readLine()) != null) {
				//格納
				array.add(line);
			}
			//ランダムで数字を生成
			Random rnd = new Random();

			//ArrayListから要素を取り出す
			//  System.out.println(array.get(ran));
			//   ,を境に分割する
	        //5問連続で表示し、表示する問題は同じデータを2回出さないようにする。
			for(int i= 0; i < QUESTION_COUNT; i++) {
				System.out.println("**************** 第"+ (i+1) +"問 ****************");
				int ran = rnd.nextInt(array.size());
				String str = array.get(ran);
		        String line1 = str.split(",")[0];
		        String line2 = str.split(",")[1];
		        System.out.println(line1);
		        System.out.println(line2);
		        System.out.println();
		        while(true) {

		        System.out.println("【入力してください】");
		        String type = scn.nextLine();


		        if( type.equals(line2)) {
		        	System.out.println();
		        	//正解の時に次の問題
		        	break;

		        }else {
		        	//不正解の時に同じ問題を出力
		        	//入力してくださいを表示している場所まで戻る

		        }
		        array.remove(ran); 		           //要素の削除
		       }

			}
			System.out.println("**************************************");
			System.out.println("終了しました。おつかれさまでした。");
			scn.close();


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (in != null){
					in.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
