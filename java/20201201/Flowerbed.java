public class Flowerbed{
	final int MAXWATER=3; //一度に持てる水の最大値
	String color; //花の色
	int seedNum; //種の数
	int bloom; //咲いた花の数
	int water; //水の量

	public Flowerbed(String color,int seedNum){
		this.color = color;
		this.seedNum = seedNum;
	}

	public void drawWater(){
		if(this.water == this.MAXWATER){
			System.out.println("水は満杯です！");
		}else{
			System.out.println("水を" + (this.MAXWATER - this.water) + "杯汲みました。");
			this.water = this.MAXWATER;
		}
	}

	public void waterFlower(){
		if(this.bloom == this.seedNum){
			System.out.println("すべての花が咲いています!");
		}else if(this.water == 0){
			System.out.println("水が空っぽです。");
		}else{
			System.out.println("水を撒きました");
			this.water = this.water - 1;
			this.bloom = this.bloom + 1;
		}
	}

	public void showStatus(){
		System.out.println("花の色は" + this.color);
		System.out.print("#");
		for(int i=0;i<this.seedNum;i++){
			if(i < this.bloom ){
				System.out.print("*");
			}else{
				System.out.print(".");
			}
		}
		System.out.println("#");
	}
}
