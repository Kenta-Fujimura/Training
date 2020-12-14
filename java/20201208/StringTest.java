public class StringTest{
	public static void main(String[]args){
		String s1="すっきりJava";
		String s2="Java";
		String s3="java";
		if(s2.equals(s3)){
			System.out.println("s2とs3は等しい");
		}
		if(s2.equalsIgnoreCase(s3)){
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}
			System.out.println(s1.length());
		if(s1.isEnpty()){
			System.out.println("enpty");
		}

		String s4="java and JavaScript";
		if(s4.contains("Java")){
			System.out.println("s4 matubi");
		}

		if(s4.startsWith("Java")){
			System.out.println("s4 first" + s4.indexOf(Java))



			
		}
	}
}
