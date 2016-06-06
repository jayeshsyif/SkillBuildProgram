package vector.example;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> vect = new Vector<String>();
		vect.addElement("J");
		vect.addElement("A");
		vect.addElement("Y");
		for(String s : vect)
		{
			System.out.println(s);
		}
		System.out.println("Enumeration");
		//Enumeration
		Enumeration<String> e = vect.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		System.out.println("Iterator");
		//Iterator
		Iterator<String> it = vect.iterator();
		while(it.hasNext())
		{
			String n  = it.next();
			if(n.equals("A"))
			{
				it.remove();
			}else
			{
				System.out.println(n);
			}
		}
		
	}
}
