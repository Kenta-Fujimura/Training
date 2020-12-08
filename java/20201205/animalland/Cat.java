public class Cat extends Animal{
	public Cat(String name){
		super(name);
	}
	@Override
	public void makeNoize(){
			System.out.println(this.name + "にゃん");
	}
	public void sleep(){
		System.out.println("こたつでおやすみzzzz..");
	}
}
