import java.util.*;
public class Test{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("文字列a:>");
		String a =  sc.nextLine();
		System.out.print("文字列b:>");
		String b =  sc.nextLine();
		System.out.println("equals():" + a + "と" + b + "が同じかどうか:" + a.equals(b));
		System.out.println("equalsIgnoreCase():" +a + "と" + b + "が同じかどうか(大文字小文字無関係):" + a.equalsIgnoreCase(b));
		System.out.println("length():" + a + "の長さは：" + a.length());
		System.out.println("isEmpty():" + a + "の長さが0 かどうか：" + a.isEmpty());
		System.out.println("contains():" + a + "にx が含まれるかどうか:" + a.contains("x"));
		System.out.println("startsWith():"+a + "がx ではじまるかどうか:" + a.startsWith("x"));
		System.out.println("endsWith():" + a + "がx で終わるかどうか:" + a.endsWith("x"));
		System.out.println("indexOf():" + a + "で最初にxが登場するのは:" + a.indexOf("x") + "文字目");
		System.out.println("lastIndexOf():" +a + "で最後にxが登場するのは:" + a.lastIndexOf("x") + "文字目");
		System.out.println("charAt():"+a + "の4文字目は:"+ a.charAt(3));
		System.out.println("substring():"+a + "の４文字目以降は:" + a.substring(3));
		System.out.println("subltring():" + a + "の４- 6文字目以降は:" + a.substring(3,6));
		System.out.println("toLowerCase():" + b + "を小文字に変換：" + b.toLowerCase());
		System.out.println("toApperCase():" + a + "を大文字に変換：" + a.toUpperCase());
		System.out.println("trim():" + a + "の空白を除去:" + a.trim());
		System.out.println("replace():" + a + "のxをaに変換:" + a.replace("x","a"));
	}
}
