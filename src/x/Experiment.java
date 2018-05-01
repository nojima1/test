package x;

import java.util.ArrayList;
import java.util.Arrays;

public class Experiment {

	public static void main(String[] args) {
		 ArrayList<String> list1 = new ArrayList<>();
		 list1.add("a");
		 list1.add("b");
		 
		 
		 String[] array1 = list1.toArray(new String[] {});
		 System.out.println(Arrays.toString(array1));
		 
		 
		 String[] array2 = {"c", "d"};
		 ArrayList<String> list2 = new ArrayList<>(Arrays.asList(array2));
		 for(String s : list2) {
		 System.out.println(s);
		 }

	}

}
