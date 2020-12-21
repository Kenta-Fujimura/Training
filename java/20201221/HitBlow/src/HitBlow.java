import java.util.Random;
import java.util.Scanner;
public class HitBlow {

	public static void main(String[] args) {
		final int NUM_COUNT=4;
		int[] nums= {1,2,3,4,5,6,7,8,9};
		int[] ans = new int[NUM_COUNT];
		for(int i=0;i<NUM_COUNT;i++) {
			int index=new Random().nextInt(nums.length-i);
			ans[i]=nums[index];
			nums[index]=nums[nums.length-1-i];
		}
		int count = 0,hit,blow;
		do {
			count++;
			hit=0;
			blow=0;
			System.out.printf("数字を%d桁で入力してください>",NUM_COUNT);
			int input=extracted().nextInt();
			int[] userAns=new int[NUM_COUNT];
			for(int i = ans.length-1;i>=0;i--) {
				userAns[i]=input %10;
				input /=10;
			}
			for(int i=0;i<NUM_COUNT;i++) {
				if(userAns[i]==ans[i]) {
					hit++;
				}else {
					for(int j=0;j<NUM_COUNT;j++) {
						if(userAns[i]==ans[j]) {
							blow++;
						}
					}
				}
			}
			System.out.printf("Hit:%d,Blow:%d%n",hit,blow);
		}while(hit!=NUM_COUNT);
		System.out.printf("%d回でclear%n",count);
	}
	private static Scanner extracted() {
		return new Scanner(System.in);
	}
}


