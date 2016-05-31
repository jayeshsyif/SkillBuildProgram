package list.example;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class ListAddAndRemoveSimultaneously {
	public static void main(String[] args) {

		List<String> list= new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");

		ListIterator<String> iterator = list.listIterator();
		while(iterator.hasNext()){
			String s = iterator.next();
			if(s.equalsIgnoreCase("1"))
			{
				iterator.remove();
			}else if(s.equalsIgnoreCase("2"))
			{
				iterator.add("23");
			}else 
			{
				
			}

		}

		System.out.println(list);
	}
}
