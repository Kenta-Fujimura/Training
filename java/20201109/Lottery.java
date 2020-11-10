public class Lottery{
	public static void main(String[]args){
		int sum = 0;
		int rnd;
	  int yen = 0;


			for(int i=0;i<3;i++){
				System.out.println((i+1) + "回目");
				rnd = new java.util.Random().nextInt(100);
				System.out.println(rnd);
				
				if(rnd == 1){
					 yen = 10000000;
					 System.out.println("1000万円");

				}else if(rnd == 2 || rnd == 3 ){
					 yen = 1000000;
					 System.out.println("100万円");
						
				}else if(rnd == 4 || rnd == 5 || rnd ==6){
					 yen = 100000;
					 System.out.println("10万円");
					 
				}else if(rnd == 7 || rnd == 8 || rnd ==9 || rnd == 10){
					 yen = 10000;
					 System.out.println("1万円");
			
				}else if(rnd >= 11 && rnd <= 20){
					 yen = 1000;
					 System.out.println("1000円");
				
				}else if(rnd >= 21 && rnd <= 40){
					 yen = 100;
					 System.out.println("100円");
			
				}else{
					 System.out.println("ハズレ");
				}
        sum = sum + yen;
				yen = 0;
		}
		System.out.println("獲得金額は" + sum + "円でした");
	}
}
