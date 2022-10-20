package labcode2010;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueRemoveMethod {

	public static void main(String[] args)
	{
		PriorityQueue<String> Q = new PriorityQueue<String>();

    
    Q.add("Rafat");
    Q.add("Niyaz");
    Q.add("Shaikh");
   

  
    System.out.println("Queue: " + Q);

    
    System.out.println("1st Queue : " + Q.remove());

   
    System.out.println("2nd Queue : " + Q.remove());


	}

}
