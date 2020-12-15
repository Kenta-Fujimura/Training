import java.util.*;
import java.io.*;
public class Lesson2{
	public static void main(String[]args){
		FileWriter fw = null;
		try{
			fw = new FileWriter("data.txt",true);
			fw.write("hello!\n");
		}catch(Exception e){
			System.out.println("error");
		}finally{
			if(fw != null){
				try{
					fw.close();
				} catch(IOException e){
					;
				}
			}
		}
	}
}
