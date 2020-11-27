import java.util.*;
public class Q3{
	public static void main(String[]args){
		System.out.print("体重>");
		double taijyu = new Scanner(System.in).nextDouble();
		System.out.print("身長>");
		double shintyo = new Scanner(System.in).nextDouble();
		
		double ans = k3(taijyu,shintyo);
		System.out.printf("体重:%.1fkg,身長:%.1fcmのBMIは%.1fです。%n",taijyu,shintyo,ans);
	}

	static double k3(double tai,double shi){
		double x = tai / (shi /100 * shi/100);
		return x;
	}
} 
