import java.util.*;
public class SplitTest{
	public static void main(String[]args){
		if(args.length >0){
			String str = args[0];
			String[] data = str.split(",");
			System.out.println(Arrays.toString(data));
			int sum = 0; 
			for(String s :data){
				sum = sum + Integer.parseInt(s);
			}
		System.out.println("引数の合計は" + sum + "です");
		}
	}
}
