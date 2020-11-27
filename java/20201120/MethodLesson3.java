import java.util.*;
public class MethodLesson3{
	public static void main(String[] args){	
		System.out.print("言葉1>");
		String kotoba1 = new Scanner(System.in).nextLine();

		System.out.print("言葉2>");
		String kotoba2 = new Scanner(System.in).nextLine();
		
		String win;
		if(kotoba1.length() > kotoba2.length()){
			win = kotoba1 + "の勝ち"; 
		}else if(kotoba1.length() < kotoba2.length()){
			win = kotoba2 + "の勝ち";
		}else{
			win  = "引き分け";
		}

		result(win);
	}	
	
	static void result(String a){
		System.out.printf(a);
	}
}

