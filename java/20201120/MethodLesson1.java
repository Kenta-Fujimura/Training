import java.util.*;
public class MethodLesson1{
	public static void main(String[]args){
		System.out.print("input number>");
		int num = new Scanner(System.in).nextInt();
		keisan(num);
		keisan(11);
	}

	static void keisan(int n){
		System.out.printf("%dは%sです%n",n,n%2 ==0? "偶数":"奇数");
	}
}
