import java.util.*;
public class Janken{
	public static void main(String[]args){
		System.out.print("手を入力0.グー、1.チョキ、2.パー>");
		int yourhand = new Scanner(System.in).nextInt();
		int pchand = new Random().nextInt(3);
		String[] index={"グー","チョキ","パー"};
		System.out.printf("PCは%s%n",index[pchand]);
		
		if(yourhand == pchand){
			System.out.println("draw");	
		}else if((yourhand == 0 && pchand == 1) 
				|| (yourhand == 1 && pchand == 2 )
				|| (yourhand == 2 && pchand == 0)){
			System.out.println("you win");
		}else{
			System.out.println("you lose");
		}
	}
}
