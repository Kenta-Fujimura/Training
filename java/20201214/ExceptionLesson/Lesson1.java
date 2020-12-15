import java.util.*;
import java.io.*;
public class Lesson1{
	public static void main(String[]args) throws Exception{
		FileWriter fw = new FileWriter("data.txt",true);//追記の場合はtrue
		fw.write("hello!\n");
		fw.close();
	}
}
