public class Hero{
	static int money;
	private String name;
	private int hp;
	public Hero(String name){
		this.setName(name);
	}
	public Hero(String name,int hp){
		this.setName(name);
		this.setHp(hp);
	}
	public String getName(){
		return this.name;
	}
	public int getHp(){
		return this.hp;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setHp(int Hp){
		this.hp = hp;
	}
	public void attack(){
		money+= 10;
		int damage= new java.util.Random().nextInt(10)+1;
		this.hp-=damage;
		System.out.println(this.name+ "は" + damage + "のダメージ！！");
		System.out.println("win");

	}
	public static void showMoney(){
		System.out.println("所持金:" + money);
	}
	
}
