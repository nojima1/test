package mondai;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CryptDecode {

	public static void main(String[] args) {
		//読み込むファイル名
		Scanner scn = new Scanner(System.in);

		System.out.println("CriptDecode（復号化）");
		System.out.println("-----------------------");
		System.out.print("ファイル名:");
		String fileName = scn.nextLine();
		File inputFile = new File("C:\\output",fileName);
		scn.close();
		
		FileInputStream in = null;	
		System.out.println("...........");
		System.out.print("データ：");
		try {
			//Stream new
			in =  new FileInputStream(inputFile);
			//読み込み処理 コードを戻す
			int c;
			while ((c = in.read()) != -1){
				int code = c -1;
				System.out.print((char) code);
//				char e = (char)(c);
//				System.out.print(e);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();


		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(in != null)
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}



	}

}
