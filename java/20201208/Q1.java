import java.util.*;
public class Q1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.println("ArrayListを使ってみよう！");
		System.out.println("Listに数字をどんどん追加していってみよう。");
		while(true){
			System.out.print("要素追加するよ数字を入れてね(0で終了):");
			int num = sc.nextInt();
			if(num == 0){
				System.out.println("——結果——");
				System.out.println("要素数:" + arr.size());
				System.out.print("要素:");
				for(int i:arr){
      		System.out.print(i + ",");
   			}
				return;
			}
			arr.add(num);
			System.out.println(num + "をListに追加したよ！");
		}
	}
}
