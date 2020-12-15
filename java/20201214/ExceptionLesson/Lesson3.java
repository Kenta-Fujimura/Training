import java.util.*;
import java.io.*;
public class Lesson3{
	public static void main(String[]args){
		try(FileWriter fw = new FileWriter("data.txt",true);){
			fw.write("hello!\n");
		}catch(Exception e){
			System.out.print("何らかの例外が発生しました");
		}
	}
}
