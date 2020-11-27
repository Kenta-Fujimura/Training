public class Ex5_2{
	public static void main(String[] args){
		email("お誘い","usi800@xxx.com","今度飲みに行きませんか");
	}

	static void email(String title,String address,String text){
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}

}
