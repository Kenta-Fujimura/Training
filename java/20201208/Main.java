public class Main{
	public static void main(String[]args){
		Hero h=new Hero();
		h.name = "minato";
		h.hp=100;
		Hero h1=new Hero();
		h1.name= "minato";
		h1.hp=100;
		if(h.equals(h1) == true){
				System.out.println("mach");
		}else{
				System.out.println("no mach");
		}
	}
}
