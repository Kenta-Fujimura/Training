import java.util.*;
public class test{
	public static void main(String[] args){	
		System.out.print("何人＞");
		int num = new Scanner(System.in).nextInt();
		for(int i=0;i<num;i++){
			System.out.print((i+1) + "人目の名前>");
			String name = new Scanner(System.in).nextLine();
			int rnd = new Random().nextInt(99);
			System.out.println(name + "さんの点数：" +rnd);
			System.out.println();

		}
	}	
}
