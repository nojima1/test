package tsd;

import java.time.LocalDate;
import java.time.Period;

public class Sample9_1 {

	public static void main(String[] args) {


		LocalDate date = LocalDate.of(2016, 12, 31);
		System.out.println("date            : " + date);
		//1日後をプラスしてる
		System.out.println("date.plusDays(1): " +date.plusDays(1));

		//plusされても変わらない.変えたければ
		System.out.println("date            : " +date);


		System.out.println("-----------------------------");

//		LocalDate lastDay = LocalDate.now().withDayOfMonth(1);
//		LocalDate lastMonth = firstDay.plusMonths(1);
//		LocalDate lastDay2 = lastMonth.plusDays(-1);
//		System.out.println(lastDay2);     月末
		
//		LocalDate now1 = LocalDate.now();
//		LocalDate lastDay3 = LocalDate.of(now1.getYear(), now1.getDayOfMonth(), 1).plusDays(-1);
		
		
		LocalDate now = LocalDate.now();
		System.out.println("今日の日付        : " +now);
		LocalDate tomorrow = now.plusDays(1);
		System.out.println("明日の日付        : " + tomorrow);


		Period p = now.until(tomorrow);

		System.out.println(p.getDays());
	}

}
