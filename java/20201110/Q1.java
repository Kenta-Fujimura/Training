import java.util.*;
public class Q1{
	public static void main(String[]args){
		int count = 0; 
		int nums[] = new int[5];  
//	boolean isPiced={false,false,false,false,false};
		for(int i=0;i<nums.length;i++){
			nums[i] = i;
	//		System.out.println(nums[i]);
		}	
		
		while(count < nums.length){
			int rnd = new Random().nextInt(nums.length);
		  
			while(nums[rnd] < 99999){
			System.out.println(nums[rnd]+1);
			nums[rnd] = nums[rnd] + 99999;
			count = count + 1;
			}
		}
	}
}
