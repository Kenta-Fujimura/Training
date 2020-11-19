import java.util.*;
public class Q3{
	public static void main(String[] args){
		System.out.print("n(1~9)?>");
		int n = new Scanner(System.in).nextInt();
		int[][] nums=new int[n][9];
	  for(int i=0;i<n;i++){
	  	  for(int j=0;j<9;j++){
	    			nums[i][j]=(i+1)*(j+1);
	    	}
	  }
    
		/*出力*/
    for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums[i].length;j++){
					char c = (j == 8) ? ' ':'|';
        	System.out.printf("%3d%c",nums[i][j],c);
    		}
        System.out.println();
    }
	}
}
