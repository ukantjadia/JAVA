//problem 2.4.3
		// factorial_2_4_3.java: write a program tha takes an integer n and calculate n! 
import java.util.Scanner;
class factorial_2_4_3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int  fact = 1;
		if(num<1)
			System.out.println("Enter a valid number...");
		else if(num == 1)
			System.out.println("Factorial value of "+num+" 1");
		else
		{
			while(num>0)
			{
				fact = fact*num;
				num--;
			}
		}
		System.out.println("factorial value if"+fact);
	}
}
