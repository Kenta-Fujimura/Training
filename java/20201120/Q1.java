import java.util.*;
public class Q1{
	public static void main(String[]args){
		System.out.print("月を入力してください>");
		int moon = new Scanner(System.in).nextInt();
		int ans = k3(moon);
		System.out.println(moon + "月は" + ans + "日です");
	}

	static int k3(int m){
		int x;
		if(m == 2){
			x = 28;
		}else if( m == 4 || m == 6 || m == 9 || m == 11) {
			x = 30;
		}else{
			x = 31;
		}
		return x;
	}
} 
