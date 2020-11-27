import java.util.*;
public class MonkeyApp{
	public static void main(String[]args){
		System.out.print("おさるの名前を決めてください:>");
		String name = new Scanner(System.in).nextLine();
		System.out.print("おさるの歳を決めてください:>");
		int age = new Scanner(System.in).nextInt();
		Monkey m1 = new Monkey(name,age);

		while(true){
			System.out.println("おさるに何をさせますか？1…挨拶、2…竹馬、3…逆立ち、4…終了>");
			int select = new Scanner(System.in).nextInt();

			if(select == 1){
				m1.greet();
			}else if(select == 2){
				m1.takeuma();
			}else if(select == 3){
				m1.sakadachi();
			}else{
				System.out.print("アプリケーションを終了します。");
				break;
			}
		}
	}
}
