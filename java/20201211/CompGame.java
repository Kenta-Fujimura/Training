import java.util.*;
public class CompGame{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		Map<Integer,String> map=new LinkedHashMap<>();
		boolean box[] = new boolean[6];
		int count = 0;
		String x ="";
		while(true){
			int num = rnd.nextInt(6);
			box[num] = true;
			count ++;
			if(box[0]==true && box[1] == true && box[2] == true
					&& box[3] == true && box[4]==true && box[5] == true){ 
				for(int i=0;i<box.length;i++){
					box[i]=false;
				}
				break;
			}
		}
		System.out.println("count:"+count);


		System.out.println(Arrays.toString(box));
			x = map.get(count);
		  x = x + "*"; 
			map.put(count,x);
			
		

		for(int key:map.keySet()){
			String value = map.get(key);
			System.out.println(key + ":" + value);
	
		}
	
	}
}
