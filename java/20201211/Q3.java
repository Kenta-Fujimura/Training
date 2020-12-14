import java.util.*;
public class Q3{
	public static void main(String[] args){
		Map<Integer,Integer> map=new TreeMap<>();
		Scanner sc=new Scanner(System.in);
		int count=100;
		Random rand=new Random();
		for(int i=0;i<count;i++){
			int num=rand.nextInt(100)+1;
			map.put(num,map.get(num) + 1);
		}
		System.out.println("***result***");
		for(int key:map.keySet()){
			System.out.printf("%d...%d回%n",key,map.get(key));
		}
	}
}
