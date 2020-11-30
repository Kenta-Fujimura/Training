public class MethodLesson8 {
	// int型の引数を2つ受け取りその大きい方の値を返すメソッド
	static int largeOf(int a, int b) {
		if(a>=b){
			return a;
		}else{
			return b;
		}
	}
	//double型の引数2個を受け取って長方形の面積を返すメソッド
	static double rectArea(double height,double width){
		return height*width;
	}
	//int型の引数1個を受け取ってそれが偶数ならばtrueをそうでなければfalseを返すメソッド
	static boolean isEven(int n){
		return n%2==0;
	}

	public static void main(String[] args) {
		System.out.println(largeOf(10,20)); //20
		System.out.println(rectArea(10.0,15.0));//150.0
		int x=10;
		if(isEven(x)){
			System.out.println(x+"は偶数");
		}else{
			System.out.println(x+"は奇数");
		}
	}
}
