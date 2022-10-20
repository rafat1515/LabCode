package Labcode1310;

public class NestedTry {

	public static void main(String[] args) 
	{  
         
        try {  
        		string name = null;
               
            try {  
            	if (name.equals("Rafat"));
            		System.out.print("Name is Same");
            	
            	else
            		System.out.print("Name is not Same");
            	}  
            
            catch (ArithmeticException e) 
            {  
                System.out.println("Arithmetic exception");  
                System.out.println(" inner try 1");  
            }  
            }  
    
             
            catch (ArithmeticException e)
        {  
                System.out.println("Arithmetic exception");  
                System.out.println("inner try block 1");  
            }  
        }  
    
        
}  

