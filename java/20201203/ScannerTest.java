import java.util.*;
public class ScannerTest{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("好きな数字は>");
		int num = sc.nextInt();sc.nextLine();//空読み
		System.out.print("お名前>");
		String name = sc.nextLine();//next()なら問題なし
		System.out.printf("%sさんの好きな数字は%dですね！%n",name,num);
	}
}
