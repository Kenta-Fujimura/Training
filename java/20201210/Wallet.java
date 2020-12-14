public class Wallet{
	private int money;
	public Wallet(int money){
		this.money = money > 0 ? money : 0;
	}


	public void insertMoney(int money){
		this.money += money;
		System.out.printf("財布に%d円入れました。%n",money);
	}
	public int takeOutMoney(int money){
		int m = this.money > money ? money : this.money;
		this.money -= m;
		System.out.printf("財布から%d円取り出しました。%n",m);
		return m;
	}

	public void display(){
		System.out.println("現在の財布の中身："+this.money+"円");
	}
}
