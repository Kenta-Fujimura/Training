import java.util.*;
public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(75);
		points.add(90);//末尾
		points.add(0,25);//先頭
		int removed=points.set(3,50);//25,10,80,50,90
		System.out.println(points.get(1));//10
		System.out.println(removed);//75
		System.out.println(points.size());//要素数
		System.out.println(points.isEmpty());//空かどうか
		System.out.println(points.contains(90));//指定要素90が含まれているかどうか
		System.out.println(points.indexOf(80));//指定要素が何番目のindex にあるか。2

		for(int i:points){
			System.out.println(i);
		}
		for(int i=0;i<points.size();i++){
			System.out.println(points.get(i));
		}
		Integer i1 = Integer.valueOf(16);
		int i2=i1.intValue();

		String s1 = String.valueOf(16);
		int i3=Integer.parseInt(s1);
	}
}
