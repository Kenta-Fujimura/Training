import java.util.*;
public class Q2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		System.out.println("ArrayListを使ってみよう！");
		System.out.println("Listにスライムを追加していってみよう。");
		while(true){
			System.out.print("スライムを追加する？(1…yes,2…no):");
			int select = sc.nextInt();
			switch(select){
			case 1 :
				System.out.print("追加するスライムの名前を決めてね:");
				String name = new Scanner(System.in).nextLine();
				arr.add(name);
				System.out.println(name + "が現れた！！");
				break;
			case 2 :
				for(String i:arr){
      		System.out.println(i + "の攻撃:5ポイントのダメージを与えた!");
   			}
				return;
			}
		}
	}
}

