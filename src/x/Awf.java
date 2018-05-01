package x;


//public class Question11 {

//	public static void main(String[] args) {
//		String[] a = {"5", "23", "a", "89", "b", "c"};
//		int c[] = new Question11().change(a);
//		for(int i = 0; i < c.length; i++) {
//			System.out.println(c[i]);
//		}
//
//		System.out.println();
//
//		int d[] = new Question11().changeAll0(a);
//		for(int i = 0; i < d.length; i++) {
//			System.out.println(d[i]);
//		}
//
//		System.out.println();
//
//		int f[] = new Question11().changeAfter0(a);
//		for(int i = 0; i < f.length; i++) {
//			System.out.println(f[i]);
//		}
//	}
//	public int[] change(String[] s) {
//		int b[] = new int[s.length];
//		for(int i = 0; i < s.length; i++) {
//			try {
//				b[i] = Integer.parseInt(s[i]);
//			}catch(NumberFormatException e) {
//				System.out.println("a[" + i + "]を0を入力しました。");
//				b[i] = 0;
//			}
//		}
//		return b;
//	}
//	public int[] changeAfter0(String[] s) {
//		int b[] = new int[s.length];
//		try {
//			for(int i = 0; i < s.length; i++) {
//				b[i] = Integer.parseInt(s[i]);
//			}
//		}catch(NumberFormatException e) {
//			System.out.println("不適切な入力があったため、それ以降の要素に０が入力されました。");
////			for(; i < s.length; i++) {
////				b[i] = 0;
////			}
//		}
//		return b;
//	}
//	public int[] changeAll0(String[] s) {
//		int b[] = new int[s.length];
//		try {
//			for(int i = 0; i < s.length; i++) {
//				b[i] = Integer.parseInt(s[i]);
//			}
//		}catch(NumberFormatException e) {
//			System.out.println("不適切な入力があったため、すべての要素に０が入力されました。");
//			for(int i = 0; i < s.length; i++) {
//				b[i] = 0;
//			}
//		}
//			return b;
//	}
//
//}
