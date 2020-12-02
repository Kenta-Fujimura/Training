import java.util.*;
public class DxBingo{
	public static void main(String[]args){
		int nums[] = new int[100];
		for(int i=1;i<100;i++){
			nums[i]= i;
		}
		//カードシャッフル
		for(int i=1;i<100;i++){
			int index=new Random().nextInt(99)+1;
			int temp=nums[i];
			nums[i]=nums[index];
			nums[index]=temp;
		}

		//カード表示
		for(int i=1;i<=25;i++){
			if(i==13){
				nums[i] = 0;
			}
			if(nums[i]==0){
				System.out.print("@@ ");
				}else{
				System.out.printf("%2d ",nums[i]);
			}
			if(i%5==0){
				System.out.println();
			}
		}
		
		//玉
		int pullNums[] = new int[100];
		for(int i=1;i<100;i++){
			pullNums[i]= i;
		}

		//玉シャッフル
		for(int i=1;i<100;i++){
			int index=new Random().nextInt(99);
			int temp=pullNums[i];
			pullNums[i]=pullNums[index];
			pullNums[index]=temp;
		}

		System.out.println("Push Enter KEY");
		new Scanner(System.in).nextLine();
		
	
		//System.out.println(Arrays.toString(pullNums));

	}
}
