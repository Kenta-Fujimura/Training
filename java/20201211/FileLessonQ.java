import java.util.*;
import java.io.*;
public class FileLessonQ{
	public static void main (String[]args) throws Exception{

		Map<String,Integer> map1 = new HashMap<>();//名前、金額
		Map<String,Integer> map2 = new HashMap<>();//科目、金額


		FileInputStream fis = new FileInputStream("data.csv");
		InputStreamReader isr = new InputStreamReader(fis,"utf-8");
		BufferedReader br = new BufferedReader(isr);
		String line;
		while((line = br.readLine()) != null){
			System.out.println(line);
			String[] data = line.split(",",-1);
			map1.put(data[0],Integer.parseInt(data[2]));
			map2.put(data[1],Integer.parseInt(data[2]));
		}
		br.close();
		for(String key : map1.keySet()){
			int value = map1.get(key);
			System.out.println(key + ":" + value);
		}

		for(String key : map2.keySet()){
			int value = map2.get(key);
			System.out.println(key + ":" + value);
		}



	}
}
