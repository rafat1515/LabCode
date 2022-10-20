package labcode2010;

import java.util.PriorityQueue;

public class QueuePeekMethod
{

	public static void main(String[] args) 
	{
	    PriorityQueue<String> pq = new PriorityQueue<String>();
	    pq.add("Rafat"); 
	    pq.add("Niyaz"); 
	    pq.add("Shaikh");
	    
	    System.out.println(pq.poll() + ":" + pq.peek()); 
	}
}


