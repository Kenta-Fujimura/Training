import java.util.*;
public class MethodLesson4_2{
	public static void main(String[] args){	
	//	System.out.print("整数1>");
	//	int num1 = new Scanner(System.in).nextInt();
		
		System.out.println(decorateStr("Hello",2));//（）内はメソッドに渡したい値
		System.out.println(decorateStr("Hello",333));
		
	}	
	
	//戻り値のあるメソッド
	static String decorateStr(String str,int num){//受け取った引数に名前を付ける

		if(num % 2 == 0){
			return "***" + str + "***";
		}else{
			return "---" + str + "---";
		}
	}

}

