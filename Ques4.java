package labcode2010;

import java.util.HashMap;

public class Ques4 
{

	public static void main(String[] args)
	{
		HashMap<String, Integer> name = new HashMap<>();

	    // insert items to the HashMap
	    name.put("Rafat", 15);
	    name.put("Nikhat", 26);
	    name.put("Naziya", 13);

	    // display the HashMap
	    System.out.println("Name is: " + name);
	    
	    // remove 
	    name.remove(0);
	    System.out.println("Remove: " + name);
	    
	    int value = name.get("Second");
	    // update the value
	    value = value * value;

	    // insert the updated value to the HashMap
	    name.put("Second", value);
	    System.out.println("Updated Name: "+ name);
	}
}
	    
	    
	    
	     
	    
	    
	    
 
	



