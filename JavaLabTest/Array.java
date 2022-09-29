package JavaLabTest;

public class Array {

	public static void main(String[] args) 
	{
		AndroidPhone[] obj = new AndroidPhone[3];
		
		obj[0] = new AndroidPhone(4,"White");
		obj[1] = new AndroidPhone(8,"Black");
		obj[2] = new AndroidPhone(6,"Blue");
		
		System.out.println("Samsung");
		obj[0].display();
		System.out.println("OnePlus");
		obj[1].display();
		System.out.println("OPPO");
		obj[2].display();
		
		
		
	}

}
