import java.util.*;
public class Q1{
	public static void main(String[] args){
		System.out.print("何クラス>");
		int cls = new Scanner(System.in).nextInt();
		int [][] score =new int[cls][];
		for(int i=0;i<cls;i++){
			System.out.print("クラス" + (i + 1) + "は何人>");
			int member = new Scanner(System.in).nextInt();
	  	score[i] = new int [member];
		  for(i=0;i<cls;i++){
					for(int j=0;j<member;j++){
						System.out.print((j + 1) + "人目の点数>");
			 		 	score[i][j] = new Scanner(System.in).nextInt();
					}
			}
		System.out.println("--- 結果---");
		for(i=0;i<score.length;i++){
			for(int j=0;j<score[i].length;j++)
				System.out.printf("%4d",score[i][j]);
			}
		}
	}
}
