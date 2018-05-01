package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Practice11_6_2 {

	public static void main(String[] args) {
		//PrintWriterのパターン
		File inputFile = new File("C:\\ocjp\\ocjp_buf.txt");
		File outputFile = new File("C:\\ocjp\\ocjpcopy_buf.txt");

		BufferedReader in = null;
		PrintWriter out =null;

		try {
			in = new BufferedReader(new FileReader(inputFile));
			out = new PrintWriter(new FileWriter(outputFile));

			String line;
			while((line = in.readLine()) != null) {
				out.println(line);
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
