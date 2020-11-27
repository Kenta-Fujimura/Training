import java.util.*;
public class Q4{
	public static void main(String[]args){
			System.out.println("****TriangleCalculator****");

		while(true){
			System.out.print("どうする？1…三角形の面積を求める 0…やめる>");
			int menu = new Scanner(System.in).nextInt();
			if(menu == 0 || menu >= 2){
				System.out.println("アプリケーションを終了します。");
				break;
			}else{
				System.out.print("底辺を入力してください>");
				double bottom = new Scanner(System.in).nextDouble();
				System.out.print("高さを入力してください>");
				double height = new Scanner(System.in).nextDouble();
				double ans = k3(bottom,height);
				System.out.printf("底辺:%.2f,高さ:%.2fの三角形の面積は%.2fです。%n",bottom,height,ans);
			}
		}
	}
	
	static double k3(double btm,double hei){
		double x = btm * hei / 2;
		return x;
	}
} 
