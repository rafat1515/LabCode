package JavaLabTest;

import java.util.Scanner;

public class Palindrome
{

	public static void main(String[] args) 
	{
		String reverse="";
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a String:");
		String original=sc.nextLine();
		
		for (int i=original.length()-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);

	    }
		if(original.equals(reverse))
		{
			System.out.println("String is Palindrome");
			
		}
		else
		{
			System.out.println("String is not Palindrome");
		}

	}
}
