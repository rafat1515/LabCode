package JavaLabTest;

public class AndroidPhone 
{
	int RAM;
	String color;
	
	
	AndroidPhone(int ram, String c)
	{
		RAM = ram;
		color= c;
	}
	
	
	public void display()
	{
		System.out.println("RAM size = "+ RAM +"" + "Color of AndroidPhone =" +color );
		System.out.println();
	}
}

	