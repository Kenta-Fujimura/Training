public class Hero{
	String name ="ミナト";
	int hp=100;

	public Hero(){
		System.out.println("Heroコンストラクタ");
	}

	public void attack(Matango m){
		System.out.println(this.name + "の攻撃");
		m.hp -=5;
	}

	public void run(){
		System.out.println(this.name + "5ポイントのダメージを与えた！");
	}

}
