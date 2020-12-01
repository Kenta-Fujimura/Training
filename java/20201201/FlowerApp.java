import java.util.*;
public class FlowerApp{
	public static void main(String[]args){
		System.out.print("何色の花にしますか？>");
		String color = new Scanner(System.in).nextLine();
		System.out.print("種をいくつ植えますか？>");
		int seedNum = new Scanner(System.in).nextInt();
		Flowerbed f1 = new Flowerbed(color,seedNum);
		
		while(true){
			System.out.print("何をしますか？1…水汲み2…水撒き3…花壇を見る4…終了>");
			int menu = new Scanner(System.in).nextInt();

			switch(menu){
			case 1:
					 f1.drawWater();
					 break;	
			case 2:
					 f1. waterFlower();
					 break;
			case 3:
					 f1.showStatus();
					 break;
			case 4:
					 System.out.println("アプリケーションを終了します。");
					 return;
			}
		}
	}
}
