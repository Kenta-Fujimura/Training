import java.util.*;
public class MethodLesson4{
	public static void main(String[] args){	
		System.out.print("言葉>");
		String kotoba = new Scanner(System.in).nextLine();
		System.out.println(ans(kotoba));
	
		System.out.print("整数1>");
		int num1 = new Scanner(System.in).nextInt();
		System.out.print("整数2>");
		int num2 = new Scanner(System.in).nextInt();
		
		int ans = k3(num1,num2);
		System.out.println("大きいほうは" + ans);
	}	
	
	//戻り値のあるメソッド
	static String ans(String s){
		return "***" + s + "***";
	}

	static int k3(int a,int b){
		return a > b ? a:b;
	}
}

