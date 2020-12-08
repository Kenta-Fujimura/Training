import java.util.*;
public class ElectricBicycle extends Bicycle{
	int battery;
	public ElectricBicycle(int wheelSize){
		super(wheelSize);
		final int MAX=10;
	}

	public void ride(){
		this.battery -= 5;
		if(this.battery == 5){
			System.out.println("坂道だってラクラクです。");
		}else{
			System.out.println("バッテリーが切れるととても重いです。");
		}
	}

	public void batteryCharge(){
		this.battery = 10;
		System.out.println("バッテリーを充電しました。");
	}
}
