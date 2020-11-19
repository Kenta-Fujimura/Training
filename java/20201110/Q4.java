import java.util.*;
public class Q4{
	public static void main(String[]args){
		int nums[] = new int [5];
		for(int i=0;i<nums.length;i++){
			int rnd = new Random().nextInt(100+1);
			nums[i] = rnd;
			System.out.printf("nums[%d]:%d%n",i,nums[i]);
		}
	}
	
}
