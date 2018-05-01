package mondai;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CryptEncode {

	public static void main(String[] args) {
		//ファイルへ保存する output
		System.out.println("CryptEncode (暗号化)");
		System.out.print("ファイル名：");
		Scanner scn = new Scanner(System.in);
		String fileName = scn.nextLine();
		File outputFile = new File("C:\\output\\" + fileName);
		System.out.print("データ：");
		String data = scn.nextLine();
		FileOutputStream out = null;
		scn.close();

		try {
//			FileInputStream in =  new FileInputStream(inputFile);
			out =  new FileOutputStream(outputFile);

			for(int i = 0; i < data.length(); i++) {
				int c = data.charAt(i) + 1;
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
				if(out != null) {
					out.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
				
			}
			
		}

	}

}
