package tsd;

public class Sample12_13 {
	static Integer wi1; //=0であればok

	public static void main(String[] args) {
//		wi1++ ; //実行時例外
		Integer wi2 = 0;
		wi2++;
		Integer wi3 = 1;
		if(wi2 == wi3) {
			System.out.println("Area: " + areaOfSquare(4.0));

		}

	}
	public static Double areaOfSquare(Double side) {
		return side * side;
	}

}
