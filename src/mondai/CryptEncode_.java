package mondai;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CryptEncode_ {

	public static void main(String[] args) {
		//ファイルへ保存する output
		Scanner scn = new Scanner(System.in);

		System.out.print("ファイル名 :");
		String filename = scn.nextLine();

		File outputFile = new File("C:\\output" , filename);
		System.out.println("CryptEncode (暗号化)");
		FileOutputStream out = null;
		try {
//			FileInputStream in =  new FileInputStream(inputFile);
			out =  new FileOutputStream(outputFile);
			System.out.print("データ：");
			String a = scn.nextLine();
			scn.close();

			for(int i = 0; i < a.length(); i++) {
				int c = a.charAt(i) + 1;
				//cを出力
//				System.out.println(c);
//				char b = (char)c;
//				System.out.print(b);
				out.write(c);
			}
			System.out.println("暗号化が終わりました。");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}finally {
			try {
				if( out != null) {
					out.close();
				}
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			}

	}

}