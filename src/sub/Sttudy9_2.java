package sub;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sttudy9_2 {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2018, 4, 1);
		LocalDate date2 = LocalDate.of(2018, 5, 1);

		if(date1.isAfter(date2)) {
			System.out.println(date1 + " is after " +date2 );
			//afeter は大きいほうが左
		}else {
			System.out.println(date2 + " is after " +date1 );
		}
		//parse
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate date3 = LocalDate.parse("2018/04/24",formatter);
		System.out.println(date3);

		DateTimeFormatter formatter2 = DateTimeFormatter.BASIC_ISO_DATE;
		LocalDate date4 = LocalDate.now();
		String str = date4.format(formatter);
		System.out.println(str);
	}

}
