import java.util.*;
public class Q3{
	public static void main(String[]args){
		int nums[] = new int[10];
		for(int i=0;i<nums.length;i++){
			int rnd = new Random().nextInt(6)+1;
			nums[i] = rnd;
		}
		System.out.println(Arrays.toString(nums));
	}
}
