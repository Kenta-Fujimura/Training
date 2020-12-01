import java.util.*;
public class HitBlow{
	public static void main(String[]args){
		System.out.print("要素数(10以下)>");
		int num = new Scanner(System.in).nextInt();
		int nums[] = new int [num];

		for(int i=0;i<num;i++){
			nums[i] = i;
		}
		System.out.println(Arrays.toString(nums));

	}
}
