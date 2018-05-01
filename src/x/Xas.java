package x;
////}
////
////public double getMIN() {
////	return MIN;
////}
//}
//
//class BMI{
//public static double calc(HumanBeings hb) {//Human,Childそれぞれで定義していたものをスーパークラスをつかって一つにまとめる
//	//BMI = 体重/身長/身長
//	return hb.getWeight() / hb.getHeight() / hb.getHeight();
//}
//
//public static String judge(HumanBeings hb) {
//	double bmi = calc(hb);
//	if(hb.getMAX() < bmi) {
//		return "太りすぎです";
//	}else if(hb.getMIN() < bmi) {
//		return "標準です";
//	}else {
//		return "痩せすぎです";
//	}
//}
//}
//
//public class Main02 {
//public static void main(String[] args) {
//	HumanBeings hb1 = new Human("kato", 1.77, 69.5);//暗黙的型変換(Human)
//	System.out.println("----- BMI -----");
//	System.out.println(hb1.getName() + "さんのBMIは" + BMI.calc(hb1));
//	System.out.println(BMI.judge(hb1));
//	System.out.println("---------------");
//
//	System.out.println();
//
//	HumanBeings hb2 = new Child("taro", 1.77, 69.5);//暗黙的型変換(Child)
//	System.out.println("----- BMI -----");
//	System.out.println(hb2.getName() + "ちゃんのBMIは" + BMI.calc(hb2));
//	System.out.println(BMI.judge(hb2));
//	System.out.println("---------------");
//}
//}