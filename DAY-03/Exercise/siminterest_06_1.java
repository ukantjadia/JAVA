//~problem: 06.1
		//siminterest_06_1.java: Write a JAVA program to find simple interest.
import java.util.Scanner;
class siminterest_06_1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principal: ");
		int principal = sc.nextInt();
		System.out.println("Enter the Rate of Interest in % per annum: ");
		float Rate = sc.nextFloat();
		System.out.println("Enter the rate of interest is in percentage r% : ");
		float rate = sc.nextFloat();
		System.out.println("The simple interest is:  "+principal*Rate*rate);
		
	}
}
		
		
		