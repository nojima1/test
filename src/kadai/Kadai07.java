package kadai;

public class Kadai07 {

	public static void main(String[] args) {
		int a = 22;
		int b = 11;

		if(a>b && (a-b)>=11) {
			System.out.println("それらの差は11以上です");
		}else if(a>b && (a-b)<= 11) {
			System.out.println("それらの差は10以下です");
		}else if(b>a && (b-a)>= 11) {
			System.out.println("それらの差は11以上です");
		}else if(b>a && (b-a)<= 11) {
			System.out.println("それらの差は10以下です");
		}


	}

}
