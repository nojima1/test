package presentation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_sample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		 
        list.add(10);
        list.add(30);
        list.add(5);
        list.add(2);
        list.add(11);
        list.add(90);
         
        System.out.println(list);
        
        Collections.sort(list);
        
        System.out.println(list);

	}

}
