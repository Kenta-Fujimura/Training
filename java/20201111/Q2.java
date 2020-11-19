import java.util.*;
public class Q2{
	public static void main(String[]args){
		int nums[] = new int[100];
		int ans = 1000;
		
		for(int i=0;i<nums.length;i++){
			int	rnd = new Random().nextInt(100); 
			nums[i] = rnd;
			System.out.print(rnd + ",");
		}
		System.out.println();
	
		//System.out.println(Arrays.toString(nums));
		for(int j=0;j<nums.length;j++){
			if(nums[j] == 77){
				ans = j;
				break;
			}
		}

		if(ans == 1000){
			System.out.println("77はありませんでした。");
		}else{
			System.out.println("最初の77のindexは" + ans );
		}

	}
}
