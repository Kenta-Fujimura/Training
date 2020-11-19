import java.util.*;
public class Kadai2{
	public static void main(String[]args){
		char ch[] ={'H','E','L','L','O'};
		//System.out.println(Arrays.toString(ch));
		
		//for(int i=ch.length -1;i>=0;i--){
		//	System.out.print(ch[i]);
		//}
		
		for(int i=0;i < ch.length / 2 ;i++){
			ch[i] = ch[ch.length-1-i];
		}

		System.out.println(Arrays.toString(ch));


		System.out.println();
	}
}
