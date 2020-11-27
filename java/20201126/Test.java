import my.util.*;
import java.util.*;

public class Test{
	public static void main(String[]args){
		System.out.print("配列の要素数を入力してください>");
		int count = new Scanner(System.in).nextInt();
		int arr[] = Common.arrRandomRange(-10,10,count);
		System.out.println("配列を生成しました。");
		System.out.println(Arrays.toString(arr));
		int orgarr[] = Common.arrClone(arr);
		while(true){
			System.out.print("1...元の配列を表示,2...配列を昇順ソート,3...配列を降順ソート,4...終了>");
			int selectManu = new Scanner(System.in).nextInt();
			if(selectManu == 1){
					System.out.println(Arrays.toString(orgarr));
			}else if(selectManu == 2){
					Common.arrSort(arr);
					System.out.println(Arrays.toString(arr));
			}else if(selectManu == 3){
					Common.arrSort(arr,true);
					System.out.println(Arrays.toString(arr));
			}else{
					System.out.println("アプリケーションを終了します");
					break;
			}
		}
	}
}
