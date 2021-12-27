//problem 04.1
		//fibonacci_04_1.java : Write a program  to generate the Fibonacci series
import java.util.Scanner;
class fibonacci_04_1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int first = 0 ,second = 1,third;
		System.out.println("Enter the count you want to have series: ");
		int count = sc.nextInt();
		System.out.print("Printing the list: "+first+" ,"+second);
		for(int i = 0 ; i<count-2 ; i++)
		{
			third = first + second;
			first = second;
			second = third;
			System.out.print(" ,"+third);
		}
		System.out.println("");
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	