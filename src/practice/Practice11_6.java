package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practice11_6 {

	public static void main(String[] args) {
		File input = new File("C:\\ocjp\\ocjp_buf.txt");
		File output = new File("C:\\ocjp\\ocjpcopy_buf.txt");
		
		BufferedReader in = null;
		BufferedWriter out = null;
		try {
			in = new BufferedReader(new FileReader(input));
			out = new BufferedWriter(new FileWriter(output));
			
			String line;
			while(( line = in.readLine()) != null) {
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
