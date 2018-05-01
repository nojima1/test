package kadai;

public class Kadai27 {

	public static void main(String[] args) {
		
		int x = 10;
		
		


		System.out.println("1から7までの和を求めます。");
		System.out.println("nの値:"+x);
		

        int sum = 0;  
		for(int i = 1; i <= x; i++) {
			sum += i;
			
			if(i < x ) {
				System.out.print(i +"+");
			}else {
				System.out.print(i + "=");
			}


		}
		
		System.out.print(sum);

	}

}
