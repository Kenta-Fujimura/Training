import java.util.*;
public class Q2{
	public static void main(String[] args){
		Map<Integer,Integer> map=new TreeMap<>();
		for(int i=1;i<=100;i++){
			map.put(i,0);
		}
		Scanner sc=new Scanner(System.in);
		int count=100;
		Random rand=new Random();
		for(int i=0;i<count;i++){
			int num=rand.nextInt(100)+1;
			if(map.containsKey(num)){
				map.put(num,map.get(num)+1);
			}else{
				map.put(num,1);
			}
		}
		System.out.println("***result***");
		for(int key:map.keySet()){
			System.out.printf("%d...%d回%n",key,map.get(key));
		}
	}
}
