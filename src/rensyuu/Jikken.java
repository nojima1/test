package rensyuu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Jikken {

	public static void main(String[] args) {
		File file = new File("c:\\output\\obejectStore.ser");
		FileOutputStream out;
		try {
			out = new FileOutputStream(file);
			ObjectOutputStream os = new ObjectOutputStream (out);

			User obj = new User("nojima", 23,"jinnro");
			os.writeObject(obj);

			os.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}



	}

}
class User implements Serializable{

	public User(String name, int age, String pass) {

	}

}
