package labcode2010;

import java.util.PriorityQueue;

public class QueuePollMethod
{
	public static void main(String args[]) 
    { 
         
        PriorityQueue<String> queue = new PriorityQueue<String>(); 
  
        
        queue.add("Rafat"); 
        queue.add("Niyaz");
        queue.add("Shaikh");
  
        
        System.out.println("Initial PriorityQueue: " + queue); 
  
       
        System.out.println("The element at the head of the"
                           + " queue is: " + queue.poll()); 
  
        System.out.println("Final PriorityQueue: " + queue); 
    } 
}