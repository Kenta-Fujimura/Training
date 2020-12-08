import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("自転車を選んでください>");
		System.out.println("0・・・自転車/ホイールサイズ:27");
		System.out.println("1・・・電動自転車/ホイールサイズ:24 バッテリー:10");
		System.out.println("2・・・終了");
		System.out.print("番号を入力してください>");
		int select = sc.nextInt();
		switch(select){
			case 0:
				Bicycle b0=new Bicycle(27);
				break;
			case 1:
				ElectricBicycle b1 = new ElectricBicycle(24);
				break;
			case 2:
				System.out.print("書アプリケーションを終了します。");
				return;
		}
		
		System.out.print("1/走る,2/降りる>");
		int select2 = sc.nextInt();
		switch(select2){
			case 1:
				Bicycle.ride();
				break;

			case 2:
				b0.batteryCharge();
				break;

		}

		
	}
}
