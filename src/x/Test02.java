package x;

public class Test02 {

	public static void main(String[] args) {
		HumanV2 suzuki = new HumanV2("鈴木", 180, 75, new Day(1972, 4, 26));
		HumanV2 yamada = new HumanV2("山田", 165, 50, new Day(1988, 10, 03));
		System.out.println("suzuki = " + suzuki);
		System.out.println();
		System.out.println("yamada = " + yamada);
		HumanV2 arai = new HumanV2("新井", 160, 50, new Day(1990));
		System.out.println(arai);
	}
}

class Day{
	private int year;
	private int month;
	private int day;
	private int week;
	private String weekString;

	Day(int year){
		this.year = year;
		getWeek();
	}

	Day(int year, int month){
		this.year = year;
		this.month = month;
		getWeek();
	}

	Day(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
		getWeek();
	}
	void setYear(int year) {
		this.year = year;
	}
	void setMonth(int month) {
		this.month = month;
	}
	void setDay(int day) {
		this.day = day;
	}

	public int dayOfWeek() {
		week = ((((year + (year / 4)) - year / 100) + year / 400) + ((month * 13 + 8) / 5) + day) % 7;
		return week;
	}
	public String getWeek() {
		if(month == 0 || day == 0) {
			weekString = "ERRAR";
		}else {
			dayOfWeek();
			switch(week) {
			case 0:
				weekString = "日";
				break;
			case 1:
				weekString = "月";
				break;
			case 2:
				weekString = "火";
				break;
			case 3:
				weekString = "水";
				break;
			case 4:
				weekString = "木";
				break;
			case 5:
				weekString = "金";
				break;
			case 6:
				weekString = "土";
				break;
			default:
				weekString = "ERRAR";
			}
		}
		return weekString;
	}
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	@Override
	public String toString() {
		return year + "年" + month + "月" + day + "日(" + weekString + ")";
	}
}

class HumanV2{
	private String name;
	private int height;
	private int weight;
	private Day day;

	HumanV2(String name, int height, int weight, Day day){
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.day = day;
	}

	void addWeight(int addweight) {
		this.weight += addweight;
	}
	void delWeight(int delweight) {
		this.weight -= delweight;
	}
	String getName() {
		return name;
	}
	int getHeight(){
		return height;
	}
	int getWeight(){
		return weight;
	}
	@Override
	public String toString() {
		return "{" + name + " : " + height + "cm " + weight + "kg " + day.toString() + "生まれ}";
	}

}


