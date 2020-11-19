import java.util.*;
public class Nijiuhairetu{
	public static void main(String[] args){	
		int[][] scores = new int[3][4];

		for(int i=0;i<scores.length;i++){
			for(int j=0;j<scores[i].length;j++){
				scores[i][j] = new Random().nextInt(100)+1;
				System.out.printf("%4d",scores[i][j]);
			}
			System.out.println();
		}
	}
}
		
