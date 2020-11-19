import java.util.*;
public class Q5{
	public static void main(String[]args){
		int nums1[] = new int [5];
		int nums2[] = new int [5];
		
		System.out.println("***nums1***");
		for(int i=0;i<nums1.length;i++){
			int rnd = new Random().nextInt(100+1);
			nums1[i] = rnd;
			System.out.printf("%d%n",nums1[i]);
		}

		System.out.println("***nums2***");
		for(int i=0;i<nums2.length;i++){
			nums2[i] = nums1[i]*3;
			System.out.printf("%d%n",nums2[i]);
		}
	}
}
