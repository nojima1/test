package tsd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal2{
	Animal2(){
		System.out.println("Animal()");
	}
}
class Dog2 extends Animal2 implements Serializable{
	Dog2(){
		System.out.println("Dog()");
	}
}
class Bulldog extends Dog2{

}
public class Sample11_7 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Bulldog obj = new Bulldog();
		try {
			fos = new FileOutputStream(new File("dog.txt"));
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			System.out.println("----  シリアライズ完了");

			fis = new FileInputStream(new File("dog.txt"));
			ois = new ObjectInputStream(fis);
			Bulldog readObj = (Bulldog) ois.readObject();
			System.out.println("----  デシアライズ完了");
		}catch(ClassNotFoundException e) {
			System.err.println("クラスファイルがありません");
		} catch (FileNotFoundException e) {
			System.err.println("ファイルがありません");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("IO Eroor");
			e.printStackTrace();
		}finally {
			try {
				oos.close();
				ois.close();
			}catch(IOException e) {

			}
		}

	}

}
