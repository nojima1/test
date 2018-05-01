package x;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Study11_3 {

	public static void main(String[] args) {
		
		File inputFile = new File("C:\\ocjp\\ocjp.txt");
		File outputFile = new File("C:\\ocjp\\ocjpcopy.txt");
		
		try {
			FileInputStream in = new FileInputStream(inputFile);
			FileOutputStream out = new FileOutputStream(outputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
