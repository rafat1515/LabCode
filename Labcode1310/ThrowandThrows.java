package Labcode1310;

import java.util.Scanner;

public class ThrowandThrows 
{

public static void main(String[] args)
{
    Scanner S = new Scanner;
    System.out.println("Please enter your roll number");
    int roll = S.nextInt();

    try {
        if (roll < 0) 
        {
            throw new ArithmeticException(
                "The number entered is not positive"
            );
        } else {
            System.out.println("Valid roll number");
        }
    } catch (ArithmeticException e) {
        System.out.println("An exception is thrown");
      
    }
}
}
