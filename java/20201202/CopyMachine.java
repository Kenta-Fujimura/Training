import java.util.*;
public class CopyMachine{
	int paper;
	public CopyMachine(int sheet){
		this.paper = sheet;
		if(sheet <0){
			this.paper = 0;
		}
	}
	
	public void feedPaper(int sheet){
		this.paper = this.paper + sheet; 
		System.out.println(sheet + "枚給紙しました。");
	}

	public void copy(int sheet){
		if(this.paper < sheet){
			sheet = this.paper;
		}
		this.paper = this.paper - sheet;
		System.out.println(sheet + "枚コピーしました。");
	}

	public void display(){
		System.out.println("コピー可能な枚数は"+ this.paper+"枚です。");
	}
}
