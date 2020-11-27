import java.util.*;
public class PencilApp{
	public static void main(String[]args){
		System.out.print("何色の鉛筆を作りますか>:");
		String color = new Scanner(System.in).nextLine();
		Pencil p1 = new Pencil(color);
		
		while(true){
		System.out.print("操作を入力してください1…書く,2…情報を見る,3…終了>");
		int select = new Scanner(System.in).nextInt();
	  switch(select){
			 case 1:
	   	  	p1.write();
			  	break;
			 case 2:
			  	p1.viewInfo();
		      break;
		   case 3:
					p1.finish();
				  return;
			 default:
					System.out.println("不正な値");
			}
		}
	}
}
