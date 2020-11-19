import java.util.*;
public class Kadai{
	public static void main(String[]args){
		int num[] = new int [99];
		int Ascore = 0;
		int Bscore = 0;
		int Acount = 0;
		int Bcount = 0;
		int Arnd;
		int Brnd;	

		for(int i=0;i<num.length;i++){
    	//System.out.println(i);
			num[i] = i + 1;
		}
		//System.out.println(Arrays.toString(num));
		for(int j=0;j<5;j++){
			while(true){
			    Arnd = new Random().nextInt(99);
				Ascore = num[Arnd];
				num[Arnd] = 0;
				if(Ascore != 0){
					break;
				}
			}
			
			while(true){
			    Brnd = new Random().nextInt(99);
				Bscore = num[Brnd];
				num[Brnd] = 0;
				if(Bscore != 0){
					break;
				}
			}
	
			System.out.println(j+1 + "回戦");
			if(Ascore > Bscore){
				System.out.printf(" A:%d,B:%d…Aの勝ち%n",Ascore,Bscore);
				Acount = Acount+1;
						
			}else{
				System.out.printf(" A:%d,B:%d…Bの勝ち%n",Ascore,Bscore);
				Bcount = Bcount+1;

			}

		}
        //System.out.println(Arrays.toString(num));
		if(Acount > Bcount){
			System.out.printf("%d対%dでAの勝ち%n",Acount,Bcount);
		}else{
			System.out.printf("%d対%dでBの勝ち%n",Acount,Bcount);
		}
	}
}
