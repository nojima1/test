package presentation;

import java.util.HashSet;
import java.util.Set;

public class Set_sample {

	public static void main(String[] args) {
		Set<String> hash_set = new HashSet<>();
		hash_set.add("Arakawa ward");
        hash_set.add("Minato ward");
        hash_set.add("Itabashi word");
        hash_set.add("Adachi word");
        hash_set.add("Setagaya word");

        System.out.println(hash_set);
//        for(Integer value : hash_set)
//        {
//            System.out.println(value);
//        }

	}

}
