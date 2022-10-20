package labcode2010;

public class ThreadScheduler
{

	public static void main(String[] args) 
	{
		// sleep() method
		try
		{  
			for (int i = 0; i < 5; i++)  
			{  
			  
				Thread.sleep(100);  
				System.out.println(i);  
			}  
		}  
			catch (Exception expn)   
			{  
				System.out.println(expn);  
			}  
	}  

}


