import java.util.*;
public class Q1{
	public static void main(String[]args){
		System.out.print("何回ふる？>");
		int count = new Scanner(System.in).nextInt();
		int scoreA[] = Rnd(count);
//		int sum = IntStream.of(scoreA).sum();
		System.out.println("A さん:" + Arrays.toString(scoreA) + (sum(scoreA, 0)));
	}

	public static int[] Rnd(int count){
		int scoreA[] = new int[count];
		int sumA = 0;
		for(int i=0;i< count;i++){
			scoreA[i] = new java.util.Random().nextInt(6)+1;
			sumA = sumA + scoreA[i];
		}
		return scoreA;
	}
	public static int sum(int[] scoreA, int index) {
		return index < scoreA.length ? scoreA[index] + sum(scoreA, index + 1) : 0;
	}
}
