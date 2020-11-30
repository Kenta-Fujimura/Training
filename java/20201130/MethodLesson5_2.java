public class MethodLesson5_2 {
	//引数で受け取った数ぶん*を横に出力し、最後に改行するメソッド
	static void printLine(int width){
		for(int i=0;i<width;i++){
			System.out.print("*");
		}
		System.out.println();
	}
	//第二引数で受け取った文字列を装飾するメソッド
	//装飾の幅は第一引数ぶんとする
	static void midashiMaker(String title){
		printLine(title.length()+2);
		System.out.println("*" + title + "*");
		printLine(title.length()+2);
	}
	
	public static void main(String[] args) {
		midashiMaker("Hello");
	}
}
