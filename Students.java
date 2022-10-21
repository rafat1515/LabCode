package labcode2010;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class Students {

	public static void main(String[] args)
	{
	    ListIterator<String> litr = null;
	    List<String> names = new ArrayList<String>();
	    names.add("Rafat");
	    names.add("Nikhat");
	    names.add("Shweta");
	    names.add("Naziya");
	    names.add("Aliya");
	    
	    litr=names.listIterator();
	 
	    System.out.println("Traversing the list in forward direction:");
	    while(litr.hasNext()){
	       System.out.println(litr.next());
	    }
	    System.out.println("\nTraversing the list in backward direction:");
	    while(litr.hasPrevious()){
	       System.out.println(litr.previous());
	    }
	}

}
