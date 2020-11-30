public class MethodLesson5 {
	//引数で受け取った数ぶん*を横に出力し、最後に改行するメソッド
	static void printLine(int width){
		for(int i=0;i<width;i++){
			System.out.print("*");
		}
		System.out.println();
	}
	//第二引数で受け取った文字列を装飾するメソッド
	//装飾の幅は第一引数ぶんとする
	static void midashiMaker(int width,String title){
		printLine(width);
		System.out.println("* "+title);
		printLine(width);
	}
	
	public static void main(String[] args) {
		midashiMaker(20,"すごい！！");
		System.out.println("すごいことがありました！");
		midashiMaker(30,"大事件発生しました！");
		System.out.println("大変なことが起こりました!");
	}
}
