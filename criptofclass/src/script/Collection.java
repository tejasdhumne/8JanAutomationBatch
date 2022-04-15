package script;

import java.util.ArrayList;

public class Collection 
{
public static void main(String[] args) {
	
	
	ArrayList a = new ArrayList();
	a.add(1);
	a.add(20);
	a.add(30);
	a.add("Rahul");
//	System.out.println(a);
	
	ArrayList <Integer> b = new ArrayList <Integer> ();
	b.add(10);
	b.add(20);
	b.add(30);
//	b.add("rahul");
	
	System.out.println(b.get(1));
	b.remove(0);
	System.out.println(b);
	
	ArrayList <String> c = new ArrayList <String> ();
//	c.add(30);
	c.add("rahul");
//	System.out.println(c);
	
	
	
	
	
	
	
	
}
}
