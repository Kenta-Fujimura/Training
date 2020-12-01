import java.util.*;
public class BingoGame{
	public static void main(String[] args) throws Exception{
		System.out.print("あなたの名前を入力してください>");
		String userName = new Scanner(System.in).nextLine();
		System.out.print("あなたの年齢を入力してください>");
		int userAge = new Scanner(System.in).nextInt();
		Bingo b1 = new Bingo(userName,userAge,100);
    boolean ageCheck = b1.ageCheck(userName,userAge);
		if(ageCheck == false){
			return;
		}

		while(true){
			if(b1.coin == 0){
				System.out.println("コインがなくなりました");
				System.out.println("Game Over");
				return;
			}
    	System.out.print("BET枚数を入力。0で終了　1-" + b1.coin + ">"); 		
			int bet = new Scanner(System.in).nextInt();
			if(bet == 0){
				System.out.println("Game Over");
				return;
			}
			b1.play(bet);
		}
	}
}

class Bingo{
  final int BINGO_RATIO=12;
	String userName;
	int userAge;
	int coin;
	
	public Bingo(String userName,int userAge,int coin){
		this.userName = userName;
		this.userAge = userAge;
		this.coin = coin;
	}
	public boolean ageCheck(String userName,int userAge){
		boolean ageBool;
		System.out.printf("こんにちは%s(%d歳)さん。%n",this.userName,this.userAge);
		if(userAge > 18){
			ageBool = true;
		}else{
	 	 	System.out.println("18歳未満の方は遊戯できません");
	  	ageBool = false;
		}
		return ageBool;
  }
	
	public void play(int bet) throws Exception{
		if(this.coin < bet){
			System.out.println("コインが不足しています");
			return;
		}
		this.coin -= bet;
		Random rand=new Random();
		int[] table=new int[9];
		for(int i=0;i<9;i++){
			
		try{
 			Thread.sleep(1000); // 1秒間だけ処理を止める
		}catch(InterruptedException e){
			e.printStackTrace();
    }      
			table[i]=rand.nextInt(10);
			System.out.print(table[i] + " ");
			if((i+1) % 3==0){
				System.out.println();
			}
		}
		int bingoCount=bingoCount(table);
		if(bingoCount==0){
			System.out.println("boo");
		}else{
			int win=bet*BINGO_RATIO*bingoCount;
			System.out.println(bingoCount+" LINE BINGO!!win:"+win);
			this.coin += win;
		}
		System.out.printf("%sさんの所持コイン:%d%n",this.userName,this.coin);
	}	
	public int bingoCount(int[] table){
		int[][] bc={
			{0,1,2},{3,4,5},{6,7,8},
			{0,3,6},{1,4,7},{2,5,8},
			{0,4,8},{2,4,6}
		};
		int bingo=0;
		for(int i=0;i<bc.length;i++){
			int[] c= bc[i];
			if(table[c[0]] == table[c[1]] && table[c[1]] == table[c[2]]){
				bingo++;
			}
		}
		return bingo;
	}
}
