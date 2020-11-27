public class Pencil{
	String color;
	int penLength = 5;

	public Pencil(String color){
		this.color = color;
	}

	public void write(){
		
		if(this.penLength == 0){
			System.out.println("もう書けません!");
		}else{
			System.out.println(this.color + "で書いた!");
			this.penLength --;
		}
		
	}

	public void viewInfo(){
		System.out.println("色:" + this.color);
		String pic = "";
		for (int i=0 ;i<this.penLength;i++){
			pic = pic + "+";
		}
		System.out.println(pic + ">");
	}

	public void finish(){
		System.out.println("アプリケーションを終了します");
	}

}
