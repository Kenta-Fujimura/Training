public class Dancer extends Character{
	public void dance(){
		System.out.println(this.name + "dance");

	}
	@Override
	public void attack(Matango m){
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に3ポイントの damage");
		m.hp-=3;
	}
}
