package practice;

public class Practice01_re {

	public static void main(String[] args) {
		String[] a = {"5", "23", "a", "89", "b", "c"};
		Practice01_re pra = new Practice01_re();
		int[] b = pra.makeArray1(a);
		System.out.print("{");

		for(int i : b) {
			System.out.print(i+" ");

	}
		System.out.println("}");

	}
	int[] makeArray1(String[] a) {
		int[] b = new int[a.length];

		for(int i = 0; i < a.length; i++) {
			try {
				b[i] = Integer.parseInt(a[i]);
			}catch(NumberFormatException e){
				

			}
			
		}
		return b;

	}
	int[] makeArray2(String[] a) {
		int[] b = new int[a.length];

		try {
			for (int i = 0; i < a.length; i++) {
				b[i] = Integer.parseInt(a[i]);
			}

		}catch(NumberFormatException e) {

		}
		return b;

	}
	int[] makeArray3(String[] a) {
		int[] b = new int[a.length];

		try {
			for(int i= 0; i < a.length; i++) {
				b[i] = Integer.parseInt(a[i]);
			}
			return b;
		}catch(NumberFormatException e) {

		}
		return new int[a.length];
	}

}
