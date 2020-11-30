public class MethodLesson2 {
	public static void main(String[] args) {
		System.out.println("★カレーを作るよ★");
		PreCook();
		mainCook();
		System.out.println("★カレーが出来ました★");
	}
	static void preCook(){
		System.out.println("野菜を切る");
		System.out.println("肉を切る");
		System.out.println("食材を炒める");
	}
	static void mainCook(){
		System.out.println("食材を炒める");
		System.out.println("ルーを加え煮込む");
	}
}
