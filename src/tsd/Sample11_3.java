package tsd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample11_3 {

	public static void main(String[] args) {
		//ファイルをコピー

		//ファイルオブジェクト作成２つ
		//FileInputStream new
		//whileで読み込みと書き込み
		//close
		File inputFile = new File("C:\\ocjp\\ocjp.txt");
		File outputFile = new File("C:\\ocjp\\ocjpcopy.txt");

		//FileInputStream in = new FileInputStream(inputFile);
		//FileOutputStream out = new FileOutputStream(outputFile);

		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream(inputFile);
			out = new FileOutputStream(outputFile);
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}finally {
			try {
				if( in != null) {
					in.close();
				}
				if( out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}


		}


	}

}
