import java.util.*;
public class CatApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***Cat Collection***");
				List <Cat> cats = new ArrayList<>();

				while(true){

        	System.out.println("1.Collect 2.Play 3.End＞");
					int select = sc.nextInt();
					switch(select){
					case 1:
					
						Cat cat = new Cat("tama");
						cat.collect();

						System.out.println("Please name this cat>");
						String name = sc.next();
						cat.setName(name);
						cats.add(cat);
						System.out.print(name + " joined!");
						
						break;

					case 2:
						if(cats.isEnpty()){
							System.out.println("You do not have anyone to play with.");
							break;
						}
						cat.play(cats.size());

						break;

					default:
						return;
					}
				}
		}
}
class Cat{
	Random rnd = new Random();
	char type;
	String name;
	int intimacy;
  Cat(String name){
		this.name = name;
	}
	public void collect(){
		char[] types = {'A','B','C'};
		int r = rnd.nextInt(3);
		System.out.println(types[r] + "-type cat appeared!");
		char t = types[r];
		setType(t);
	}

	public void play(int num){
		for(int i=0;i<num;i++){
			System.out.println(i +"・・・" + cats(i));
		}
	}

	public void setName(String name){
		this.name = name;
	}

	public void setType(char t){
		this.type = type;
	}
}
