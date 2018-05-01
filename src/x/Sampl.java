package x;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//public class CryptDecode {
//
//	public static void main(String[] args) {
//
//		File input = new File("C:\\output\\crypt.txt");
//		FileInputStream in = null;
//		try {
//			in = new FileInputStream(input);
//
//			int c ;
//			while((c = in.read()) != -1) {
//				char d = (char)(c-1);
//				System.out.print(d);
//			}
//
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				if(in != null) {
//					in.close();
//				}
//			}catch(IOException e){
//				e.printStackTrace();
//			}
//		}
//
//	}
//
//}
