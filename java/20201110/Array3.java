import java.util.Array3;
public class ArrLesson3{
	public static void main(String[] args){
		int[] dataA={3,5,10};
		String[] strs={"hoge","fuga","bar"};
		int[] dataB=new int[]{4,6,10};

		for(int i=0;i<strs.length;i++){
			System.out.println(strs[i]);
		}
		
//拡張for文
		for(int n : dataB){
			System.out.println(n);
		}

		for(String s : strs){
			System.out.println(s);
		}


		System.out.println(Arrays.toString(dataA));
	}
}
