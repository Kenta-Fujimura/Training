import java.util.*;
public class Q2{
	public static void main(String[]args){
		System.out.print("繰り返文字>");
		String moji = new Scanner(System.in).nextLine();
		System.out.print("繰り返す回数>");
		int kaisu = new Scanner(System.in).nextInt();
		
		String ans = k3(moji,kaisu);
		System.out.println(ans);
	}

	static String k3(String m,int kai){
		String x = ""; 
		for(int i=0;i<kai;i++ ){
			x = x + m ;
		}
		return x;
	}
} 
