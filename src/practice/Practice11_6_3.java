package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practice11_6_3 {

	public static void main(String[] args) {
		File inputFile = new File("c:\\ocjp\\ocjp_buf.txt");
		File outputFile = new File("c:\\ocjp\\ocjp_bufcopy.txt");

		BufferedReader in = null;
		BufferedWriter out = null;


		try {
			in = new BufferedReader(new FileReader(inputFile));
			out = new BufferedWriter(new FileWriter(outputFile));

			String line;
			while((line = in.readLine()) != null) {
				out.write(line);
				out.newLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
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
