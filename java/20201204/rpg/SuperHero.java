public class SuperHero extends Hero{
	int hp = 100;
	boolean flying;

	public SuperHero(){
		super();
		System.out.println("スーパーヒーローコンストラクタ");
	}

	public void fly(){
		this.flying = true;
		System.out.println("とんだ");
	}

	public void land(){
		System.out.println("着地");
	}
	
	@Override
	public void run(){
		System.out.println("撤退");
	}
	@Override
	public void attack(Matango m){
		super.attack(m);
		if(this.flying){
			super.attack(m);
		}
	}
}
