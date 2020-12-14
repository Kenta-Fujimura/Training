import java.util.*;
public class IteratorLesson{
	public static void main(String[] args){
		ArrayList<String> names = new ArrayList<String>();
		names.add("minato");
		names.add("asuka");
		names.add("suga");

		Iterator<String> it = names.iterator();
		while(it.hasNext()){
			String e=it.next();
			System.out.println(e);
		}
		printList(names);
	}
	public static void printList(List<String>list){
		for(String s:list){
			System.out.print(s);
		}
	}
}
