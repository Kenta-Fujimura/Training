public class Code5_13{
	public static void incArray(int[] array){
		for(int i =0 ;i<array.length;i++){
			array[i]++;
		}
	}
	public static void incNum(int n){
		n++;
		System.out.print(n);
	}

	public static void main(String[]args){
		int[] array={1,2,3};
		incArray(array);
		for(int i :array){
			System.out.println(i);
		}
		int n = 10;
		incNum(n);
		System.out.print(n);tfv
	}
}
