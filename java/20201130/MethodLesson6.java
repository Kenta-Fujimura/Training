import java.util.*;
public class MethodLesson6 {
	//第一引数の文字で第二引数の幅の正方形を描画するメソッド
	static void printSquare(char c , int width){
		//外のforは行の制御
		for(int i=0;i<width;i++){
			//内側のループは列の制御
			for(int j=0;j<width;j++){
				int x = new Random().nextInt(width*10);
				if(x == 0){
					System.out.print("ぬ");
				}else{
					System.out.print(c);
				}
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("一文字入れてください>");
		String s=scan.next();
		//Stringからcharとして取り出す。
		char c=s.charAt(0);
		System.out.print("幅を入れてください>");
		int width=scan.nextInt();
		printSquare(c,width);
		scan.close();
	}
}

