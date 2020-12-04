public class Main{
	public static void main(String[]args){
		//SuperHero sh = new SuperHero();
		//sh.run();
		//Weapon w = new Weapon();
/*		Hero h = new Hero();
		Sword s=new Sword();
		s.name="鋼の剣";
		s.damage = 10;
		h.setSword(s);
		PoisonMatango[] ms = new PoisonMatango[3];
		ms[0]=new PoisonMatango('A');
		ms[1]=new PoisonMatango('B');
		ms[2]=new PoisonMatango('C');

		for(Matango m : ms){
			m.attack(h);
		}
		System.out.println(h.name+ "のHP:" + h.hp);
		h.attack(ms[0]);*/
		
		//Character c = new Character(); 
		//Dancer dancer=new Dancer();
		Goblin g = new Goblin();
		Werewolf w = new Werewolf();
		DeathBat db = new DeathBat();
		g.attack();
		w.attack();
		db.attack();

		g.run();
		w.run();
		db.run();


	}
}
