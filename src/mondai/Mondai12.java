package mondai;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Mondai12 {

	public static void main(String[] args) {
		String[][] holidays = {
				{ "2018-01-01", "元日" },
				{ "2018-01-08", "成人の日" },
				{ "2018-02-11", "建国記念の日" },
				{ "2018-02-12", "振替休日" },
				{ "2018-03-21", "春分の日" },
				{ "2018-04-29", "昭和の日" },
				{ "2018-04-30", "振替休日" },
				{ "2018-05-03", "憲法記念日" },
				{ "2018-05-04", "みどりの日" },
				{ "2018-05-05", "こどもの日" },
				{ "2018-07-16", "海の日" },
				{ "2018-08-11", "山の日" },
				{ "2018-09-17", "敬老の日" },
				{ "2018-09-23", "秋分の日" },
				{ "2018-09-24", "振替休日" },
				{ "2018-10-08", "体育の日" },
				{ "2018-11-03", "文化の日" },
				{ "2018-11-23", "勤労感謝の日" },
				{ "2018-12-23", "天皇誕生日" },
				{ "2018-12-24", "振替休日" }
		};


		Scanner scn = new Scanner(System.in);
		System.out.print("year = ");
		int y = scn.nextInt();
		System.out.print("month = ");
		int m = scn.nextInt();
		scn.close();

		System.out.println("*** "+ y+"年"+ m +"月の祝日カレンダー ***");

		//日付取得
		LocalDate day = LocalDate.of(y, m, 1);
		LocalDate nextMonth = day.plusMonths(1);
		LocalDate lastDay = nextMonth.plusDays(-1);
		Period p = day.until(lastDay);


		//その月の日数を表示
		for(int i= 0; i <= p.getDays() ; i++ ) {
			System.out.print(day.plusDays(i));

			for(int j = 0; j < holidays.length;j++) {
				//LocalDateにする
				LocalDate l = LocalDate.parse(holidays[j][0]);

				if(l.equals(day.plusDays(i))) {
					System.out.print(holidays[j][1]);

				}


			}
			System.out.println();

		}

	}
}




