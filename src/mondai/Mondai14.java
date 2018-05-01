package mondai;

public class Mondai14 {

	public static void main(String[] args) {
		String[] array = {"abc", "abcdefg", "a", "ab", "cdef"};



	}

}

interface Comparator<String>{
	int compare(String o1, String o2);

}


class Sort implements Comparator<String>{

	@Override
	public int compare(java.lang.String o1, java.lang.String o2) {
		return 0;
	}

}