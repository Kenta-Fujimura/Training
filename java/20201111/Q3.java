import java.util.*;
public class Q3{
	public static void main(String[]args){
		int nums[] = new int [10];
		String str[] = new String[10];
		//数字を配列(nums)に格納
		for(int i=0;i<nums.length;i++){
			int	rnd = new Random().nextInt(10);
			nums[i] = rnd;
			System.out.print(rnd + ",");
		}
		System.out.println();
		//文字列を配列(str)に格納
		for(int j=0;j<nums.length;j++){
			str[j] = nums[j] % 2 == 0 ? "偶数":"奇数";
		}
		
		System.out.println(Arrays.toString(str));
	}
}
