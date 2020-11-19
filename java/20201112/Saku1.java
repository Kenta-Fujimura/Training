import java.util.*;
public class Saku1{
	public static void main(String[]args){
		System.out.print("何人>");
		int nums[] = new int[new Scanner(System.in).nextInt()];
		for(int i=0;i<nums.length;i++){
			System.out.print((i + 1) + "人目の点数>");
			nums[i] = new Scanner(System.in).nextInt();
		}
		System.out.println(Arrays.toString(nums));
	}
}
