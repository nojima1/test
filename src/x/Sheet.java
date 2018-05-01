package x;


//public class Question16 {
//
//	public static void main(String[] args) {
//		System.out.println("タイピングゲームを開始します。");
//		System.out.print("何かキーを入力してください : ");
//		Scanner scn = new Scanner(System.in);
//		String a = scn.nextLine();
//
//		System.out.println();
//
//		File inputFile = new File("c:\\ocjp\\data.txt");
//
//		ArrayList<String> question = new ArrayList<>();
//		BufferedReader in = null;
//		try {
//			in = new BufferedReader(new FileReader(inputFile));
//
//			String str;
//			while((str = in.readLine()) != null) {
//				question.add(str);
//
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				if(in != null) {
//					in.close();
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//
//		Collections.shuffle(question);
//
//		LocalTime start = LocalTime.now();
//		int words = 0;
//		for(int questionCount = 0; questionCount < 5; questionCount++) {
//
//			System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊　第" + (questionCount + 1) + "問　＊＊＊＊＊＊＊＊＊＊＊＊");
//
//			System.out.println();
//
//			String[] str = question.get(questionCount).split(",", 0);
//			for(String s : str) {
//				System.out.println(s);
//			}
//			words += str[1].length();
//
//			String answer;
//			do {
//				System.out.println();
//				System.out.println("【入力してください】");
//				answer = scn.nextLine();
//			}while(answer.equals(str[1]) == false);
//			System.out.println();
//		}
//		scn.close();
//
//		LocalTime finish = LocalTime.now();
//		long time = start.until(finish, ChronoUnit.SECONDS);
//		BigDecimal bi = new BigDecimal(String.valueOf((double)words / (double)time));
//		double words_per_second = bi.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
//
//		System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊　成績　＊＊＊＊＊＊＊＊＊＊＊＊");
//		System.out.println("時間 : " + time + "秒");
//		System.out.println("文字数 : " + words + "文字");
//		System.out.print("一秒あたり : ");
//		System.out.printf("%.1f", words_per_second);
//		System.out.println("文字");
//		System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
//	}
//
//}