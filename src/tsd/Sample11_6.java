package tsd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sample11_6 {

	public static void main(String[] args) {
		//ファイルnew
		File inputFile = new File("c:\\ocjp\\ocjp_buf.txt");
		File outputFile = new File("c:\\ocjp\\ocjpcopy_buf.txt");
		
		BufferedReader in = null;
		BufferedWriter out = null;
		
		//BufferedReaderをnew and try-catch Writerを追加
		try {
			in = new BufferedReader(new FileReader(inputFile));
			out = new BufferedWriter(new FileWriter(outputFile));
			
			String line;
			while((line = in.readLine()) != null) {
				out.write(line);
				out.newLine();//改行コード
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {//close => 上でnull
			try {
				if(in != null) {
					in.close();
				}
				if(out != null) {
					out.close();
				}
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}

	}

}
