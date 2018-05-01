package x;

//public class Mondai13 {
//
//	public static void main(String[] args) {
//		SummaryImpl s1 = new SummaryImpl();
//		System.out.println(s1.exec(2, 3));
//
//		Summary s2 = new Summary() {
//
//			@Override
//			public int exec(int a, int b) {
//				return a + b;
//			}
//		};
//		System.out.println(s2.exec(2, 3));
//
//		Summary s3 = (int a, int b) -> a + b;
//		System.out.println(s3.exec(2, 3));
//	}
//
//}
//
//interface Summary{
//	public int exec(int a, int b);
//}
//
//class SummaryImpl implements Summary{
//
//	@Override
//	public int exec(int a, int b) {
//
//		return a + b;
//	}
//
//}